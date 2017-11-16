package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.as;

public final class aa
{
  private static boolean hasInit;
  private static aa hhA;
  private static boolean hhJ;
  private t fIC;
  private ae handler;
  private ab hhB;
  private ac hhC;
  private Context hhD;
  private a hhE;
  private z hhF;
  private y hhG;
  private Looper hhH;
  private w hhI;
  
  static
  {
    GMTrace.i(13660009267200L, 101775);
    hasInit = false;
    hhJ = false;
    GMTrace.o(13660009267200L, 101775);
  }
  
  private aa()
  {
    GMTrace.i(13656385388544L, 101748);
    GMTrace.o(13656385388544L, 101748);
  }
  
  private static aa OP()
  {
    GMTrace.i(13656519606272L, 101749);
    if (hhA == null) {
      hhA = new aa();
    }
    aa localaa = hhA;
    GMTrace.o(13656519606272L, 101749);
    return localaa;
  }
  
  private static SharedPreferences OQ()
  {
    GMTrace.i(13656653824000L, 101750);
    SharedPreferences localSharedPreferences = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("notify_key_pref_no_account", 4);
    GMTrace.o(13656653824000L, 101750);
    return localSharedPreferences;
  }
  
  public static SharedPreferences OR()
  {
    GMTrace.i(13656788041728L, 101751);
    Object localObject2 = OQ().getString("login_weixin_username", "");
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2))
    {
      localObject2 = as.gnb.B("login_weixin_username", "");
      localObject1 = localObject2;
      if (!bg.nm((String)localObject2))
      {
        OQ().edit().putString("login_weixin_username", (String)localObject2).commit();
        localObject1 = localObject2;
      }
    }
    localObject2 = localObject1;
    if (localObject1 != null) {
      localObject2 = ((String)localObject1).replace("[\\/\\\\]", "#").trim();
    }
    localObject1 = "notify_key_pref" + (String)localObject2;
    localObject1 = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences((String)localObject1, 4);
    GMTrace.o(13656788041728L, 101751);
    return (SharedPreferences)localObject1;
  }
  
  public static void OS()
  {
    GMTrace.i(13656922259456L, 101752);
    SharedPreferences localSharedPreferences;
    int i;
    if (!hasInit)
    {
      localSharedPreferences = OR();
      long l = localSharedPreferences.getLong("wakeup_alarm_last_tick", 0L);
      i = localSharedPreferences.getInt("wakeup_alarm_last_cnt", 0);
      if ((l == 0L) || (l > bg.Pv()))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMPushCore", "dealWithOnCreate, invalid time, thisCnt:%d", new Object[] { Integer.valueOf(i) });
        localSharedPreferences.edit().putLong("wakeup_alarm_last_tick", bg.Pv()).commit();
        localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", 1).commit();
        GMTrace.o(13656922259456L, 101752);
        return;
      }
      if (bg.aH(l) <= 86400000L) {
        break label225;
      }
      localSharedPreferences.edit().putInt("wakeup_alarm_launch_cnt", i).commit();
      localSharedPreferences.edit().putLong("wakeup_alarm_last_tick", bg.Pv()).commit();
      localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", 1).commit();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMPushCore", "dealWithOnCreate, statistics cycle expire, thisCnt:%d", new Object[] { Integer.valueOf(i) });
    }
    for (;;)
    {
      hasInit = true;
      GMTrace.o(13656922259456L, 101752);
      return;
      label225:
      localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", i + 1).commit();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMPushCore", "dealWithOnCreate, add up launch count to:%d", new Object[] { Integer.valueOf(i + 1) });
    }
  }
  
  public static boolean OT()
  {
    GMTrace.i(13657056477184L, 101753);
    String str = as.gnb.B("login_user_name", "");
    Object localObject = str;
    if (str != null) {
      localObject = str.replace("[\\/\\\\]", "#").trim();
    }
    localObject = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("notify_key_pref" + (String)localObject, 4);
    int i = ((SharedPreferences)localObject).getInt("wakeup_alarm_launch_cnt", 0);
    int j = ((SharedPreferences)localObject).getInt("wakeup_alarm_last_cnt", 0);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MMPushCore", "isFrequentlyLaunch cnt:%d, thisCnt:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (i > 10)
    {
      i = 1;
      if (j <= 10) {
        break label139;
      }
    }
    label139:
    for (j = 1;; j = 0)
    {
      GMTrace.o(13657056477184L, 101753);
      return j | i;
      i = 0;
      break;
    }
  }
  
  public static ab OU()
  {
    GMTrace.i(13657190694912L, 101754);
    ab localab = OP().hhB;
    GMTrace.o(13657190694912L, 101754);
    return localab;
  }
  
  public static ac OV()
  {
    GMTrace.i(13657459130368L, 101756);
    ac localac = OP().hhC;
    GMTrace.o(13657459130368L, 101756);
    return localac;
  }
  
  public static ae OW()
  {
    GMTrace.i(13657996001280L, 101760);
    ae localae = OP().handler;
    GMTrace.o(13657996001280L, 101760);
    return localae;
  }
  
  public static a OX()
  {
    GMTrace.i(13658264436736L, 101762);
    a locala = OP().hhE;
    GMTrace.o(13658264436736L, 101762);
    return locala;
  }
  
  public static t OY()
  {
    GMTrace.i(13658532872192L, 101764);
    t localt = OP().fIC;
    GMTrace.o(13658532872192L, 101764);
    return localt;
  }
  
  public static z OZ()
  {
    GMTrace.i(13658801307648L, 101766);
    z localz = OP().hhF;
    GMTrace.o(13658801307648L, 101766);
    return localz;
  }
  
  public static y Pa()
  {
    GMTrace.i(13659069743104L, 101768);
    y localy = OP().hhG;
    GMTrace.o(13659069743104L, 101768);
    return localy;
  }
  
  public static Looper Pb()
  {
    GMTrace.i(13659338178560L, 101770);
    if (OP().hhH == null)
    {
      localObject = e.SV("MMPushCore_handlerThread");
      ((HandlerThread)localObject).start();
      OP().hhH = ((HandlerThread)localObject).getLooper();
    }
    Object localObject = OP().hhH;
    GMTrace.o(13659338178560L, 101770);
    return (Looper)localObject;
  }
  
  public static w Pc()
  {
    GMTrace.i(13659472396288L, 101771);
    w localw = OP().hhI;
    GMTrace.o(13659472396288L, 101771);
    return localw;
  }
  
  public static boolean Pd()
  {
    GMTrace.i(13659875049472L, 101774);
    OP();
    boolean bool = hhJ;
    GMTrace.o(13659875049472L, 101774);
    return bool;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13658398654464L, 101763);
    OP().hhE = parama;
    GMTrace.o(13658398654464L, 101763);
  }
  
  public static void a(ab paramab)
  {
    GMTrace.i(13657324912640L, 101755);
    OP().hhB = paramab;
    GMTrace.o(13657324912640L, 101755);
  }
  
  public static void a(ac paramac)
  {
    GMTrace.i(13657593348096L, 101757);
    OP().hhC = paramac;
    GMTrace.o(13657593348096L, 101757);
  }
  
  public static void a(w paramw)
  {
    GMTrace.i(13659606614016L, 101772);
    OP().hhI = paramw;
    GMTrace.o(13659606614016L, 101772);
  }
  
  public static void a(y paramy)
  {
    GMTrace.i(13659203960832L, 101769);
    OP().hhG = paramy;
    GMTrace.o(13659203960832L, 101769);
  }
  
  public static void a(z paramz)
  {
    GMTrace.i(13658935525376L, 101767);
    OP().hhF = paramz;
    GMTrace.o(13658935525376L, 101767);
  }
  
  public static void a(ae paramae)
  {
    GMTrace.i(13658130219008L, 101761);
    OP().handler = paramae;
    GMTrace.o(13658130219008L, 101761);
  }
  
  public static void b(t paramt)
  {
    GMTrace.i(13658667089920L, 101765);
    OP().fIC = paramt;
    GMTrace.o(13658667089920L, 101765);
  }
  
  public static void bN(boolean paramBoolean)
  {
    GMTrace.i(13659740831744L, 101773);
    OP();
    hhJ = paramBoolean;
    GMTrace.o(13659740831744L, 101773);
  }
  
  public static Context getContext()
  {
    GMTrace.i(13657727565824L, 101758);
    Context localContext = OP().hhD;
    GMTrace.o(13657727565824L, 101758);
    return localContext;
  }
  
  public static void setContext(Context paramContext)
  {
    GMTrace.i(13657861783552L, 101759);
    OP().hhD = paramContext;
    GMTrace.o(13657861783552L, 101759);
  }
  
  public static abstract interface a
  {
    public abstract void aD(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */