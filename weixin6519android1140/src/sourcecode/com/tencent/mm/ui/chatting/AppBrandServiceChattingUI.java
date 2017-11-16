package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.m;
import com.tencent.mm.g.a.m.b;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.b.a;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.d.c.4;
import com.tencent.mm.ui.d.c.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

public class AppBrandServiceChattingUI
  extends MMFragmentActivity
{
  public u wrj;
  public com.tencent.mm.sdk.platformtools.ae wrk;
  
  public AppBrandServiceChattingUI()
  {
    GMTrace.i(2496718176256L, 18602);
    this.wrk = new com.tencent.mm.sdk.platformtools.ae();
    GMTrace.o(2496718176256L, 18602);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(2496986611712L, 18604);
    w.d("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingUI dispatch key event %s", new Object[] { paramKeyEvent });
    if ((this.wrj != null) && (this.wrj.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)))
    {
      GMTrace.o(2496986611712L, 18604);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(2496986611712L, 18604);
    return bool;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2496852393984L, 18603);
    getWindow().setFormat(-2);
    com.tencent.mm.pluginsdk.e.O(this);
    overridePendingTransition(0, 0);
    super.onCreate(null);
    if (getIntent().getStringExtra("Chat_User") == null)
    {
      finish();
      w.e("MicroMsg.AppBrandServiceChattingUI", "talker is null !!!");
      GMTrace.o(2496852393984L, 18603);
      return;
    }
    setContentView(R.i.cto);
    this.wrj = new a((byte)0);
    paramBundle = getIntent().getExtras();
    paramBundle.putBoolean("FROM_APP_BRAND_CHATTING_ACTIVITY", true);
    this.wrj.setArguments(paramBundle);
    aR().aV().a(R.h.bNx, this.wrj).commit();
    cN().cO().show();
    if (getIntent().getBooleanExtra("resend_fail_messages", false))
    {
      com.tencent.mm.sdk.platformtools.af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2176743112704L, 16218);
          com.tencent.mm.ui.base.h.a(AppBrandServiceChattingUI.this, AppBrandServiceChattingUI.this.getString(R.l.dMv), "", AppBrandServiceChattingUI.this.getString(R.l.dMw), AppBrandServiceChattingUI.this.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2497523482624L, 18608);
              paramAnonymous2DialogInterface = new ni();
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
              GMTrace.o(2497523482624L, 18608);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2298478592000L, 17125);
              paramAnonymous2DialogInterface = new kp();
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
              GMTrace.o(2298478592000L, 17125);
            }
          });
          GMTrace.o(2176743112704L, 16218);
        }
      }, 500L);
      getIntent().putExtra("is_need_resend_sns", false);
    }
    com.tencent.mm.permission.a.Ph().Pi();
    bXM();
    this.wrk.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2280761851904L, 16993);
        if (AppBrandServiceChattingUI.this.wrj != null) {
          com.tencent.mm.pluginsdk.e.a(AppBrandServiceChattingUI.this, AppBrandServiceChattingUI.this.wrj.vKB.vKI);
        }
        GMTrace.o(2280761851904L, 16993);
      }
    });
    GMTrace.o(2496852393984L, 18603);
  }
  
  @SuppressLint({"ValidFragment"})
  public static final class a
    extends En_5b8fbb1e.a
  {
    private String appId;
    public int fromScene;
    public WxaAttributes.b hRG;
    public WxaExposedParams iBy;
    public String iEr;
    private String ief;
    private String ieg;
    private String ieh;
    private boolean iei;
    private int iej;
    public View.OnCreateContextMenuListener odu;
    public boolean wrn;
    private String wro;
    private com.tencent.mm.sdk.b.c<kv> wrp;
    private final ChatFooter.d wrq;
    private com.tencent.mm.pluginsdk.ui.d.e wrr;
    private com.tencent.mm.ui.d.c wrs;
    public com.tencent.mm.ui.d.a wrt;
    
    public a()
    {
      GMTrace.i(2292304576512L, 17079);
      this.wro = "";
      this.wrq = new ChatFooter.d()
      {
        public final boolean ks(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19164815163392L, 142789);
          if (AppBrandServiceChattingUI.a.this.hRG != null)
          {
            WxaAttributes.b.a locala = (WxaAttributes.b.a)AppBrandServiceChattingUI.a.this.hRG.hRP.get(0);
            if ((AppBrandServiceChattingUI.a.this.fromScene == 2) && (AppBrandServiceChattingUI.a.this.iBy.username.equals(locala.userName)))
            {
              w.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", new Object[] { locala.userName, locala.eAw });
              AppBrandServiceChattingUI.a.this.VS(locala.eAw);
              GMTrace.o(19164815163392L, 142789);
              return true;
            }
            AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
            localAppBrandStatObject.scene = 1080;
            ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(AppBrandServiceChattingUI.a.this.vKB.vKW, locala.userName, "", 0, locala.version, locala.eAw, localAppBrandStatObject, AppBrandServiceChattingUI.a.this.getAppId());
          }
          for (;;)
          {
            GMTrace.o(19164815163392L, 142789);
            return true;
            w.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
          }
        }
      };
      this.wrr = new com.tencent.mm.pluginsdk.ui.d.e()
      {
        public final Object a(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
        {
          GMTrace.i(19219844431872L, 143199);
          switch (paramAnonymousk.type)
          {
          default: 
            GMTrace.o(19219844431872L, 143199);
            return null;
          }
          paramAnonymousk = AppBrandServiceChattingUI.a.this.cci();
          GMTrace.o(19219844431872L, 143199);
          return paramAnonymousk;
        }
        
        public final Object b(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
        {
          GMTrace.i(19219978649600L, 143200);
          if (paramAnonymousk.type == 45)
          {
            String str = new String(Base64.decode(paramAnonymousk.url, 0));
            paramAnonymousk = new String(Base64.decode(bg.aq((String)paramAnonymousk.t(String.class), ""), 0));
            w.d("MicroMsg.AppBrandServiceChattingUI", "appId:%s,path:%s", new Object[] { str, paramAnonymousk });
            if ((AppBrandServiceChattingUI.a.this.fromScene == 2) && (AppBrandServiceChattingUI.a.this.iBy.appId.equals(str)))
            {
              w.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", new Object[] { str, paramAnonymousk });
              AppBrandServiceChattingUI.a.this.VS(paramAnonymousk);
              GMTrace.o(19219978649600L, 143200);
              return Boolean.valueOf(true);
            }
            AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
            localAppBrandStatObject.scene = 1081;
            ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(AppBrandServiceChattingUI.a.this.vKB.vKW, null, str, 0, 0, paramAnonymousk, localAppBrandStatObject);
          }
          GMTrace.o(19219978649600L, 143200);
          return null;
        }
      };
      GMTrace.o(2292304576512L, 17079);
    }
    
    public a(byte paramByte)
    {
      super();
      GMTrace.i(2292438794240L, 17080);
      this.wro = "";
      this.wrq = new ChatFooter.d()
      {
        public final boolean ks(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19164815163392L, 142789);
          if (AppBrandServiceChattingUI.a.this.hRG != null)
          {
            WxaAttributes.b.a locala = (WxaAttributes.b.a)AppBrandServiceChattingUI.a.this.hRG.hRP.get(0);
            if ((AppBrandServiceChattingUI.a.this.fromScene == 2) && (AppBrandServiceChattingUI.a.this.iBy.username.equals(locala.userName)))
            {
              w.i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", new Object[] { locala.userName, locala.eAw });
              AppBrandServiceChattingUI.a.this.VS(locala.eAw);
              GMTrace.o(19164815163392L, 142789);
              return true;
            }
            AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
            localAppBrandStatObject.scene = 1080;
            ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(AppBrandServiceChattingUI.a.this.vKB.vKW, locala.userName, "", 0, locala.version, locala.eAw, localAppBrandStatObject, AppBrandServiceChattingUI.a.this.getAppId());
          }
          for (;;)
          {
            GMTrace.o(19164815163392L, 142789);
            return true;
            w.e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
          }
        }
      };
      this.wrr = new com.tencent.mm.pluginsdk.ui.d.e()
      {
        public final Object a(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
        {
          GMTrace.i(19219844431872L, 143199);
          switch (paramAnonymousk.type)
          {
          default: 
            GMTrace.o(19219844431872L, 143199);
            return null;
          }
          paramAnonymousk = AppBrandServiceChattingUI.a.this.cci();
          GMTrace.o(19219844431872L, 143199);
          return paramAnonymousk;
        }
        
        public final Object b(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
        {
          GMTrace.i(19219978649600L, 143200);
          if (paramAnonymousk.type == 45)
          {
            String str = new String(Base64.decode(paramAnonymousk.url, 0));
            paramAnonymousk = new String(Base64.decode(bg.aq((String)paramAnonymousk.t(String.class), ""), 0));
            w.d("MicroMsg.AppBrandServiceChattingUI", "appId:%s,path:%s", new Object[] { str, paramAnonymousk });
            if ((AppBrandServiceChattingUI.a.this.fromScene == 2) && (AppBrandServiceChattingUI.a.this.iBy.appId.equals(str)))
            {
              w.i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", new Object[] { str, paramAnonymousk });
              AppBrandServiceChattingUI.a.this.VS(paramAnonymousk);
              GMTrace.o(19219978649600L, 143200);
              return Boolean.valueOf(true);
            }
            AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
            localAppBrandStatObject.scene = 1081;
            ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(AppBrandServiceChattingUI.a.this.vKB.vKW, null, str, 0, 0, paramAnonymousk, localAppBrandStatObject);
          }
          GMTrace.o(19219978649600L, 143200);
          return null;
        }
      };
      GMTrace.o(2292438794240L, 17080);
    }
    
    private float zy(int paramInt)
    {
      GMTrace.i(17901289472000L, 133375);
      float f = TypedValue.applyDimension(1, paramInt, this.vKB.vKW.getResources().getDisplayMetrics());
      GMTrace.o(17901289472000L, 133375);
      return f;
    }
    
    public final void VS(String paramString)
    {
      GMTrace.i(19177968500736L, 142887);
      Intent localIntent = new Intent();
      localIntent.putExtra("keyOutPagePath", paramString);
      bWQ().setResult(-1, localIntent);
      finish();
      GMTrace.o(19177968500736L, 142887);
    }
    
    public final void cbG()
    {
      String str = null;
      GMTrace.i(2292841447424L, 17083);
      super.cbG();
      this.mTr.bLY();
      this.mTr.bMg();
      this.mTr.bMs();
      this.mTr.bMv();
      this.mTr.bMl();
      this.mTr.bMh();
      this.mTr.bMj();
      this.mTr.bMk();
      this.mTr.bMi();
      this.mTr.bMl();
      this.mTr.bMh();
      this.mTr.bMu();
      this.mTr.oJ();
      this.mTr.bMm();
      this.mTr.bMn();
      this.mTr.ko(true);
      this.mTr.kp(true);
      this.mTr.bMo();
      this.mTr.bMp();
      this.mTr.bMq();
      this.mTr.bMk();
      this.mTr.bMr();
      this.mTr.kn(com.tencent.mm.bj.d.bNA());
      Object localObject1 = cci();
      label247:
      boolean bool;
      label287:
      label301:
      label319:
      int i;
      Object localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject1 = null;
        this.hRG = ((WxaAttributes.b)localObject1);
        if ((this.hRG == null) || (this.hRG.hRP.size() != 1)) {
          break label471;
        }
        this.mTr.zv(1);
        this.mTr.a(this.wrq);
        localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(this.eMY.field_username);
        if ((localObject1 == null) || ((((WxaAttributes)localObject1).field_appOpt & 0x2) <= 0)) {
          break label534;
        }
        bool = true;
        this.wrn = bool;
        if (localObject1 != null) {
          break label539;
        }
        localObject1 = str;
        this.appId = ((String)localObject1);
        if (!this.wrn) {
          break label549;
        }
        CQ(0);
        if (this.fromScene == 2)
        {
          localObject1 = getAppId();
          str = this.eMY.field_username;
          i = this.fromScene;
          at.AR();
          localObject2 = com.tencent.mm.y.c.yP().TO(str);
          if (localObject2 != null) {
            break label558;
          }
          w.e("MicroMsg.AppBrandServiceChattingUI", "cvs:%s is null, error", new Object[] { str });
        }
      }
      for (;;)
      {
        this.wrt = new com.tencent.mm.ui.d.a(this.vKB.vKW);
        GMTrace.o(2292841447424L, 17083);
        return;
        localObject2 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn((String)localObject1);
        if (localObject2 != null)
        {
          localObject1 = ((WxaAttributes)localObject2).UH();
          break;
        }
        w.e("MicroMsg.AppBrandServiceHelper", "username:%s, attr is null or getWxaBizMenuByUsername return null", new Object[] { localObject1 });
        localObject1 = null;
        break;
        label471:
        if ((this.hRG != null) && (this.hRG.hRP != null))
        {
          w.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu.buttonList.size():%d", new Object[] { Integer.valueOf(this.hRG.hRP.size()) });
          break label247;
        }
        w.e("MicroMsg.AppBrandServiceChattingUI", "wxaBizMenu or wxaBizMenu.buttonList is empty");
        break label247;
        label534:
        bool = false;
        break label287;
        label539:
        localObject1 = ((WxaAttributes)localObject1).field_appId;
        break label301;
        label549:
        CQ(8);
        break label319;
        label558:
        int j = ((aj)localObject2).field_unReadCount;
        str = bg.nl(this.iEr);
        w.d("MicroMsg.AppBrandServiceChattingUI", "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s", new Object[] { Integer.valueOf(13799), localObject1, Integer.valueOf(i), Integer.valueOf(j), str });
        com.tencent.mm.plugin.report.service.g.ork.i(13799, new Object[] { localObject1, Integer.valueOf(i), Integer.valueOf(j), str, Long.valueOf(bg.Pu()) });
      }
    }
    
    protected final void cbH()
    {
      GMTrace.i(2292975665152L, 17084);
      super.cbH();
      AW(R.l.cSg);
      if (TextUtils.isEmpty(this.wro)) {
        this.wro = com.tencent.mm.ui.d.b.Vw(com.tencent.mm.ui.d.b.Vv(this.eMY.field_username));
      }
      if (TextUtils.isEmpty(this.wro))
      {
        AW(R.l.cSg);
        GMTrace.o(2292975665152L, 17084);
        return;
      }
      Ve(getResources().getString(R.l.cSg) + "-" + this.wro);
      GMTrace.o(2292975665152L, 17084);
    }
    
    public final void cbI()
    {
      GMTrace.i(2293109882880L, 17085);
      sq(this.eMY.field_nickname);
      if (this.wrn)
      {
        CQ(0);
        GMTrace.o(2293109882880L, 17085);
        return;
      }
      CQ(8);
      GMTrace.o(2293109882880L, 17085);
    }
    
    protected final void cbJ()
    {
      GMTrace.i(2293244100608L, 17086);
      a(0, R.l.cRY, R.g.aXV, new s()
      {
        public final void bxw()
        {
          GMTrace.i(19181860814848L, 142916);
          boolean bool = AppBrandServiceChattingUI.a.this.avJ();
          Runnable local1 = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19219307560960L, 143195);
              String str1 = com.tencent.mm.ui.d.b.Vv(AppBrandServiceChattingUI.a.this.eMY.field_username);
              if (TextUtils.isEmpty(str1)) {
                str1 = AppBrandServiceChattingUI.a.this.eMY.field_username;
              }
              for (String str2 = AppBrandServiceChattingUI.a.this.eMY.field_nickname;; str2 = com.tencent.mm.ui.d.b.Vw(str1))
              {
                AppBrandServiceChattingUI.a.this.wrt.username = AppBrandServiceChattingUI.a.this.eMY.field_username;
                AppBrandServiceChattingUI.a.this.wrt.vXl = false;
                AppBrandServiceChattingUI.a.this.wrt.scene = AppBrandServiceChattingUI.a.this.fromScene;
                AppBrandServiceChattingUI.a.this.wrt.vXk = AppBrandServiceChattingUI.a.this.iEr;
                if (AppBrandServiceChattingUI.a.this.fromScene != 2) {
                  break label250;
                }
                AppBrandServiceChattingUI.a.this.wrt.iBy = AppBrandServiceChattingUI.a.this.iBy;
                if (!AppBrandServiceChattingUI.a.this.wrn) {
                  break;
                }
                AppBrandServiceChattingUI.a.this.wrt.show(1);
                GMTrace.o(19219307560960L, 143195);
                return;
              }
              AppBrandServiceChattingUI.a.this.wrt.show(2);
              GMTrace.o(19219307560960L, 143195);
              return;
              label250:
              WxaExposedParams.a locala = new WxaExposedParams.a();
              locala.appId = AppBrandServiceChattingUI.a.this.getAppId();
              locala.eDj = 4;
              locala.username = str1;
              locala.eCQ = str2;
              AppBrandServiceChattingUI.a.this.wrt.iBy = locala.UI();
              AppBrandServiceChattingUI.a.this.wrt.appId = AppBrandServiceChattingUI.a.this.getAppId();
              if (AppBrandServiceChattingUI.a.this.wrn)
              {
                AppBrandServiceChattingUI.a.this.wrt.show(5);
                GMTrace.o(19219307560960L, 143195);
                return;
              }
              AppBrandServiceChattingUI.a.this.wrt.show(6);
              GMTrace.o(19219307560960L, 143195);
            }
          };
          if (bool) {}
          for (int i = 100;; i = 0)
          {
            com.tencent.mm.sdk.platformtools.af.i(local1, i);
            GMTrace.o(19181860814848L, 142916);
            return;
          }
        }
      });
      lg(true);
      GMTrace.o(2293244100608L, 17086);
    }
    
    protected final void cbK()
    {
      GMTrace.i(2293378318336L, 17087);
      super.cbK();
      this.odu = new View.OnCreateContextMenuListener()
      {
        public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
        {
          GMTrace.i(19183202992128L, 142926);
          w.d("MicroMsg.AppBrandServiceChattingUI", "menuListener onCreateCotextMenuListener");
          if (paramAnonymousView == null)
          {
            GMTrace.o(19183202992128L, 142926);
            return;
          }
          paramAnonymousContextMenuInfo = (dr)paramAnonymousView.getTag();
          if (paramAnonymousContextMenuInfo == null)
          {
            GMTrace.o(19183202992128L, 142926);
            return;
          }
          int k = paramAnonymousContextMenuInfo.position;
          au localau = (au)AppBrandServiceChattingUI.a.this.wvd.getItem(k);
          if (localau == null)
          {
            w.e("MicroMsg.AppBrandServiceChattingUI", "msg is null!");
            GMTrace.o(19183202992128L, 142926);
            return;
          }
          if (localau.bTF())
          {
            paramAnonymousContextMenu.add(k, 102, 0, AppBrandServiceChattingUI.a.this.Bg(R.l.dfg));
            paramAnonymousContextMenu.add(k, 108, 0, paramAnonymousView.getContext().getString(R.l.dSi));
            paramAnonymousContextMenu.add(k, 116, 0, paramAnonymousView.getContext().getString(R.l.dNH));
            if (com.tencent.mm.pluginsdk.model.app.g.N(AppBrandServiceChattingUI.a.this.vKB.vKW, localau.field_type)) {
              paramAnonymousContextMenu.add(k, 128, 0, paramAnonymousView.getContext().getString(R.l.dgi));
            }
          }
          if (localau.bTC())
          {
            at.AR();
            if (com.tencent.mm.y.c.isSDCardAvailable())
            {
              paramAnonymousContextMenu.add(k, 110, 0, paramAnonymousView.getContext().getString(R.l.dSi));
              paramAnonymousContextMenu.add(k, 116, 0, paramAnonymousView.getContext().getString(R.l.dNH));
              paramAnonymousContextMenuInfo = new dh();
              paramAnonymousContextMenuInfo.eEV.eDr = localau.field_msgId;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousContextMenuInfo);
              if ((paramAnonymousContextMenuInfo.eEW.eEu) || (com.tencent.mm.pluginsdk.model.app.g.N(AppBrandServiceChattingUI.a.this.vKB.vKW, localau.field_type))) {
                paramAnonymousContextMenu.add(k, 128, 0, paramAnonymousView.getContext().getString(R.l.dgi));
              }
              paramAnonymousContextMenuInfo = null;
              if (localau.field_msgId > 0L) {
                paramAnonymousContextMenuInfo = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
              }
              if ((com.tencent.mm.bj.d.LL("photoedit")) && (paramAnonymousContextMenuInfo.status != -1))
              {
                paramAnonymousContextMenuInfo = paramAnonymousContextMenu.add(k, 130, 0, paramAnonymousView.getContext().getString(R.l.dfG));
                int j = 0;
                int i = 0;
                int[] arrayOfInt = new int[2];
                if (paramAnonymousView != null)
                {
                  j = paramAnonymousView.getWidth();
                  i = paramAnonymousView.getHeight();
                  paramAnonymousView.getLocationInWindow(arrayOfInt);
                }
                Intent localIntent = new Intent();
                localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
                paramAnonymousContextMenuInfo.setIntent(localIntent);
              }
            }
          }
          if (localau.aCp())
          {
            paramAnonymousContextMenu.add(k, 111, 0, AppBrandServiceChattingUI.a.this.Bg(R.l.dSi));
            paramAnonymousContextMenuInfo = localau.field_content;
            if (paramAnonymousContextMenuInfo == null)
            {
              GMTrace.o(19183202992128L, 142926);
              return;
            }
            paramAnonymousContextMenuInfo = f.a.eS(paramAnonymousContextMenuInfo);
            if (paramAnonymousContextMenuInfo == null)
            {
              GMTrace.o(19183202992128L, 142926);
              return;
            }
            if (paramAnonymousContextMenuInfo.type == 5) {
              paramAnonymousContextMenu.add(k, 116, 0, paramAnonymousView.getContext().getString(R.l.dNH));
            }
          }
          paramAnonymousContextMenu.add(k, 100, 0, paramAnonymousView.getContext().getString(R.l.dgd));
          paramAnonymousContextMenu.add(k, 122, 0, AppBrandServiceChattingUI.a.this.Bg(R.l.dgg));
          GMTrace.o(19183202992128L, 142926);
        }
      };
      this.wvd.wyW = new cw(this, cci())
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19172062920704L, 142843);
          w.d("MicroMsg.AppBrandServiceChattingUI", "clickListener ChattingListClickListener onClick");
          Object localObject = (dr)paramAnonymousView.getTag();
          au localau;
          switch (((dr)localObject).jHw)
          {
          case 1: 
          case 9: 
          default: 
            localau = ((dr)localObject).eRz;
            if (localau == null)
            {
              GMTrace.o(19172062920704L, 142843);
              return;
            }
            break;
          case 6: 
            super.onClick(paramAnonymousView);
            GMTrace.o(19172062920704L, 142843);
            return;
          }
          if (localau.bTC())
          {
            super.onClick(paramAnonymousView);
            GMTrace.o(19172062920704L, 142843);
            return;
          }
          if ((((dr)localObject).jHw == 0) && (localau.aCp()))
          {
            localObject = localau.field_content;
            if (localObject == null)
            {
              GMTrace.o(19172062920704L, 142843);
              return;
            }
            localObject = f.a.eS((String)localObject);
            if (localObject == null)
            {
              GMTrace.o(19172062920704L, 142843);
              return;
            }
            if ((AppBrandServiceChattingUI.a.this.fromScene == 2) && (((f.a)localObject).type == 33) && (AppBrandServiceChattingUI.a.this.iBy.appId.equals(((f.a)localObject).gkS)))
            {
              AppBrandServiceChattingUI.a.this.VS(((f.a)localObject).gkQ);
              GMTrace.o(19172062920704L, 142843);
              return;
            }
            super.onClick(paramAnonymousView);
            GMTrace.o(19172062920704L, 142843);
            return;
          }
          if ((((dr)localObject).jHw == 5) && (localau.field_isSend == 1))
          {
            super.onClick(paramAnonymousView);
            GMTrace.o(19172062920704L, 142843);
            return;
          }
          GMTrace.o(19172062920704L, 142843);
        }
      };
      this.wvd.wyY = new cy(this.wvd.odu, this)
      {
        public int juH;
        public int juI;
        public View wrx;
        
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(19173002444800L, 142850);
          w.d("MicroMsg.AppBrandServiceChattingUI", "longClickListener ChattingListClickListener onLongClick");
          Object localObject;
          if ((paramAnonymousView.getTag() instanceof dr))
          {
            localObject = (dr)paramAnonymousView.getTag();
            if (((dr)localObject).jHw == 1)
            {
              GMTrace.o(19173002444800L, 142850);
              return true;
            }
            if (((dr)localObject).jHw == 9)
            {
              GMTrace.o(19173002444800L, 142850);
              return true;
            }
          }
          if ((paramAnonymousView.getTag(R.h.cie) instanceof int[]))
          {
            localObject = (int[])paramAnonymousView.getTag(R.h.cie);
            new com.tencent.mm.ui.widget.h(AppBrandServiceChattingUI.a.this.vKB.vKW).a(paramAnonymousView, AppBrandServiceChattingUI.a.this.odu, AppBrandServiceChattingUI.a.this.mTX, localObject[0], localObject[1]);
          }
          for (;;)
          {
            GMTrace.o(19173002444800L, 142850);
            return true;
            if (((this.juH == 0) && (this.juI == 0)) || (!this.wrx.equals(paramAnonymousView))) {
              paramAnonymousView.setOnTouchListener(new View.OnTouchListener()
              {
                public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
                {
                  GMTrace.i(19164278292480L, 142785);
                  AppBrandServiceChattingUI.a.7.this.juH = ((int)paramAnonymous2MotionEvent.getRawX());
                  AppBrandServiceChattingUI.a.7.this.juI = ((int)paramAnonymous2MotionEvent.getRawY());
                  AppBrandServiceChattingUI.a.7.this.wrx = paramAnonymous2View;
                  GMTrace.o(19164278292480L, 142785);
                  return false;
                }
              });
            } else {
              new com.tencent.mm.ui.widget.h(AppBrandServiceChattingUI.a.this.vKB.vKW).a(paramAnonymousView, AppBrandServiceChattingUI.a.this.odu, AppBrandServiceChattingUI.a.this.mTX, this.juH, this.juI);
            }
          }
        }
      };
      GMTrace.o(2293378318336L, 17087);
    }
    
    protected final boolean cbL()
    {
      GMTrace.i(2293646753792L, 17089);
      Object localObject;
      if (this.fromScene == 2)
      {
        at.AR();
        localObject = com.tencent.mm.y.c.yP().TO("appbrandcustomerservicemsg");
        if ((localObject != null) && (!bg.nm(((aj)localObject).field_username)))
        {
          int i = ((aj)localObject).field_unReadCount;
          m localm = new m();
          localm.eAp.eAr = this.eMY.field_username;
          com.tencent.mm.sdk.b.a.vgX.m(localm);
          int j = localm.eAq.eAs;
          w.i("MicroMsg.AppBrandServiceChattingUI", "parUnReadCount:%d, unReadCount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          ((com.tencent.mm.storage.ae)localObject).dz(Math.max(0, i - j));
          at.AR();
          if (com.tencent.mm.y.c.yP().a((com.tencent.mm.storage.ae)localObject, ((aj)localObject).field_username) == -1) {
            w.e("MicroMsg.AppBrandServiceChattingUI", "update SPUSER_APP_BRAND_SERVICE cvs unread failed");
          }
        }
      }
      for (;;)
      {
        boolean bool = super.cbL();
        GMTrace.o(2293646753792L, 17089);
        return bool;
        localObject = new com.tencent.mm.g.a.p();
        ((com.tencent.mm.g.a.p)localObject).eAB.eAr = this.eMY.field_username;
        ((com.tencent.mm.g.a.p)localObject).eAB.eAs = 0;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        continue;
        w.e("MicroMsg.AppBrandServiceChattingUI", "update Unread: can not find SPUSER_APP_BRAND_SERVICE cvs");
        continue;
        w.i("MicroMsg.AppBrandServiceChattingUI", "writeOpLogAndMarkRead clear AppBrandKvData username:%s", new Object[] { this.eMY.field_username });
        localObject = new com.tencent.mm.g.a.p();
        ((com.tencent.mm.g.a.p)localObject).eAB.eAr = this.eMY.field_username;
        ((com.tencent.mm.g.a.p)localObject).eAB.eAs = 0;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      }
    }
    
    public final void cbM()
    {
      GMTrace.i(18822023086080L, 140235);
      f.a locala = new f.a();
      locala.title = this.ief;
      locala.type = 33;
      locala.gkR = this.iBy.username;
      Object localObject1;
      Object localObject2;
      if (bg.nm(this.ieg))
      {
        localObject1 = this.iBy.ePf;
        locala.gkQ = ((String)localObject1);
        locala.gkS = this.iBy.appId;
        locala.gkY = this.iBy.hKB;
        locala.gkZ = this.iBy.hKC;
        locala.gkU = this.iBy.hRZ;
        locala.gkT = 2;
        locala.url = this.iBy.hSa;
        locala.gla = this.iBy.iconUrl;
        locala.eTu = ("wxapp_" + this.iBy.appId + this.iBy.ePf);
        locala.eTo = this.iBy.username;
        locala.eTp = this.iBy.eCQ;
        localObject2 = new byte[0];
        if (this.iej != 4) {
          break label318;
        }
        localObject1 = com.tencent.mm.modelappbrand.a.b.CT().hx(this.ieh);
      }
      for (;;)
      {
        label233:
        if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
        {
          w.i("MicroMsg.AppBrandServiceChattingUI", "thumb image is not null ");
          localObject2 = new ByteArrayOutputStream();
          ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
        }
        for (localObject1 = ((ByteArrayOutputStream)localObject2).toByteArray();; localObject1 = localObject2)
        {
          com.tencent.mm.pluginsdk.model.app.l.a(locala, getAppId(), this.ief, this.eMY.field_username, null, (byte[])localObject1);
          GMTrace.o(18822023086080L, 140235);
          return;
          localObject1 = this.ieg;
          break;
          label318:
          if (bg.nm(this.ieh)) {
            break label431;
          }
          Bitmap localBitmap = com.tencent.mm.modelappbrand.a.b.CT().hx(this.ieh);
          if (localBitmap != null)
          {
            localObject1 = localBitmap;
            if (!localBitmap.isRecycled()) {
              break label233;
            }
          }
          localBitmap = com.tencent.mm.sdk.platformtools.d.RD(this.ieh);
          localObject1 = localBitmap;
          if (this.iej == 2) {
            break label233;
          }
          boolean bool = com.tencent.mm.loader.stub.b.deleteFile(this.ieh);
          w.v("MicroMsg.AppBrandServiceChattingUI", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", new Object[] { this.ieh, Boolean.valueOf(bool) });
          localObject1 = localBitmap;
          break label233;
          w.e("MicroMsg.AppBrandServiceChattingUI", "thumb image is null");
        }
        label431:
        localObject1 = null;
      }
    }
    
    public final String getAppId()
    {
      GMTrace.i(19177700065280L, 142885);
      if (bg.nm(this.appId))
      {
        localObject = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(this.eMY.field_username);
        if (localObject != null) {
          break label87;
        }
      }
      label87:
      for (Object localObject = null;; localObject = ((WxaAttributes)localObject).field_appId)
      {
        this.appId = ((String)localObject);
        if (bg.nm(this.appId)) {
          w.e("MicroMsg.AppBrandServiceChattingUI", "error, appId is null");
        }
        localObject = this.appId;
        GMTrace.o(19177700065280L, 142885);
        return (String)localObject;
      }
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      GMTrace.i(2292707229696L, 17082);
      super.onActivityCreated(paramBundle);
      if (this.fromScene == 2)
      {
        paramBundle = new com.tencent.mm.modelsimple.k(cci(), 19, getStringExtra("key_temp_session_from"));
        at.wS().a(paramBundle, 0);
        w.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onActivityCreated NetSceneEnterTempSession");
      }
      this.wrp = new com.tencent.mm.sdk.b.c() {};
      com.tencent.mm.sdk.b.a.vgX.b(this.wrp);
      GMTrace.o(2292707229696L, 17082);
    }
    
    public final void onCreate(Bundle paramBundle)
    {
      GMTrace.i(2292573011968L, 17081);
      super.onCreate(paramBundle);
      this.fromScene = getIntExtra("app_brand_chatting_from_scene", 1);
      Object localObject = null;
      paramBundle = (Bundle)localObject;
      if (this.vHX)
      {
        paramBundle = (Bundle)localObject;
        if (bWQ() != null) {
          paramBundle = bWQ().getIntent().getParcelableExtra("app_brand_chatting_expose_params");
        }
      }
      localObject = paramBundle;
      if (paramBundle == null)
      {
        localObject = paramBundle;
        if (this.ol != null) {
          localObject = this.ol.getParcelable("app_brand_chatting_expose_params");
        }
      }
      this.iBy = ((WxaExposedParams)localObject);
      this.iEr = bg.nl(getStringExtra("key_scene_id"));
      this.ief = getStringExtra("sendMessageTitle");
      this.ieg = getStringExtra("sendMessagePath");
      this.ieh = getStringExtra("sendMessageImg");
      this.iei = aZ("showMessageCard", false).booleanValue();
      this.iej = getIntExtra("isBitmapFrom", 1);
      w.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate fromScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
      w.i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate wxaExposedParams:%s", new Object[] { this.iBy });
      w.i("MicroMsg.AppBrandServiceChattingUI", "mSceneId:%s, sendMessageTitle:%s, sendMessagePath:%s, sendMessageImg:%s, showMessageCard:%b, isBitmapFrom:%d", new Object[] { this.iEr, this.ief, this.ieg, this.ieh, Boolean.valueOf(this.iei), Integer.valueOf(this.iej) });
      GMTrace.o(2292573011968L, 17081);
    }
    
    public final void onDestroy()
    {
      GMTrace.i(2293780971520L, 17090);
      super.onDestroy();
      com.tencent.mm.sdk.b.a.vgX.c(this.wrp);
      GMTrace.o(2293780971520L, 17090);
    }
    
    public final void onPause()
    {
      GMTrace.i(19177834283008L, 142886);
      super.onPause();
      com.tencent.mm.pluginsdk.ui.d.h.b(this.wrr);
      GMTrace.o(19177834283008L, 142886);
    }
    
    public final void onResume()
    {
      GMTrace.i(19177565847552L, 142884);
      super.onResume();
      com.tencent.mm.pluginsdk.ui.d.h.a(this.wrr);
      GMTrace.o(19177565847552L, 142884);
    }
    
    public final void onViewAttachedToWindow(View paramView)
    {
      GMTrace.i(17901155254272L, 133374);
      super.onViewAttachedToWindow(paramView);
      View localView;
      ChatFooter localChatFooter;
      if ((this.fromScene == 2) && (this.iei)) {
        if (this.wrs == null)
        {
          paramView = aG();
          localView = this.mTr.getRootView();
          localChatFooter = this.mTr;
          if (bg.nm(this.mTr.bMe())) {
            break label255;
          }
        }
      }
      label255:
      for (boolean bool = true;; bool = false)
      {
        this.wrs = new com.tencent.mm.ui.d.c(paramView, localView, localChatFooter, bool);
        this.wrs.tAT = false;
        if (!bg.nm(this.ieh))
        {
          int i = (int)zy(75);
          int j = (int)zy(60);
          if ((this.iej != 4) && (!this.ieh.startsWith("file://"))) {
            this.ieh = ("file://" + this.ieh);
          }
          com.tencent.mm.modelappbrand.a.b.CT().a(this.wrs, this.ieh, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aM(i, j));
        }
        this.wrs.vXu = new c.a()
        {
          public final void bZm()
          {
            GMTrace.i(19181592379392L, 142914);
            AppBrandServiceChattingUI.a.this.avJ();
            at.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19168439042048L, 142816);
                AppBrandServiceChattingUI.a.this.cbM();
                GMTrace.o(19168439042048L, 142816);
              }
            });
            GMTrace.o(19181592379392L, 142914);
          }
        };
        paramView = this.wrs;
        w.d("MicroMsg.AppBrandServiceImageBubble", "show");
        at.xB().A(new c.4(paramView));
        GMTrace.o(17901155254272L, 133374);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\AppBrandServiceChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */