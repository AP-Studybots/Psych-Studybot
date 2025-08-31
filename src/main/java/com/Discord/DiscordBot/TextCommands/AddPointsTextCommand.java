package com.Discord.DiscordBot.TextCommands;

import com.Discord.DiscordBot.Sessions.UserProfile;
import com.Discord.DiscordBot.Sessions.UserProfileManager;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.IOException;
import java.util.List;

public class AddPointsTextCommand {

    public static void execute(MessageReceivedEvent event) {
        User targetUser = null;
        try {
            // Get the list of mentions(only 1 mention)
            List<User> mentionedUsers = event.getMessage().getMentions().getUsers();
            targetUser = mentionedUsers.get(0);

            // Load the user's profile
            UserProfile profile = UserProfileManager.loadProfile(targetUser);

            int points = 0;
            String message = event.getMessage().getContentRaw();
            for (int i = message.length(); i > 0; i--) {
                try {
                    points = Integer.parseInt(message.substring(i));
                } catch (Exception ignored) { }
            }

            // Reset points to 0 and update title
            profile.addPoints(points); // add points

            // Send confirmation message
            event.getChannel().sendMessage(
                    "✅ Successfully changed points for " + targetUser.getAsMention() +
                            "\nTheir new title is: " + profile.getTitle() + " with " + profile.getPoints() + " points."
            ).queue();

        } catch (IOException e) { // This only happens when I use the command wrong
            event.getChannel().sendMessage(
                    "❌ Failed to reset points for " + targetUser.getAsMention() +
                            ": " + e.getMessage()
            ).queue();
        }
    }

}
