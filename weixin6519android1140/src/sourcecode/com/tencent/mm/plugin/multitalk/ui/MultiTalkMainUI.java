package com.tencent.mm.plugin.multitalk.ui;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.plugin.multitalk.a.e.6;
import com.tencent.mm.plugin.multitalk.a.i;
import com.tencent.mm.plugin.multitalk.a.i.a;
import com.tencent.mm.plugin.multitalk.a.m;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView;
import com.tencent.mm.plugin.multitalk.ui.widget.f;
import com.tencent.mm.plugin.multitalk.ui.widget.f.a;
import com.tencent.mm.plugin.multitalk.ui.widget.f.b;
import com.tencent.mm.plugin.voip.ui.MMCheckBox;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.pb.talkroom.sdk.d;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkMainUI
  extends MMActivity
  implements com.tencent.mm.plugin.multitalk.a.a
{
  protected ae krX;
  private com.tencent.mm.plugin.multitalk.ui.widget.c nnL;
  private f nnM;
  private boolean nnN;
  private boolean nnO;
  private boolean nnP;
  private Runnable nnQ;
  private boolean nnR;
  private BroadcastReceiver nnS;
  
  public MultiTalkMainUI()
  {
    GMTrace.i(4784727785472L, 35649);
    this.nnO = true;
    this.nnP = false;
    this.nnQ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4784190914560L, 35645);
        o.aRR().aRA();
        GMTrace.o(4784190914560L, 35645);
      }
    };
    this.nnS = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(4783922479104L, 35643);
        if (("android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent.getAction())) && (o.aRR().nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noE))
        {
          o.aRR().stopRing();
          MultiTalkMainUI.a(MultiTalkMainUI.this);
        }
        GMTrace.o(4783922479104L, 35643);
      }
    };
    GMTrace.o(4784727785472L, 35649);
  }
  
  private static int aII()
  {
    GMTrace.i(4785801527296L, 35657);
    if (at.AS().sh())
    {
      int i = at.AS().st();
      GMTrace.o(4785801527296L, 35657);
      return i;
    }
    if (!o.aRR().mjp.bwb())
    {
      GMTrace.o(4785801527296L, 35657);
      return 2;
    }
    GMTrace.o(4785801527296L, 35657);
    return 0;
  }
  
  public final int CN(String paramString)
  {
    GMTrace.i(4787412140032L, 35669);
    paramString = this.nnM.Dh(paramString);
    if (paramString == null)
    {
      GMTrace.o(4787412140032L, 35669);
      return -1;
    }
    int i = ((f.a)paramString.getTag()).npe.position;
    GMTrace.o(4787412140032L, 35669);
    return i;
  }
  
  protected final int Qf()
  {
    GMTrace.i(4787949010944L, 35673);
    GMTrace.o(4787949010944L, 35673);
    return 1;
  }
  
  public final void a(i.a parama)
  {
    GMTrace.i(4787680575488L, 35671);
    if (parama == i.a.nmX)
    {
      o.aRP().y(this);
      GMTrace.o(4787680575488L, 35671);
      return;
    }
    if (parama == i.a.nmY)
    {
      o.aRP().x(this);
      GMTrace.o(4787680575488L, 35671);
      return;
    }
    if (parama == i.a.nmZ) {
      com.tencent.mm.as.a.a(this, R.l.eiM, null);
    }
    GMTrace.o(4787680575488L, 35671);
  }
  
  public final void a(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    GMTrace.i(4787546357760L, 35670);
    if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noH)
    {
      parame = this.nnM;
      if (parame.npb > 0L) {
        parame.npb = System.currentTimeMillis();
      }
    }
    GMTrace.o(4787546357760L, 35670);
  }
  
  public final void a(String paramString, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    GMTrace.i(4787277922304L, 35668);
    this.nnM.a(paramString, paramBitmap, paramInt1, paramInt2);
    GMTrace.o(4787277922304L, 35668);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(4787143704576L, 35667);
    if (o.aRR().aRr()) {
      this.nnM.a(paramString, paramArrayOfInt, paramInt1, paramInt2, 0, paramInt3);
    }
    GMTrace.o(4787143704576L, 35667);
  }
  
  public final void aHW()
  {
    GMTrace.i(4786338398208L, 35661);
    jl localjl = new jl();
    localjl.eNh.action = 0;
    com.tencent.mm.sdk.b.a.vgX.m(localjl);
    this.nnM.go(true);
    o.aRR().nmx = null;
    o.aRR().stopRing();
    finish();
    GMTrace.o(4786338398208L, 35661);
  }
  
  public final void aHX()
  {
    GMTrace.i(4787814793216L, 35672);
    Object localObject3 = this.nnM;
    Object localObject1 = ((f)localObject3).jRw;
    long l = o.aRR().nmr;
    ((TextView)localObject1).setText(String.format("%02d:%02d", new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) }));
    Object localObject4 = o.aRR();
    Object localObject2 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).nmp.xOx;
    localObject1 = localObject2;
    if (bg.nm((String)localObject2)) {
      localObject1 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).nmp.xOy;
    }
    localObject1 = o.aRQ().nlX.XL((String)localObject1);
    if (localObject1 != null)
    {
      localObject2 = ((f)localObject3).noU.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (f.a)((RelativeLayout)((Iterator)localObject2).next()).getTag();
        if (((List)localObject1).contains(((f.a)localObject4).npe.username)) {
          ((f.a)localObject4).npg.setVisibility(0);
        } else {
          ((f.a)localObject4).npg.setVisibility(8);
        }
      }
    }
    localObject4 = o.aRR();
    localObject2 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).nmp.xOx;
    localObject1 = localObject2;
    if (bg.nm((String)localObject2)) {
      localObject1 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).nmp.xOy;
    }
    if (m.nnz == null) {
      m.nnz = new m();
    }
    localObject4 = m.nnz;
    localObject2 = new ArrayList();
    ((m)localObject4).nnA = com.tencent.wecall.talkroom.model.c.crn().YR((String)localObject1);
    if (((m)localObject4).nnA != null)
    {
      localObject1 = ((m)localObject4).nnA.crk().iterator();
      label371:
      label432:
      label435:
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (a.av)((Iterator)localObject1).next();
        int i = ((a.av)localObject4).mkl;
        byte[] arrayOfByte = new byte[4];
        if (o.aRQ().nlX.setAppCmd(10, arrayOfByte, i) < 0)
        {
          w.d("MicroMsg.Multitalk.VoipNetStatusChecker", "get netStatus failed");
          i = -1;
          if ((i == -1) || (i >= 5)) {
            break label432;
          }
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label435;
          }
          ((List)localObject2).add(((a.av)localObject4).xMH);
          break;
          i = bg.byteArrayToInt(arrayOfByte);
          w.d("MicroMsg.Multitalk.VoipNetStatusChecker", "netStatus: %d", new Object[] { Integer.valueOf(i) });
          break label371;
        }
      }
    }
    localObject1 = ((f)localObject3).noU.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (f.a)((RelativeLayout)((Iterator)localObject1).next()).getTag();
      if (((List)localObject2).contains(((f.a)localObject3).npe.username)) {
        ((f.a)localObject3).nph.setVisibility(0);
      } else {
        ((f.a)localObject3).nph.setVisibility(8);
      }
    }
    GMTrace.o(4787814793216L, 35672);
  }
  
  public final void aNV()
  {
    GMTrace.i(4786204180480L, 35660);
    this.nnL.aRX();
    this.nnM.o(o.aRR().nmp);
    GMTrace.o(4786204180480L, 35660);
  }
  
  public final void aQQ()
  {
    GMTrace.i(4786472615936L, 35662);
    at.AS().sg();
    com.tencent.mm.sdk.f.e.post(new e.6(o.aRR()), "MultiTalkManager_play_end_sound");
    jl localjl = new jl();
    localjl.eNh.action = 0;
    com.tencent.mm.sdk.b.a.vgX.m(localjl);
    this.nnM.go(false);
    o.aRR().nmx = null;
    o.aRR().stopRing();
    finish();
    GMTrace.o(4786472615936L, 35662);
  }
  
  public final void aQR()
  {
    GMTrace.i(4786069962752L, 35659);
    switch (6.nnU[o.aRR().nmo.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(4786069962752L, 35659);
      return;
      this.nnM.o(o.aRR().nmp);
      GMTrace.o(4786069962752L, 35659);
      return;
      this.nnL.n(o.aRR().nmp);
    }
  }
  
  public final void aQS()
  {
    GMTrace.i(4786606833664L, 35663);
    w.i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + o.aRR().nmn.size());
    if (o.aRR().aRr())
    {
      if (o.aRR().nmn.size() <= 0) {
        break label119;
      }
      i.aRJ();
      o.aRR().aRA();
    }
    for (;;)
    {
      f localf = this.nnM;
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(o.aRR().nmn);
      if (o.aRR().aRp()) {
        localf.c(localHashSet);
      }
      GMTrace.o(4786606833664L, 35663);
      return;
      label119:
      o.aRR().aRB();
    }
  }
  
  public final void aRW()
  {
    GMTrace.i(20506455572480L, 152785);
    this.nnR = true;
    Intent localIntent = new Intent(this, MultiTalkAddMembersUI.class);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = o.aRR().nmp.xOB.iterator();
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if ((localMultiTalkGroupMember.status == 10) || (localMultiTalkGroupMember.status == 1)) {
        localArrayList.add(localMultiTalkGroupMember.xOC);
      }
    }
    localIntent.putExtra("titile", getString(R.l.dJy));
    localIntent.putExtra("chatroomName", o.aRR().nmp.xOz);
    localIntent.putExtra("always_select_contact", bg.c(localArrayList, ","));
    localIntent.putExtra("key_need_gallery", false);
    startActivityForResult(localIntent, 1);
    GMTrace.o(20506455572480L, 152785);
  }
  
  public final void cx(int paramInt1, int paramInt2)
  {
    GMTrace.i(4787009486848L, 35666);
    if (o.aRR().aRr())
    {
      f localf = this.nnM;
      Object localObject = (f.a)localf.Dh(q.zE()).getTag();
      if (!i.rd(paramInt2))
      {
        if (i.rd(paramInt1))
        {
          localf.noP.setChecked(false);
          ((f.a)localObject).npe.aSb();
          localf.noO.setVisibility(8);
          if ((localf.noZ.equals(q.zE())) && (localf.noK.getVisibility() == 0))
          {
            localf.noZ = "";
            localf.noJ.setVisibility(0);
            localf.noK.setVisibility(8);
          }
        }
        localf.jr(false);
      }
      for (;;)
      {
        localObject = new HashSet();
        ((HashSet)localObject).addAll(o.aRR().nmn);
        if (i.re(paramInt2)) {
          break;
        }
        if (!i.re(paramInt1)) {
          break label265;
        }
        localf.aRY();
        GMTrace.o(4787009486848L, 35666);
        return;
        if ((i.rd(paramInt2)) && (!i.rd(paramInt1)))
        {
          localf.noP.setChecked(true);
          ((f.a)localObject).npe.aSc();
          ((f.a)localObject).npi.setVisibility(8);
          af.i(new f.b(localf, (f.a)localObject), 1500L);
          localf.noO.setVisibility(0);
        }
      }
      if ((i.re(paramInt2)) && (!i.re(paramInt1))) {
        localf.c((HashSet)localObject);
      }
    }
    label265:
    GMTrace.o(4787009486848L, 35666);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4784996220928L, 35651);
    int i = R.i.cCD;
    GMTrace.o(4784996220928L, 35651);
    return i;
  }
  
  public final void gg(boolean paramBoolean)
  {
    GMTrace.i(4786741051392L, 35664);
    if (o.aRR().aRr()) {
      this.nnM.noQ.setChecked(paramBoolean);
    }
    GMTrace.o(4786741051392L, 35664);
  }
  
  public final void gh(boolean paramBoolean)
  {
    GMTrace.i(4786875269120L, 35665);
    if (o.aRR().aRr()) {
      this.nnM.noR.setChecked(paramBoolean);
    }
    GMTrace.o(4786875269120L, 35665);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4785935745024L, 35658);
    w.i("MicroMsg.MT.MultiTalkMainUI", "onActivityResult " + paramInt1 + " resultCode " + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.nnR = false;
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      w.i("MicroMsg.MT.MultiTalkMainUI", "add member " + paramIntent);
      List localList = bg.g(paramIntent.split(","));
      if (localList == null)
      {
        GMTrace.o(4785935745024L, 35658);
        return;
      }
      com.tencent.mm.plugin.multitalk.a.e locale = o.aRR();
      if (locale.aRq())
      {
        String str = locale.nmp.xOx;
        paramIntent = str;
        if (bg.nm(str)) {
          paramIntent = locale.nmp.xOy;
        }
        o.aRQ().nlX.t(paramIntent, localList);
      }
    }
    GMTrace.o(4785935745024L, 35658);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4784862003200L, 35650);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    int i = getIntent().getIntExtra("enterMainUiSource", 0);
    if ((i == 1) || (i == 2)) {
      overridePendingTransition(R.a.aLC, R.a.aLj);
    }
    for (;;)
    {
      getWindow().addFlags(6946944);
      o.aRR().aHP();
      if (o.aRR().aRq()) {
        break;
      }
      finish();
      if (i == 2) {
        getIntent().getStringExtra("enterMainUiWxGroupId");
      }
      GMTrace.o(4784862003200L, 35650);
      return;
      overridePendingTransition(R.a.aMc, R.a.aMd);
    }
    this.nnL = new com.tencent.mm.plugin.multitalk.ui.widget.c(this);
    this.nnM = new f(this);
    o.aRR().gm(o.aRR().nmk);
    o.aRR().nmx = this;
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.intent.action.SCREEN_OFF");
    registerReceiver(this.nnS, paramBundle);
    this.nnP = true;
    this.krX = new ae();
    at.AS().sf();
    if (!com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 82, "", "")) {
      w.i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
    }
    GMTrace.o(4784862003200L, 35650);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4785398874112L, 35654);
    if (this.nnR) {
      o.aRR().gl(false);
    }
    if (this.nnP) {
      unregisterReceiver(this.nnS);
    }
    super.onDestroy();
    GMTrace.o(4785398874112L, 35654);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4785667309568L, 35656);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      com.tencent.mm.ui.base.h.a(this, R.l.dJR, R.l.dJx, R.l.cRM, R.l.cSk, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4783385608192L, 35639);
          o.aRR().c(false, false, false);
          GMTrace.o(4783385608192L, 35639);
        }
      }, null);
      GMTrace.o(4785667309568L, 35656);
      return true;
    }
    if (o.aRR().nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noE)
    {
      if ((paramInt == 25) || (paramInt == 24))
      {
        o.aRR().stopRing();
        this.nnO = false;
        GMTrace.o(4785667309568L, 35656);
        return true;
      }
    }
    else
    {
      if (paramInt == 25)
      {
        at.AS().ei(aII());
        GMTrace.o(4785667309568L, 35656);
        return true;
      }
      if (paramInt == 24)
      {
        at.AS().eh(aII());
        GMTrace.o(4785667309568L, 35656);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4785667309568L, 35656);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(4785264656384L, 35653);
    KeyguardManager localKeyguardManager = (KeyguardManager)ab.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
    boolean bool1 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool2 = hasWindowFocus();
    boolean bool3 = localPowerManager.isScreenOn();
    if (((bool2) || (!bool1)) && (bool3)) {}
    for (bool1 = true;; bool1 = false)
    {
      this.nnN = bool1;
      w.i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", new Object[] { Boolean.valueOf(this.nnN) });
      if (o.aRR().aRr())
      {
        o.aRR().aRB();
        this.nnM.jr(true);
      }
      super.onPause();
      GMTrace.o(4785264656384L, 35653);
      return;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(4788083228672L, 35674);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      w.e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(4788083228672L, 35674);
      return;
    }
    w.d("MicroMsg.MT.MultiTalkMainUI", "[multitalk] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(4788083228672L, 35674);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        w.d("MicroMsg.MT.MultiTalkMainUI", "granted record audio!");
        GMTrace.o(4788083228672L, 35674);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4783654043648L, 35641);
          MultiTalkMainUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(4783654043648L, 35641);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4793049284608L, 35711);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(4793049284608L, 35711);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(4785130438656L, 35652);
    super.onResume();
    switch (6.nnU[o.aRR().nmo.ordinal()])
    {
    }
    for (;;)
    {
      if (o.aRR().aRr())
      {
        if (o.aRR().aRo()) {
          this.nnM.a(null, true);
        }
        this.krX.postDelayed(this.nnQ, 2000L);
      }
      GMTrace.o(4785130438656L, 35652);
      return;
      this.nnM.noL.setVisibility(8);
      this.nnL.n(o.aRR().nmp);
      if (am.is4G(this)) {
        o.aRP().y(this);
      }
      while (this.nnO)
      {
        o.aRR().gn(false);
        break;
        if ((am.is2G(this)) || (am.is3G(this))) {
          o.aRP().x(this);
        }
      }
      this.nnL.aRX();
      this.nnM.o(o.aRR().nmp);
      if (am.is4G(this)) {
        o.aRP().y(this);
      }
      for (;;)
      {
        o.aRR().gn(true);
        break;
        if ((am.is2G(this)) || (am.is3G(this))) {
          o.aRP().x(this);
        }
      }
      this.nnL.aRX();
      this.nnM.o(o.aRR().nmp);
    }
  }
  
  protected void onStop()
  {
    GMTrace.i(4785533091840L, 35655);
    if ((!this.nnR) && (this.nnN)) {
      o.aRR().gl(false);
    }
    super.onStop();
    GMTrace.o(4785533091840L, 35655);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\MultiTalkMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */