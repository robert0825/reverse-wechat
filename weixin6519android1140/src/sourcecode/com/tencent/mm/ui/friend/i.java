package com.tencent.mm.ui.friend;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.protocal.m.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class i
  extends ContentObserver
  implements e
{
  private String eMW;
  private boolean guN;
  private Context mContext;
  private ContentResolver oWB;
  private boolean oWC;
  private boolean oWD;
  private String[] oWG;
  private int progress;
  private String vQH;
  private s vST;
  private ProgressBar vSh;
  private com.tencent.mm.ui.base.i vSi;
  private ae vSj;
  private String vWI;
  private final a xcC;
  private com.tencent.mm.modelfriend.t xcD;
  private com.tencent.mm.modelfriend.t xcE;
  private s xcF;
  private String xcG;
  private boolean xcH;
  private View xcI;
  public boolean xcJ;
  private int xcK;
  
  public i(int paramInt, Context paramContext, a parama)
  {
    super(ae.fetchFreeHandler());
    GMTrace.i(2788104863744L, 20773);
    this.oWC = false;
    this.oWD = false;
    this.guN = false;
    this.progress = 0;
    this.vSi = null;
    this.xcH = false;
    this.vQH = null;
    this.xcJ = true;
    this.vSj = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2830651883520L, 21090);
        if (((i.a(i.this) != null) && (!i.a(i.this).isShowing())) || (i.b(i.this)))
        {
          GMTrace.o(2830651883520L, 21090);
          return;
        }
        i.a(i.this, i.c(i.this) + 1);
        i.d(i.this).setProgress(i.c(i.this));
        if (i.c(i.this) < i.d(i.this).getMax() - 2)
        {
          sendEmptyMessageDelayed(0, 1000L);
          GMTrace.o(2830651883520L, 21090);
          return;
        }
        i.e(i.this);
        i.d(i.this).setIndeterminate(true);
        if (!i.f(i.this))
        {
          if (i.a(i.this) != null) {
            i.a(i.this).dismiss();
          }
          i.g(i.this);
        }
        GMTrace.o(2830651883520L, 21090);
      }
    };
    this.xcK = paramInt;
    this.xcH = false;
    this.mContext = paramContext;
    this.oWG = this.mContext.getResources().getStringArray(R.c.aMx);
    this.xcI = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(R.i.cDR, null);
    this.vSh = ((ProgressBar)this.xcI.findViewById(R.h.bUw));
    this.xcC = parama;
    GMTrace.o(2788104863744L, 20773);
  }
  
  private void Bu(int paramInt)
  {
    GMTrace.i(2788641734656L, 20777);
    if ((this.xcK == b.xcN) || (this.xcK == b.xcO)) {
      at.wS().a(132, this);
    }
    for (;;)
    {
      if (this.xcC != null) {
        this.xcC.Bu(paramInt);
      }
      GMTrace.o(2788641734656L, 20777);
      return;
      at.wS().a(145, this);
    }
  }
  
  private boolean aM(int paramInt, String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(2788507516928L, 20776);
    boolean bool1;
    switch (paramInt)
    {
    default: 
      bool1 = false;
    }
    for (;;)
    {
      GMTrace.o(2788507516928L, 20776);
      return bool1;
      Toast.makeText(this.mContext, R.l.cSM, 0).show();
      bool1 = bool2;
      continue;
      Toast.makeText(this.mContext, R.l.cZq, 0).show();
      bool1 = bool2;
      continue;
      w.e("MicroMsg.SmsBindMobileObserver", "dealErrCodeBindMobile");
      this.guN = true;
      if ((b.xcN == this.xcK) || (this.xcK == b.xcO))
      {
        at.AR();
        c.xh().set(4097, "");
        at.AR();
        c.xh().set(6, this.eMW);
        this.mContext.getApplicationContext();
        com.tencent.mm.modelfriend.a.GO();
      }
      Bu(1);
      Toast.makeText(this.mContext, R.l.cZn, 0).show();
      bool1 = bool2;
      continue;
      paramString = com.tencent.mm.h.a.dH(paramString);
      bool1 = bool2;
      if (paramString != null)
      {
        paramString.a(this.mContext, null, null);
        bool1 = bool2;
        continue;
        Toast.makeText(this.mContext, R.l.cZp, 0).show();
        bool1 = bool2;
        continue;
        if (this.xcK == b.xcM)
        {
          Bu(3);
          bool1 = bool2;
        }
        else
        {
          h.a(this.mContext, R.l.cZo, R.l.bhd, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2816693239808L, 20986);
              GMTrace.o(2816693239808L, 20986);
            }
          });
          bool1 = bool2;
          continue;
          Toast.makeText(this.mContext, R.l.cZs, 0).show();
          bool1 = bool2;
          continue;
          h.a(this.mContext, R.l.cZr, R.l.cUG, null);
          bool1 = bool2;
          continue;
          if (!this.xcH) {
            break;
          }
          Bu(6);
          bool1 = bool2;
          continue;
          h.a(this.mContext, R.l.cZm, R.l.cUG, null);
          bool1 = bool2;
        }
      }
    }
  }
  
  private String chw()
  {
    GMTrace.i(2789312823296L, 20782);
    String str = "( ";
    int i = 0;
    if (i < this.oWG.length)
    {
      if (i == this.oWG.length - 1) {}
      for (str = str + " body like \"%" + this.oWG[i] + "%\" ) ";; str = str + "body like \"%" + this.oWG[i] + "%\" or ")
      {
        i += 1;
        break;
      }
    }
    str = str + " and date > " + (System.currentTimeMillis() - 300000L) + " ";
    w.v("MicroMsg.SmsBindMobileObserver", "sql where:" + str);
    GMTrace.o(2789312823296L, 20782);
    return str;
  }
  
  private void j(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2788910170112L, 20779);
    switch (((com.tencent.mm.modelfriend.t)paramk).CD())
    {
    default: 
      GMTrace.o(2788910170112L, 20779);
      return;
    }
    if (((((com.tencent.mm.modelfriend.t)paramk).CD() == 2) || (((com.tencent.mm.modelfriend.t)paramk).CD() == 19)) && (this.vSi != null)) {
      this.vSi.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((((com.tencent.mm.modelfriend.t)paramk).CD() == 2) || (((com.tencent.mm.modelfriend.t)paramk).CD() == 19))
      {
        if (this.xcJ)
        {
          this.mContext.getApplicationContext();
          com.tencent.mm.modelfriend.a.GO();
        }
        Bu(1);
        GMTrace.o(2788910170112L, 20779);
        return;
      }
      if ((((com.tencent.mm.modelfriend.t)paramk).CD() == 1) || (((com.tencent.mm.modelfriend.t)paramk).CD() == 18))
      {
        w.v("MicroMsg.SmsBindMobileObserver", "mobile:" + this.eMW);
        GMTrace.o(2788910170112L, 20779);
        return;
      }
    }
    if (aM(paramInt2, paramString))
    {
      if (this.vSi != null) {
        this.vSi.dismiss();
      }
      this.guN = true;
      GMTrace.o(2788910170112L, 20779);
      return;
    }
    if (((com.tencent.mm.modelfriend.t)paramk).CD() == 2)
    {
      if (this.vSi != null) {
        this.vSi.dismiss();
      }
      this.guN = true;
      Bu(2);
      GMTrace.o(2788910170112L, 20779);
      return;
    }
    this.guN = true;
    if (this.vSi != null) {
      this.vSi.dismiss();
    }
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null)
    {
      paramString.a(this.mContext, null, null);
      GMTrace.o(2788910170112L, 20779);
      return;
    }
    Toast.makeText(this.mContext, this.mContext.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2788910170112L, 20779);
  }
  
  public final void WO(String paramString)
  {
    GMTrace.i(2788239081472L, 20774);
    int i;
    if ((this.xcK == b.xcN) || (this.xcK == b.xcO))
    {
      at.wS().a(132, this);
      this.eMW = paramString;
      this.oWC = false;
      this.oWD = false;
      this.xcG = "";
      this.guN = false;
      if ((this.xcK != b.xcN) && (this.xcK != b.xcO)) {
        break label219;
      }
      i = 1;
      if (this.xcK == b.xcO) {
        i = 18;
      }
      this.xcE = new com.tencent.mm.modelfriend.t(this.eMW, i, "", 0, "");
      at.wS().a(this.xcE, 0);
      if (this.vSi != null) {
        break label272;
      }
      this.vSi = h.a(this.mContext, false, this.mContext.getString(R.l.cZU), this.xcI, "", "", null, null);
    }
    for (;;)
    {
      this.progress = 0;
      this.vSh.setIndeterminate(false);
      this.vSj.sendEmptyMessage(1000);
      GMTrace.o(2788239081472L, 20774);
      return;
      at.wS().a(145, this);
      break;
      label219:
      paramString = this.eMW;
      if (this.xcH) {}
      for (i = 8;; i = 5)
      {
        this.vST = new s(paramString, i, "", 0, "");
        at.wS().a(this.vST, 0);
        break;
      }
      label272:
      this.vSi.show();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2788775952384L, 20778);
    w.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((!paramk.equals(this.xcD)) && (!paramk.equals(this.xcE)) && (!paramk.equals(this.xcF)) && (!paramk.equals(this.vST)))
    {
      w.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd, doScene is not called by this class");
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    if (this.guN)
    {
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    if ((paramInt1 == 1) || (paramInt1 == 2))
    {
      w.d("MicroMsg.SmsBindMobileObserver", "error net");
      if (this.vSi != null) {
        this.vSi.dismiss();
      }
      Bu(4);
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    if ((b.xcN == this.xcK) && (paramk.getType() == 132))
    {
      j(paramInt1, paramInt2, paramString, paramk);
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    if ((b.xcO == this.xcK) && (paramk.getType() == 132))
    {
      j(paramInt1, paramInt2, paramString, paramk);
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    if ((b.xcM == this.xcK) && (paramk.getType() == 145))
    {
      switch (((s)paramk).CD())
      {
      case 7: 
      default: 
        GMTrace.o(2788775952384L, 20778);
        return;
      }
      if (((((s)paramk).CD() == 6) || (((s)paramk).CD() == 9)) && (this.vSi != null)) {
        this.vSi.dismiss();
      }
      int i = ((m.b)((s)paramk).guL.AZ()).tKy.tUQ;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || ((paramInt2 == -35) && (i == 1)))
      {
        if (((s)paramk).CD() == 6)
        {
          this.vQH = ((s)paramk).Hx();
          w.d("MicroMsg.SmsBindMobileObserver", "NetSceneBindOpMobileForReg ticket: " + this.vQH);
          Bu(1);
          GMTrace.o(2788775952384L, 20778);
          return;
        }
        if (((s)paramk).CD() == 9)
        {
          this.vQH = ((s)paramk).Hx();
          w.d("MicroMsg.SmsBindMobileObserver", "NetSceneBindOpMobileForReg ticket: " + this.vQH);
          ((s)paramk).getUsername();
          ((s)paramk).Hw();
          GMTrace.o(2788775952384L, 20778);
          return;
        }
        if ((((s)paramk).CD() == 5) || (((s)paramk).CD() == 8))
        {
          w.v("MicroMsg.SmsBindMobileObserver", "mobile:" + this.eMW);
          if ((((s)paramk).CD() == 5) && (paramInt2 == -35) && (i == 1))
          {
            this.xcH = true;
            Bu(5);
          }
          GMTrace.o(2788775952384L, 20778);
          return;
        }
      }
      if ((((s)paramk).CD() == 6) || (((s)paramk).CD() == 9))
      {
        if (this.vSi != null) {
          this.vSi.dismiss();
        }
        this.guN = true;
        Bu(2);
        GMTrace.o(2788775952384L, 20778);
        return;
      }
      if (aM(paramInt2, paramString))
      {
        if (this.vSi != null) {
          this.vSi.dismiss();
        }
        this.guN = true;
        GMTrace.o(2788775952384L, 20778);
        return;
      }
      this.guN = true;
      if (this.vSi != null) {
        this.vSi.dismiss();
      }
      Toast.makeText(this.mContext, this.mContext.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(2788775952384L, 20778);
      return;
    }
    Assert.assertTrue("code path should not be here!", false);
    GMTrace.o(2788775952384L, 20778);
  }
  
  public final void bYZ()
  {
    GMTrace.i(2789178605568L, 20781);
    w.v("MicroMsg.SmsBindMobileObserver", "sms number:" + this.xcG);
    if ((this.oWC) || (this.guN) || (this.oWD))
    {
      GMTrace.o(2789178605568L, 20781);
      return;
    }
    Object localObject1 = Uri.parse("content://sms/inbox");
    this.oWB = this.mContext.getContentResolver();
    Object localObject3 = chw();
    if ((localObject3 == null) || (((String)localObject3).equals("")))
    {
      GMTrace.o(2789178605568L, 20781);
      return;
    }
    Object localObject2;
    try
    {
      localObject1 = this.oWB.query((Uri)localObject1, new String[] { "body", "_id", "date" }, (String)localObject3, null, null);
      if (localObject1 == null)
      {
        GMTrace.o(2789178605568L, 20781);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SmsBindMobileObserver", "get sms failed");
        w.printErrStackTrace("MicroMsg.SmsBindMobileObserver", localException, "", new Object[0]);
        localObject2 = null;
      }
      i = -1;
      long l1 = 0L;
      while (((Cursor)localObject2).moveToNext())
      {
        long l2 = ((Cursor)localObject2).getLong(2);
        if (l2 > l1)
        {
          i = ((Cursor)localObject2).getPosition();
          l1 = l2;
        }
      }
      this.vWI = null;
      if (i < 0) {
        break label473;
      }
    }
    this.oWD = true;
    ((Cursor)localObject2).moveToPosition(i);
    localObject3 = ((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("body"));
    localObject3 = Pattern.compile("\\d{4,8}").matcher((CharSequence)localObject3);
    if (((Matcher)localObject3).find()) {}
    for (localObject3 = ((Matcher)localObject3).group();; localObject3 = null)
    {
      this.vWI = ((String)localObject3);
      if (this.vSi != null) {
        this.vSi.setCancelable(true);
      }
      if ((this.xcK != b.xcN) && (this.xcK != b.xcO)) {
        break;
      }
      localObject3 = new hl();
      ((hl)localObject3).eKJ.context = this.mContext;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject3);
      localObject3 = ((hl)localObject3).eKK.eKL;
      Object localObject4 = new hm();
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject4);
      localObject4 = ((hm)localObject4).eKM.eKN;
      i = 2;
      if (this.xcK == b.xcO) {
        i = 19;
      }
      this.xcD = new com.tencent.mm.modelfriend.t(this.eMW, i, this.vWI, "", (String)localObject3, (String)localObject4);
      at.wS().a(this.xcD, 0);
      label473:
      ((Cursor)localObject2).close();
      GMTrace.o(2789178605568L, 20781);
      return;
    }
    localObject3 = this.eMW;
    if (this.xcH) {}
    for (int i = 9;; i = 6)
    {
      this.xcF = new s((String)localObject3, i, this.vWI, 0, "");
      at.wS().a(this.xcF, 0);
      break;
    }
  }
  
  public final void onChange(boolean paramBoolean)
  {
    GMTrace.i(2789044387840L, 20780);
    super.onChange(paramBoolean);
    if ((this.mContext instanceof Activity))
    {
      paramBoolean = com.tencent.mm.pluginsdk.h.a.a((Activity)this.mContext, "android.permission.READ_SMS", 128, "", "");
      w.i("MicroMsg.SmsBindMobileObserver", "summerper checkPermission checkSMS[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW(), this.mContext });
      if (!paramBoolean)
      {
        GMTrace.o(2789044387840L, 20780);
        return;
      }
    }
    bYZ();
    GMTrace.o(2789044387840L, 20780);
  }
  
  public final void recycle()
  {
    GMTrace.i(2788373299200L, 20775);
    at.wS().b(132, this);
    at.wS().b(145, this);
    this.mContext = null;
    this.guN = true;
    if (this.vSi != null) {
      this.vSi.dismiss();
    }
    GMTrace.o(2788373299200L, 20775);
  }
  
  public static abstract interface a
  {
    public abstract void Bu(int paramInt);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(2804747862016L, 20897);
      xcM = 1;
      xcN = 2;
      xcO = 3;
      xcP = new int[] { xcM, xcN, xcO };
      GMTrace.o(2804747862016L, 20897);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */