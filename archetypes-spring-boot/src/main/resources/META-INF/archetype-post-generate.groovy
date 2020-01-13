

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

final Path projectPath = Paths.get(request.outputDirectory, request.artifactId)
final String modulePrefix = request.artifactId + "-"

renameModule("service", projectPath, modulePrefix)
renameModule("core", projectPath, modulePrefix)

// Functions

void renameModule(String name, projectPath, modulePrefix) {
    Files.move(projectPath.resolve(name), projectPath.resolve(modulePrefix + name))
}