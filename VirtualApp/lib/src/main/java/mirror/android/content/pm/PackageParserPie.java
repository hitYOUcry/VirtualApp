package mirror.android.content.pm;

import android.content.pm.PackageParser;

import java.io.File;

import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefStaticMethod;

/**
 * @author Lody
 */

public class PackageParserPie {
    public static Class<?> TYPE = RefClass.load(PackageParserPie.class, "android.content.pm.PackageParser");
    @MethodReflectParams({"android.content.pm.PackageParser$Package", "boolean"})
    public static RefStaticMethod<Void> collectCertificates;
    @MethodParams({File.class, int.class})
    public static RefMethod<PackageParser.Package> parsePackage;
    @MethodParams({File.class, int.class})
    public static RefMethod<PackageParser.PackageLite> parsePackageLite;
}
