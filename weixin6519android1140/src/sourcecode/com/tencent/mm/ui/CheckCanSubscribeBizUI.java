package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.af.f;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ls;
import com.tencent.mm.protocal.c.lt;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.LinkedList;

public class CheckCanSubscribeBizUI
  extends MMActivity
  implements com.tencent.mm.ad.e, j.a, m.b
{
  private String appId;
  private int cfz;
  private String eGp;
  private String extInfo;
  private int fromScene;
  private boolean gpJ;
  private String nLA;
  private int scene;
  private String toUserName;
  private String vGA;
  private int vGB;
  private int vGu;
  private LinkedList<azq> vGv;
  private boolean vGw;
  private boolean vGx;
  private boolean vGy;
  private boolean vGz;
  
  public CheckCanSubscribeBizUI()
  {
    GMTrace.i(1882672070656L, 14027);
    this.vGw = false;
    this.gpJ = false;
    this.vGx = false;
    this.vGy = false;
    this.vGz = false;
    this.vGB = 0;
    GMTrace.o(1882672070656L, 14027);
  }
  
  private boolean Vr()
  {
    GMTrace.i(1883611594752L, 14034);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      w.e("MicroMsg.CheckCanSubscribeBizUI", "intent is null.");
      GMTrace.o(1883611594752L, 14034);
      return false;
    }
    this.appId = localIntent.getStringExtra("appId");
    this.toUserName = localIntent.getStringExtra("toUserName");
    if (bg.nm(this.toUserName))
    {
      w.e("MicroMsg.CheckCanSubscribeBizUI", "toUserName is null.");
      GMTrace.o(1883611594752L, 14034);
      return false;
    }
    this.extInfo = localIntent.getStringExtra("extInfo");
    this.cfz = localIntent.getIntExtra("source", -1);
    this.scene = localIntent.getIntExtra("scene", 0);
    this.vGB = localIntent.getIntExtra("jump_profile_type", 0);
    switch (this.cfz)
    {
    default: 
      w.e("MicroMsg.CheckCanSubscribeBizUI", "source(%d) is invalidated.", new Object[] { Integer.valueOf(this.cfz) });
      GMTrace.o(1883611594752L, 14034);
      return false;
    case 1: 
      if (bg.nm(this.appId))
      {
        w.e("MicroMsg.CheckCanSubscribeBizUI", "appId is null.");
        GMTrace.o(1883611594752L, 14034);
        return false;
      }
      this.fromScene = 68;
      ArrayList localArrayList = localIntent.getStringArrayListExtra("androidPackNameList");
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        w.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is null or nil.");
        GMTrace.o(1883611594752L, 14034);
        return false;
      }
      this.vGv = new LinkedList();
      int i = 0;
      while (i < localArrayList.size())
      {
        String str = (String)localArrayList.get(i);
        if (!bg.nm(str))
        {
          w.i("MicroMsg.CheckCanSubscribeBizUI", "packName(%d) : %s", new Object[] { Integer.valueOf(i), str });
          this.vGv.add(com.tencent.mm.platformtools.n.ni(str));
        }
        i += 1;
      }
      if (this.vGv.size() == 0)
      {
        w.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is nil.");
        GMTrace.o(1883611594752L, 14034);
        return false;
      }
      this.vGu = this.vGv.size();
    }
    for (;;)
    {
      this.eGp = localIntent.getStringExtra("fromURL");
      GMTrace.o(1883611594752L, 14034);
      return true;
      this.fromScene = 69;
    }
  }
  
  private void auD()
  {
    GMTrace.i(1884551118848L, 14041);
    if (this.cfz == 1) {
      LauncherUI.eW(this);
    }
    GMTrace.o(1884551118848L, 14041);
  }
  
  private void bWm()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(1883880030208L, 14036);
        w.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess..,canJump = " + this.vGw);
        if (this.scene == 1)
        {
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("rawUrl", this.vGA);
          com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent1);
          finish();
          GMTrace.o(1883880030208L, 14036);
          return;
        }
        if ((this.scene != 0) || (this.vGB != 1)) {
          break label190;
        }
        if (this.vGy)
        {
          w.i("MicroMsg.CheckCanSubscribeBizUI", "has jump ignore this scene");
          GMTrace.o(1883880030208L, 14036);
          continue;
        }
        this.vGy = true;
      }
      finally {}
      at.wS().a(233, this);
      Object localObject2 = new com.tencent.mm.modelsimple.l(this.extInfo, null, 4, (int)System.currentTimeMillis(), new byte[0]);
      at.wS().a((k)localObject2, 0);
      GMTrace.o(1883880030208L, 14036);
      continue;
      label190:
      if ((bWn()) && (this.vGw))
      {
        if (!this.vGy)
        {
          w.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
          localObject2 = new Intent().putExtra("Chat_User", this.toUserName);
          ((Intent)localObject2).putExtra("finish_direct", true);
          if (bg.nm(this.toUserName)) {
            com.tencent.mm.ui.contact.e.a((Intent)localObject2, this.toUserName);
          }
          ((Intent)localObject2).setClass(this, En_5b8fbb1e.class);
          if (!this.vGx)
          {
            setResult(-1);
            this.vGy = true;
            startActivity((Intent)localObject2);
            finish();
          }
        }
        GMTrace.o(1883880030208L, 14036);
      }
      else
      {
        if ((this.vGw) && (!this.vGy))
        {
          w.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
          at.AR();
          localObject2 = c.yK().TE(this.toUserName);
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("Contact_Scene", this.fromScene);
          localIntent2.putExtra("Verify_ticket", this.nLA);
          if (localObject2 != null)
          {
            localIntent2.putExtra("Contact_Alias", ((com.tencent.mm.storage.x)localObject2).qQ());
            localIntent2.putExtra("Contact_Nick", ((af)localObject2).field_nickname);
            localIntent2.putExtra("Contact_Signature", ((af)localObject2).signature);
            localIntent2.putExtra("Contact_RegionCode", ((af)localObject2).fjq);
            localIntent2.putExtra("Contact_Sex", ((af)localObject2).fja);
            localIntent2.putExtra("Contact_VUser_Info", ((af)localObject2).fjp);
            localIntent2.putExtra("Contact_VUser_Info_Flag", ((af)localObject2).field_verifyFlag);
            localIntent2.putExtra("Contact_KWeibo_flag", ((af)localObject2).field_weiboFlag);
            localIntent2.putExtra("Contact_KWeibo", ((af)localObject2).fjo);
            localIntent2.putExtra("Contact_KWeiboNick", ((af)localObject2).field_weiboNickname);
          }
          com.tencent.mm.ui.contact.e.k(localIntent2, this.toUserName);
          if (!this.vGx)
          {
            setResult(-1);
            this.vGy = true;
            com.tencent.mm.bj.d.b(this, "profile", ".ui.ContactInfoUI", localIntent2);
            finish();
          }
        }
        GMTrace.o(1883880030208L, 14036);
      }
    }
  }
  
  private boolean bWn()
  {
    boolean bool = false;
    for (;;)
    {
      com.tencent.mm.storage.x localx;
      int i;
      try
      {
        GMTrace.i(1884014247936L, 14037);
        at.AR();
        localx = c.yK().TE(this.toUserName);
        if ((localx != null) && ((int)localx.fTq != 0)) {
          break label313;
        }
        w.w("MicroMsg.CheckCanSubscribeBizUI", "contact is null.");
        i = 1;
        com.tencent.mm.af.d locald = null;
        if (i == 0) {
          locald = f.iK(this.toUserName);
        }
        if ((locald == null) || (locald.Ez()))
        {
          w.e("MicroMsg.CheckCanSubscribeBizUI", "BizInfo(" + locald + ") is null or should update.");
          i = 1;
        }
        if (this.vGz)
        {
          if (localx == null)
          {
            this.vGw = false;
            setResult(5);
            bWp();
            finish();
            GMTrace.o(1884014247936L, 14037);
            return bool;
          }
          this.vGw = true;
          this.gpJ = true;
          if (com.tencent.mm.l.a.eE(localx.field_type)) {
            break label289;
          }
          GMTrace.o(1884014247936L, 14037);
          continue;
        }
        if (i == 0) {
          break label253;
        }
      }
      finally {}
      if (this.vGw)
      {
        setResult(5);
        bWp();
        finish();
      }
      for (;;)
      {
        GMTrace.o(1884014247936L, 14037);
        break;
        ak.a.gmX.a(this.toUserName, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(2917759188992L, 21739);
            if (!paramAnonymousBoolean)
            {
              CheckCanSubscribeBizUI.a(CheckCanSubscribeBizUI.this);
              CheckCanSubscribeBizUI.b(CheckCanSubscribeBizUI.this);
            }
            GMTrace.o(2917759188992L, 21739);
          }
        });
      }
      label253:
      if (!com.tencent.mm.l.a.eE(localx.field_type))
      {
        w.w("MicroMsg.CheckCanSubscribeBizUI", "is not contact.");
        this.vGw = true;
        GMTrace.o(1884014247936L, 14037);
      }
      else
      {
        label289:
        this.vGw = true;
        this.gpJ = true;
        GMTrace.o(1884014247936L, 14037);
        bool = true;
        continue;
        label313:
        i = 0;
      }
    }
  }
  
  private void bWo()
  {
    GMTrace.i(1884282683392L, 14039);
    Toast.makeText(this, getString(R.l.efW), 1).show();
    auD();
    GMTrace.o(1884282683392L, 14039);
  }
  
  private void bWp()
  {
    GMTrace.i(1884416901120L, 14040);
    Toast.makeText(this, R.l.dRP, 1).show();
    auD();
    GMTrace.o(1884416901120L, 14040);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1883745812480L, 14035);
    w.d("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramk.getType() != 605)
    {
      if (paramk.getType() == 233)
      {
        at.wS().b(233, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (com.tencent.mm.modelsimple.l)paramk;
          paramInt1 = paramString.Le();
          w.i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 == 15)
          {
            paramString = paramString.Lc();
            w.d("MicroMsg.CheckCanSubscribeBizUI", "actionCode = %s, url = %s", new Object[] { Integer.valueOf(paramInt1), paramString });
            paramk = new gt();
            paramk.eJT.actionCode = paramInt1;
            paramk.eJT.result = paramString;
            paramk.eJT.context = this;
            com.tencent.mm.sdk.b.a.vgX.a(paramk, Looper.myLooper());
            finish();
            GMTrace.o(1883745812480L, 14035);
            return;
          }
          bWo();
          GMTrace.o(1883745812480L, 14035);
          return;
        }
        bWo();
        GMTrace.o(1883745812480L, 14035);
        return;
      }
      w.e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", new Object[] { Integer.valueOf(paramk.getType()) });
    }
    GMTrace.o(1883745812480L, 14035);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(1884819554304L, 14043);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(1884819554304L, 14043);
      return;
    }
    a((String)paramObject, null);
    GMTrace.o(1884819554304L, 14043);
  }
  
  public final void a(final String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(1884685336576L, 14042);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3078820462592L, 22939);
        w.d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange toUserName = " + CheckCanSubscribeBizUI.d(CheckCanSubscribeBizUI.this) + ", userName = " + paramString);
        if (CheckCanSubscribeBizUI.d(CheckCanSubscribeBizUI.this).equals(paramString))
        {
          CheckCanSubscribeBizUI.e(CheckCanSubscribeBizUI.this);
          if (!CheckCanSubscribeBizUI.f(CheckCanSubscribeBizUI.this)) {
            CheckCanSubscribeBizUI.b(CheckCanSubscribeBizUI.this);
          }
        }
        GMTrace.o(3078820462592L, 22939);
      }
    });
    GMTrace.o(1884685336576L, 14042);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1883477377024L, 14033);
    int i = R.i.cAC;
    GMTrace.o(1883477377024L, 14033);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1882806288384L, 14028);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    if ((!at.AT()) || (at.wF()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      GMTrace.o(1882806288384L, 14028);
      return;
    }
    at.wS().a(605, this);
    at.AR();
    c.yK().a(this);
    com.tencent.mm.af.x.FG().c(this);
    if (Vr())
    {
      paramBundle = this.appId;
      String str1 = this.toUserName;
      String str2 = this.extInfo;
      int i = this.vGu;
      LinkedList localLinkedList = this.vGv;
      String str3 = this.eGp;
      int j = this.cfz;
      int k = this.scene;
      Object localObject = new b.a();
      ((b.a)localObject).gtF = new ls();
      ((b.a)localObject).gtG = new lt();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcansubscribebiz";
      ((b.a)localObject).gtE = 605;
      localObject = ((b.a)localObject).DA();
      ls localls = (ls)((b)localObject).gtC.gtK;
      localls.lPg = paramBundle;
      localls.lSX = str1;
      localls.lTj = str2;
      localls.ucq = i;
      localls.ucr = localLinkedList;
      localls.ucs = null;
      localls.uct = str3;
      localls.tQP = j;
      localls.tOG = k;
      w.i("MicroMsg.CheckCanSubscribeBizUI", "appId(%s) , toUsername(%s) , extInfo(%s) , packNum(%d), scene(%d)", new Object[] { paramBundle, str1, str2, Integer.valueOf(i), Integer.valueOf(k) });
      u.a((b)localObject, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(2104802410496L, 15682);
          paramAnonymousb = (lt)paramAnonymousb.gtD.gtK;
          CheckCanSubscribeBizUI.a(CheckCanSubscribeBizUI.this, paramAnonymousb.ucu);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (!bg.nm(paramAnonymousb.ucu)) && (!bg.nm(paramAnonymousb.lSX)))
          {
            CheckCanSubscribeBizUI.b(CheckCanSubscribeBizUI.this, paramAnonymousb.lSX);
            CheckCanSubscribeBizUI.c(CheckCanSubscribeBizUI.this, paramAnonymousb.ucv);
            CheckCanSubscribeBizUI.b(CheckCanSubscribeBizUI.this);
            GMTrace.o(2104802410496L, 15682);
            return 0;
          }
          if (t.a.a(CheckCanSubscribeBizUI.this, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, 7))
          {
            CheckCanSubscribeBizUI.this.setResult(5);
            CheckCanSubscribeBizUI.this.finish();
            GMTrace.o(2104802410496L, 15682);
            return 0;
          }
          CheckCanSubscribeBizUI.c(CheckCanSubscribeBizUI.this);
          CheckCanSubscribeBizUI.this.setResult(3);
          CheckCanSubscribeBizUI.this.finish();
          GMTrace.o(2104802410496L, 15682);
          return 0;
        }
      });
      GMTrace.o(1882806288384L, 14028);
      return;
    }
    setResult(2);
    bWp();
    finish();
    GMTrace.o(1882806288384L, 14028);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1883208941568L, 14031);
    super.onDestroy();
    if (this.vGv != null) {
      this.vGv.clear();
    }
    if (at.AU())
    {
      at.wS().b(605, this);
      com.tencent.mm.af.x.FG().j(this);
      at.AR();
      c.yK().b(this);
    }
    GMTrace.o(1883208941568L, 14031);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1884148465664L, 14038);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      this.vGx = true;
      if (this.vGy)
      {
        GMTrace.o(1884148465664L, 14038);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1884148465664L, 14038);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(1883343159296L, 14032);
    super.onPause();
    GMTrace.o(1883343159296L, 14032);
  }
  
  protected void onResume()
  {
    GMTrace.i(1883074723840L, 14030);
    super.onResume();
    GMTrace.o(1883074723840L, 14030);
  }
  
  public void onStart()
  {
    GMTrace.i(1882940506112L, 14029);
    super.onStart();
    GMTrace.o(1882940506112L, 14029);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\CheckCanSubscribeBizUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */