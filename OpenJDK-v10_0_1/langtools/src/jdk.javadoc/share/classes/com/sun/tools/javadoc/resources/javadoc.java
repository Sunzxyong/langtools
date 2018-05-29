package com.sun.tools.javadoc.resources;

public final class javadoc extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "javadoc.Body_missing_from_html_file", "Body tag missing from HTML file" },
            { "javadoc.End_body_missing_from_html_file", "Close body tag missing from HTML file" },
            { "javadoc.File_Read_Error", "Error while reading file {0}" },
            { "javadoc.JavaScript_in_comment", "JavaScript found in documentation comment.\nUse --allow-script-in-comments to allow use of JavaScript." },
            { "javadoc.Multiple_package_comments", "Multiple sources of package comments found for package \"{0}\"" },
            { "javadoc.class_not_found", "Class {0} not found." },
            { "javadoc.error", "error" },
            { "javadoc.error.msg", "{0}: error - {1}" },
            { "javadoc.note.msg", "{1}" },
            { "javadoc.note.pos.msg", "{0}: {1}" },
            { "javadoc.warning", "warning" },
            { "javadoc.warning.msg", "{0}: warning - {1}" },
            { "main.Building_tree", "Constructing Javadoc information..." },
            { "main.Loading_source_file", "Loading source file {0}..." },
            { "main.Loading_source_files_for_package", "Loading source files for package {0}..." },
            { "main.No_packages_or_classes_specified", "No packages or classes specified." },
            { "main.Xusage", "  -Xmaxerrs <number>               Set the maximum number of errors to print\n  -Xmaxwarns <number>              Set the maximum number of warnings to print\n  --add-exports <module>/<package>=<other-module>(,<other-module>)*\n                                   Specify a package to be considered as exported from its \n                                   defining module to additional modules, or to all unnamed \n                                   modules if <other-module> is ALL-UNNAMED.\n  --add-reads <module>=<other-module>(,<other-module>)*\n                                   Specify additional modules to be considered as required by a\n                                   given module. <other-module> may be ALL-UNNAMED to require\n                                   the unnamed module.\n  --patch-module <module>=<file>(:<file>)*\n                                   Override or augment a module with classes and resources\n                                   in JAR files or directories\n" },
            { "main.Xusage.foot", "These options are non-standard and subject to change without notice." },
            { "main.cant.read", "cannot read {0}" },
            { "main.doclet_class_not_found", "Cannot find doclet class {0}" },
            { "main.doclet_method_must_be_static", "In doclet class {0}, method {1} must be static." },
            { "main.doclet_method_not_accessible", "In doclet class {0},  method {1} not accessible" },
            { "main.doclet_method_not_found", "Doclet class {0} does not contain a {1} method" },
            { "main.done_in", "[done in {0} ms]" },
            { "main.error", "{0} error" },
            { "main.errors", "{0} errors" },
            { "main.exception_thrown", "In doclet class {0},  method {1} has thrown an exception {2}" },
            { "main.fatal.error", "fatal error" },
            { "main.fatal.exception", "fatal exception" },
            { "main.file_ignored", "File ignored: \"{0}\" (not yet supported)" },
            { "main.file_not_found", "File not found: \"{0}\"" },
            { "main.illegal_class_name", "Illegal class name: \"{0}\"" },
            { "main.illegal_locale_name", "Locale not available: {0}" },
            { "main.illegal_package_name", "Illegal package name: \"{0}\"" },
            { "main.incompatible.access.flags", "More than one of -public, -private, -package, or -protected specified." },
            { "main.internal_error_exception_thrown", "Internal error: In doclet class {0},  method {1} has thrown an exception {2}" },
            { "main.invalid_flag", "invalid flag: {0}" },
            { "main.locale_first", "option -locale must be first on the command line." },
            { "main.malformed_locale_name", "Malformed locale name: {0}" },
            { "main.more_than_one_doclet_specified_0_and_1", "More than one doclet specified ({0} and {1})." },
            { "main.must_return_boolean", "In doclet class {0}, method {1} must return boolean." },
            { "main.must_return_int", "In doclet class {0}, method {1} must return int." },
            { "main.must_return_languageversion", "In doclet class {0}, method {1} must return LanguageVersion." },
            { "main.no_source_files_for_package", "No source files for package {0}" },
            { "main.option.already.seen", "The {0} option may be specified no more than once." },
            { "main.option.invalid.value", "{0}" },
            { "main.out.of.memory", "java.lang.OutOfMemoryError: Please increase memory.\nFor example, on the JDK Classic or HotSpot VMs, add the option -J-Xmx\nsuch as -J-Xmx32m." },
            { "main.release.bootclasspath.conflict", "option {0} cannot be used together with -release" },
            { "main.requires_argument", "option {0} requires an argument." },
            { "main.unsupported.release.version", "release version {0} not supported" },
            { "main.usage", "Usage: javadoc [options] [packagenames] [sourcefiles] [@files]\n  -overview <file>                 Read overview documentation from HTML file\n  -public                          Show only public classes and members\n  -protected                       Show protected/public classes and members (default)\n  -package                         Show package/protected/public classes and members\n  -private                         Show all classes and members\n  -help                            Display command line options and exit\n  -doclet <class>                  Generate output via alternate doclet\n  -docletpath <path>               Specify where to find doclet class files\n  --module-source-path <path>      Specify where to find input source files for multiple modules\n  --upgrade-module-path <path>     Override location of upgradeable modules\n  --module-path <path>, -p <path>  Specify where to find application modules\n  --add-modules <module>(,<module>)*\n                                   Root modules to resolve in addition to the initial modules,\n                                   or all modules on the module path if <module> is ALL-MODULE-PATH.\n  --limit-modules <module>(,<module>)*\n                                   Limit the universe of observable modules\n  --source-path <path>             Specify where to find source files\n  -sourcepath <path>               Specify where to find source files\n  --class-path <path>              Specify where to find user class files\n  -classpath <path>                Specify where to find user class files\n  -cp <path>                       Specify where to find user class files\n  -exclude <pkglist>               Specify a list of packages to exclude\n  -subpackages <subpkglist>        Specify subpackages to recursively load\n  -breakiterator                   Compute first sentence with BreakIterator\n  -bootclasspath <path>            Override location of platform class files\n                                   used for non-modular releases\n  --system <jdk>                   Override location of system modules used\n                                   for modular releases.\n  -source <release>                Provide source compatibility with specified release\n  --release <release>              Provide source compatibility with specified release\n  -extdirs <dirlist>               Override location of installed extensions\n  -verbose                         Output messages about what Javadoc is doing\n  -locale <name>                   Locale to be used, e.g. en_US or en_US_WIN\n  -encoding <name>                 Source file encoding name\n  -quiet                           Do not display status messages\n  -J<flag>                         Pass <flag> directly to the runtime system\n  -X                               Print a synopsis of nonstandard options and exit\n" },
            { "main.usage.foot", "\nGNU-style options may use '=' instead whitespace to separate the name of an option\nfrom its value.\n" },
            { "main.warning", "{0} warning" },
            { "main.warnings", "{0} warnings" },
            { "tag.End_delimiter_missing_for_possible_SeeTag", "End Delimiter } missing for possible See Tag in comment string: \"{0}\"" },
            { "tag.Improper_Use_Of_Link_Tag", "Missing closing ''}'' character for inline tag: \"{0}\"" },
            { "tag.illegal_char_in_arr_dim", "Tag {0}: Syntax Error in array dimension, method parameters: {1}" },
            { "tag.illegal_see_tag", "Tag {0}: Syntax Error in method parameters: {1}" },
            { "tag.missing_comma_space", "Tag {0}: Missing comma or space in method parameters: {1}" },
            { "tag.see.can_not_find_member", "Tag {0}: can''t find {1} in {2}" },
            { "tag.see.class_not_specified", "Tag {0}: class not specified: \"{1}\"" },
            { "tag.see.illegal_character", "Tag {0}:illegal character: \"{1}\" in \"{2}\"" },
            { "tag.see.malformed_see_tag", "Tag {0}: malformed: \"{1}\"" },
            { "tag.see.missing_sharp", "Tag {0}: missing ''#'': \"{1}\"" },
            { "tag.see.no_close_bracket_on_url", "Tag {0}: missing final ''>'': \"{1}\"" },
            { "tag.see.no_close_quote", "Tag {0}: no final close quote: \"{1}\"" },
            { "tag.serialField.illegal_character", "illegal character {0} in @serialField tag: {1}." },
            { "tag.tag_has_no_arguments", "{0} tag has no arguments." },
        };
    }
}
