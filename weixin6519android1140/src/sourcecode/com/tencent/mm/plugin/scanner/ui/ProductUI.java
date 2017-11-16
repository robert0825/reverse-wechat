package com.tencent.mm.plugin.scanner.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.g.a.ca.a;
import com.tencent.mm.g.a.ca.b;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.hi;
import com.tencent.mm.protocal.c.hk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductUI
  extends MMPreference
  implements com.tencent.mm.ad.e, j.a
{
  private long eDr;
  private com.tencent.mm.modelgeo.c fJm;
  private com.tencent.mm.modelgeo.a.a fJt;
  private int gRb;
  private boolean gxk;
  private TextView hqi;
  protected ProgressDialog htG;
  protected com.tencent.mm.ui.base.preference.f htU;
  private com.tencent.mm.sdk.b.c ian;
  private String klt;
  private long mStartTime;
  private List<MusicPreference> npK;
  private View owA;
  private int owB;
  private int owC;
  private a owD;
  private boolean owE;
  private HashMap<String, Boolean> owF;
  private e.a owG;
  private String owH;
  private boolean owI;
  private String owJ;
  private boolean owK;
  private boolean owL;
  private boolean owM;
  private com.tencent.mm.plugin.scanner.history.a.a owN;
  private bt.a owO;
  private MusicPreference.a owP;
  private boolean owQ;
  private ImageView owq;
  private ImageView owr;
  private View ows;
  private TextView owt;
  private ImageView owu;
  private View owv;
  private TextView oww;
  private LinearLayout owx;
  private ImageView owy;
  private n.a owz;
  
  public ProductUI()
  {
    GMTrace.i(6087310835712L, 45354);
    this.owB = 0;
    this.htG = null;
    this.owE = false;
    this.owI = false;
    this.owK = false;
    this.owL = false;
    this.owM = false;
    this.gxk = false;
    this.fJt = new com.tencent.mm.modelgeo.a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15373567000576L, 114542);
        if (paramAnonymousBoolean)
        {
          w.i("MicroMsg.scanner.ProductUI", "getLocation suc");
          if (ProductUI.a(ProductUI.this) != null)
          {
            w.i("MicroMsg.scanner.ProductUI", "do getActionInfoScene, lng=" + paramAnonymousFloat1 + ", lat=" + paramAnonymousFloat2);
            com.tencent.mm.plugin.scanner.a.c localc = new com.tencent.mm.plugin.scanner.a.c(ProductUI.b(ProductUI.this), com.tencent.mm.plugin.scanner.a.k.bn(ProductUI.a(ProductUI.this).oBs), ProductUI.c(ProductUI.this), ProductUI.d(ProductUI.this), paramAnonymousFloat1, paramAnonymousFloat2);
            at.wS().a(localc, 0);
          }
          if (ProductUI.e(ProductUI.this) != null) {
            ProductUI.e(ProductUI.this).c(ProductUI.f(ProductUI.this));
          }
          if (!ProductUI.g(ProductUI.this))
          {
            ProductUI.h(ProductUI.this);
            com.tencent.mm.modelstat.n.a(2011, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          }
          GMTrace.o(15373567000576L, 114542);
          return false;
        }
        w.w("MicroMsg.scanner.ProductUI", "getLocation fail");
        GMTrace.o(15373567000576L, 114542);
        return false;
      }
    };
    this.owO = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(6096974512128L, 45426);
        Object localObject1 = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.scanner.ProductUI", "lo-scanner-onRecieveMsg");
        paramAnonymousa = ProductUI.a(ProductUI.this);
        Object localObject2;
        if ((paramAnonymousa != null) && (!bg.nm((String)localObject1)))
        {
          localObject1 = bh.q((String)localObject1, "sysmsg");
          localObject2 = (String)((Map)localObject1).get(".sysmsg.scanproductinfo.product.id");
          if ((!bg.nm(paramAnonymousa.field_productid)) && (paramAnonymousa.field_productid.equals(localObject2))) {
            break label149;
          }
          w.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: product id not match, productId=" + bg.nl((String)localObject2) + ", target=" + paramAnonymousa.field_productid);
        }
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6131468468224L, 45683);
              ProductUI.a(ProductUI.this, ProductUI.a(ProductUI.this));
              GMTrace.o(6131468468224L, 45683);
            }
          });
          GMTrace.o(6096974512128L, 45426);
          return;
          label149:
          localObject1 = com.tencent.mm.plugin.scanner.a.a.j((Map)localObject1, ".sysmsg.scanproductinfo.product");
          localObject2 = new HashMap();
          int i = 0;
          while (i < ((List)localObject1).size())
          {
            LinkedList localLinkedList = ((com.tencent.mm.plugin.scanner.a.a)((List)localObject1).get(i)).gVg;
            if (localLinkedList != null)
            {
              int j = 0;
              while (j < localLinkedList.size())
              {
                com.tencent.mm.plugin.scanner.a.a.a locala = (com.tencent.mm.plugin.scanner.a.a.a)localLinkedList.get(j);
                if (locala != null) {
                  ((Map)localObject2).put(locala.amf, locala);
                }
                j += 1;
              }
            }
            i += 1;
          }
          w.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: toUpdateSize=" + ((Map)localObject2).size());
          com.tencent.mm.plugin.scanner.a.k.b(paramAnonymousa.oBs, (Map)localObject2);
        }
      }
    };
    this.owP = new MusicPreference.a()
    {
      public final void a(MusicPreference paramAnonymousMusicPreference)
      {
        GMTrace.i(6066372870144L, 45198);
        if (paramAnonymousMusicPreference == null)
        {
          w.e("MicroMsg.scanner.ProductUI", "onMusicPrefClick, musicPref == null");
          GMTrace.o(6066372870144L, 45198);
          return;
        }
        if ((bg.nm(paramAnonymousMusicPreference.osP)) && (bg.nm(paramAnonymousMusicPreference.osQ)))
        {
          w.w("MicroMsg.scanner.ProductUI", "wifiurl = null,  wapurl = null");
          if (!bg.nm(paramAnonymousMusicPreference.osR)) {
            ProductUI.a(ProductUI.this, paramAnonymousMusicPreference.osR);
          }
          GMTrace.o(6066372870144L, 45198);
          return;
        }
        Object localObject = String.format("%s_cd_%s", new Object[] { paramAnonymousMusicPreference.osP, paramAnonymousMusicPreference.hiu });
        int j;
        int i;
        label205:
        MusicPreference localMusicPreference;
        String str2;
        if (!ProductUI.FV((String)localObject))
        {
          if (paramAnonymousMusicPreference.getTitle() == null)
          {
            w.e("MicroMsg.scanner.ProductUI", "onPlayBtnClick, getTitle() == null");
            GMTrace.o(6066372870144L, 45198);
            return;
          }
          j = -1;
          if (ProductUI.m(ProductUI.this) == null)
          {
            localObject = null;
            String str1 = String.format("%s_cd_%s", new Object[] { paramAnonymousMusicPreference.osP, paramAnonymousMusicPreference.hiu });
            paramAnonymousMusicPreference = new ArrayList();
            Iterator localIterator = ProductUI.n(ProductUI.this).iterator();
            i = 0;
            if (!localIterator.hasNext()) {
              break label349;
            }
            localMusicPreference = (MusicPreference)localIterator.next();
            str2 = String.format("%s_cd_%s", new Object[] { localMusicPreference.osP, localMusicPreference.hiu });
            if (!str1.equals(str2)) {
              break label445;
            }
            j = i;
          }
        }
        label349:
        label445:
        for (;;)
        {
          paramAnonymousMusicPreference.add(((com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class)).a(5, (String)localObject, localMusicPreference.getTitle().toString(), "", localMusicPreference.osR, localMusicPreference.osQ, localMusicPreference.osP, str2, com.tencent.mm.plugin.scanner.c.zo(), (String)localObject, "", "wx482a4001c37e2b74"));
          i += 1;
          break label205;
          localObject = ProductUI.m(ProductUI.this).Pm();
          break;
          if (j < 0)
          {
            GMTrace.o(6066372870144L, 45198);
            return;
          }
          localObject = new jm();
          ((jm)localObject).eNj.action = 0;
          ((jm)localObject).eNj.eIB = paramAnonymousMusicPreference;
          ((jm)localObject).eNj.eNm = j;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          for (;;)
          {
            ProductUI.o(ProductUI.this);
            GMTrace.o(6066372870144L, 45198);
            return;
            com.tencent.mm.at.b.JO();
            w.d("MicroMsg.scanner.ProductUI", "isTheSameId, playMusicId : [%s]", new Object[] { localObject });
          }
        }
      }
    };
    this.owQ = true;
    this.ian = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6087310835712L, 45354);
  }
  
  private static boolean FR(String paramString)
  {
    GMTrace.i(6089324101632L, 45369);
    apv localapv = com.tencent.mm.at.b.JS();
    if ((localapv != null) && (localapv.uFq == 5) && (paramString.equals(localapv.ucY)) && (com.tencent.mm.at.b.JQ()))
    {
      GMTrace.o(6089324101632L, 45369);
      return true;
    }
    GMTrace.o(6089324101632L, 45369);
    return false;
  }
  
  private static String FS(String paramString)
  {
    GMTrace.i(6089860972544L, 45373);
    if (bg.nm(paramString))
    {
      GMTrace.o(6089860972544L, 45373);
      return null;
    }
    try
    {
      String str = Uri.parse(paramString).getQueryParameter("p");
      GMTrace.o(6089860972544L, 45373);
      return str;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.scanner.ProductUI", paramString + ";" + localException.getLocalizedMessage());
      GMTrace.o(6089860972544L, 45373);
    }
    return null;
  }
  
  private static boolean FT(String paramString)
  {
    GMTrace.i(6090129408000L, 45375);
    at.AR();
    paramString = com.tencent.mm.y.c.yK().TE(paramString);
    if ((paramString != null) && ((int)paramString.fTq > 0) && (com.tencent.mm.l.a.eE(paramString.field_type)))
    {
      GMTrace.o(6090129408000L, 45375);
      return true;
    }
    GMTrace.o(6090129408000L, 45375);
    return false;
  }
  
  private void FU(String paramString)
  {
    GMTrace.i(6090397843456L, 45377);
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("jsapi_args_appid", com.tencent.mm.plugin.scanner.a.i.tt(this.owB));
    localIntent.putExtra("jsapiargs", localBundle);
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("pay_channel", 3);
    localIntent.putExtra("geta8key_scene", Ya());
    com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(6090397843456L, 45377);
  }
  
  private int Ya()
  {
    GMTrace.i(6090263625728L, 45376);
    if (this.owB == 4)
    {
      GMTrace.o(6090263625728L, 45376);
      return 11;
    }
    if (this.owB == 3)
    {
      GMTrace.o(6090263625728L, 45376);
      return 12;
    }
    GMTrace.o(6090263625728L, 45376);
    return 0;
  }
  
  private void a(final n.a parama)
  {
    GMTrace.i(6088518795264L, 45363);
    if (parama == null)
    {
      w.e("MicroMsg.scanner.ProductUI", "refreshViewByProduct(), pd == null");
      finish();
      GMTrace.o(6088518795264L, 45363);
      return;
    }
    if (!bg.nm(parama.field_thumburl)) {
      this.owD = new a(parama);
    }
    this.owC = this.vKB.vKW.getResources().getDimensionPixelSize(R.f.aSE);
    Object localObject;
    if ((this.owz != null) && ((this.owz.field_type == 1) || (this.owz.field_type == 2)))
    {
      this.owC = this.vKB.vKW.getResources().getDimensionPixelSize(R.f.aSF);
      localObject = this.owr.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = this.owC;
      this.owr.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = this.ows.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = this.owC;
      this.owx.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localObject = (RelativeLayout)findViewById(R.h.bTY);
      ViewGroup.LayoutParams localLayoutParams = ((RelativeLayout)localObject).getLayoutParams();
      localLayoutParams.height = this.owC;
      ((RelativeLayout)localObject).setLayoutParams(localLayoutParams);
      localObject = this.owx.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = this.owC;
      this.owx.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if ((!bg.nm(parama.field_introtitle)) && (!bg.nm(parama.field_introlink)))
    {
      this.oww.setText(parama.field_introtitle);
      this.oww.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6141266362368L, 45756);
          ProductUI.a(ProductUI.this, 10003, parama.field_introlink);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", parama.field_introlink);
          paramAnonymousView.putExtra("geta8key_scene", ProductUI.k(ProductUI.this));
          com.tencent.mm.bj.d.b(ProductUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(6141266362368L, 45756);
        }
      });
      this.oww.setVisibility(0);
      this.owB = this.owz.field_functionType;
      if (parama.field_xmlType != 3) {
        break label578;
      }
      this.hqi.setText(parama.field_title);
      if (bg.nm(parama.field_certification)) {
        break label491;
      }
      this.owt.setText(parama.field_certification);
      this.owu.setVisibility(0);
      label341:
      if ((parama.field_type != 1) && (parama.field_type != 2)) {
        break label538;
      }
      this.owq = ((ImageView)findViewById(R.h.bUa));
      findViewById(R.h.bUa).setVisibility(0);
      findViewById(R.h.bUd).setVisibility(8);
      label394:
      if (!bg.nm(parama.field_playurl))
      {
        localObject = (ImageView)findViewById(R.h.bTW);
        ((ImageView)localObject).setVisibility(0);
        ((ImageView)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6125831323648L, 45641);
            paramAnonymousView = new Intent("android.intent.action.VIEW");
            paramAnonymousView.setDataAndType(Uri.parse(parama.field_playurl), "video/*");
            ProductUI.this.startActivity(paramAnonymousView);
            GMTrace.o(6125831323648L, 45641);
          }
        });
      }
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6153614393344L, 45848);
          ProductUI.l(ProductUI.this);
          GMTrace.o(6153614393344L, 45848);
          return true;
        }
      });
    }
    for (;;)
    {
      w.v("MicroMsg.scanner.ProductUI", "start postToMainThread initBodyView");
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6067178176512L, 45204);
          ProductUI.a(ProductUI.this, parama);
          ProductUI.b(ProductUI.this, parama);
          GMTrace.o(6067178176512L, 45204);
        }
      });
      GMTrace.o(6088518795264L, 45363);
      return;
      this.oww.setVisibility(8);
      break;
      label491:
      this.owt.setText(parama.field_source);
      this.owu.setVisibility(8);
      this.owv.setOnClickListener(null);
      this.owv.setBackgroundDrawable(null);
      this.owv.setFocusable(false);
      break label341;
      label538:
      this.owq = ((ImageView)findViewById(R.h.bUd));
      findViewById(R.h.bUd).setVisibility(0);
      findViewById(R.h.bUa).setVisibility(8);
      break label394;
      label578:
      if (parama.field_xmlType == 4)
      {
        this.owq = ((ImageView)findViewById(R.h.bUd));
        findViewById(R.h.bUd).setVisibility(0);
        findViewById(R.h.bUa).setVisibility(8);
        this.owq.setImageResource(R.k.cOz);
        this.owq.setBackgroundResource(R.k.cOz);
        this.hqi.setText(R.l.dVm);
        this.owt.setText(null);
      }
    }
  }
  
  private static boolean a(int paramInt, LinkedList<com.tencent.mm.plugin.scanner.a.a.a> paramLinkedList)
  {
    GMTrace.i(6088921448448L, 45366);
    if (paramLinkedList != null)
    {
      paramInt += 1;
      while (paramInt < paramLinkedList.size())
      {
        if (((com.tencent.mm.plugin.scanner.a.a.a)paramLinkedList.get(paramInt)).showType != 2)
        {
          GMTrace.o(6088921448448L, 45366);
          return true;
        }
        paramInt += 1;
      }
    }
    GMTrace.o(6088921448448L, 45366);
    return false;
  }
  
  private void ao(int paramInt, String paramString)
  {
    GMTrace.i(6089458319360L, 45370);
    if (this.owz == null)
    {
      GMTrace.o(6089458319360L, 45370);
      return;
    }
    paramString = new com.tencent.mm.plugin.scanner.a.h(this.owz.field_productid, "", paramInt, paramString, 0, 0);
    at.wS().a(paramString, 0);
    GMTrace.o(6089458319360L, 45370);
  }
  
  private void b(n.a parama)
  {
    GMTrace.i(6088787230720L, 45365);
    if ((parama == null) || (parama.oBs == null) || (parama.oBs.size() == 0) || (this.htU == null))
    {
      GMTrace.o(6088787230720L, 45365);
      return;
    }
    this.htU.removeAll();
    int i = 0;
    while (i < parama.oBs.size())
    {
      Object localObject2 = (com.tencent.mm.plugin.scanner.a.a)parama.oBs.get(i);
      Object localObject1;
      Object localObject3;
      if ((localObject2 != null) && (((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg != null) && (((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.size() != 0) && (((com.tencent.mm.plugin.scanner.a.a)localObject2).osK != 1) && (((com.tencent.mm.plugin.scanner.a.a)localObject2).osM))
      {
        if (i != 0)
        {
          localObject1 = new Preference(this);
          ((Preference)localObject1).setLayoutResource(R.i.cDz);
          this.htU.a((Preference)localObject1);
        }
        if ((!bg.nm(((com.tencent.mm.plugin.scanner.a.a)localObject2).title)) && ((((com.tencent.mm.plugin.scanner.a.a)localObject2).type == 6) || (((com.tencent.mm.plugin.scanner.a.a)localObject2).type == 7)))
        {
          localObject1 = new CategoryWithTitlePreference(this);
          ((CategoryWithTitlePreference)localObject1).setTitle(((com.tencent.mm.plugin.scanner.a.a)localObject2).title);
          this.htU.a((Preference)localObject1);
        }
        if (((com.tencent.mm.plugin.scanner.a.a)localObject2).type != 6) {
          break label359;
        }
        localObject1 = new ArrayList();
        j = 0;
        while (j < ((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.size())
        {
          localObject3 = (com.tencent.mm.plugin.scanner.a.a.a)((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.get(j);
          if (((com.tencent.mm.plugin.scanner.a.a.a)localObject3).type == 10) {
            ((List)localObject1).add(localObject3);
          }
          j += 1;
        }
        if (((List)localObject1).size() > 0)
        {
          localObject2 = new h(this);
          ((h)localObject2).setKey(i * 100);
          ((h)localObject2).nJb = ((List)localObject1);
          this.htU.a((Preference)localObject2);
        }
      }
      i += 1;
      continue;
      label359:
      int j = 0;
      label361:
      com.tencent.mm.plugin.scanner.a.a.a locala;
      if (j < ((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.size())
      {
        localObject3 = i * 100 + j;
        locala = (com.tencent.mm.plugin.scanner.a.a.a)((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.get(j);
        if (locala.type == 11)
        {
          this.owI = true;
          this.owJ = locala.name;
        }
        if (locala.showType != 2)
        {
          if (locala.showType != 1) {
            break label515;
          }
          if (!bg.nm(locala.osN))
          {
            localObject1 = new b(this);
            ((b)localObject1).setKey((String)localObject3);
            ((b)localObject1).kmO = locala.osN;
            ((b)localObject1).htU = this.htU;
            this.htU.a((Preference)localObject1);
          }
        }
      }
      label515:
      label616:
      label1191:
      for (;;)
      {
        j += 1;
        break label361;
        break;
        if (locala.type == 5)
        {
          localObject1 = new MusicPreference(this);
          ((MusicPreference)localObject1).setKey((String)localObject3);
          ((MusicPreference)localObject1).setTitle(locala.name);
          ((MusicPreference)localObject1).osP = locala.osP;
          ((MusicPreference)localObject1).osQ = locala.osQ;
          ((MusicPreference)localObject1).osR = locala.osR;
          if (!FR(String.format("%s_cd_%s", new Object[] { locala.osP, localObject3 })))
          {
            ((MusicPreference)localObject1).ha(false);
            ((MusicPreference)localObject1).ovW = this.owP;
            this.htU.a((Preference)localObject1);
            com.tencent.mm.sdk.b.a.vgX.b(this.ian);
            if (this.npK == null) {
              this.npK = new ArrayList();
            }
            if (this.owQ) {
              this.npK.add(localObject1);
            }
          }
        }
        for (;;)
        {
          if ((j >= ((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.size() - 1) || (locala.type == 12) || (((com.tencent.mm.plugin.scanner.a.a.a)((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.get(j + 1)).type == 12) || (((com.tencent.mm.plugin.scanner.a.a.a)((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg.get(j + 1)).showType == 1) || (!a(j, ((com.tencent.mm.plugin.scanner.a.a)localObject2).gVg))) {
            break label1191;
          }
          localObject1 = new g(this);
          this.htU.a((Preference)localObject1);
          break;
          ((MusicPreference)localObject1).ha(true);
          break label616;
          if (locala.type == 6)
          {
            localObject1 = new e(this);
            ((e)localObject1).setKey((String)localObject3);
            ((e)localObject1).mTitle = locala.name;
            ((e)localObject1).setSummary(locala.desc);
            this.htU.a((Preference)localObject1);
            ((e)localObject1).ovL = this.owG;
          }
          else if (locala.type == 12)
          {
            localObject1 = new f(this);
            ((f)localObject1).setKey((String)localObject3);
            ((f)localObject1).kmO = locala.thumburl;
            ((f)localObject1).htU = this.htU;
            this.htU.a((Preference)localObject1);
          }
          else
          {
            if (locala.type == 2)
            {
              if (FT(locala.username)) {}
              for (localObject1 = locala.osX;; localObject1 = locala.osW)
              {
                a locala1 = new a(this);
                locala1.setKey((String)localObject3);
                locala1.setTitle((CharSequence)localObject1);
                locala1.setSummary(locala.desc);
                locala1.ouh = locala.glz;
                this.htU.a(locala1);
                break;
              }
            }
            if (locala.type == 22)
            {
              localObject1 = new d(this);
              ((d)localObject1).setKey((String)localObject3);
              if (!bg.nm(locala.eCQ)) {
                ((d)localObject1).onj = (locala.eCQ + ":");
              }
              ((d)localObject1).lNF = locala.content;
              ((d)localObject1).ovz = locala.thumburl;
              this.htU.a((Preference)localObject1);
            }
            else
            {
              localObject1 = new a(this);
              ((a)localObject1).setKey((String)localObject3);
              ((a)localObject1).setTitle(locala.name);
              ((a)localObject1).setSummary(locala.desc);
              ((a)localObject1).ouh = locala.glz;
              ((a)localObject1).kEt = locala.iconUrl;
              this.htU.a((Preference)localObject1);
            }
          }
        }
      }
    }
    this.htU.notifyDataSetChanged();
    w.d("MicroMsg.scanner.ProductUI", "initBodyView finish");
    if (this.npK != null) {
      this.owQ = false;
    }
    GMTrace.o(6088787230720L, 45365);
  }
  
  private void bcW()
  {
    GMTrace.i(6088653012992L, 45364);
    this.eDr = getIntent().getLongExtra("key_ProductUI_chatting_msgId", 0L);
    if ((this.eDr > 0L) && (at.AU()))
    {
      at.AR();
      au localau = com.tencent.mm.y.c.yM().cM(this.eDr);
      if (localau.field_msgId > 0L)
      {
        localau.dc(this.owD.Pm());
        at.AR();
        com.tencent.mm.y.c.yM().a(this.eDr, localau);
      }
    }
    GMTrace.o(6088653012992L, 45364);
  }
  
  private void bcX()
  {
    GMTrace.i(6089055666176L, 45367);
    if ((this.owz == null) || (this.owz.oBs == null) || (this.owz.oBs.size() == 0) || (this.htU == null))
    {
      GMTrace.o(6089055666176L, 45367);
      return;
    }
    int i = 0;
    while (i < this.owz.oBs.size())
    {
      com.tencent.mm.plugin.scanner.a.a locala = (com.tencent.mm.plugin.scanner.a.a)this.owz.oBs.get(i);
      if ((locala != null) && (locala.gVg != null) && (locala.gVg.size() != 0))
      {
        int j = 0;
        if (j < locala.gVg.size())
        {
          com.tencent.mm.plugin.scanner.a.a.a locala1 = (com.tencent.mm.plugin.scanner.a.a.a)locala.gVg.get(j);
          MusicPreference localMusicPreference;
          if (locala1.type == 5)
          {
            String str = i * 100 + j;
            localMusicPreference = (MusicPreference)this.htU.VG(str);
            if (localMusicPreference != null)
            {
              if (FR(String.format("%s_cd_%s", new Object[] { locala1.osP, str }))) {
                break label227;
              }
              localMusicPreference.ha(false);
            }
          }
          for (;;)
          {
            j += 1;
            break;
            label227:
            localMusicPreference.ha(true);
          }
        }
      }
      i += 1;
    }
    this.htU.notifyDataSetChanged();
    GMTrace.o(6089055666176L, 45367);
  }
  
  private int bcY()
  {
    GMTrace.i(6090532061184L, 45378);
    if (this.owB == 3)
    {
      GMTrace.o(6090532061184L, 45378);
      return 47;
    }
    GMTrace.o(6090532061184L, 45378);
    return 49;
  }
  
  private void bcZ()
  {
    GMTrace.i(6090666278912L, 45379);
    if (this.owz != null)
    {
      w.i("MicroMsg.scanner.ProductUI", "doUpdateActionLogic, flag=:" + this.owz.field_getaction);
      if ((this.owz.field_getaction & 0x2) > 0)
      {
        this.fJm = com.tencent.mm.modelgeo.c.Ir();
        if (this.fJm != null)
        {
          this.fJm.b(this.fJt);
          GMTrace.o(6090666278912L, 45379);
        }
      }
      else if ((this.owz.field_getaction & 0x1) > 0)
      {
        com.tencent.mm.plugin.scanner.a.c localc = new com.tencent.mm.plugin.scanner.a.c(this.klt, com.tencent.mm.plugin.scanner.a.k.bn(this.owz.oBs), this.gRb, this.owH, 0.0D, 0.0D);
        at.wS().a(localc, 0);
      }
    }
    GMTrace.o(6090666278912L, 45379);
  }
  
  private void bda()
  {
    GMTrace.i(6090934714368L, 45381);
    if (!com.tencent.mm.plugin.scanner.util.j.bdx())
    {
      w.e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
      GMTrace.o(6090934714368L, 45381);
      return;
    }
    com.tencent.mm.plugin.scanner.history.a.a locala = new com.tencent.mm.plugin.scanner.history.a.a();
    locala.field_productId = this.klt;
    if (!com.tencent.mm.plugin.scanner.c.bcn().b(locala, new String[0])) {}
    for (boolean bool = com.tencent.mm.plugin.scanner.c.bcn().b(this.owN); bool; bool = com.tencent.mm.plugin.scanner.c.bcn().c(this.owN, new String[0]))
    {
      w.i("MicroMsg.scanner.ProductUI", "mHistoryItem insert success!");
      this.owL = true;
      GMTrace.o(6090934714368L, 45381);
      return;
    }
    w.e("MicroMsg.scanner.ProductUI", "mHistoryItem insert fail!");
    GMTrace.o(6090934714368L, 45381);
  }
  
  private static void j(View paramView, float paramFloat)
  {
    GMTrace.i(6090800496640L, 45380);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
    localAlphaAnimation.setDuration(0L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
    GMTrace.o(6090800496640L, 45380);
  }
  
  private void n(final String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(6089995190272L, 45374);
    this.klt = paramString1;
    this.owH = paramString2;
    paramString1 = new com.tencent.mm.plugin.scanner.a.d(paramString1, this.gRb, paramString2);
    at.wS().a(paramString1, 0);
    if (!paramBoolean)
    {
      paramString2 = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(paramString2, getString(R.l.dVv), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(6130394726400L, 45675);
          w.d("MicroMsg.scanner.ProductUI", "User cancel");
          at.wS().c(paramString1);
          GMTrace.o(6130394726400L, 45675);
        }
      });
    }
    GMTrace.o(6089995190272L, 45374);
  }
  
  protected final void MP()
  {
    GMTrace.i(6088384577536L, 45362);
    oM(R.l.dVE);
    this.htU = this.wky;
    if (cN().cO() != null) {
      cN().cO().setBackgroundDrawable(null);
    }
    for (Object localObject = cN().cO().getCustomView();; localObject = null)
    {
      if (localObject != null)
      {
        localObject = ((View)localObject).findViewById(R.h.divider);
        if (localObject != null) {
          ((View)localObject).setBackgroundColor(-1);
        }
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6156298747904L, 45868);
          if (ProductUI.c(ProductUI.this) == 4) {
            ProductUI.this.setResult(0);
          }
          ProductUI.this.finish();
          GMTrace.o(6156298747904L, 45868);
          return true;
        }
      });
      this.hqi = ((TextView)findViewById(R.h.bUg));
      this.owr = ((ImageView)findViewById(R.h.bTX));
      this.ows = findViewById(R.h.bUc);
      this.owu = ((ImageView)findViewById(R.h.bTU));
      this.owA = findViewById(R.h.bTR);
      this.owx = ((LinearLayout)findViewById(R.h.bUb));
      this.owy = ((ImageView)findViewById(R.h.bTZ));
      this.owv = findViewById(R.h.bTT);
      j(this.owA, 0.0F);
      String str;
      if (com.tencent.mm.br.a.ed(this.vKB.vKW))
      {
        this.hqi.setTextSize(0, this.vKB.vKW.getResources().getDimensionPixelSize(R.f.aPS) * 1.25F);
        this.owt = ((TextView)findViewById(R.h.bTS));
        this.oww = ((TextView)findViewById(R.h.bZH));
        this.owF = new HashMap();
        this.owG = new e.a()
        {
          public final Boolean FP(String paramAnonymousString)
          {
            GMTrace.i(6080599949312L, 45304);
            if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0))
            {
              paramAnonymousString = (Boolean)ProductUI.i(ProductUI.this).get(paramAnonymousString);
              GMTrace.o(6080599949312L, 45304);
              return paramAnonymousString;
            }
            GMTrace.o(6080599949312L, 45304);
            return null;
          }
          
          public final void a(String paramAnonymousString, Boolean paramAnonymousBoolean)
          {
            GMTrace.i(6080465731584L, 45303);
            if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {
              ProductUI.i(ProductUI.this).put(paramAnonymousString, paramAnonymousBoolean);
            }
            GMTrace.o(6080465731584L, 45303);
          }
          
          public final void bcU()
          {
            GMTrace.i(6080734167040L, 45305);
            if (ProductUI.this.htU != null) {
              ProductUI.this.htU.notifyDataSetChanged();
            }
            GMTrace.o(6080734167040L, 45305);
          }
        };
        this.owN = new com.tencent.mm.plugin.scanner.history.a.a();
        this.owN.field_ScanTime = System.currentTimeMillis();
        this.owN.field_scene = this.gRb;
        if (this.gRb != 5) {
          break label472;
        }
        this.owK = true;
        localObject = getIntent().getStringExtra("key_Qrcode_Url");
        str = FS((String)localObject);
        this.owN.field_qrcodeUrl = ((String)localObject);
        this.owN.field_productId = str;
        n(str, (String)localObject, false);
      }
      for (;;)
      {
        findViewById(R.h.bUe).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6097511383040L, 45430);
            ProductUI.j(ProductUI.this);
            GMTrace.o(6097511383040L, 45430);
          }
        });
        findViewById(R.h.bTV).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6068117700608L, 45211);
            ProductUI.j(ProductUI.this);
            GMTrace.o(6068117700608L, 45211);
          }
        });
        this.owv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6095498117120L, 45415);
            if ((ProductUI.a(ProductUI.this) != null) && (!bg.nm(ProductUI.a(ProductUI.this).field_certificationurl)))
            {
              ProductUI.a(ProductUI.this, 10002, ProductUI.a(ProductUI.this).field_certificationurl);
              ProductUI.a(ProductUI.this, ProductUI.a(ProductUI.this).field_certificationurl);
            }
            GMTrace.o(6095498117120L, 45415);
          }
        });
        new b();
        GMTrace.o(6088384577536L, 45362);
        return;
        this.hqi.setTextSize(0, com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aPS));
        break;
        label472:
        if (this.gRb == 4)
        {
          localObject = getIntent().getStringExtra("key_product_id");
          str = getIntent().getStringExtra("key_Qrcode_Url");
          if (!bg.nm((String)localObject))
          {
            n((String)localObject, str, false);
          }
          else
          {
            w.e("MicroMsg.scanner.ProductUI", "jsapi jump finish productId null");
            finish();
            GMTrace.o(6088384577536L, 45362);
          }
        }
        else
        {
          this.owM = getIntent().getBooleanExtra("key_is_from_barcode", false);
          this.owK = getIntent().getBooleanExtra("key_need_add_to_history", false);
          localObject = getIntent().getStringExtra("key_Product_xml");
          if (!bg.nm((String)localObject))
          {
            int i = getIntent().getIntExtra("key_Product_funcType", 0);
            this.owz = com.tencent.mm.plugin.scanner.a.i.bH((String)localObject, i);
            if (this.owz == null)
            {
              w.e("MicroMsg.scanner.ProductUI", "initView(), product == null");
              finish();
              GMTrace.o(6088384577536L, 45362);
              return;
            }
            this.klt = this.owz.field_productid;
            this.owH = this.owz.field_extinfo;
            if ((this.owK) && (!TextUtils.isEmpty(this.klt)))
            {
              this.owN.field_xmlContent = ((String)localObject);
              this.owN.field_qrcodeUrl = this.owH;
              this.owN.field_productId = this.klt;
              this.owN.field_funcType = i;
              bda();
            }
            for (;;)
            {
              localObject = this.owz;
              getIntent().getBooleanExtra("key_ProductUI_addToDB", true);
              a((n.a)localObject);
              if ((i != 0) || (bg.nm(this.owz.field_productid))) {
                break label822;
              }
              n(this.owz.field_productid, this.owz.field_extinfo, true);
              break;
              w.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.owK + " mProductId:" + this.klt);
            }
            label822:
            bcZ();
          }
          else
          {
            localObject = getIntent().getStringExtra("key_Product_ID");
            if (bg.nm((String)localObject)) {
              break label857;
            }
            n((String)localObject, null, false);
          }
        }
      }
      label857:
      w.e("MicroMsg.scanner.ProductUI", "normal finish productId null");
      finish();
      GMTrace.o(6088384577536L, 45362);
      return;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(6087579271168L, 45356);
    int i = R.o.eoZ;
    GMTrace.o(6087579271168L, 45356);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6089726754816L, 45372);
    if (paramk == null)
    {
      w.w("MicroMsg.scanner.ProductUI", "scene == null");
      GMTrace.o(6089726754816L, 45372);
      return;
    }
    if (paramk.getType() == 1063)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.scanner.ProductUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        GMTrace.o(6089726754816L, 45372);
        return;
      }
      paramString = (com.tencent.mm.plugin.scanner.a.d)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (hk)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
      {
        w.w("MicroMsg.scanner.ProductUI", "onSceneEnd productInfo == null");
        GMTrace.o(6089726754816L, 45372);
        return;
      }
      if (paramString.tWp != null)
      {
        w.d("MicroMsg.scanner.ProductUI", "onSceneEnd  productInfo.DescXML != null");
        paramk = com.tencent.mm.plugin.scanner.a.i.bH(paramString.tWp, this.owB);
        if ((this.owz != null) && (this.owz.field_xml != null) && (paramk != null) && (paramk.field_xml != null) && (!this.owz.field_xml.equals(paramk.field_xml)))
        {
          this.owz = paramk;
          a(this.owz);
        }
        for (;;)
        {
          if ((this.htG != null) && (this.htG.isShowing())) {
            this.htG.dismiss();
          }
          bcZ();
          if ((!this.owK) || (this.owL) || (TextUtils.isEmpty(this.klt))) {
            break;
          }
          this.owN.field_xmlContent = paramString.tWp;
          this.owN.field_funcType = this.owB;
          bda();
          GMTrace.o(6089726754816L, 45372);
          return;
          if ((paramk != null) && (paramk.field_xml != null))
          {
            this.owz = paramk;
            a(this.owz);
          }
        }
        w.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.owK + " mProductId:" + this.klt + "  hasAddToHistory:" + this.owL);
      }
      GMTrace.o(6089726754816L, 45372);
      return;
    }
    if ((paramk.getType() == 1068) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((hi)((com.tencent.mm.plugin.scanner.a.c)paramk).fUa.gtD.gtK).tWo;
      if ((this.owz != null) && (com.tencent.mm.plugin.scanner.a.k.b(this.owz.oBs, com.tencent.mm.plugin.scanner.a.k.bo(paramString)))) {
        b(this.owz);
      }
    }
    GMTrace.o(6089726754816L, 45372);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(6089189883904L, 45368);
    w.i("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.hiu });
    if ((this.owz == null) || (this.owz.oBs == null))
    {
      w.e("MicroMsg.scanner.ProductUI", "product == null || product.actionlist == null");
      GMTrace.o(6089189883904L, 45368);
      return false;
    }
    for (;;)
    {
      com.tencent.mm.plugin.scanner.a.a.a locala1;
      Intent localIntent;
      try
      {
        int i = Integer.valueOf(paramPreference.hiu).intValue();
        int j = i / 100;
        int k = i % 100;
        w.v("MicroMsg.scanner.ProductUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((j < 0) || (j >= this.owz.oBs.size()))
        {
          w.w("MicroMsg.scanner.ProductUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.owz.oBs.size()) });
          GMTrace.o(6089189883904L, 45368);
          return false;
        }
        com.tencent.mm.plugin.scanner.a.a locala = (com.tencent.mm.plugin.scanner.a.a)this.owz.oBs.get(j);
        if (locala == null)
        {
          w.w("MicroMsg.scanner.ProductUI", "actionList == null");
          GMTrace.o(6089189883904L, 45368);
          return false;
        }
        if ((k < 0) || (k >= locala.gVg.size()))
        {
          w.w("MicroMsg.scanner.ProductUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(locala.gVg.size()) });
          GMTrace.o(6089189883904L, 45368);
          return false;
        }
        locala1 = (com.tencent.mm.plugin.scanner.a.a.a)locala.gVg.get(k);
        if (locala1 == null)
        {
          w.w("MicroMsg.scanner.ProductUI", "action == null");
          GMTrace.o(6089189883904L, 45368);
          return false;
        }
        w.i("MicroMsg.scanner.ProductUI", "action.type = [%s]", new Object[] { Integer.valueOf(locala1.type) });
        paramPreference = null;
        localIntent = new Intent();
        paramf = paramPreference;
        switch (locala1.type)
        {
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
          w.d("MicroMsg.scanner.ProductUI", "Default go url:" + locala1.gVf);
          paramf = paramPreference;
          if (!bg.nm(locala1.gVf))
          {
            FU(locala1.gVf);
            paramf = paramPreference;
          }
        case 6: 
        case 7: 
        case 10: 
          paramf = new com.tencent.mm.plugin.scanner.a.h(this.owz.field_productid, locala1.osS, locala1.type, paramf, locala.gVg.size(), locala1.showType);
          at.wS().a(paramf, 0);
          GMTrace.o(6089189883904L, 45368);
          return true;
        }
      }
      catch (Exception paramf)
      {
        w.e("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        w.printErrStackTrace("MicroMsg.scanner.ProductUI", paramf, "", new Object[0]);
        GMTrace.o(6089189883904L, 45368);
        return false;
      }
      paramPreference = locala1.gVf;
      paramf = paramPreference;
      if (!bg.nm(locala1.gVf))
      {
        FU(locala1.gVf);
        paramf = paramPreference;
        continue;
        paramPreference = locala1.username;
        paramf = paramPreference;
        if (!bg.nm(locala1.username))
        {
          paramf = locala1.username;
          if (FT(paramf))
          {
            localIntent = new Intent();
            localIntent.putExtra("Chat_User", paramf);
            localIntent.putExtra("finish_direct", true);
            localIntent.putExtra("add_scene", bcY());
            com.tencent.mm.plugin.scanner.b.hnH.e(localIntent, this.vKB.vKW);
            paramf = paramPreference;
          }
          else if (TextUtils.isEmpty(paramf))
          {
            w.v("MicroMsg.scanner.ProductUI", "username is null");
            paramf = paramPreference;
          }
          else
          {
            localIntent = new Intent();
            localIntent.putExtra("Contact_User", paramf);
            localIntent.putExtra("force_get_contact", true);
            localIntent.putExtra("Contact_Scene", bcY());
            com.tencent.mm.plugin.scanner.b.hnH.d(localIntent, this);
            paramf = paramPreference;
            continue;
            paramf = locala1.osR;
            localIntent.putExtra("rawUrl", locala1.osR);
            localIntent.putExtra("geta8key_scene", Ya());
            com.tencent.mm.plugin.scanner.b.hnH.j(localIntent, this);
            com.tencent.mm.at.b.JO();
            bcX();
            continue;
            paramPreference = locala1.osT;
            paramf = paramPreference;
            if (!bg.nm(locala1.osT))
            {
              localIntent.putExtra("key_product_id", locala1.osT);
              localIntent.putExtra("key_product_scene", 12);
              com.tencent.mm.bj.d.b(this, "product", ".ui.MallProductUI", localIntent);
              paramf = paramPreference;
              continue;
              paramf = locala1.osT;
              localIntent.putExtra("key_card_id", locala1.osV);
              localIntent.putExtra("key_card_ext", locala1.osU);
              localIntent.putExtra("key_from_scene", 9);
              com.tencent.mm.bj.d.b(this, "card", ".ui.CardDetailUI", localIntent);
              continue;
              localIntent.setClass(this, ProductFurtherInfoUI.class);
              localIntent.putExtra("key_Product_xml", this.owz.field_xml);
              localIntent.putExtra("key_title", locala1.name);
              startActivity(localIntent);
              paramf = paramPreference;
              continue;
              paramf = locala1.osL;
              localIntent.setClass(this, ProductPurchaseAreaUI.class);
              localIntent.putExtra("key_Product_xml", this.owz.field_xml);
              localIntent.putExtra("referkey", locala1.osL);
              localIntent.putExtra("key_Product_funcType", this.owB);
              startActivity(localIntent);
              continue;
              paramPreference = locala1.gVf;
              paramf = paramPreference;
              if (!bg.nm(locala1.gVf))
              {
                FU(locala1.gVf);
                paramf = paramPreference;
              }
            }
          }
        }
      }
    }
  }
  
  public final int ait()
  {
    GMTrace.i(6087713488896L, 45357);
    int i = R.i.cDG;
    GMTrace.o(6087713488896L, 45357);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6087445053440L, 45355);
    int i = R.i.bTV;
    GMTrace.o(6087445053440L, 45355);
    return i;
  }
  
  public final void k(final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6089592537088L, 45371);
    if ((!bg.nm(paramString)) && (this.owz != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      w.d("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + paramString);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6099390431232L, 45444);
          if ((paramString.equals(ProductUI.a(ProductUI.this).field_thumburl)) && (ProductUI.q(ProductUI.this) != null)) {
            w.i("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + paramString);
          }
          try
          {
            ProductUI.q(ProductUI.this).setImageBitmap(paramBitmap);
            ProductUI.q(ProductUI.this).setBackgroundDrawable(null);
            ProductUI.q(ProductUI.this).setBackgroundColor(-1);
            ProductUI.r(ProductUI.this);
            ProductUI.s(ProductUI.this);
            if ((paramString.equals(ProductUI.a(ProductUI.this).field_headerbackgroundurl)) && (ProductUI.t(ProductUI.this) != null)) {
              ProductUI.t(ProductUI.this).setImageBitmap(paramBitmap);
            }
            GMTrace.o(6099390431232L, 45444);
            return;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.scanner.ProductUI", "onGetPictureFinish : [%s]", new Object[] { localException.getLocalizedMessage() });
            }
          }
        }
      });
    }
    GMTrace.o(6089592537088L, 45371);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6087847706624L, 45358);
    super.onCreate(paramBundle);
    this.mStartTime = bg.Pu();
    this.gRb = getIntent().getIntExtra("key_ProductUI_getProductInfoScene", 0);
    com.tencent.mm.platformtools.j.b(this);
    at.getSysCmdMsgExtension().a("scanproductinfo", this.owO, true);
    MP();
    GMTrace.o(6087847706624L, 45358);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6088250359808L, 45361);
    com.tencent.mm.platformtools.j.c(this);
    at.getSysCmdMsgExtension().b("scanproductinfo", this.owO, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    if (this.fJm != null) {
      this.fJm.c(this.fJt);
    }
    ao(10100, bg.Pu() - this.mStartTime);
    super.onDestroy();
    GMTrace.o(6088250359808L, 45361);
  }
  
  protected void onPause()
  {
    GMTrace.i(6088116142080L, 45360);
    at.wS().b(1063, this);
    at.wS().b(1068, this);
    super.onPause();
    GMTrace.o(6088116142080L, 45360);
  }
  
  protected void onResume()
  {
    GMTrace.i(6087981924352L, 45359);
    super.onResume();
    at.wS().a(1063, this);
    at.wS().a(1068, this);
    GMTrace.o(6087981924352L, 45359);
  }
  
  public static final class a
    implements com.tencent.mm.platformtools.i
  {
    private n.a owz;
    
    public a(n.a parama)
    {
      GMTrace.i(6116167647232L, 45569);
      this.owz = parama;
      GMTrace.o(6116167647232L, 45569);
    }
    
    public final void I(String paramString, boolean paramBoolean)
    {
      GMTrace.i(6117375606784L, 45578);
      GMTrace.o(6117375606784L, 45578);
    }
    
    public final i.b Pl()
    {
      GMTrace.i(6117778259968L, 45581);
      GMTrace.o(6117778259968L, 45581);
      return null;
    }
    
    public final String Pm()
    {
      GMTrace.i(6116301864960L, 45570);
      String str = com.tencent.mm.plugin.scanner.c.bcm().dv(this.owz.field_thumburl, "@S");
      GMTrace.o(6116301864960L, 45570);
      return str;
    }
    
    public final String Pn()
    {
      GMTrace.i(6116436082688L, 45571);
      if (this.owz == null)
      {
        GMTrace.o(6116436082688L, 45571);
        return "";
      }
      String str = this.owz.field_thumburl;
      GMTrace.o(6116436082688L, 45571);
      return str;
    }
    
    public final String Po()
    {
      GMTrace.i(6116570300416L, 45572);
      if (this.owz == null)
      {
        GMTrace.o(6116570300416L, 45572);
        return "";
      }
      String str = this.owz.field_thumburl;
      GMTrace.o(6116570300416L, 45572);
      return str;
    }
    
    public final String Pp()
    {
      GMTrace.i(6116704518144L, 45573);
      if (this.owz == null)
      {
        GMTrace.o(6116704518144L, 45573);
        return "";
      }
      String str = this.owz.field_thumburl;
      GMTrace.o(6116704518144L, 45573);
      return str;
    }
    
    public final boolean Pq()
    {
      GMTrace.i(6116838735872L, 45574);
      GMTrace.o(6116838735872L, 45574);
      return false;
    }
    
    public final boolean Pr()
    {
      GMTrace.i(6116972953600L, 45575);
      GMTrace.o(6116972953600L, 45575);
      return false;
    }
    
    public final Bitmap Ps()
    {
      GMTrace.i(6117644042240L, 45580);
      if (ab.getContext() == null)
      {
        GMTrace.o(6117644042240L, 45580);
        return null;
      }
      Bitmap localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
      GMTrace.o(6117644042240L, 45580);
      return localBitmap;
    }
    
    public final void Pt()
    {
      GMTrace.i(6117241389056L, 45577);
      GMTrace.o(6117241389056L, 45577);
    }
    
    public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
    {
      GMTrace.i(6117107171328L, 45576);
      if (i.a.hiU == parama) {}
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Pm(), false);
        GMTrace.o(6117107171328L, 45576);
        return paramBitmap;
      }
      catch (IOException parama)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.scanner.ProductUI", parama, "", new Object[0]);
        }
      }
    }
    
    public final void a(i.a parama, String paramString)
    {
      GMTrace.i(6117509824512L, 45579);
      GMTrace.o(6117509824512L, 45579);
    }
  }
  
  private final class b
  {
    int LQ;
    ProductScrollView owX;
    boolean owY;
    private ProductScrollView.a owZ;
    
    public b()
    {
      GMTrace.i(6067312394240L, 45205);
      this.owZ = new ProductScrollView.a()
      {
        public final void auP()
        {
          float f3 = 1.0F;
          GMTrace.i(6081807908864L, 45313);
          ProductUI.b localb = ProductUI.b.this;
          int i = localb.owX.getScrollY();
          float f1;
          label75:
          float f2;
          if (i < 0)
          {
            f1 = -1.0F;
            w.v("MicroMsg.ProductUI.HeaderEffectHelper", "rate=" + f1);
            if (f1 != 1.0F) {
              break label224;
            }
            if (!localb.owY)
            {
              localb.owY = true;
              if (ProductUI.v(localb.owR) != null)
              {
                float f4 = 1.0F - f1 - 0.2F;
                f2 = f4;
                if (f4 <= 0.0F) {
                  f2 = 0.0F;
                }
                if (f1 == 0.0F) {
                  f2 = 1.0F;
                }
                ProductUI.k(ProductUI.v(localb.owR), f2);
              }
              if (ProductUI.w(localb.owR) != null)
              {
                if (f1 != 0.0F) {
                  break label233;
                }
                f2 = 0.0F;
              }
            }
          }
          for (;;)
          {
            ProductUI.k(ProductUI.w(localb.owR), f2);
            GMTrace.o(6081807908864L, 45313);
            return;
            if ((i >= ProductUI.x(localb.owR) - localb.LQ) || (ProductUI.x(localb.owR) == 0.0F))
            {
              f1 = 1.0F;
              break;
            }
            f1 = i * 1.37F / ProductUI.x(localb.owR);
            break;
            label224:
            localb.owY = false;
            break label75;
            label233:
            f2 = f3;
            if (f1 >= 0.0F)
            {
              f1 += 0.2F;
              f2 = f3;
              if (f1 <= 1.0F) {
                f2 = f1;
              }
            }
          }
        }
      };
      this.owX = ((ProductScrollView)ProductUI.this.findViewById(R.h.bUA));
      this.owX.owp = this.owZ;
      this.LQ = ProductUI.u(ProductUI.this);
      GMTrace.o(6067312394240L, 45205);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ProductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */