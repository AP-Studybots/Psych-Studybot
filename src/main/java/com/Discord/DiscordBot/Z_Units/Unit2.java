package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit2Questions;

public class Unit2 {

    public static int numUnit2Questions;

    public static void initializeUnit2Questions() {

        unit2Questions.add(new Question(
                "Which research method involves an in-depth analysis of a single individual or group?",
                "Survey", "Case Study", "Experiment", "Naturalistic Observation",
                "B", 2, 1000, "medium"));

        unit2Questions.add(new Question(
                "What is the main purpose of random assignment in an experiment?",
                "To eliminate all confounding variables",
                "To ensure each participant has an equal chance of being in any group",
                "To increase sample size",
                "To manipulate the independent variable",
                "B", 2, 1001, "medium"));

        unit2Questions.add(new Question(
                "A correlation coefficient of -0.85 indicates:",
                "A weak positive relationship",
                "A strong negative relationship",
                "No relationship",
                "A strong positive relationship",
                "B", 2, 1002, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a measure of central tendency?",
                "Mean", "Variance", "Correlation", "Standard Deviation",
                "A", 2, 1003, "easy"));

        unit2Questions.add(new Question(
                "In an experiment, the variable that is manipulated is called the:",
                "Dependent Variable", "Independent Variable", "Confounding Variable", "Control Variable",
                "B", 2, 1004, "easy"));

        unit2Questions.add(new Question(
                "The placebo effect demonstrates the importance of:",
                "Random assignment", "Experimental control", "Operational definitions", "Blind procedures",
                "D", 2, 1005, "medium"));

        unit2Questions.add(new Question(
                "Which research method is most useful for detecting naturally occurring relationships between variables?",
                "Case study", "Survey", "Correlation", "Experiment",
                "C", 2, 1006, "easy"));

        unit2Questions.add(new Question(
                "Ethical guidelines in psychological research emphasize all of the following EXCEPT:",
                "Informed consent", "Confidentiality", "Avoiding deception", "Publishing only positive results",
                "D", 2, 1007, "medium"));

        unit2Questions.add(new Question(
                "A double-blind procedure helps control for:",
                "Placebo effects and experimenter bias", "Sampling errors", "Correlation vs causation confusion", "Random assignment issues",
                "A", 2, 1008, "hard"));

        unit2Questions.add(new Question(
                "Which statement best illustrates critical thinking?",
                "Accepting claims because they come from experts",
                "Evaluating evidence before forming a conclusion",
                "Relying on intuition",
                "Following common sense",
                "B", 2, 1009, "medium"));

        unit2Questions.add(new Question(
                "Descriptive statistics help psychologists to:",
                "Summarize data", "Determine cause and effect", "Eliminate bias", "Ensure ethical treatment",
                "A", 2, 1010, "easy"));

        unit2Questions.add(new Question(
                "Random sampling is important because it:",
                "Reduces sampling bias", "Ensures causation", "Manipulates variables", "Increases correlation strength",
                "A", 2, 1011, "medium"));

        unit2Questions.add(new Question(
                "If a study finds that increased sleep is related to higher test scores, this is an example of:",
                "Causation", "Correlation", "Random assignment", "Experimental manipulation",
                "B", 2, 1012, "easy"));

        unit2Questions.add(new Question(
                "Operational definitions are important because they:",
                "Increase sample size", "Specify exactly how variables are measured or manipulated", "Eliminate confounding variables", "Ensure ethical treatment",
                "B", 2, 1013, "medium"));

        unit2Questions.add(new Question(
                "Which type of study would best determine whether exercise causes improved mood?",
                "Survey", "Case study", "Experiment", "Correlation study",
                "C", 2, 1014, "medium"));

        unit2Questions.add(new Question(
                "Which of the following is a potential problem with surveys?",
                "Small sample size", "Social desirability bias", "Question wording effects", "All of the above",
                "D", 2, 1015, "medium"));

        unit2Questions.add(new Question(
                "A negative correlation means:",
                "As one variable increases, the other decreases",
                "As one variable increases, the other increases",
                "There is no relationship",
                "Variables are independent",
                "A", 2, 1016, "easy"));

        unit2Questions.add(new Question(
                "A histogram is a type of:",
                "Inferential statistic", "Descriptive statistic", "Correlation coefficient", "Operational definition",
                "B", 2, 1017, "easy"));

        unit2Questions.add(new Question(
                "Which of the following best illustrates an experimenter bias?",
                "Recording data incorrectly to fit the hypothesis",
                "Using random assignment",
                "Selecting a representative sample",
                "Reporting all results accurately",
                "A", 2, 1018, "hard"));

        unit2Questions.add(new Question(
                "Psychologists study behavior scientifically in order to:",
                "Rely on intuition",
                "Understand and predict behavior",
                "Confirm common sense",
                "Avoid research ethics",
                "B", 2, 1019, "easy"));


        numUnit2Questions = unit2Questions.size();
        System.out.printf("There are %d questions in unit 2%n", numUnit2Questions);
    }



}
