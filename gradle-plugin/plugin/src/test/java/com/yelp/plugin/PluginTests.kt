package com.yelp.plugin

import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

class PluginTests {
    @get:Rule
    val temporaryFolder = TemporaryFolder()

    @Test
    fun basicPluginTest() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create().withProjectDir(projectDir)
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)

        val result2ndRun = GradleRunner.create().withProjectDir(projectDir)
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()
        Assert.assertEquals(TaskOutcome.UP_TO_DATE, result2ndRun.task(":generateSwagger")?.outcome)
    }

    @Test
    fun testMinSupportdGradleVersion54() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.4")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion541() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.4.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion55() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.5")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion551() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.5.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion56() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.6")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion561() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.6.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion562() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.6.2")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion563() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.6.3")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion564() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("5.6.4")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion60() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.0")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion601() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.0.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion61() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion611() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.1.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion62() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.2")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion621() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.2.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion622() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.2.2")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion63() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.3")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion64() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.4")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion641() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.4.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion65() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.5")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion651() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.5.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion66() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.6")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion661() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.6.1")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
    @Test
    fun testMinSupportdGradleVersion67() {
        val projectDir = temporaryFolder.newFolder("project")
        File("src/test/testProject").copyRecursively(projectDir)

        val result = GradleRunner.create()
            .withProjectDir(projectDir)
            .withGradleVersion("6.7")
            .forwardStdOutput(System.out.writer())
            .forwardStdError(System.err.writer())
            .withArguments("generateSwagger")
            .build()

        Assert.assertEquals(TaskOutcome.SUCCESS, result.task(":generateSwagger")?.outcome)
    }
}
