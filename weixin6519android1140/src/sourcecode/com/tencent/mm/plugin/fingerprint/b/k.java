package com.tencent.mm.plugin.fingerprint.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.d.a.c.h;
import com.tencent.d.b.f.b.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.g.a.lc.a;
import com.tencent.mm.g.a.lc.b;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  extends a
{
  private l llv;
  public com.tencent.d.b.c.a llw;
  
  public k()
  {
    GMTrace.i(10784528662528L, 80351);
    this.llv = null;
    this.llw = null;
    GMTrace.o(10784528662528L, 80351);
  }
  
  private static String azX()
  {
    GMTrace.i(10786139275264L, 80363);
    Object localObject = com.tencent.mm.plugin.wallet_core.model.r.riJ.riL;
    if (localObject != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("json", ((h)localObject).yaq);
        localJSONObject.put("signature", ((h)localObject).signature);
        localObject = localJSONObject.toString();
        GMTrace.o(10786139275264L, 80363);
        return (String)localObject;
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", new Object[] { localJSONException.toString() });
        w.printErrStackTrace("MicroMsg.SoterAuthMgrImp", localJSONException, "", new Object[0]);
        GMTrace.o(10786139275264L, 80363);
        return "";
      }
    }
    w.e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
    GMTrace.o(10786139275264L, 80363);
    return "";
  }
  
  @TargetApi(16)
  public final int a(final com.tencent.mm.pluginsdk.wallet.c paramc, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10785468186624L, 80358);
    if (paramBoolean)
    {
      w.i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
      GMTrace.o(10785468186624L, 80358);
      return 0;
    }
    Object localObject = new com.tencent.d.b.c.b()
    {
      public final void aAa()
      {
        GMTrace.i(18484197064704L, 137718);
        w.i("MicroMsg.SoterAuthMgrImp", "alvinluo onAuthenticationCancelled");
        k.this.llw = null;
        GMTrace.o(18484197064704L, 137718);
      }
      
      public final void azY()
      {
        GMTrace.i(18483660193792L, 137714);
        w.i("MicroMsg.SoterAuthMgrImp", "alvinluo onStartAuthentication");
        GMTrace.o(18483660193792L, 137714);
      }
      
      public final void azZ()
      {
        GMTrace.i(18483928629248L, 137716);
        k.this.llw = null;
        w.i("MicroMsg.SoterAuthMgrImp", "alvinluo onAuthenticationSucceed");
        GMTrace.o(18483928629248L, 137716);
      }
      
      public final void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(18484331282432L, 137719);
        w.e("MicroMsg.SoterAuthMgrImp", "alvinluo onAuthenticationError errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousCharSequence });
        k.this.llw = null;
        GMTrace.o(18484331282432L, 137719);
      }
      
      public final void onAuthenticationFailed()
      {
        GMTrace.i(18484062846976L, 137717);
        w.i("MicroMsg.SoterAuthMgrImp", "alvinluo onAuthenticationFailed");
        if (paramc != null) {
          paramc.av(2002, -1);
        }
        GMTrace.o(18484062846976L, 137717);
      }
      
      public final void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(18483794411520L, 137715);
        w.i("MicroMsg.SoterAuthMgrImp", "alvinluo onAuthenticationHelp helpCode: %d, helpString: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousCharSequence });
        if (paramc != null) {
          paramc.av(2000, -1);
        }
        GMTrace.o(18483794411520L, 137715);
      }
    };
    this.llw = new com.tencent.d.b.c.a();
    localObject = new b.a().Fm(1).hP(ab.getContext()).a(this.llw).Yz(com.tencent.mm.plugin.wallet_core.model.r.riJ.llD).a((com.tencent.d.b.c.b)localObject).yaQ;
    com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, (com.tencent.d.b.f.b)localObject);
    GMTrace.o(10785468186624L, 80358);
    return 0;
  }
  
  public final void a(lc paramlc, int paramInt)
  {
    GMTrace.i(10786005057536L, 80362);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
    paramlc.ePn.ePr = azX();
    lc.b localb = paramlc.ePn;
    if (!bg.nm(paramlc.ePn.ePr)) {}
    for (paramInt = 0;; paramInt = 1)
    {
      localb.errCode = paramInt;
      paramlc.ePn.ePs = 2;
      paramlc.ePn.eJR = "";
      paramlc.ePn.eJS = "";
      if (paramlc.ePm.ePq != null) {
        paramlc.ePm.ePq.run();
      }
      GMTrace.o(10786005057536L, 80362);
      return;
    }
  }
  
  public final boolean a(boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    GMTrace.i(10787078799360L, 80370);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (!paramBoolean1)
    {
      paramBundle = paramBundle.getString("pwd");
      if (bg.nm(paramBundle))
      {
        w.e("MicroMsg.SoterAuthMgrImp", "hy: no pwd. can not change auth key");
        GMTrace.o(10787078799360L, 80370);
        return false;
      }
      if (com.tencent.mm.plugin.wallet_core.model.r.riJ.llE)
      {
        w.i("MicroMsg.SoterAuthMgrImp", "hy: need change auth key. start gen auth key");
        com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, true, 1, new com.tencent.mm.plugin.fingerprint.c.c(paramBundle), new com.tencent.mm.plugin.soter.b.e());
      }
    }
    GMTrace.o(10787078799360L, 80370);
    return false;
  }
  
  public final boolean azA()
  {
    GMTrace.i(10784662880256L, 80352);
    if (p.fQG.fQO == 1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.d.b.a.cpG();
      w.i("MicroMsg.SoterAuthMgrImp", "hy: config support: %b, device support: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) || (!bool2)) {
        break;
      }
      GMTrace.o(10784662880256L, 80352);
      return true;
    }
    GMTrace.o(10784662880256L, 80352);
    return false;
  }
  
  public final boolean azB()
  {
    GMTrace.i(10784797097984L, 80353);
    boolean bool = com.tencent.d.a.a.hE(ab.getContext());
    GMTrace.o(10784797097984L, 80353);
    return bool;
  }
  
  public final void azC()
  {
    GMTrace.i(10784931315712L, 80354);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
    e.eG(true);
    e.eF(true);
    com.tencent.mm.plugin.soter.d.b.a(false, false, null);
    GMTrace.o(10784931315712L, 80354);
  }
  
  public final boolean azE()
  {
    GMTrace.i(10785065533440L, 80355);
    GMTrace.o(10785065533440L, 80355);
    return false;
  }
  
  public final boolean azF()
  {
    GMTrace.i(10785333968896L, 80357);
    boolean bool = azA();
    GMTrace.o(10785333968896L, 80357);
    return bool;
  }
  
  @SuppressLint({"NewApi"})
  public final void azG()
  {
    GMTrace.i(10785736622080L, 80360);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
    GMTrace.o(10785736622080L, 80360);
  }
  
  @SuppressLint({"NewApi"})
  public final void azH()
  {
    GMTrace.i(10785870839808L, 80361);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: do nothing in system release");
    GMTrace.o(10785870839808L, 80361);
  }
  
  public final void azI()
  {
    GMTrace.i(10786273492992L, 80364);
    if (com.tencent.d.a.a.Ys(e.azN())) {
      com.tencent.d.a.a.bk(e.azN(), false);
    }
    GMTrace.o(10786273492992L, 80364);
  }
  
  public final Map<String, String> azJ()
  {
    GMTrace.i(10786541928448L, 80366);
    HashMap localHashMap = new HashMap();
    Object localObject = com.tencent.mm.plugin.soter.c.b.bqB();
    String str = ((com.tencent.mm.plugin.soter.c.c)localObject).qpg;
    localObject = ((com.tencent.mm.plugin.soter.c.c)localObject).qph;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    GMTrace.o(10786541928448L, 80366);
    return localHashMap;
  }
  
  public final j azK()
  {
    GMTrace.i(10786676146176L, 80367);
    m localm = new m();
    GMTrace.o(10786676146176L, 80367);
    return localm;
  }
  
  public final Map<String, String> azL()
  {
    GMTrace.i(10786810363904L, 80368);
    Map localMap = azJ();
    GMTrace.o(10786810363904L, 80368);
    return localMap;
  }
  
  public final boolean azM()
  {
    GMTrace.i(10786944581632L, 80369);
    w.v("MicroMsg.SoterAuthMgrImp", "hasAsk: %b, hasAuthKey: %b, isAuthKeyValid: %b", new Object[] { Boolean.valueOf(com.tencent.d.a.a.cpz()), Boolean.valueOf(com.tencent.d.a.a.Ys(e.azN())), Boolean.valueOf(com.tencent.d.a.a.Yt(e.azN())) });
    if ((!com.tencent.d.a.a.cpz()) || (!com.tencent.d.a.a.Ys(e.azN())) || (!com.tencent.d.a.a.Yt(e.azN())))
    {
      w.i("MicroMsg.SoterAuthMgrImp", "hy: no ask or auth key");
      com.tencent.mm.plugin.wallet_core.model.r.riJ.llE = true;
    }
    if (!com.tencent.mm.plugin.wallet_core.model.r.riJ.llE)
    {
      GMTrace.o(10786944581632L, 80369);
      return true;
    }
    GMTrace.o(10786944581632L, 80369);
    return false;
  }
  
  public final boolean azv()
  {
    GMTrace.i(10787213017088L, 80371);
    boolean bool = com.tencent.d.a.a.hF(ab.getContext());
    GMTrace.o(10787213017088L, 80371);
    return bool;
  }
  
  public final void azx()
  {
    GMTrace.i(10787347234816L, 80372);
    if ((this.llw != null) && (Build.VERSION.SDK_INT >= 16))
    {
      w.i("MicroMsg.SoterAuthMgrImp", "alvinluo cancel fingeprint canceller");
      this.llw.nc(true);
      if (com.tencent.mm.plugin.soter.c.a.bqA()) {
        com.tencent.mm.plugin.soter.c.a.c(1, -1000223, -1, "user cancelled");
      }
    }
    GMTrace.o(10787347234816L, 80372);
  }
  
  public final i azz()
  {
    GMTrace.i(10786407710720L, 80365);
    this.llv = new l();
    l locall = this.llv;
    GMTrace.o(10786407710720L, 80365);
    return locall;
  }
  
  public final void cq(Context paramContext)
  {
    GMTrace.i(10785199751168L, 80356);
    w.i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
    GMTrace.o(10785199751168L, 80356);
  }
  
  public final int type()
  {
    GMTrace.i(18482989105152L, 137709);
    GMTrace.o(18482989105152L, 137709);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */