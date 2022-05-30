package com.fortify.cli.fod.picocli.command.application.release;

import com.fortify.cli.common.picocli.command.DummyCommand;
import picocli.CommandLine;

@CommandLine.Command(name = "create",
        description = "Create a new application (with a release) from FoD."
)
public class FoDApplicationReleaseCreateCommand  extends DummyCommand {
}
