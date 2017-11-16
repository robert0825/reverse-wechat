package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Build.VERSION;
import android.system.Os;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.j.a;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public final class c
{
  static final String hLB;
  private static final Collection<a> hLC;
  public static final AppBrandLocalMediaObject hLD;
  
  static
  {
    GMTrace.i(10640647258112L, 79279);
    String str = com.tencent.mm.compatible.util.e.ghz;
    Object localObject = str;
    if (!str.endsWith("/")) {
      localObject = str + "/";
    }
    hLB = (String)localObject + "wxafiles/";
    localObject = new LinkedList();
    ((Collection)localObject).add(new d());
    ((Collection)localObject).add(new c());
    hLC = Collections.unmodifiableCollection((Collection)localObject);
    hLD = new AppBrandLocalMediaObjectManager.3();
    GMTrace.o(10640647258112L, 79279);
  }
  
  public static AppBrandLocalMediaObject a(AppBrandLocalMediaObject paramAppBrandLocalMediaObject)
  {
    GMTrace.i(10639439298560L, 79270);
    Object localObject = null;
    Iterator localIterator = hLC.iterator();
    while (localIterator.hasNext())
    {
      AppBrandLocalMediaObject localAppBrandLocalMediaObject = ((a)localIterator.next()).a(paramAppBrandLocalMediaObject);
      localObject = localAppBrandLocalMediaObject;
      if (localAppBrandLocalMediaObject != null) {
        localObject = localAppBrandLocalMediaObject;
      }
    }
    GMTrace.o(10639439298560L, 79270);
    return (AppBrandLocalMediaObject)localObject;
  }
  
  private static <T extends AppBrandLocalMediaObject> T a(String paramString1, String paramString2, Class<T> paramClass, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(10638902427648L, 79266);
    if (bg.nm(paramString1))
    {
      GMTrace.o(10638902427648L, 79266);
      return null;
    }
    if (!com.tencent.mm.a.e.aZ(paramString2))
    {
      GMTrace.o(10638902427648L, 79266);
      return null;
    }
    String str = com.tencent.mm.pluginsdk.ui.tools.s.PR(paramString2);
    if (bg.nm(str))
    {
      str = paramString3;
      paramString3 = null;
      Iterator localIterator = hLC.iterator();
      while (localIterator.hasNext())
      {
        a locala = ((a)localIterator.next()).w(paramString1, paramString2, str);
        paramString3 = locala;
        if (locala != null) {
          paramString3 = locala;
        }
      }
      if ((paramString3 != null) && (paramString3.size() >= 2)) {
        break label173;
      }
      if (paramString3 != null) {
        break label164;
      }
    }
    label164:
    for (int i = -1;; i = paramString3.size())
    {
      w.e("MicroMsg.AppBrand.LocalMediaObjectManager", "attachCast, no handler return correct info, attach.size = %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(10638902427648L, 79266);
      return null;
      break;
    }
    try
    {
      label173:
      paramString1 = (AppBrandLocalMediaObject)paramClass.newInstance();
      paramString1.eHy = ((String)paramString3.get(0));
      paramString1.mimeType = com.tencent.mm.pluginsdk.ui.tools.s.PP(str);
      paramString1.gpy = ((String)paramString3.get(1));
      if (bg.nm(paramString1.gpy))
      {
        w.e("MicroMsg.AppBrand.LocalMediaObjectManager", "attachCast appId %s, Null Or Nil fileFullPath");
        GMTrace.o(10638902427648L, 79266);
        return null;
      }
      paramString1.hLy = bg.aq((String)paramString3.get(3), bg.aq(str, "unknown"));
      paramClass = paramString1.gpy;
      if ((paramBoolean) && (aF(paramString2, paramClass))) {
        i = 1;
      }
      while (i != 0)
      {
        paramString2 = new File(paramString1.gpy);
        paramString1.hmS = paramString2.length();
        paramString1.hLA = paramString2.lastModified();
        GMTrace.o(10638902427648L, 79266);
        return paramString1;
        if (!paramBoolean)
        {
          paramBoolean = j.eR(paramString2, paramClass);
          if (paramBoolean)
          {
            i = 1;
            continue;
          }
        }
        i = 0;
      }
      return null;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager", paramString1, "", new Object[0]);
      GMTrace.o(10638902427648L, 79266);
    }
  }
  
  public static String aE(String paramString1, String paramString2)
  {
    GMTrace.i(10638097121280L, 79260);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(10638097121280L, 79260);
      return null;
    }
    paramString1 = oC(paramString1) + paramString2;
    GMTrace.o(10638097121280L, 79260);
    return paramString1;
  }
  
  public static boolean aF(String paramString1, String paramString2)
  {
    GMTrace.i(10638231339008L, 79261);
    if (Build.VERSION.SDK_INT >= 21) {
      try
      {
        long l = bg.Pv();
        new b();
        Os.rename(paramString1, paramString2);
        w.d("MicroMsg.AppBrand.LocalMediaObjectManager", "renameToImpl, os rename works, cost = %d", new Object[] { Long.valueOf(bg.Pv() - l) });
        GMTrace.o(10638231339008L, 79261);
        return true;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppBrand.LocalMediaObjectManager", "renameToImpl, os rename exp = %s", new Object[] { bg.f(localException) });
      }
    }
    boolean bool = com.tencent.mm.a.e.b(new File(paramString1), new File(paramString2));
    GMTrace.o(10638231339008L, 79261);
    return bool;
  }
  
  public static AppBrandLocalVideoObject aG(String paramString1, String paramString2)
  {
    GMTrace.i(10638768209920L, 79265);
    paramString1 = (AppBrandLocalVideoObject)a(paramString1, paramString2, AppBrandLocalVideoObject.class, "mp4", false);
    GMTrace.o(10638768209920L, 79265);
    return paramString1;
  }
  
  public static String aH(String paramString1, String paramString2)
  {
    GMTrace.i(16058077413376L, 119642);
    byte[] arrayOfByte = bg.St(paramString1);
    com.tencent.mm.platformtools.s locals = new com.tencent.mm.platformtools.s();
    paramString2 = paramString2.getBytes();
    int n = arrayOfByte.length;
    locals.preCrypt = 0;
    locals.crypt = 0;
    locals.key = paramString2;
    paramString2 = new byte[8];
    if ((n % 8 != 0) || (n < 16)) {
      paramString2 = null;
    }
    int j;
    int i;
    while (bg.nm(paramString1))
    {
      GMTrace.o(16058077413376L, 119642);
      return null;
      locals.prePlain = locals.decipher(arrayOfByte, 0);
      if (locals.prePlain == null)
      {
        paramString2 = null;
      }
      else
      {
        locals.pos = (locals.prePlain[0] & 0x7);
        j = n - locals.pos - 10;
        if (j < 0)
        {
          paramString2 = null;
        }
        else
        {
          i = 0;
          while (i < 8)
          {
            paramString2[i] = 0;
            i += 1;
          }
          locals.out = new byte[j];
          locals.preCrypt = 0;
          locals.crypt = 8;
          locals.contextStart = 8;
          locals.pos += 1;
          locals.padding = 1;
        }
      }
    }
    for (;;)
    {
      if (locals.padding <= 2)
      {
        if (locals.pos < 8)
        {
          locals.pos += 1;
          locals.padding += 1;
        }
        if (locals.pos != 8) {
          continue;
        }
        if (locals.decrypt8Bytes(arrayOfByte, 0, n)) {
          break label590;
        }
        paramString2 = null;
        break;
      }
      i = j;
      int k = 0;
      for (;;)
      {
        int m;
        if (i != 0)
        {
          m = k;
          j = i;
          if (locals.pos < 8)
          {
            locals.out[k] = ((byte)(paramString2[(locals.preCrypt + 0 + locals.pos)] ^ locals.prePlain[locals.pos]));
            m = k + 1;
            j = i - 1;
            locals.pos += 1;
          }
          k = m;
          i = j;
          if (locals.pos != 8) {
            continue;
          }
          locals.preCrypt = (locals.crypt - 8);
          if (locals.decrypt8Bytes(arrayOfByte, 0, n)) {
            break label578;
          }
          paramString2 = null;
          break;
        }
        for (locals.padding = 1;; locals.padding += 1)
        {
          if (locals.padding >= 8) {
            break label549;
          }
          if (locals.pos < 8)
          {
            if ((paramString2[(locals.preCrypt + 0 + locals.pos)] ^ locals.prePlain[locals.pos]) != 0)
            {
              paramString2 = null;
              break;
            }
            locals.pos += 1;
          }
          if (locals.pos == 8)
          {
            locals.preCrypt = locals.crypt;
            if (!locals.decrypt8Bytes(arrayOfByte, 0, n))
            {
              paramString2 = null;
              break;
            }
            paramString2 = arrayOfByte;
          }
        }
        label549:
        paramString2 = locals.out;
        break;
        paramString1 = new String(paramString2);
        GMTrace.o(16058077413376L, 119642);
        return paramString1;
        label578:
        paramString2 = arrayOfByte;
        k = m;
        i = j;
      }
      label590:
      paramString2 = arrayOfByte;
    }
  }
  
  private static AppBrandLocalMediaObject aI(String paramString1, String paramString2)
  {
    Object localObject = null;
    GMTrace.i(10639573516288L, 79271);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(10639573516288L, 79271);
      return null;
    }
    Iterator localIterator = hLC.iterator();
    while (localIterator.hasNext())
    {
      AppBrandLocalMediaObject localAppBrandLocalMediaObject = ((a)localIterator.next()).aL(paramString1, paramString2);
      localObject = localAppBrandLocalMediaObject;
      if (localAppBrandLocalMediaObject != null) {
        localObject = localAppBrandLocalMediaObject;
      }
    }
    GMTrace.o(10639573516288L, 79271);
    return (AppBrandLocalMediaObject)localObject;
  }
  
  public static AppBrandLocalMediaObject aJ(String paramString1, String paramString2)
  {
    GMTrace.i(10639707734016L, 79272);
    if ((bg.nm(paramString2)) || (!paramString2.startsWith("wxfile://")) || (bg.nm(paramString1)))
    {
      w.e("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, invalid args, localId(%s), appId(%s) ", new Object[] { paramString2, paramString1 });
      GMTrace.o(10639707734016L, 79272);
      return null;
    }
    String str = paramString2.substring(9);
    Iterator localIterator = hLC.iterator();
    paramString2 = null;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramString2 = locala.aK(paramString1, str);
      if (paramString2 != null) {
        w.i("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, handled by %s, result = %s", new Object[] { locala.toString(), paramString2 });
      }
    }
    for (;;)
    {
      if (hLD == paramString2)
      {
        GMTrace.o(10639707734016L, 79272);
        return null;
        break;
      }
      GMTrace.o(10639707734016L, 79272);
      return paramString2;
    }
  }
  
  public static AppBrandLocalMediaObject b(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(10639170863104L, 79268);
    paramString1 = a(paramString1, paramString2, AppBrandLocalMediaObject.class, paramString3, paramBoolean);
    GMTrace.o(10639170863104L, 79268);
    return paramString1;
  }
  
  public static AppBrandLocalMediaObject c(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(10639036645376L, 79267);
    paramString1 = b(paramString1, paramString2, null, paramBoolean);
    GMTrace.o(10639036645376L, 79267);
    return paramString1;
  }
  
  public static String encrypt(String paramString1, String paramString2)
  {
    GMTrace.i(16057943195648L, 119641);
    paramString1 = bg.bs(new com.tencent.mm.platformtools.s().encrypt(paramString1.getBytes(), paramString2.getBytes()));
    GMTrace.o(16057943195648L, 119641);
    return paramString1;
  }
  
  public static long oA(String paramString)
  {
    long l1 = 0L;
    GMTrace.i(15546036781056L, 115827);
    paramString = new File(oC(paramString));
    if ((!paramString.exists()) || (!paramString.isDirectory())) {}
    for (paramString = null; (paramString == null) || (paramString.length <= 0); paramString = paramString.listFiles(new FileFilter()
        {
          public final boolean accept(File paramAnonymousFile)
          {
            GMTrace.i(15545365692416L, 115822);
            if ((paramAnonymousFile.exists()) && (!paramAnonymousFile.isDirectory()) && (!bg.nm(paramAnonymousFile.getName())) && (paramAnonymousFile.getName().startsWith("tmp_")))
            {
              GMTrace.o(15545365692416L, 115822);
              return true;
            }
            GMTrace.o(15545365692416L, 115822);
            return false;
          }
        }))
    {
      GMTrace.o(15546036781056L, 115827);
      return 0L;
    }
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      long l2 = paramString[i].length();
      i += 1;
      l1 = l2 + l1;
    }
    GMTrace.o(15546036781056L, 115827);
    return l1;
  }
  
  public static long oB(String paramString)
  {
    long l1 = 0L;
    GMTrace.i(10638633992192L, 79264);
    paramString = oz(paramString);
    if ((paramString == null) || (paramString.length <= 0))
    {
      GMTrace.o(10638633992192L, 79264);
      return 0L;
    }
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      long l2 = paramString[i].length();
      i += 1;
      l1 = l2 + l1;
    }
    GMTrace.o(10638633992192L, 79264);
    return l1;
  }
  
  public static String oC(String paramString)
  {
    GMTrace.i(10639305080832L, 79269);
    paramString = hLB + paramString + "/";
    h.Nj(paramString);
    try
    {
      new File(paramString, ".nomedia").createNewFile();
      GMTrace.o(10639305080832L, 79269);
      return paramString;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static long oD(String paramString)
  {
    GMTrace.i(16058211631104L, 119643);
    paramString = new FileInputStream(paramString);
    CheckedInputStream localCheckedInputStream = new CheckedInputStream(paramString, new Adler32());
    byte[] arrayOfByte = new byte['ࠀ'];
    while (localCheckedInputStream.read(arrayOfByte) >= 0) {}
    long l = localCheckedInputStream.getChecksum().getValue();
    bg.g(localCheckedInputStream);
    bg.g(paramString);
    GMTrace.o(16058211631104L, 119643);
    return l;
  }
  
  public static List<AppBrandLocalMediaObject> oy(String paramString)
  {
    GMTrace.i(10638365556736L, 79262);
    File[] arrayOfFile = oz(paramString);
    if ((arrayOfFile == null) || (arrayOfFile.length <= 0))
    {
      GMTrace.o(10638365556736L, 79262);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int j = arrayOfFile.length;
    int i = 0;
    while (i < j)
    {
      AppBrandLocalMediaObject localAppBrandLocalMediaObject = aI(paramString, arrayOfFile[i].getName());
      if (localAppBrandLocalMediaObject != null) {
        localLinkedList.add(localAppBrandLocalMediaObject);
      }
      i += 1;
    }
    GMTrace.o(10638365556736L, 79262);
    return localLinkedList;
  }
  
  private static File[] oz(String paramString)
  {
    GMTrace.i(10638499774464L, 79263);
    paramString = new File(oC(paramString));
    if ((!paramString.exists()) || (!paramString.isDirectory()))
    {
      GMTrace.o(10638499774464L, 79263);
      return null;
    }
    paramString = paramString.listFiles(new FileFilter()
    {
      public final boolean accept(File paramAnonymousFile)
      {
        GMTrace.i(10632594194432L, 79219);
        if ((paramAnonymousFile.exists()) && (!paramAnonymousFile.isDirectory()) && (!bg.nm(paramAnonymousFile.getName())) && (paramAnonymousFile.getName().startsWith("store_")))
        {
          GMTrace.o(10632594194432L, 79219);
          return true;
        }
        GMTrace.o(10632594194432L, 79219);
        return false;
      }
    });
    GMTrace.o(10638499774464L, 79263);
    return paramString;
  }
  
  private static abstract interface a
  {
    public abstract AppBrandLocalMediaObject a(AppBrandLocalMediaObject paramAppBrandLocalMediaObject);
    
    public abstract AppBrandLocalMediaObject aK(String paramString1, String paramString2);
    
    public abstract AppBrandLocalMediaObject aL(String paramString1, String paramString2);
    
    public abstract a w(String paramString1, String paramString2, String paramString3);
  }
  
  private static final class b
  {
    public b()
    {
      GMTrace.i(10630983581696L, 79207);
      GMTrace.o(10630983581696L, 79207);
    }
  }
  
  private static final class c
    implements c.a
  {
    public c()
    {
      GMTrace.i(10636620726272L, 79249);
      GMTrace.o(10636620726272L, 79249);
    }
    
    public final AppBrandLocalMediaObject a(AppBrandLocalMediaObject paramAppBrandLocalMediaObject)
    {
      GMTrace.i(10637157597184L, 79253);
      GMTrace.o(10637157597184L, 79253);
      return null;
    }
    
    public final AppBrandLocalMediaObject aK(String paramString1, String paramString2)
    {
      GMTrace.i(10636889161728L, 79251);
      Object localObject = null;
      label86:
      label142:
      String str4;
      try
      {
        String str1 = c.aH(paramString2, paramString1);
        localObject = str1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, fileName = %s, decrypt exp = %s", new Object[] { paramString2, bg.f(localException) });
        }
        if (!bg.nm((String)localObject)) {
          break label86;
        }
        GMTrace.o(10636889161728L, 79251);
        return null;
        localObject = ((String)localObject).split("\\|");
        if (localObject != null) {
          break label142;
        }
        for (int i = -1;; i = localObject.length)
        {
          w.i("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, split arrays length %d", new Object[] { Integer.valueOf(i) });
          if ((localObject != null) && (localObject.length == 2)) {
            break;
          }
          GMTrace.o(10636889161728L, 79251);
          return null;
        }
        String str3 = localObject[0];
        str4 = localObject[1];
        if (!bg.nm(str3)) {
          break label199;
        }
        w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, null or nil fileName(%s) fileMd5(%s)", new Object[] { paramString2, str3 });
        GMTrace.o(10636889161728L, 79251);
        return null;
        localObject = c.oC(paramString1) + paramString2 + ".dat";
        String str2 = c.oC(paramString1) + paramString2 + ".tmp";
        if (!com.tencent.mm.a.e.aZ((String)localObject)) {
          break label324;
        }
        w.i("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, fileName(%s) appId(%s) permanent file exists", new Object[] { paramString2, paramString1 });
        for (;;)
        {
          if (g.bg((String)localObject).equals(str3)) {
            break label387;
          }
          w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, exactMd5 != fileMd5, fileName(%s), appId(%s) ", new Object[] { paramString2, paramString1 });
          GMTrace.o(10636889161728L, 79251);
          return null;
          if (!com.tencent.mm.a.e.aZ(str2)) {
            break;
          }
          w.i("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, fileName(%s) appId(%s) temp file exists", new Object[] { paramString2, paramString1 });
          localObject = str2;
        }
        w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V1Handler", "retrieveMediaObject, file not exists, fileName(%s), appId(%s) ", new Object[] { paramString2, paramString1 });
        GMTrace.o(10636889161728L, 79251);
        return null;
      }
      if (bg.nm((String)localObject))
      {
        GMTrace.o(10636889161728L, 79251);
        return null;
      }
      label199:
      label324:
      label387:
      paramString1 = new AppBrandLocalMediaObject();
      paramString1.eHy = ("wxfile://" + paramString2);
      paramString1.gpy = ((String)localObject);
      paramString1.mimeType = str4;
      paramString1.hLy = com.tencent.mm.pluginsdk.ui.tools.s.OV(str4);
      paramString1.hLz = false;
      GMTrace.o(10636889161728L, 79251);
      return paramString1;
    }
    
    public final AppBrandLocalMediaObject aL(String paramString1, String paramString2)
    {
      GMTrace.i(10637023379456L, 79252);
      GMTrace.o(10637023379456L, 79252);
      return null;
    }
    
    public final String toString()
    {
      GMTrace.i(10636754944000L, 79250);
      GMTrace.o(10636754944000L, 79250);
      return "V1MediaObjectInfoHandler";
    }
    
    @Deprecated
    public final a w(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(10637291814912L, 79254);
      GMTrace.o(10637291814912L, 79254);
      return null;
    }
  }
  
  private static final class d
    implements c.a
  {
    public d()
    {
      GMTrace.i(10630044057600L, 79200);
      GMTrace.o(10630044057600L, 79200);
    }
    
    public final AppBrandLocalMediaObject a(AppBrandLocalMediaObject paramAppBrandLocalMediaObject)
    {
      GMTrace.i(10630446710784L, 79203);
      if (paramAppBrandLocalMediaObject == null)
      {
        GMTrace.o(10630446710784L, 79203);
        return null;
      }
      String str = paramAppBrandLocalMediaObject.gpy.replaceFirst("tmp_", "store_");
      if (c.aF(paramAppBrandLocalMediaObject.gpy, str))
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = new AppBrandLocalMediaObject();
        localAppBrandLocalMediaObject.gpy = str;
        localAppBrandLocalMediaObject.eHy = paramAppBrandLocalMediaObject.eHy.replaceFirst("tmp_", "store_");
        localAppBrandLocalMediaObject.hmS = paramAppBrandLocalMediaObject.hmS;
        localAppBrandLocalMediaObject.hLy = paramAppBrandLocalMediaObject.hLy;
        localAppBrandLocalMediaObject.hLA = new File(localAppBrandLocalMediaObject.gpy).lastModified();
        localAppBrandLocalMediaObject.mimeType = paramAppBrandLocalMediaObject.mimeType;
        localAppBrandLocalMediaObject.hLz = true;
        GMTrace.o(10630446710784L, 79203);
        return localAppBrandLocalMediaObject;
      }
      GMTrace.o(10630446710784L, 79203);
      return null;
    }
    
    public final AppBrandLocalMediaObject aK(String paramString1, String paramString2)
    {
      GMTrace.i(10630312493056L, 79202);
      if ((!paramString2.startsWith("store_")) && (!paramString2.startsWith("tmp_")))
      {
        GMTrace.o(10630312493056L, 79202);
        return null;
      }
      String str2 = com.tencent.mm.pluginsdk.ui.tools.s.PR(paramString2);
      Object localObject2 = paramString2.replaceFirst("store_", "").replaceFirst("tmp_", "");
      Object localObject1 = localObject2;
      if (!bg.nm(str2)) {
        localObject1 = ((String)localObject2).replaceFirst("." + str2, "");
      }
      if (bg.nm((String)localObject1))
      {
        paramString1 = c.hLD;
        GMTrace.o(10630312493056L, 79202);
        return paramString1;
      }
      localObject2 = null;
      try
      {
        String str1 = c.aH((String)localObject1, paramString1);
        localObject2 = str1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", localException, "retrieveMediaObject, decrypt exp ", new Object[0]);
        }
        Object localObject3 = ((String)localObject2).split("\\|");
        if ((localObject3 != null) && (localObject3.length == 2)) {
          break label216;
        }
        paramString1 = c.hLD;
        GMTrace.o(10630312493056L, 79202);
        return paramString1;
        label216:
        if (!paramString2.startsWith("store_")) {
          break label297;
        }
        long l1;
        label297:
        for (localObject2 = "store_";; localObject2 = "tmp_")
        {
          localObject1 = c.oC(paramString1) + (String)localObject2 + (String)localObject1;
          l1 = bg.getLong(localObject3[0], 0L);
          localObject3 = localObject3[1];
          if (((String)localObject3).equalsIgnoreCase(str2)) {
            break;
          }
          paramString1 = c.hLD;
          GMTrace.o(10630312493056L, 79202);
          return paramString1;
        }
        try
        {
          long l2 = c.oD((String)localObject1);
          if (l1 != l2)
          {
            w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s), appId(%s)", new Object[] { Long.valueOf(l2), Long.valueOf(l1), paramString2, paramString1 });
            paramString1 = c.hLD;
            GMTrace.o(10630312493056L, 79202);
            return paramString1;
          }
        }
        catch (IOException paramString1)
        {
          w.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", new Object[] { bg.f(paramString1) });
          paramString1 = c.hLD;
          GMTrace.o(10630312493056L, 79202);
          return paramString1;
        }
        paramString1 = new AppBrandLocalMediaObject();
        paramString1.eHy = ("wxfile://" + paramString2);
        paramString1.gpy = ((String)localObject1);
        paramString1.mimeType = com.tencent.mm.pluginsdk.ui.tools.s.PP((String)localObject3);
        paramString1.hLz = ((String)localObject2).equalsIgnoreCase("store_");
        paramString2 = new File(paramString1.gpy);
        paramString1.hLA = paramString2.lastModified();
        paramString1.hmS = paramString2.length();
        GMTrace.o(10630312493056L, 79202);
      }
      if (bg.nm((String)localObject2))
      {
        w.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
        paramString1 = c.hLD;
        GMTrace.o(10630312493056L, 79202);
        return paramString1;
      }
      return paramString1;
    }
    
    public final AppBrandLocalMediaObject aL(String paramString1, String paramString2)
    {
      GMTrace.i(10630715146240L, 79205);
      String str2 = paramString2.replaceFirst("store_", "").replaceFirst("tmp_", "");
      Object localObject2;
      try
      {
        String str1 = c.aH(str2, paramString1);
        if (bg.nm(str1))
        {
          GMTrace.o(10630715146240L, 79205);
          return null;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", localException, "retrieveMediaObjectByRealFileName, dec exp = ", new Object[0]);
          localObject1 = null;
        }
        localObject1 = ((String)localObject1).split("\\|");
        if ((localObject1 == null) || (localObject1.length != 2))
        {
          GMTrace.o(10630715146240L, 79205);
          return null;
        }
        localObject1 = localObject1[1];
        localObject2 = new StringBuilder("wxfile://").append(paramString2);
        if (!bg.nm((String)localObject1)) {}
      }
      for (Object localObject1 = "";; localObject1 = "." + (String)localObject1)
      {
        localObject2 = (String)localObject1;
        localObject1 = new AppBrandLocalMediaObject();
        ((AppBrandLocalMediaObject)localObject1).eHy = ((String)localObject2);
        ((AppBrandLocalMediaObject)localObject1).gpy = (c.oC(paramString1) + paramString2);
        ((AppBrandLocalMediaObject)localObject1).hLy = str2;
        ((AppBrandLocalMediaObject)localObject1).hLz = true;
        paramString1 = new File(((AppBrandLocalMediaObject)localObject1).gpy);
        ((AppBrandLocalMediaObject)localObject1).hLA = paramString1.lastModified();
        ((AppBrandLocalMediaObject)localObject1).hmS = paramString1.length();
        GMTrace.o(10630715146240L, 79205);
        return (AppBrandLocalMediaObject)localObject1;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(10630178275328L, 79201);
      GMTrace.o(10630178275328L, 79201);
      return "V2MediaObjectInfoHandler";
    }
    
    /* Error */
    public final a w(String paramString1, String paramString2, String paramString3)
    {
      // Byte code:
      //   0: ldc2_w 203
      //   3: ldc -51
      //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_3
      //   9: ldc -49
      //   11: invokestatic 210	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   14: astore_3
      //   15: aload_2
      //   16: invokestatic 163	com/tencent/mm/plugin/appbrand/appstorage/c:oD	(Ljava/lang/String;)J
      //   19: lstore 4
      //   21: getstatic 216	java/util/Locale:US	Ljava/util/Locale;
      //   24: ldc -38
      //   26: iconst_2
      //   27: anewarray 4	java/lang/Object
      //   30: dup
      //   31: iconst_0
      //   32: lload 4
      //   34: invokestatic 171	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   37: aastore
      //   38: dup
      //   39: iconst_1
      //   40: aload_3
      //   41: aastore
      //   42: invokestatic 222	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   45: astore_2
      //   46: aload_2
      //   47: aload_1
      //   48: invokestatic 225	com/tencent/mm/plugin/appbrand/appstorage/c:encrypt	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   51: astore_2
      //   52: aload_2
      //   53: invokestatic 107	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   56: ifeq +60 -> 116
      //   59: ldc2_w 203
      //   62: ldc -51
      //   64: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   67: aconst_null
      //   68: areturn
      //   69: astore_1
      //   70: ldc -127
      //   72: ldc -29
      //   74: iconst_1
      //   75: anewarray 4	java/lang/Object
      //   78: dup
      //   79: iconst_0
      //   80: aload_1
      //   81: invokestatic 181	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   84: aastore
      //   85: invokestatic 175	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   88: ldc2_w 203
      //   91: ldc -51
      //   93: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   96: aconst_null
      //   97: areturn
      //   98: astore_2
      //   99: ldc -127
      //   101: aload_2
      //   102: ldc -27
      //   104: iconst_0
      //   105: anewarray 4	java/lang/Object
      //   108: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   111: aconst_null
      //   112: astore_2
      //   113: goto -61 -> 52
      //   116: new 109	java/lang/StringBuilder
      //   119: dup
      //   120: ldc 39
      //   122: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   125: aload_2
      //   126: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   129: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   132: astore 6
      //   134: new 109	java/lang/StringBuilder
      //   137: dup
      //   138: invokespecial 149	java/lang/StringBuilder:<init>	()V
      //   141: aload_1
      //   142: invokestatic 152	com/tencent/mm/plugin/appbrand/appstorage/c:oC	(Ljava/lang/String;)Ljava/lang/String;
      //   145: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   148: aload 6
      //   150: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   153: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   156: astore_2
      //   157: new 109	java/lang/StringBuilder
      //   160: dup
      //   161: ldc -73
      //   163: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   166: aload 6
      //   168: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   171: astore 6
      //   173: aload_3
      //   174: invokestatic 107	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   177: ifeq +81 -> 258
      //   180: ldc 102
      //   182: astore_1
      //   183: aload 6
      //   185: aload_1
      //   186: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   189: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   192: astore_1
      //   193: ldc -127
      //   195: ldc -25
      //   197: iconst_2
      //   198: anewarray 4	java/lang/Object
      //   201: dup
      //   202: iconst_0
      //   203: aload_1
      //   204: aastore
      //   205: dup
      //   206: iconst_1
      //   207: aload_2
      //   208: aastore
      //   209: invokestatic 233	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   212: new 235	com/tencent/mm/vending/j/d
      //   215: dup
      //   216: invokespecial 236	com/tencent/mm/vending/j/d:<init>	()V
      //   219: astore 6
      //   221: aload 6
      //   223: iconst_3
      //   224: anewarray 4	java/lang/Object
      //   227: dup
      //   228: iconst_0
      //   229: aload_1
      //   230: aastore
      //   231: dup
      //   232: iconst_1
      //   233: aload_2
      //   234: aastore
      //   235: dup
      //   236: iconst_2
      //   237: aload_3
      //   238: aastore
      //   239: putfield 242	com/tencent/mm/vending/j/a:xyT	[Ljava/lang/Object;
      //   242: aload 6
      //   244: checkcast 235	com/tencent/mm/vending/j/d
      //   247: astore_1
      //   248: ldc2_w 203
      //   251: ldc -51
      //   253: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   256: aload_1
      //   257: areturn
      //   258: new 109	java/lang/StringBuilder
      //   261: dup
      //   262: ldc 111
      //   264: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   267: aload_3
      //   268: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   271: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   274: astore_1
      //   275: goto -92 -> 183
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	278	0	this	d
      //   0	278	1	paramString1	String
      //   0	278	2	paramString2	String
      //   0	278	3	paramString3	String
      //   19	14	4	l	long
      //   132	111	6	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   15	21	69	java/lang/Exception
      //   46	52	98	java/lang/Exception
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appstorage\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */