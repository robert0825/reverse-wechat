package com.tencent.mm.plugin.voip.widget;

import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.plugin.voip.ui.VoipWarningDialog;
import com.tencent.mm.plugin.voip.ui.VoipWarningDialog.a;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b
  implements com.tencent.mm.plugin.voip.ui.b
{
  private static final String esG;
  private static final String esH;
  public int mStatus;
  private CaptureView qHb;
  public x qHf;
  private boolean qHg;
  private boolean qHh;
  private int qHl;
  private long qHm;
  private boolean qIq;
  public com.tencent.mm.sdk.platformtools.aj qNE;
  private com.tencent.mm.plugin.voip.ui.c qQI;
  public BaseSmallView qQJ;
  public com.tencent.mm.sdk.platformtools.aj qQK;
  private PowerManager.WakeLock qQL;
  private long qQM;
  private boolean qQN;
  private View.OnClickListener qQO;
  private com.tencent.mm.sdk.platformtools.aj qQP;
  
  static
  {
    GMTrace.i(5240531189760L, 39045);
    String str = p.ta();
    esG = str;
    esH = o.getString(str.hashCode());
    GMTrace.o(5240531189760L, 39045);
  }
  
  public b(com.tencent.mm.plugin.voip.ui.c paramc, int paramInt, x paramx, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(5237041528832L, 39019);
    this.mStatus = -1;
    this.qHm = -1L;
    this.qHl = 1;
    this.qQM = -1L;
    this.qQN = false;
    this.qIq = false;
    this.qQO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5241336496128L, 39051);
        if (b.this.qQJ != null) {
          b.this.qQJ.setOnClickListener(null);
        }
        b.this.qNE = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(15362561146880L, 114460);
            w.i("MicroMsg.Voip.VoipSmallWindow", "click small view and time is up we remove it..");
            b.this.bwm();
            if (b.this.qNE != null) {
              b.this.qNE.stopTimer();
            }
            GMTrace.o(15362561146880L, 114460);
            return true;
          }
        }, false);
        b.this.qNE.z(2000L, 2000L);
        paramAnonymousView = new Intent(ab.getContext(), VideoActivity.class);
        paramAnonymousView.setFlags(268435456);
        ab.getContext().startActivity(paramAnonymousView);
        GMTrace.o(5241336496128L, 39051);
      }
    };
    w.i("MicroMsg.Voip.VoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(paramInt), paramx.field_username, Boolean.valueOf(paramBoolean1) });
    this.qHf = paramx;
    this.qQI = paramc;
    this.qHh = paramBoolean1;
    this.qHg = paramBoolean2;
    this.qIq = paramBoolean3;
    dq(0, paramInt);
    this.qQL = ((PowerManager)ab.getContext().getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.VoipSmallWindow");
    this.qQL.acquire();
    GMTrace.o(5237041528832L, 39019);
  }
  
  private void bwk()
  {
    GMTrace.i(5237981052928L, 39026);
    w.i("MicroMsg.Voip.VoipSmallWindow", "showMini");
    boolean bool = false;
    if ((this.mStatus == 261) || (this.mStatus == 7))
    {
      this.qQP = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(5241068060672L, 39049);
          com.tencent.mm.plugin.voip.model.d.btH().JQ(b.this.bwj());
          GMTrace.o(5241068060672L, 39049);
          return true;
        }
      }, true);
      this.qQP.z(1000L, 1000L);
      bool = true;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ab.getContext(), VideoActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("Voip_User", this.qHf.field_username);
    localIntent.putExtra("Voip_Outcall", this.qHg);
    localIntent.putExtra("Voip_VideoCall", this.qHh);
    localIntent.putExtra("Voip_Is_Talking", bool);
    com.tencent.mm.plugin.voip.model.d.btH().a(localIntent, new com.tencent.mm.plugin.voip.ui.a()
    {
      public final void a(Intent paramAnonymousIntent, com.tencent.mm.plugin.voip.ui.h paramAnonymoush)
      {
        GMTrace.i(14282376871936L, 106412);
        if (paramAnonymousIntent.getBooleanExtra("Voip_Is_Talking", false))
        {
          paramAnonymoush.JQ(b.this.bwj());
          GMTrace.o(14282376871936L, 106412);
          return;
        }
        paramAnonymoush.JQ(ab.getContext().getString(R.l.dKo));
        GMTrace.o(14282376871936L, 106412);
      }
      
      public final boolean aHS()
      {
        GMTrace.i(14282242654208L, 106411);
        if ((com.tencent.mm.plugin.voip.b.b.wD(b.this.mStatus)) || (com.tencent.mm.plugin.voip.b.b.wB(b.this.mStatus)))
        {
          GMTrace.o(14282242654208L, 106411);
          return true;
        }
        GMTrace.o(14282242654208L, 106411);
        return false;
      }
    });
    GMTrace.o(5237981052928L, 39026);
  }
  
  private static void wF(int paramInt)
  {
    GMTrace.i(5237578399744L, 39023);
    Context localContext = ab.getContext();
    Toast.makeText(localContext, localContext.getString(paramInt), 1).show();
    GMTrace.o(5237578399744L, 39023);
  }
  
  public final void JP(String paramString)
  {
    GMTrace.i(14694425296896L, 109482);
    GMTrace.o(14694425296896L, 109482);
  }
  
  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5238652141568L, 39031);
    if ((260 != this.mStatus) && (6 != this.mStatus))
    {
      GMTrace.o(5238652141568L, 39031);
      return;
    }
    if (this.qQJ != null) {
      this.qQJ.a(paramInt1, paramInt2, paramArrayOfInt);
    }
    GMTrace.o(5238652141568L, 39031);
  }
  
  public final void a(CaptureView paramCaptureView)
  {
    GMTrace.i(5239725883392L, 39039);
    this.qHb = paramCaptureView;
    if ((this.qQJ != null) && (this.qHb != null))
    {
      if ((this.qHb.getParent() != null) && ((this.qHb.getParent() instanceof ViewGroup))) {
        ((ViewGroup)this.qHb.getParent()).removeView(this.qHb);
      }
      this.qQJ.a(paramCaptureView);
    }
    GMTrace.o(5239725883392L, 39039);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(5238920577024L, 39033);
    if ((260 != this.mStatus) && (6 != this.mStatus))
    {
      GMTrace.o(5238920577024L, 39033);
      return;
    }
    if (this.qQJ != null) {
      this.qQJ.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    GMTrace.o(5238920577024L, 39033);
  }
  
  public final void aJA()
  {
    GMTrace.i(5239591665664L, 39038);
    GMTrace.o(5239591665664L, 39038);
  }
  
  public final void ax(int paramInt, String paramString)
  {
    GMTrace.i(5238517923840L, 39030);
    if (paramInt == 241) {
      Toast.makeText(ab.getContext(), paramString, 1).show();
    }
    w.d("MicroMsg.Voip.VoipSmallWindow", "getHintByErrorCode " + paramInt);
    if (paramInt == 235) {
      paramInt = R.l.eir;
    }
    while (paramInt == 0)
    {
      wF(R.l.eip);
      GMTrace.o(5238517923840L, 39030);
      return;
      if (paramInt == 233)
      {
        com.tencent.mm.plugin.voip.model.d.btG().buP();
        paramInt = R.l.eiq;
      }
      else if (paramInt == 237)
      {
        if ((!com.tencent.mm.ap.b.Jw()) || (this.qHh)) {
          paramInt = R.l.eis;
        } else {
          paramInt = R.l.eiu;
        }
      }
      else if (paramInt == 236)
      {
        paramInt = R.l.eiE;
      }
      else if (paramInt == 211)
      {
        paramInt = R.l.eit;
      }
      else
      {
        paramInt = 0;
      }
    }
    wF(paramInt);
    GMTrace.o(5238517923840L, 39030);
  }
  
  public final void buu()
  {
    GMTrace.i(5238786359296L, 39032);
    if (this.qQJ != null) {
      this.qQJ.buu();
    }
    GMTrace.o(5238786359296L, 39032);
  }
  
  public final Context bvu()
  {
    GMTrace.i(5239054794752L, 39034);
    GMTrace.o(5239054794752L, 39034);
    return null;
  }
  
  public final void bvv()
  {
    GMTrace.i(5239457447936L, 39037);
    Toast.makeText(ab.getContext(), R.l.eiL, 1).show();
    GMTrace.o(5239457447936L, 39037);
  }
  
  public final void bwi()
  {
    GMTrace.i(5237712617472L, 39024);
    w.i("MicroMsg.Voip.VoipSmallWindow", "show mini..");
    bwm();
    Object localObject = ab.getContext();
    com.tencent.mm.plugin.voip.model.d.btG();
    this.qQJ = new a((Context)localObject, m.iA(false));
    this.qQJ.eg(this.qHm);
    localObject = ab.getContext();
    com.tencent.mm.plugin.voip.model.d.btG();
    float f1 = m.iA(true);
    int i = ((WindowManager)((Context)localObject).getSystemService("window")).getDefaultDisplay().getHeight() / 5 + BackwardSupportUtil.b.a((Context)localObject, 7.0F);
    float f2 = i;
    int j = (int)(BackwardSupportUtil.b.a((Context)localObject, 7.0F) + f1 * f2);
    this.qQJ.setViewSize(j, i);
    this.qQJ.setOnClickListener(this.qQO);
    w.i("MicroMsg.Voip.VoipSmallWindow", "now add to view..");
    Point localPoint = new Point(j, i);
    w.i("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager");
    if ((!com.tencent.mm.plugin.voip.b.b.wD(this.mStatus)) && (!com.tencent.mm.plugin.voip.b.b.wB(this.mStatus)))
    {
      w.i("MicroMsg.Voip.VoipSmallWindow", "not in voip talking or inviting,now return..");
      GMTrace.o(5237712617472L, 39024);
      return;
    }
    if (this.qQK != null) {
      this.qQK.stopTimer();
    }
    if (this.qQP != null) {
      this.qQP.stopTimer();
    }
    if (this.qNE != null) {
      this.qNE.stopTimer();
    }
    at.getNotification().cancel(40);
    localObject = (WindowManager)ab.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.type = 2002;
    localLayoutParams.format = 1;
    localLayoutParams.flags = 40;
    localLayoutParams.gravity = 51;
    Context localContext = ab.getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
    localLayoutParams.width = localPoint.x;
    localLayoutParams.height = localPoint.y;
    localPoint = com.tencent.mm.plugin.voip.model.d.btG().qIn;
    if (localPoint == null)
    {
      at.AR();
      i = com.tencent.mm.y.c.xh().getInt(327947, 0);
      j = BackwardSupportUtil.b.a(localContext, 5.0F);
      localLayoutParams.x = (localDisplayMetrics.widthPixels - localLayoutParams.width - j);
    }
    for (localLayoutParams.y = (j + i);; localLayoutParams.y = localPoint.y)
    {
      if (this.qHb != null)
      {
        if ((this.qHb.getParent() != null) && ((this.qHb.getParent() instanceof ViewGroup))) {
          ((ViewGroup)this.qHb.getParent()).removeView(this.qHb);
        }
        this.qQJ.a(this.qHb);
      }
      this.qQJ.setTag(Integer.valueOf(this.mStatus));
      try
      {
        ((WindowManager)localObject).addView(this.qQJ, localLayoutParams);
        GMTrace.o(5237712617472L, 39024);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager failed: %s", new Object[] { localException.getMessage() });
        GMTrace.o(5237712617472L, 39024);
      }
      localLayoutParams.x = localPoint.x;
    }
  }
  
  public final String bwj()
  {
    GMTrace.i(5237846835200L, 39025);
    int i = (int)(System.currentTimeMillis() / 1000L - this.qHm);
    if (this.qHm == -1L) {
      i = 0;
    }
    if (i >= 3600) {}
    for (String str1 = String.format(Locale.US, "%d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) });; str1 = String.format(Locale.US, "%d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }))
    {
      String str2 = str1;
      if (com.tencent.pb.common.c.h.yp(str1)) {
        str2 = "00:00";
      }
      GMTrace.o(5237846835200L, 39025);
      return str2;
    }
  }
  
  public final String bwl()
  {
    GMTrace.i(5238115270656L, 39027);
    int i = (int)(System.currentTimeMillis() / 1000L - this.qHm);
    if (this.qHm == -1L) {
      i = 0;
    }
    String str = ab.getContext().getString(R.l.ejl);
    if (i >= 3600) {}
    for (str = str + String.format(Locale.US, "    %d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) });; str = str + String.format(Locale.US, "    %d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }))
    {
      GMTrace.o(5238115270656L, 39027);
      return str;
    }
  }
  
  public final void bwm()
  {
    GMTrace.i(5238383706112L, 39029);
    w.i("MicroMsg.Voip.VoipSmallWindow", "removeSmallView");
    if (this.qQK != null) {
      this.qQK.stopTimer();
    }
    w.i("MicroMsg.Voip.VoipSmallWindow", "remove small view..cancel notification first..");
    at.getNotification().cancel(40);
    Object localObject;
    if (this.qQJ != null)
    {
      localObject = (WindowManager.LayoutParams)this.qQJ.getLayoutParams();
      com.tencent.mm.plugin.voip.model.d.btG().qIn = new Point(((WindowManager.LayoutParams)localObject).x, ((WindowManager.LayoutParams)localObject).y);
      this.qQJ.uninit();
      localObject = (WindowManager)ab.getContext().getSystemService("window");
    }
    try
    {
      ((WindowManager)localObject).removeView(this.qQJ);
      this.qQJ = null;
      com.tencent.mm.plugin.voip.model.d.btH().JQ(ab.getContext().getString(R.l.dJA));
      if (this.qQP != null) {
        this.qQP.stopTimer();
      }
      com.tencent.mm.plugin.voip.model.d.btH().dismiss();
      GMTrace.o(5238383706112L, 39029);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        w.e("MicroMsg.Voip.VoipSmallWindow", "remove failed", new Object[] { localIllegalArgumentException });
      }
    }
  }
  
  public final void dq(int paramInt1, int paramInt2)
  {
    GMTrace.i(5237444182016L, 39022);
    w.i("MicroMsg.Voip.VoipSmallWindow", "newState: %s ", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(paramInt2) });
    if (paramInt2 == this.mStatus)
    {
      w.i("MicroMsg.Voip.VoipSmallWindow", "state unchange");
      GMTrace.o(5237444182016L, 39022);
      return;
    }
    this.mStatus = paramInt2;
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(5237444182016L, 39022);
      return;
      w.i("MicroMsg.Voip.VoipSmallWindow", "showVideoInviting");
      if (this.qQJ == null) {}
      for (Object localObject1 = null; (localObject1 != null) && ((((Integer)localObject1).intValue() == 0) || (2 == ((Integer)localObject1).intValue()) || (4 == ((Integer)localObject1).intValue())); localObject1 = (Integer)this.qQJ.getTag())
      {
        GMTrace.o(5237444182016L, 39022);
        return;
      }
      localObject1 = ab.getContext().getString(R.l.eje);
      f((String)localObject1, (String)localObject1, "", true);
      if (this.qQI != null) {
        this.qQI.a(this, 2);
      }
      GMTrace.o(5237444182016L, 39022);
      return;
      w.i("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking");
      this.qQN = true;
      if (-1L == this.qQM) {
        this.qQM = System.currentTimeMillis();
      }
      if (this.qQI != null) {
        this.qQI.a(this, 2);
      }
      if (!com.tencent.mm.compatible.e.b.aH(ab.getContext()))
      {
        w.e("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking, permission denied");
        VoipWarningDialog.a(ab.getContext(), new VoipWarningDialog.a()
        {
          public final void a(VoipWarningDialog paramAnonymousVoipWarningDialog)
          {
            GMTrace.i(5236773093376L, 39017);
            paramAnonymousVoipWarningDialog.finish();
            paramAnonymousVoipWarningDialog = ab.getContext().getString(R.l.eje);
            b.this.f(paramAnonymousVoipWarningDialog, r.fs(b.this.qHf.field_username), paramAnonymousVoipWarningDialog, false);
            if ((com.tencent.mm.plugin.voip.b.b.wD(b.this.mStatus)) || (com.tencent.mm.plugin.voip.b.b.wB(b.this.mStatus))) {
              b.this.bwi();
            }
            GMTrace.o(5236773093376L, 39017);
          }
          
          public final void b(VoipWarningDialog paramAnonymousVoipWarningDialog)
          {
            GMTrace.i(5236907311104L, 39018);
            paramAnonymousVoipWarningDialog.finish();
            GMTrace.o(5236907311104L, 39018);
          }
        });
        if (!com.tencent.mm.plugin.voip.model.d.btG().qIo)
        {
          com.tencent.mm.plugin.voip.model.d.btG().qIo = true;
          at.AR();
          long l = com.tencent.mm.y.c.xh().As(327950);
          if (System.currentTimeMillis() - l > 86400000L)
          {
            at.AR();
            com.tencent.mm.y.c.xh().setLong(327950, System.currentTimeMillis());
            w.d("MicroMsg.Voip.VoipSmallWindow", "reportRawMessage, len: " + "have not permission to showing floating window\n".length());
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("\n#client.version=").append(com.tencent.mm.protocal.d.tJC).append("\n");
            localStringBuilder.append("#accinfo.revision=").append(e.REV).append("\n");
            localStringBuilder.append("#accinfo.uin=").append(as.gnb.B("last_login_uin", esH)).append("\n");
            localStringBuilder.append("#accinfo.dev=").append(esG).append("\n");
            localStringBuilder.append("#accinfo.build=").append(e.TIME).append(":").append(e.HOSTNAME).append(":").append(f.eqV).append("\n");
            localObject1 = new Date();
            Object localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
            localStringBuilder.append("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1)).append("\n");
            localStringBuilder.append("#accinfo.content:\n");
            Intent localIntent = new Intent();
            localIntent.setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorService");
            localIntent.setAction("uncatch_exception");
            localIntent.putExtra("exceptionWriteSdcard", false);
            localIntent.putExtra("exceptionPid", Process.myPid());
            localObject2 = as.gnb.B("login_weixin_username", "");
            localObject1 = localObject2;
            if (bg.nm((String)localObject2)) {
              localObject1 = as.gnb.B("login_user_name", "never_login_crash");
            }
            localIntent.putExtra("userName", (String)localObject1);
            localIntent.putExtra("tag", "float_window_permission");
            localIntent.putExtra("exceptionMsg", Base64.encodeToString((localStringBuilder.toString() + "have not permission to showing floating window\n").getBytes(), 2));
            ab.getContext().startService(localIntent);
          }
        }
      }
      for (;;)
      {
        localObject1 = ab.getContext().getString(R.l.eje);
        f((String)localObject1, r.fs(this.qHf.field_username), (String)localObject1, false);
        GMTrace.o(5237444182016L, 39022);
        return;
        bwi();
      }
      w.i("MicroMsg.Voip.VoipSmallWindow", "showCalledVideoInviting");
      if (this.qQJ == null) {}
      for (localObject1 = null; (localObject1 != null) && ((256 == ((Integer)localObject1).intValue()) || (258 == ((Integer)localObject1).intValue())); localObject1 = (Integer)this.qQJ.getTag())
      {
        GMTrace.o(5237444182016L, 39022);
        return;
      }
      localObject1 = ab.getContext().getString(R.l.eje);
      f((String)localObject1, (String)localObject1, "", true);
      if (this.qQI != null) {
        this.qQI.a(this, 2);
      }
      GMTrace.o(5237444182016L, 39022);
      return;
      switch (paramInt1)
      {
      }
      for (;;)
      {
        bwm();
        GMTrace.o(5237444182016L, 39022);
        return;
        wF(R.l.eiX);
        continue;
        wF(R.l.eiO);
        continue;
        wF(R.l.ehz);
      }
      if (2 == this.qHl) {
        wF(R.l.eho);
      }
      bwm();
      localObject1 = ab.getContext().getString(R.l.ejl);
      f((String)localObject1, r.fs(this.qHf.field_username), (String)localObject1, true);
      bwk();
      if (this.qQI != null) {
        this.qQI.a(this, 2);
      }
      GMTrace.o(5237444182016L, 39022);
      return;
      w.i("MicroMsg.Voip.VoipSmallWindow", "showVoiceTalking");
      if (-1L == this.qQM) {
        this.qQM = System.currentTimeMillis();
      }
      if (2 == this.qHl) {
        wF(R.l.eho);
      }
      bwm();
      if (this.qQI != null) {
        this.qQI.a(this, 2);
      }
      this.qQK = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(5240799625216L, 39047);
          w.i("MicroMsg.Voip.VoipSmallWindow", "time out ,status is " + b.this.mStatus);
          if ((b.this.mStatus == 8) || (b.this.mStatus == 262) || (!com.tencent.mm.plugin.voip.b.d.bvN()))
          {
            at.getNotification().cancel(40);
            w.i("MicroMsg.Voip.VoipSmallWindow", "showVoiceTalking...CALLING_STATE_FINISH state..cancel notification..");
            if ((b.this.qQK != null) && (!b.this.qQK.bQn())) {
              b.this.qQK.stopTimer();
            }
            GMTrace.o(5240799625216L, 39047);
            return false;
          }
          w.i("MicroMsg.Voip.VoipSmallWindow", "show voice talking, first timer trigger..");
          String str = b.this.bwl();
          b.this.f(str, r.fs(b.this.qHf.field_username), str, false);
          GMTrace.o(5240799625216L, 39047);
          return true;
        }
      }, true);
      this.qQK.z(5000L, 5000L);
      localObject1 = bwl();
      f((String)localObject1, r.fs(this.qHf.field_username), (String)localObject1, false);
      bwk();
      if (4101 == paramInt1) {
        wF(R.l.eiZ);
      }
    }
  }
  
  public final void eg(long paramLong)
  {
    GMTrace.i(5239323230208L, 39036);
    this.qHm = paramLong;
    if (this.qQJ != null)
    {
      this.qQJ.eg(paramLong);
      GMTrace.o(5239323230208L, 39036);
      return;
    }
    if ((261 == this.mStatus) || (7 == this.mStatus))
    {
      String str = bwl();
      f(str, r.fs(this.qHf.field_username), str, false);
    }
    GMTrace.o(5239323230208L, 39036);
  }
  
  public final void f(final String paramString1, final String paramString2, final String paramString3, boolean paramBoolean)
  {
    GMTrace.i(5238249488384L, 39028);
    w.i("MicroMsg.Voip.VoipSmallWindow", "showNotification..show notification..tickContent:" + paramString1 + ",title:" + paramString2 + ",content:" + paramString3 + ",breathEffect:" + paramBoolean);
    w.j("MicroMsg.Voip.VoipSmallWindow", "breathEffect " + paramBoolean, new Object[0]);
    if (paramBoolean)
    {
      this.qQK = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
      {
        private int mCount;
        
        public final boolean pM()
        {
          GMTrace.i(14283182178304L, 106418);
          w.i("MicroMsg.Voip.VoipSmallWindow", "time out ,status is " + b.this.mStatus);
          this.mCount += 1;
          if ((b.this.mStatus == 8) || (b.this.mStatus == 262) || (!com.tencent.mm.plugin.voip.b.d.bvN()))
          {
            w.i("MicroMsg.Voip.VoipSmallWindow", "CALLING_STATE_FINISH state..cancel notification..");
            at.getNotification().cancel(40);
            if ((b.this.qQK != null) && (!b.this.qQK.bQn())) {
              b.this.qQK.stopTimer();
            }
            GMTrace.o(14283182178304L, 106418);
            return false;
          }
          b localb = b.this;
          StringBuilder localStringBuilder = new StringBuilder().append(paramString1);
          if (this.mCount % 2 == 1) {}
          for (String str = " ";; str = "")
          {
            localb.f(str, paramString2, paramString3, false);
            GMTrace.o(14283182178304L, 106418);
            return true;
          }
        }
      }, true);
      this.qQK.z(5000L, 5000L);
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClass(ab.getContext(), VideoActivity.class);
    ((Intent)localObject).putExtra("Voip_User", this.qHf.field_username);
    ((Intent)localObject).putExtra("Voip_Outcall", this.qHg);
    ((Intent)localObject).putExtra("Voip_VideoCall", this.qHh);
    localObject = PendingIntent.getActivity(ab.getContext(), 40, (Intent)localObject, 134217728);
    paramString1 = com.tencent.mm.plugin.voip.b.d.a(new Notification.Builder(ab.getContext()).setTicker(paramString1).setWhen(System.currentTimeMillis()).setContentTitle(paramString2).setContentText(paramString3).setContentIntent((PendingIntent)localObject).setOngoing(true));
    if (Build.VERSION.SDK_INT < 19) {}
    for (int i = R.g.aYC;; i = R.g.aYD)
    {
      paramString1.icon = i;
      at.getNotification().a(40, paramString1, false);
      GMTrace.o(5238249488384L, 39028);
      return;
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(5237309964288L, 39021);
    GMTrace.o(5237309964288L, 39021);
  }
  
  public final void uninit()
  {
    int i = 3;
    GMTrace.i(5239189012480L, 39035);
    w.i("MicroMsg.Voip.VoipSmallWindow", "uninit");
    com.tencent.mm.plugin.report.service.g localg;
    long l;
    if (-1L != this.qQM)
    {
      localg = com.tencent.mm.plugin.report.service.g.ork;
      if (this.qQN) {
        i = 2;
      }
      l = (System.currentTimeMillis() - this.qQM) / 1000L;
      if (!this.qIq) {
        break label188;
      }
    }
    label188:
    for (int j = 1;; j = 2)
    {
      localg.i(11620, new Object[] { Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(j) });
      if ((this.qQL != null) && (this.qQL.isHeld())) {
        this.qQL.release();
      }
      bwm();
      if (this.qQK != null) {
        this.qQK.stopTimer();
      }
      if (this.qQP != null) {
        this.qQP.stopTimer();
      }
      w.i("MicroMsg.Voip.VoipSmallWindow", "uninit..cancel notification..");
      at.getNotification().cancel(40);
      this.qHb = null;
      GMTrace.o(5239189012480L, 39035);
      return;
    }
  }
  
  public final void wu(int paramInt)
  {
    GMTrace.i(5237175746560L, 39020);
    GMTrace.o(5237175746560L, 39020);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */