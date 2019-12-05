package com.paf.zoo.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandInvokerTest {

    @Test
    public void commandShouldBeCorrectTest() {
        Assert.assertTrue(CommandInvoker.valueOf("HELP").getCommand() instanceof HelpCommand);
        Assert.assertTrue(CommandInvoker.valueOf("EXIT").getCommand() instanceof ExitCommand);
        Assert.assertTrue(CommandInvoker.valueOf("DISPLAY").getCommand() instanceof DisplayCommand);
        Assert.assertTrue(CommandInvoker.valueOf("LIVE").getCommand() instanceof LiveOneDayCommand);
        Assert.assertTrue(CommandInvoker.valueOf("UNKNOWN").getCommand() instanceof UnknownCommand);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalCommandTest() {
        CommandInvoker.valueOf("abc");
    }
}
