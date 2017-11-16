package com.tencent.mm.plugin.x;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.gv;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class a
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.b.b
{
  private static HashMap<Integer, g.d> fIv;
  private static volatile a nDx;
  private i jcG;
  private com.tencent.mm.pluginsdk.model.app.c jcH;
  private k nDA;
  private m nDB;
  private d nDC;
  private com.tencent.mm.sdk.b.c nDD;
  private com.tencent.mm.pluginsdk.model.app.e nDy;
  private com.tencent.mm.pluginsdk.model.app.h nDz;
  
  static
  {
    GMTrace.i(18738271223808L, 139611);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("APPATTACHINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18736123740160L, 139595);
        String[] arrayOfString = com.tencent.mm.pluginsdk.model.app.c.fTX;
        GMTrace.o(18736123740160L, 139595);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("APPINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18735855304704L, 139593);
        String[] arrayOfString = i.fTX;
        GMTrace.o(18735855304704L, 139593);
        return arrayOfString;
      }
    });
    GMTrace.o(18738271223808L, 139611);
  }
  
  private a()
  {
    GMTrace.i(18736257957888L, 139596);
    this.nDD = new com.tencent.mm.sdk.b.c() {};
    a.a.a(new com.tencent.mm.plugin.x.a.a()
    {
      public final com.tencent.mm.pluginsdk.model.app.f Et(String paramAnonymousString)
      {
        GMTrace.i(18731828772864L, 139563);
        paramAnonymousString = a.aWy().Ox(paramAnonymousString);
        GMTrace.o(18731828772864L, 139563);
        return paramAnonymousString;
      }
      
      public final void Eu(String paramAnonymousString)
      {
        GMTrace.i(18732499861504L, 139568);
        a.aWx().Ov(paramAnonymousString);
        GMTrace.o(18732499861504L, 139568);
      }
      
      public final Bitmap a(String paramAnonymousString, int paramAnonymousInt, float paramAnonymousFloat)
      {
        GMTrace.i(18732231426048L, 139566);
        a.aWy();
        if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
        {
          w.e("MicroMsg.AppInfoStorage", "getIcon : invalid argument");
          GMTrace.o(18732231426048L, 139566);
          return null;
        }
        if (paramAnonymousString.equals("wx7fa037cc7dfabad5"))
        {
          paramAnonymousString = BitmapFactory.decodeResource(ab.getContext().getResources(), a.d.bem);
          GMTrace.o(18732231426048L, 139566);
          return paramAnonymousString;
        }
        paramAnonymousString = i.cC(paramAnonymousString, paramAnonymousInt);
        if (!com.tencent.mm.a.e.aZ(paramAnonymousString))
        {
          w.e("MicroMsg.AppInfoStorage", "icon does not exist, iconPath = " + paramAnonymousString + ", iconType = " + paramAnonymousInt);
          GMTrace.o(18732231426048L, 139566);
          return null;
        }
        paramAnonymousString = BackwardSupportUtil.b.c(paramAnonymousString, paramAnonymousFloat);
        GMTrace.o(18732231426048L, 139566);
        return paramAnonymousString;
      }
      
      public final i aWB()
      {
        GMTrace.i(18733036732416L, 139572);
        i locali = a.aWy();
        GMTrace.o(18733036732416L, 139572);
        return locali;
      }
      
      public final Cursor aWC()
      {
        GMTrace.i(18733439385600L, 139575);
        Object localObject = a.aWy();
        StringBuilder localStringBuilder = new StringBuilder(256);
        localStringBuilder.append("select * from AppInfo");
        localStringBuilder.append(" where ");
        localStringBuilder.append("serviceAppType > 0");
        localObject = ((i)localObject).rawQuery(localStringBuilder.toString(), new String[0]);
        if (localObject == null)
        {
          w.e("MicroMsg.AppInfoStorage", "getAllServices : cursor is null");
          GMTrace.o(18733439385600L, 139575);
          return null;
        }
        w.d("MicroMsg.AppInfoStorage", "getAllServices count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
        GMTrace.o(18733439385600L, 139575);
        return (Cursor)localObject;
      }
      
      public final void aa(LinkedList<String> paramAnonymousLinkedList)
      {
        GMTrace.i(18733170950144L, 139573);
        a.aWx().at(paramAnonymousLinkedList);
        GMTrace.o(18733170950144L, 139573);
      }
      
      public final void bC(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18732365643776L, 139567);
        a.aWw().cA(paramAnonymousString, paramAnonymousInt);
        GMTrace.o(18732365643776L, 139567);
      }
      
      public final void c(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(18732634079232L, 139569);
        i locali = a.aWy();
        if ((paramAnonymousf != null) && (paramAnonymousf.field_status != 5))
        {
          paramAnonymousf.field_status = 3;
          w.i("MicroMsg.AppInfoStorage", "setBlack package name = %s", new Object[] { paramAnonymousf.field_packageName });
          locali.a(paramAnonymousf, new String[0]);
        }
        GMTrace.o(18732634079232L, 139569);
      }
      
      public final Cursor cJ(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(18733305167872L, 139574);
        Cursor localCursor = a.aWy().cJ(paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(18733305167872L, 139574);
        return localCursor;
      }
      
      public final void d(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(18732768296960L, 139570);
        i locali = a.aWy();
        if ((paramAnonymousf == null) || (paramAnonymousf.field_status != 3))
        {
          GMTrace.o(18732768296960L, 139570);
          return;
        }
        paramAnonymousf.field_status = 4;
        locali.a(paramAnonymousf, new String[0]);
        GMTrace.o(18732768296960L, 139570);
      }
      
      public final void e(com.tencent.mm.pluginsdk.model.app.f paramAnonymousf)
      {
        GMTrace.i(18732902514688L, 139571);
        a.aWy().a(paramAnonymousf, new String[0]);
        GMTrace.o(18732902514688L, 139571);
      }
      
      public final Cursor l(int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(18732097208320L, 139565);
        i locali = a.aWy();
        String str = "select * from AppInfo where ";
        int i = 0;
        while (i <= 0)
        {
          str = str + " status = " + paramAnonymousArrayOfInt[0];
          i += 1;
        }
        paramAnonymousArrayOfInt = locali.rawQuery(str + " order by status desc, modifyTime asc", new String[0]);
        if (paramAnonymousArrayOfInt == null)
        {
          w.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
          GMTrace.o(18732097208320L, 139565);
          return null;
        }
        GMTrace.o(18732097208320L, 139565);
        return paramAnonymousArrayOfInt;
      }
      
      public final Cursor sn(int paramAnonymousInt)
      {
        GMTrace.i(18731962990592L, 139564);
        Cursor localCursor = a.aWy().rawQuery("select * from AppInfo where status = 5" + " order by modifyTime asc", new String[0]);
        if (localCursor == null)
        {
          w.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
          GMTrace.o(18731962990592L, 139564);
          return null;
        }
        GMTrace.o(18731962990592L, 139564);
        return localCursor;
      }
    });
    GMTrace.o(18736257957888L, 139596);
  }
  
  public static d aGk()
  {
    GMTrace.i(18737465917440L, 139605);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().nDC == null) {
      aWv().nDC = new d();
    }
    d locald = aWv().nDC;
    GMTrace.o(18737465917440L, 139605);
    return locald;
  }
  
  public static m aWA()
  {
    GMTrace.i(18737331699712L, 139604);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().nDB == null) {
      aWv().nDB = new m();
    }
    m localm = aWv().nDB;
    GMTrace.o(18737331699712L, 139604);
    return localm;
  }
  
  public static a aWv()
  {
    GMTrace.i(18736392175616L, 139597);
    if (nDx == null) {}
    try
    {
      if (nDx == null) {
        nDx = new a();
      }
      a locala = nDx;
      GMTrace.o(18736392175616L, 139597);
      return locala;
    }
    finally {}
  }
  
  public static com.tencent.mm.pluginsdk.model.app.e aWw()
  {
    GMTrace.i(18736929046528L, 139601);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().nDy == null) {
      aWv().nDy = new com.tencent.mm.pluginsdk.model.app.e();
    }
    com.tencent.mm.pluginsdk.model.app.e locale = aWv().nDy;
    GMTrace.o(18736929046528L, 139601);
    return locale;
  }
  
  public static com.tencent.mm.pluginsdk.model.app.h aWx()
  {
    GMTrace.i(18737063264256L, 139602);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().nDz == null) {
      aWv().nDz = new com.tencent.mm.pluginsdk.model.app.h();
    }
    com.tencent.mm.pluginsdk.model.app.h localh = aWv().nDz;
    GMTrace.o(18737063264256L, 139602);
    return localh;
  }
  
  public static i aWy()
  {
    GMTrace.i(18737197481984L, 139603);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().jcG == null) {
      aWv().jcG = new i(com.tencent.mm.kernel.h.xy().fYV);
    }
    i locali = aWv().jcG;
    GMTrace.o(18737197481984L, 139603);
    return locali;
  }
  
  public static k aWz()
  {
    GMTrace.i(20992457965568L, 156406);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().nDA == null) {
      aWv().nDA = new k(com.tencent.mm.kernel.h.xy().fYV);
    }
    k localk = aWv().nDA;
    GMTrace.o(20992457965568L, 156406);
    return localk;
  }
  
  public static com.tencent.mm.pluginsdk.model.app.c afP()
  {
    GMTrace.i(18736794828800L, 139600);
    com.tencent.mm.kernel.h.xw().wG();
    if (aWv().jcH == null) {
      aWv().jcH = new com.tencent.mm.pluginsdk.model.app.c(com.tencent.mm.kernel.h.xy().fYV);
    }
    com.tencent.mm.pluginsdk.model.app.c localc = aWv().jcH;
    GMTrace.o(18736794828800L, 139600);
    return localc;
  }
  
  public static String zf()
  {
    GMTrace.i(18736660611072L, 139599);
    String str = com.tencent.mm.kernel.h.xy().fYU + "openapi/";
    GMTrace.o(18736660611072L, 139599);
    return str;
  }
  
  public HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(18737868570624L, 139608);
    HashMap localHashMap = fIv;
    GMTrace.o(18737868570624L, 139608);
    return localHashMap;
  }
  
  public List<String> collectStoragePaths()
  {
    GMTrace.i(18736526393344L, 139598);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "openapi/" });
    GMTrace.o(18736526393344L, 139598);
    return localLinkedList;
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(18737600135168L, 139606);
    com.tencent.mm.y.ab.a.gmV = aWx();
    com.tencent.mm.sdk.b.a.vgX.b(this.nDD);
    GMTrace.o(18737600135168L, 139606);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(18737734352896L, 139607);
    Object localObject = aWv().nDz;
    if (localObject != null)
    {
      com.tencent.mm.kernel.h.xx().fYr.b(231, (com.tencent.mm.ad.e)localObject);
      aGk().b(7, (t)localObject);
    }
    localObject = aWv().nDy;
    if (localObject != null)
    {
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).tnD.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).oKe.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).hVe.clear();
    }
    localObject = aWv().nDB;
    if (localObject != null)
    {
      w.d("MicroMsg.AppSettingService", "stop service");
      ((m)localObject).toc.clear();
      aGk().b(1, (t)localObject);
    }
    if (this.nDC != null)
    {
      localObject = this.nDC;
      com.tencent.mm.kernel.h.xx().fYr.b(452, (com.tencent.mm.ad.e)localObject);
      ((d)localObject).guw.clear();
    }
    if (aWv().jcG != null) {
      aWv().jcG.tnU.clear();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.nDD);
    GMTrace.o(18737734352896L, 139607);
  }
  
  public void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(18738137006080L, 139610);
    this.jcH = null;
    this.jcG = null;
    GMTrace.o(18738137006080L, 139610);
  }
  
  public void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(18738002788352L, 139609);
    GMTrace.o(18738002788352L, 139609);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\x\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */