package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.c.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.g.a.lc.a;
import com.tencent.mm.g.a.lc.b;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class d
  extends a
{
  private com.c.a.a lkW;
  private a lkX;
  public com.tencent.mm.pluginsdk.wallet.c lkY;
  
  public d()
  {
    GMTrace.i(10779696824320L, 80315);
    this.lkW = null;
    this.lkX = new a();
    this.lkY = null;
    GMTrace.o(10779696824320L, 80315);
  }
  
  public static void azD()
  {
    GMTrace.i(20964272242688L, 156196);
    w.i("MicroMsg.FingerPrintMgrImpl", "initRsaKey");
    if (!e.azF())
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "device is not support");
      GMTrace.o(20964272242688L, 156196);
      return;
    }
    if ((com.tencent.mm.plugin.wallet_core.model.n.byx().byP()) || (com.tencent.mm.plugin.wallet_core.model.n.byx().byT()))
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "user had not reg wxpay or is isSimpleReg");
      GMTrace.o(20964272242688L, 156196);
      return;
    }
    try
    {
      Object localObject = e.getUserId();
      w.i("MicroMsg.FingerPrintMgrImpl", "initRsaKey userId:" + (String)localObject);
      String str = p.ta();
      str = FingerPrintAuth.getRsaKey(e.cs(ab.getContext()), (String)localObject, str);
      localObject = str;
      if (TextUtils.isEmpty(str))
      {
        w.e("MicroMsg.FingerPrintMgrImpl", "FingerPrintAuth.getRsaKey() is null");
        localObject = FingerPrintAuth.genRsaKey(e.cs(ab.getContext()), e.getUserId(), p.ta());
      }
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        w.e("MicroMsg.FingerPrintMgrImpl", "FingerPrintAuth.genRsaKey() return null");
        GMTrace.o(20964272242688L, 156196);
        return;
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
      GMTrace.o(20964272242688L, 156196);
      return;
      w.e("MicroMsg.FingerPrintMgrImpl", "initRsaKey success!");
      GMTrace.o(20964272242688L, 156196);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
      w.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localException.getMessage());
      GMTrace.o(20964272242688L, 156196);
    }
  }
  
  public static void cr(Context paramContext)
  {
    GMTrace.i(20964406460416L, 156197);
    w.i("MicroMsg.FingerPrintMgrImpl", "initTASecureWorld");
    if (!c.azw())
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "device is not support");
      GMTrace.o(20964406460416L, 156197);
      return;
    }
    if (e.ct(paramContext) != 0)
    {
      e.eF(false);
      w.e("MicroMsg.FingerPrintMgrImpl", "copyTAFromAssets failed!");
      GMTrace.o(20964406460416L, 156197);
      return;
    }
    e.eF(true);
    w.e("MicroMsg.FingerPrintMgrImpl", "copyTAFromAssets success!");
    GMTrace.o(20964406460416L, 156197);
  }
  
  private int[] ny()
  {
    GMTrace.i(10780099477504L, 80318);
    if (this.lkW != null)
    {
      int[] arrayOfInt = this.lkW.ny();
      GMTrace.o(10780099477504L, 80318);
      return arrayOfInt;
    }
    w.i("MicroMsg.FingerPrintMgrImpl", "getIds auth == null");
    GMTrace.o(10780099477504L, 80318);
    return null;
  }
  
  public final int a(com.tencent.mm.pluginsdk.wallet.c paramc, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10780770566144L, 80323);
    if (this.lkW == null) {
      this.lkW = com.c.a.a.nx();
    }
    if (this.lkW != null)
    {
      this.lkY = paramc;
      this.lkW = com.c.a.a.nx();
      paramc = ny();
      paramInt = this.lkW.a(this.lkX, 0, paramc);
      GMTrace.o(10780770566144L, 80323);
      return paramInt;
    }
    GMTrace.o(10780770566144L, 80323);
    return -1;
  }
  
  public final void a(lc paramlc, int paramInt)
  {
    GMTrace.i(10781173219328L, 80326);
    String str1;
    String str2;
    Object localObject;
    if (paramlc != null)
    {
      str1 = paramlc.ePm.eJQ;
      str2 = e.getUserId();
      localObject = p.ta();
      String str3 = com.tencent.mm.wallet_core.c.n.clL();
      str1 = FingerPrintAuth.genPayFPEncrypt(e.cs(ab.getContext()), str2, (String)localObject, String.valueOf(paramInt), str3, str1, Build.MODEL);
      str2 = FingerPrintAuth.genOpenFPSign(e.cs(ab.getContext()), e.getUserId(), p.ta(), str1);
      if (TextUtils.isEmpty(str1)) {
        break label200;
      }
      w.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_info!");
      label91:
      if (TextUtils.isEmpty(str2)) {
        break label211;
      }
      w.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_sign!");
    }
    for (;;)
    {
      w.i("MicroMsg.FingerPrintMgrImpl", "callback FingerPrintAuthEvent onSuccess()");
      if ((paramlc != null) && (paramlc.ePm.ePq != null))
      {
        localObject = new lc.b();
        ((lc.b)localObject).ePs = 1;
        ((lc.b)localObject).errCode = 0;
        ((lc.b)localObject).eJR = str1;
        ((lc.b)localObject).eJS = str2;
        ((lc.b)localObject).eJP = paramInt;
        paramlc.ePn = ((lc.b)localObject);
        paramlc.ePm.ePq.run();
      }
      GMTrace.o(10781173219328L, 80326);
      return;
      str1 = "";
      break;
      label200:
      w.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_info!");
      break label91;
      label211:
      w.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_sign!");
    }
  }
  
  public final boolean a(boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    GMTrace.i(10782112743424L, 80333);
    GMTrace.o(10782112743424L, 80333);
    return false;
  }
  
  public final boolean azA()
  {
    GMTrace.i(10779831042048L, 80316);
    int[] arrayOfInt = com.c.a.a.nz();
    int i;
    boolean bool1;
    if (arrayOfInt != null)
    {
      i = 0;
      if (i < arrayOfInt.length) {
        if (1 == arrayOfInt[i])
        {
          bool1 = true;
          label38:
          if (p.fQG.fQO != 1) {
            break label107;
          }
        }
      }
    }
    label107:
    for (boolean bool2 = true;; bool2 = false)
    {
      w.i("MicroMsg.FingerPrintMgrImpl", "hy: is hardware support: %b, is config support : %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) || (!bool2)) {
        break label112;
      }
      GMTrace.o(10779831042048L, 80316);
      return true;
      i += 1;
      break;
      bool1 = false;
      break label38;
    }
    label112:
    GMTrace.o(10779831042048L, 80316);
    return false;
  }
  
  public final boolean azB()
  {
    GMTrace.i(10779965259776L, 80317);
    this.lkW = com.c.a.a.nx();
    int[] arrayOfInt = ny();
    if ((arrayOfInt == null) || (arrayOfInt.length <= 0)) {
      w.e("MicroMsg.FingerPrintMgrImpl", "ids is null");
    }
    azG();
    if ((arrayOfInt != null) && (arrayOfInt.length > 0))
    {
      GMTrace.o(10779965259776L, 80317);
      return true;
    }
    GMTrace.o(10779965259776L, 80317);
    return false;
  }
  
  public final void azC()
  {
    GMTrace.i(10780367912960L, 80320);
    w.i("MicroMsg.FingerPrintMgrImpl", "initFP");
    if (!azA())
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "device is not support fingerprintAuth");
      GMTrace.o(10780367912960L, 80320);
      return;
    }
    final Object localObject = com.tencent.mm.plugin.wallet_core.model.n.byx().byW();
    if ((localObject != null) && (!((ad)localObject).byM()))
    {
      w.e("MicroMsg.FingerPrintMgrImpl", "isSupportTouchPay is false");
      GMTrace.o(10780367912960L, 80320);
      return;
    }
    localObject = new ae(Looper.myLooper());
    w.i("MicroMsg.FingerPrintMgrImpl", "device is support fingerprintAuth");
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10774864986112L, 80279);
        if (!e.azS()) {}
        try
        {
          d.cr(ab.getContext());
          if (e.azT()) {}
        }
        catch (Exception localException1)
        {
          try
          {
            ClassLoader localClassLoader = com.tencent.mm.plugin.fingerprint.a.class.getClassLoader();
            if (!TextUtils.isEmpty(k.dS("teec")))
            {
              w.i("MicroMsg.FingerPrintMgrImpl", "LoadLibrary fingerprintauth.so, find the libteec so");
              k.b("fingerprintauth", localClassLoader);
              e.eG(true);
            }
            for (;;)
            {
              localObject.post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(10775938727936L, 80287);
                  try
                  {
                    d.azD();
                    GMTrace.o(10775938727936L, 80287);
                    return;
                  }
                  catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
                  {
                    w.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
                    GMTrace.o(10775938727936L, 80287);
                    return;
                  }
                  catch (Exception localException)
                  {
                    w.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
                    w.e("MicroMsg.FingerPrintMgrImpl", "init rsa key is occur exception e=" + localException.getMessage());
                    GMTrace.o(10775938727936L, 80287);
                  }
                }
              });
              GMTrace.o(10774864986112L, 80279);
              return;
              localException1 = localException1;
              w.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException1, "", new Object[0]);
              w.e("MicroMsg.FingerPrintMgrImpl", "init wechat ta secure world is occur exception e=" + localException1.getMessage());
              e.eF(false);
              break;
              w.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so, because can not find the libteec");
              e.eG(false);
            }
          }
          catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
          {
            for (;;)
            {
              w.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
              e.eG(false);
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException2, "", new Object[0]);
              w.e("MicroMsg.FingerPrintMgrImpl", "init rsa key is occur exception e=" + localException2.getMessage());
              e.eG(false);
            }
          }
        }
      }
    }, getClass().getName());
    GMTrace.o(10780367912960L, 80320);
  }
  
  public final boolean azE()
  {
    GMTrace.i(10780502130688L, 80321);
    GMTrace.o(10780502130688L, 80321);
    return true;
  }
  
  public final boolean azF()
  {
    GMTrace.i(10780636348416L, 80322);
    boolean bool = e.azF();
    GMTrace.o(10780636348416L, 80322);
    return bool;
  }
  
  /* Error */
  public final void azG()
  {
    // Byte code:
    //   0: ldc2_w 385
    //   3: ldc_w 387
    //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 39	com/tencent/mm/plugin/fingerprint/b/d:lkY	Lcom/tencent/mm/pluginsdk/wallet/c;
    //   14: aload_0
    //   15: getfield 32	com/tencent/mm/plugin/fingerprint/b/d:lkW	Lcom/c/a/a;
    //   18: ifnull +113 -> 131
    //   21: aload_0
    //   22: getfield 32	com/tencent/mm/plugin/fingerprint/b/d:lkW	Lcom/c/a/a;
    //   25: astore_1
    //   26: aload_1
    //   27: getfield 391	com/c/a/a:aCZ	Lcom/c/a/a$a;
    //   30: ifnull +12 -> 42
    //   33: aload_1
    //   34: getfield 391	com/c/a/a:aCZ	Lcom/c/a/a$a;
    //   37: bipush 8
    //   39: invokevirtual 397	com/c/a/a$a:removeMessages	(I)V
    //   42: aload_1
    //   43: getfield 401	com/c/a/a:aCX	Lcom/c/a/c;
    //   46: aload_1
    //   47: getfield 405	com/c/a/a:aCY	Lcom/c/a/b;
    //   50: invokeinterface 411 2 0
    //   55: aload_1
    //   56: getfield 401	com/c/a/a:aCX	Lcom/c/a/c;
    //   59: invokeinterface 415 1 0
    //   64: aload_1
    //   65: getfield 419	com/c/a/a:aDd	Landroid/os/IBinder$DeathRecipient;
    //   68: iconst_0
    //   69: invokeinterface 425 3 0
    //   74: pop
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 32	com/tencent/mm/plugin/fingerprint/b/d:lkW	Lcom/c/a/a;
    //   80: ldc2_w 385
    //   83: ldc_w 387
    //   86: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: return
    //   90: astore_1
    //   91: ldc 53
    //   93: aload_1
    //   94: ldc -108
    //   96: iconst_0
    //   97: anewarray 150	java/lang/Object
    //   100: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: ldc 53
    //   105: new 93	java/lang/StringBuilder
    //   108: dup
    //   109: ldc_w 427
    //   112: invokespecial 98	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: aload_1
    //   116: invokevirtual 155	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   119: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 60	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: goto -53 -> 75
    //   131: ldc 53
    //   133: ldc_w 429
    //   136: invokestatic 60	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: ldc2_w 385
    //   142: ldc_w 387
    //   145: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: return
    //   149: astore_1
    //   150: goto -75 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	d
    //   25	40	1	locala	com.c.a.a
    //   90	26	1	localException	Exception
    //   149	1	1	localRemoteException	android.os.RemoteException
    // Exception table:
    //   from	to	target	type
    //   21	42	90	java/lang/Exception
    //   42	75	90	java/lang/Exception
    //   42	75	149	android/os/RemoteException
  }
  
  public final void azH()
  {
    GMTrace.i(10781039001600L, 80325);
    if (this.lkW != null) {
      try
      {
        this.lkW.abort();
        GMTrace.o(10781039001600L, 80325);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
        w.i("MicroMsg.FingerPrintMgrImpl", "auth systemAbort occur exception e:" + localException.getMessage());
      }
    }
    GMTrace.o(10781039001600L, 80325);
  }
  
  public final void azI()
  {
    GMTrace.i(10781307437056L, 80327);
    w.e("MicroMsg.FingerPrintMgrImpl", "hy: param incorrect");
    GMTrace.o(10781307437056L, 80327);
  }
  
  public final Map<String, String> azJ()
  {
    GMTrace.i(10781575872512L, 80329);
    GMTrace.o(10781575872512L, 80329);
    return null;
  }
  
  public final j azK()
  {
    GMTrace.i(10781710090240L, 80330);
    GMTrace.o(10781710090240L, 80330);
    return null;
  }
  
  public final Map<String, String> azL()
  {
    GMTrace.i(10781844307968L, 80331);
    GMTrace.o(10781844307968L, 80331);
    return null;
  }
  
  public final boolean azM()
  {
    GMTrace.i(10781978525696L, 80332);
    GMTrace.o(10781978525696L, 80332);
    return true;
  }
  
  public final void azx()
  {
    GMTrace.i(10782246961152L, 80334);
    azH();
    azG();
    GMTrace.o(10782246961152L, 80334);
  }
  
  public final i azz()
  {
    GMTrace.i(10781441654784L, 80328);
    h localh = new h();
    GMTrace.o(10781441654784L, 80328);
    return localh;
  }
  
  public final void cq(Context paramContext)
  {
    GMTrace.i(10780233695232L, 80319);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.android.settings.fingerprint.FingerprintSettings");
      localIntent.addCategory("android.intent.category.DEFAULT");
      localIntent.setFlags(268435456);
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(10780233695232L, 80319);
  }
  
  public final int type()
  {
    GMTrace.i(18483525976064L, 137713);
    GMTrace.o(18483525976064L, 137713);
    return 1;
  }
  
  private final class a
    implements a.b
  {
    public a()
    {
      GMTrace.i(10772583284736L, 80262);
      GMTrace.o(10772583284736L, 80262);
    }
    
    public final void av(int paramInt1, int paramInt2)
    {
      GMTrace.i(10772717502464L, 80263);
      if (d.this.lkY != null) {
        d.this.lkY.av(paramInt1, paramInt2);
      }
      GMTrace.o(10772717502464L, 80263);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */