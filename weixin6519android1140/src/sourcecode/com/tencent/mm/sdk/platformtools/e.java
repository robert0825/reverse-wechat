package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.BaseBuildInfo;

public final class e
{
  public static String BUILD_TAG;
  public static String CLIENT_VERSION;
  public static String COMMAND;
  public static boolean DEBUG;
  public static String HOSTNAME;
  public static String OWNER;
  public static String REV;
  public static String SVNPATH;
  public static String TIME;
  public static boolean vho;
  
  static
  {
    GMTrace.i(13954885615616L, 103972);
    DEBUG = false;
    BUILD_TAG = "MicroMessenger_Android_GIT_RELEASE_GRADLE #4822";
    OWNER = "";
    HOSTNAME = "077647f0cb40";
    TIME = "2017-11-09 17:02:28";
    COMMAND = "null";
    REV = "3a3f33cbf52fb0ef2d45330cfd58a095d24924d2";
    SVNPATH = "origin/RB-2017-OCT@git";
    CLIENT_VERSION = "0x26051334";
    vho = true;
    GMTrace.o(13954885615616L, 103972);
  }
  
  public static String aiJ()
  {
    GMTrace.i(13954751397888L, 103971);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("[b.ver] %s\n", new Object[] { a.eQ(CLIENT_VERSION, BaseBuildInfo.CLIENT_VERSION) }));
    localStringBuilder.append(String.format("[tag  ] %s\n", new Object[] { a.eQ(BUILD_TAG, BaseBuildInfo.BUILD_TAG) }));
    localStringBuilder.append(String.format("[by   ] %s\n", new Object[] { a.eQ(OWNER, BaseBuildInfo.OWNER) }));
    localStringBuilder.append(String.format("[host ] %s\n", new Object[] { a.eQ(HOSTNAME, BaseBuildInfo.HOSTNAME) }));
    localStringBuilder.append(String.format("[time ] %s\n", new Object[] { a.eQ(TIME, BaseBuildInfo.TIME) }));
    localStringBuilder.append(String.format("[cmd  ] %s\n", new Object[] { a.eQ(COMMAND, BaseBuildInfo.COMMAND) }));
    localStringBuilder.append(String.format("[path ] %s\n", new Object[] { a.eQ(a.eP(SVNPATH, "MicroMsg_proj"), a.eP(BaseBuildInfo.SVNPATH, "MicroMsg_proj")) }));
    localStringBuilder.append(String.format("[rev  ] %s\n", new Object[] { a.eQ(REV, BaseBuildInfo.REV) }));
    if (BaseBuildInfo.patchEnabled()) {}
    for (String str = BaseBuildInfo.codeRevision();; str = "disabled")
    {
      localStringBuilder.append(String.format("[p.rev] %s\n", new Object[] { str }));
      str = localStringBuilder.toString();
      GMTrace.o(13954751397888L, 103971);
      return str;
    }
  }
  
  private static final class a
  {
    public static String eP(String paramString1, String paramString2)
    {
      GMTrace.i(13930323771392L, 103789);
      if (paramString1 == null)
      {
        GMTrace.o(13930323771392L, 103789);
        return null;
      }
      int i = paramString1.indexOf(paramString2);
      if (i < 0)
      {
        GMTrace.o(13930323771392L, 103789);
        return paramString1;
      }
      paramString1 = paramString1.substring(i);
      GMTrace.o(13930323771392L, 103789);
      return paramString1;
    }
    
    public static String eQ(String paramString1, String paramString2)
    {
      GMTrace.i(13930457989120L, 103790);
      if (paramString1 == null)
      {
        GMTrace.o(13930457989120L, 103790);
        return null;
      }
      if (paramString1.equals(paramString2))
      {
        GMTrace.o(13930457989120L, 103790);
        return paramString1;
      }
      paramString1 = String.format("%s(%s)", new Object[] { paramString1, paramString2 });
      GMTrace.o(13930457989120L, 103790);
      return paramString1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */