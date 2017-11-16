package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.collect.b.d.a;
import com.tencent.mm.plugin.collect.b.f.a;
import com.tencent.mm.plugin.collect.b.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.ui.k.a;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.aoc;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CollectMainUI
  extends WalletPreferenceUI
  implements d.a, au.a
{
  private static int kaI;
  private static int kaJ;
  private static int kaK;
  private static int kaL;
  private static int kar;
  private int eXn;
  private com.tencent.mm.ui.base.preference.f iAA;
  protected ScrollView jXX;
  private Vibrator jZM;
  private ImageView jZN;
  private TextView jZO;
  private TextView jZP;
  private TextView jZQ;
  private TextView jZR;
  private TextView jZS;
  private View jZT;
  private TextView jZU;
  private Dialog jZV;
  private View jZW;
  private View jZX;
  private boolean jZY;
  private View jZZ;
  private long jZy;
  private String kaA;
  protected CdnImageView kaB;
  protected TextView kaC;
  protected TextView kaD;
  protected ImageView kaE;
  protected ViewGroup kaF;
  protected View kaG;
  private j.a kaH;
  private ImageView kaa;
  private TextView kab;
  private TextView kac;
  private TextView kad;
  protected TextView kae;
  private RelativeLayout kaf;
  private Bitmap kag;
  protected String kah;
  protected String kai;
  protected String kaj;
  private String kak;
  private List<a> kal;
  private double kam;
  private String kan;
  private String kao;
  protected boolean kap;
  private long kaq;
  private View kas;
  private b kat;
  private SpannableStringBuilder kau;
  private SpannableStringBuilder kav;
  private com.tencent.mm.plugin.collect.b.f kaw;
  private int kax;
  private String kay;
  private String kaz;
  
  static
  {
    GMTrace.i(5411121922048L, 40316);
    kaI = -1;
    kaJ = -1;
    kaK = -1;
    kaL = -1;
    GMTrace.o(5411121922048L, 40316);
  }
  
  public CollectMainUI()
  {
    GMTrace.i(5404545253376L, 40267);
    this.jZN = null;
    this.jZO = null;
    this.jZP = null;
    this.jZQ = null;
    this.jZR = null;
    this.jZS = null;
    this.jZT = null;
    this.jZU = null;
    this.iAA = null;
    this.jZV = null;
    this.jZW = null;
    this.jZX = null;
    this.jXX = null;
    this.jZY = false;
    this.jZZ = null;
    this.kag = null;
    this.kah = null;
    this.kai = null;
    this.kaj = null;
    this.kak = null;
    this.kal = new LinkedList();
    this.kan = null;
    this.kao = null;
    this.kap = false;
    this.kat = new b();
    this.kax = 0;
    this.kaH = new j.a()
    {
      public final void k(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(20344186339328L, 151576);
        if ((paramAnonymousString == null) || (CollectMainUI.a(CollectMainUI.this) == null))
        {
          GMTrace.o(20344186339328L, 151576);
          return;
        }
        if (paramAnonymousString.equals(CollectMainUI.a(CollectMainUI.this)))
        {
          w.i("MicroMsg.CollectMainUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", new Object[] { CollectMainUI.a(CollectMainUI.this), paramAnonymousString });
          CollectMainUI.this.apf();
        }
        GMTrace.o(20344186339328L, 151576);
      }
    };
    GMTrace.o(5404545253376L, 40267);
  }
  
  private void apg()
  {
    GMTrace.i(5405350559744L, 40273);
    getWindow().getDecorView().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5402800422912L, 40254);
        int i = com.tencent.mm.br.a.fromDPToPix(CollectMainUI.this.vKB.vKW, 37);
        ViewGroup.LayoutParams localLayoutParams = CollectMainUI.g(CollectMainUI.this).getLayoutParams();
        localLayoutParams.height = i;
        CollectMainUI.g(CollectMainUI.this).setLayoutParams(localLayoutParams);
        CollectMainUI.g(CollectMainUI.this).requestLayout();
        GMTrace.o(5402800422912L, 40254);
      }
    });
    GMTrace.o(5405350559744L, 40273);
  }
  
  private void aph()
  {
    GMTrace.i(5405618995200L, 40275);
    double d;
    if ((this.kal != null) && (this.kal.size() > 0))
    {
      this.jZW.setBackgroundResource(a.e.snP);
      this.iAA.removeAll();
      int i = 0;
      d = 0.0D;
      if (i < this.kal.size())
      {
        a locala = (a)this.kal.get(i);
        c localc;
        if (i == this.kal.size() - 1)
        {
          localc = new c(this, a.g.sMe);
          label107:
          localc.setKey(String.valueOf(i));
          String str2 = locala.fMz;
          String str1 = str2;
          if (bg.nm(str2))
          {
            str1 = str2;
            if (!bg.nm(locala.username)) {
              str1 = com.tencent.mm.wallet_core.ui.e.fs(locala.username);
            }
          }
          localc.mTitle = str1;
          localc.fKP = locala.username;
          if (locala.status != 0) {
            break label224;
          }
          localc.setSummary(a.i.sST);
        }
        for (;;)
        {
          this.iAA.a(localc);
          i += 1;
          break;
          localc = new c(this);
          break label107;
          label224:
          if (locala.status == 1)
          {
            if (locala.jFL)
            {
              d += locala.jWS;
              localc.setSummary(com.tencent.mm.wallet_core.ui.e.d(locala.jWS, locala.eCU));
            }
            for (;;)
            {
              this.iAA.a(localc);
              break;
              localc.setSummary(a.i.sSS);
            }
          }
          if (locala.status == 2) {
            localc.setSummary(a.i.sSR);
          }
        }
      }
      this.iAA.notifyDataSetChanged();
      this.jZR.setText(com.tencent.mm.wallet_core.ui.e.d(d, ((a)this.kal.get(0)).eCU));
      this.jZR.setVisibility(0);
    }
    for (;;)
    {
      if ((this.kal != null) && (this.kal.size() > 0))
      {
        this.kaF.setBackgroundResource(a.e.snQ);
        this.jZT.setVisibility(0);
        if ((d > 0.0D) && (this.kal.size() > 0))
        {
          this.kaG.setVisibility(0);
          this.jZX.setVisibility(0);
          GMTrace.o(5405618995200L, 40275);
        }
      }
      else
      {
        this.jZR.setVisibility(8);
        this.jZT.setVisibility(8);
        this.jZX.setVisibility(8);
      }
      GMTrace.o(5405618995200L, 40275);
      return;
      d = 0.0D;
    }
  }
  
  private static aoc api()
  {
    GMTrace.i(18057250471936L, 134537);
    try
    {
      com.tencent.mm.kernel.h.xz();
      aoc localaoc = z(new JSONObject((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzc, "")));
      GMTrace.o(18057250471936L, 134537);
      return localaoc;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
      GMTrace.o(18057250471936L, 134537);
    }
    return null;
  }
  
  private static List<aoc> apj()
  {
    GMTrace.i(18057384689664L, 134538);
    localArrayList = new ArrayList();
    try
    {
      com.tencent.mm.kernel.h.xz();
      Object localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vze, "");
      if (!bg.nm((String)localObject))
      {
        localObject = new JSONArray((String)localObject);
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          localArrayList.add(z(((JSONArray)localObject).getJSONObject(i)));
          i += 1;
        }
      }
      return localArrayList;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.CollectMainUI", localJSONException, "", new Object[0]);
      GMTrace.o(18057384689664L, 134538);
    }
  }
  
  private Bitmap vk(String paramString)
  {
    GMTrace.i(20340159807488L, 151546);
    String str1 = q.zE();
    int i = this.kax;
    String str2 = this.kaA;
    j.a locala = this.kaH;
    paramString = com.tencent.mm.plugin.collect.b.b.a(this, paramString, str1, i, str2, true, BackwardSupportUtil.b.a(this, 197.0F), locala);
    GMTrace.o(20340159807488L, 151546);
    return paramString;
  }
  
  private static aoc z(JSONObject paramJSONObject)
  {
    GMTrace.i(18057518907392L, 134539);
    aoc localaoc = new aoc();
    localaoc.type = paramJSONObject.optInt("type", -1);
    localaoc.url = paramJSONObject.optString("url", "");
    localaoc.eLQ = paramJSONObject.optString("wording", "");
    localaoc.uEa = paramJSONObject.optString("waapp_username", "");
    localaoc.uEb = paramJSONObject.optString("waapp_path", "");
    GMTrace.o(18057518907392L, 134539);
    return localaoc;
  }
  
  protected final void MP()
  {
    GMTrace.i(5404947906560L, 40270);
    oM(a.i.sWr);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20340025589760L, 151545);
        CollectMainUI.this.finish();
        GMTrace.o(20340025589760L, 151545);
        return true;
      }
    });
    this.iAA = this.wky;
    this.jZT = findViewById(a.f.stR);
    this.kaG = findViewById(a.f.stS);
    this.jZP = ((TextView)findViewById(a.f.stJ));
    this.jZO = ((TextView)findViewById(a.f.stI));
    this.jZQ = ((TextView)findViewById(a.f.stK));
    this.jZR = ((TextView)findViewById(a.f.stQ));
    this.kae = ((TextView)findViewById(a.f.sqJ));
    this.jZW = ((RelativeLayout)findViewById(a.f.stP));
    this.jZX = findViewById(a.f.stN);
    this.kas = LayoutInflater.from(this).inflate(a.g.sMc, null, false);
    this.jZS = ((TextView)findViewById(a.f.sua));
    final Object localObject = new SpannableStringBuilder(getString(a.i.sua));
    ((SpannableStringBuilder)localObject).setSpan(new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void aoR()
      {
        GMTrace.i(5417564372992L, 40364);
        CollectMainUI.b(CollectMainUI.this);
        g.ork.i(13944, new Object[] { Integer.valueOf(5) });
        GMTrace.o(5417564372992L, 40364);
      }
    }), 0, ((SpannableStringBuilder)localObject).length(), 18);
    this.jZS.setText((CharSequence)localObject);
    this.jZS.setClickable(true);
    this.jZS.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
    this.mqO.addFooterView(this.kas, null, false);
    this.mqO.setFooterDividersEnabled(false);
    this.jZN = ((ImageView)findViewById(a.f.stM));
    this.jZU = ((TextView)findViewById(a.f.suf));
    this.kad = ((TextView)findViewById(a.f.suq));
    this.kad.setClickable(true);
    this.kad.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
    this.kau = new SpannableStringBuilder(getString(a.i.sSN));
    this.kav = new SpannableStringBuilder(getString(a.i.sSO));
    localObject = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void aoR()
      {
        GMTrace.i(5413806276608L, 40336);
        Intent localIntent = new Intent();
        localIntent.setClass(CollectMainUI.this.vKB.vKW, CollectCreateQRCodeUI.class);
        localIntent.putExtra("key_currency_unit", CollectMainUI.this.kaj);
        CollectMainUI.this.startActivityForResult(localIntent, 4096);
        GMTrace.o(5413806276608L, 40336);
      }
    });
    com.tencent.mm.plugin.wallet_core.ui.k localk = new com.tencent.mm.plugin.wallet_core.ui.k(new k.a()
    {
      public final void aoR()
      {
        GMTrace.i(20339488718848L, 151541);
        CollectMainUI.this.kap = false;
        CollectMainUI.this.apf();
        CollectMainUI.d(CollectMainUI.this).setText(CollectMainUI.c(CollectMainUI.this));
        CollectMainUI.e(CollectMainUI.this);
        GMTrace.o(20339488718848L, 151541);
      }
    });
    this.kau.setSpan(localObject, 0, this.kau.length(), 18);
    this.kav.setSpan(localk, 0, this.kav.length(), 18);
    this.kad.setText(this.kau);
    this.kaf = ((RelativeLayout)findViewById(a.f.sug));
    this.jZN.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(20339220283392L, 151539);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(CollectMainUI.this.getString(a.i.sSU));
        localLinkedList.add(Integer.valueOf(0));
        com.tencent.mm.ui.base.h.a(CollectMainUI.this.vKB.vKW, CollectMainUI.this.getString(a.i.sSW), paramAnonymousView, localLinkedList, null, true, new h.d()
        {
          public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(17423071707136L, 129812);
            switch (paramAnonymous2Int2)
            {
            }
            for (;;)
            {
              GMTrace.o(17423071707136L, 129812);
              return;
              CollectMainUI.b(CollectMainUI.this);
              g.ork.i(13944, new Object[] { Integer.valueOf(6) });
            }
          }
        });
        GMTrace.o(20339220283392L, 151539);
        return true;
      }
    });
    this.jZZ = findViewById(a.f.stT);
    this.kaa = ((ImageView)findViewById(a.f.sui));
    this.kab = ((TextView)findViewById(a.f.suk));
    this.kac = ((TextView)findViewById(a.f.suj));
    this.kaB = ((CdnImageView)findViewById(a.f.stj));
    this.kaC = ((TextView)findViewById(a.f.stm));
    this.kaD = ((TextView)findViewById(a.f.stn));
    this.kaE = ((ImageView)findViewById(a.f.stl));
    this.kaF = ((ViewGroup)findViewById(a.f.stk));
    this.jZW.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17413944901632L, 129744);
        int[] arrayOfInt = new int[2];
        CollectMainUI.f(CollectMainUI.this).getLocationInWindow(arrayOfInt);
        CollectMainUI.mp(arrayOfInt[1]);
        GMTrace.o(17413944901632L, 129744);
      }
    }, 300L);
    localObject = new sm();
    ((sm)localObject).eXp.eXr = "8";
    ((sm)localObject).eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17414884425728L, 129751);
        if (!bg.nm(localObject.eXq.eXs))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)CollectMainUI.this.findViewById(a.f.sqJ), localObject.eXq.eXs, localObject.eXq.content, localObject.eXq.url);
          GMTrace.o(17414884425728L, 129751);
          return;
        }
        w.i("MicroMsg.CollectMainUI", "no bulletin data");
        GMTrace.o(17414884425728L, 129751);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(5404947906560L, 40270);
  }
  
  public final int QI()
  {
    GMTrace.i(5405887430656L, 40277);
    int i = a.l.tjX;
    GMTrace.o(5405887430656L, 40277);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5406290083840L, 40280);
    GMTrace.o(5406290083840L, 40280);
    return false;
  }
  
  public final void abx()
  {
    GMTrace.i(5406961172480L, 40285);
    w.i("MicroMsg.CollectMainUI", "do screen shot");
    g.ork.i(13944, new Object[] { Integer.valueOf(9) });
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.sSY), "", getString(a.i.sSX), getString(a.i.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(17425890279424L, 129833);
        CollectMainUI.b(CollectMainUI.this);
        g.ork.i(13944, new Object[] { Integer.valueOf(10) });
        GMTrace.o(17425890279424L, 129833);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20344320557056L, 151577);
        GMTrace.o(20344320557056L, 151577);
      }
    });
    GMTrace.o(5406961172480L, 40285);
  }
  
  public final int ait()
  {
    GMTrace.i(5406021648384L, 40278);
    int i = a.g.sMd;
    GMTrace.o(5406021648384L, 40278);
    return i;
  }
  
  protected final void anc()
  {
    GMTrace.i(5405082124288L, 40271);
    if (bg.nm(this.kah))
    {
      w.w("MicroMsg.CollectMainUI", "func[refreshView], mPayUrl null.");
      GMTrace.o(5405082124288L, 40271);
      return;
    }
    if (this.kax == 1)
    {
      if (!bg.nm(this.kay)) {
        this.jZU.setText(this.kay);
      }
      if (!bg.nm(this.kaz))
      {
        localObject = (TextView)findViewById(a.f.stO);
        ((TextView)localObject).setText(this.kaz);
        ((TextView)localObject).setVisibility(0);
      }
    }
    apf();
    aph();
    Object localObject = com.tencent.mm.plugin.wallet_core.model.h.byp();
    if (this.kap) {}
    for (int i = 33;; i = 32)
    {
      if (localObject != null) {
        g.ork.i(13447, new Object[] { Integer.valueOf(i), ((at)localObject).tOR, ((at)localObject).tOS, this.kah, Double.valueOf(this.kam), Long.valueOf(bg.Pu()), Long.valueOf(((at)localObject).tOQ), ((at)localObject).tOT, ((at)localObject).tOU });
      }
      GMTrace.o(5405082124288L, 40271);
      return;
    }
  }
  
  protected final void ap(final List<aoc> paramList)
  {
    GMTrace.i(18057653125120L, 134540);
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        aoc localaoc = (aoc)localIterator.next();
        if (localaoc.type == 1) {
          g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), localaoc.eLQ, "", "", "", Integer.valueOf(1) });
        } else if (localaoc.type == 2) {
          g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), localaoc.eLQ, "", "", localaoc.url, Integer.valueOf(1) });
        } else if (localaoc.type == 3) {
          g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), localaoc.eLQ, localaoc.uEa, localaoc.uEb, "", Integer.valueOf(1) });
        }
      }
    }
    this.kaf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20344588992512L, 151579);
        paramAnonymousView = new com.tencent.mm.ui.widget.f(CollectMainUI.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
        paramAnonymousView.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
          {
            GMTrace.i(20339891372032L, 151544);
            com.tencent.mm.plugin.collect.a.a.aos();
            if (com.tencent.mm.plugin.collect.a.a.aou()) {
              paramAnonymous2n.add(0, 1, 0, a.i.sSI);
            }
            while (CollectMainUI.9.this.kaP != null)
            {
              int i = 0;
              while (i < CollectMainUI.9.this.kaP.size())
              {
                aoc localaoc = (aoc)CollectMainUI.9.this.kaP.get(i);
                if (!bg.nm(localaoc.eLQ)) {
                  paramAnonymous2n.add(0, i + 1 + 1, 0, localaoc.eLQ);
                }
                i += 1;
              }
              paramAnonymous2n.add(0, 1, 0, a.i.sSP);
            }
            GMTrace.o(20339891372032L, 151544);
          }
        };
        paramAnonymousView.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(20339757154304L, 151543);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            default: 
              paramAnonymous2Int = paramAnonymous2MenuItem.getItemId() - 1 - 1;
              if (paramAnonymous2Int < 0)
              {
                w.w("MicroMsg.CollectMainUI", "illegal pos: %s", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                GMTrace.o(20339757154304L, 151543);
                return;
              }
              break;
            case 1: 
              com.tencent.mm.plugin.collect.a.a.aos();
              if (com.tencent.mm.plugin.collect.a.a.aou())
              {
                CollectMainUI.t(CollectMainUI.this);
                Toast.makeText(CollectMainUI.this.vKB.vKW, a.i.sSJ, 1).show();
                g.ork.i(13944, new Object[] { Integer.valueOf(8) });
                GMTrace.o(20339757154304L, 151543);
                return;
              }
              CollectMainUI.u(CollectMainUI.this);
              Toast.makeText(CollectMainUI.this.vKB.vKW, a.i.sSQ, 1).show();
              g.ork.i(13944, new Object[] { Integer.valueOf(7) });
              GMTrace.o(20339757154304L, 151543);
              return;
            }
            paramAnonymous2MenuItem = (aoc)CollectMainUI.9.this.kaP.get(paramAnonymous2Int);
            if (paramAnonymous2MenuItem.type == 1)
            {
              w.w("MicroMsg.CollectMainUI", "wrong native type: %s", new Object[] { paramAnonymous2MenuItem.url });
              g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(1), paramAnonymous2MenuItem.eLQ, "", "", "", Integer.valueOf(2) });
              GMTrace.o(20339757154304L, 151543);
              return;
            }
            if (paramAnonymous2MenuItem.type == 2)
            {
              if (!bg.nm(paramAnonymous2MenuItem.url))
              {
                com.tencent.mm.wallet_core.ui.e.m(CollectMainUI.this.vKB.vKW, paramAnonymous2MenuItem.url, false);
                g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(2), paramAnonymous2MenuItem.eLQ, "", "", paramAnonymous2MenuItem.url, Integer.valueOf(2) });
                GMTrace.o(20339757154304L, 151543);
              }
            }
            else if (paramAnonymous2MenuItem.type == 3)
            {
              qi localqi = new qi();
              localqi.eUY.userName = paramAnonymous2MenuItem.uEa;
              localqi.eUY.eVa = bg.aq(paramAnonymous2MenuItem.uEb, "");
              localqi.eUY.scene = 1072;
              localqi.eUY.eVb = 0;
              com.tencent.mm.sdk.b.a.vgX.m(localqi);
              g.ork.i(14526, new Object[] { Integer.valueOf(2), Integer.valueOf(3), paramAnonymous2MenuItem.eLQ, paramAnonymous2MenuItem.uEa, paramAnonymous2MenuItem.uEb, "", Integer.valueOf(2) });
            }
            GMTrace.o(20339757154304L, 151543);
          }
        };
        paramAnonymousView.bFk();
        GMTrace.o(20344588992512L, 151579);
      }
    });
    GMTrace.o(18057653125120L, 134540);
  }
  
  protected void apb()
  {
    GMTrace.i(17418776739840L, 129780);
    this.kaw = new com.tencent.mm.plugin.collect.b.f();
    Object localObject = this.kaw;
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(1588, (com.tencent.mm.ad.e)localObject);
    com.tencent.mm.plugin.collect.b.f localf = this.kaw;
    f.a local7 = new f.a()
    {
      public final void a(boolean paramAnonymousBoolean, kd paramAnonymouskd)
      {
        GMTrace.i(20344857427968L, 151581);
        w.i("MicroMsg.CollectMainUI", "get from cgi: %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean)
        {
          CollectMainUI.this.kah = paramAnonymouskd.url;
          CollectMainUI.this.kai = paramAnonymouskd.ree;
          CollectMainUI.a(CollectMainUI.this, paramAnonymouskd.omG);
          CollectMainUI.b(CollectMainUI.this, paramAnonymouskd.omH);
          CollectMainUI.a(CollectMainUI.this, paramAnonymouskd.omI);
          CollectMainUI.c(CollectMainUI.this, paramAnonymouskd.uaR);
          CollectMainUI.a(CollectMainUI.this, paramAnonymouskd.uaO);
          CollectMainUI.this.ap(paramAnonymouskd.uaN);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vzK, Integer.valueOf(CollectMainUI.s(CollectMainUI.this)));
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vzL, CollectMainUI.a(CollectMainUI.this));
          CollectMainUI.this.anc();
        }
        GMTrace.o(20344857427968L, 151581);
      }
      
      public final void bL(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(20344723210240L, 151580);
        w.i("MicroMsg.CollectMainUI", "get cache: %s, %s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
        CollectMainUI.this.kah = paramAnonymousString1;
        CollectMainUI.this.kai = paramAnonymousString2;
        paramAnonymousString1 = CollectMainUI.p(CollectMainUI.this);
        paramAnonymousString2 = CollectMainUI.q(CollectMainUI.this);
        CollectMainUI.a(CollectMainUI.this, paramAnonymousString1);
        CollectMainUI.this.ap(paramAnonymousString2);
        if (CollectMainUI.r(CollectMainUI.this) == 1)
        {
          paramAnonymousString1 = CollectMainUI.this;
          com.tencent.mm.kernel.h.xz();
          CollectMainUI.a(paramAnonymousString1, ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzK, Integer.valueOf(-1))).intValue());
          paramAnonymousString1 = CollectMainUI.this;
          com.tencent.mm.kernel.h.xz();
          CollectMainUI.a(paramAnonymousString1, (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzL, ""));
        }
        GMTrace.o(20344723210240L, 151580);
      }
    };
    com.tencent.mm.kernel.h.xz();
    String str1 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vza, "");
    com.tencent.mm.kernel.h.xz();
    String str2 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzb, "");
    localObject = str1;
    if (bg.nm(str1))
    {
      w.i("MicroMsg.F2fGetPayUrlManager", "use old payurl");
      localObject = com.tencent.mm.plugin.wallet_core.model.n.byx().byV();
    }
    local7.bL((String)localObject, str2);
    localObject = new com.tencent.mm.plugin.collect.b.k();
    localf.fUk.put(localObject, local7);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
    GMTrace.o(17418776739840L, 129780);
  }
  
  protected String apc()
  {
    GMTrace.i(17418910957568L, 129781);
    if (bg.nm(this.kai))
    {
      this.kai = com.tencent.mm.plugin.wallet_core.model.n.byx().apc();
      this.kai = com.tencent.mm.wallet_core.ui.e.Xx(this.kai);
    }
    String str = this.kai;
    GMTrace.o(17418910957568L, 129781);
    return str;
  }
  
  protected String apd()
  {
    GMTrace.i(17419045175296L, 129782);
    String str = com.tencent.mm.wallet_core.ui.e.Xu(this.kan);
    GMTrace.o(17419045175296L, 129782);
    return str;
  }
  
  protected void ape()
  {
    GMTrace.i(17419313610752L, 129784);
    GMTrace.o(17419313610752L, 129784);
  }
  
  protected void apf()
  {
    GMTrace.i(5405216342016L, 40272);
    this.jZN.setImageBitmap(null);
    if (this.kap)
    {
      if (bg.nm(this.kak))
      {
        w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
        GMTrace.o(5405216342016L, 40272);
        return;
      }
      this.kag = vk(this.kak);
      if ((this.kag == null) || (this.kag.isRecycled())) {
        break label252;
      }
      this.jZN.setImageBitmap(this.kag);
      label93:
      if (!this.kap) {
        break label296;
      }
      this.jZQ.setText(apd());
      this.jZP.setText(com.tencent.mm.wallet_core.ui.e.r(this.kam));
      this.jZP.setVisibility(0);
      this.jZQ.setVisibility(0);
      if (bg.nm(this.kao)) {
        break label284;
      }
      this.jZO.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.vKB.vKW, this.kao, this.jZO.getTextSize()));
      this.jZO.setVisibility(0);
    }
    for (;;)
    {
      findViewById(a.f.stL).setVisibility(0);
      GMTrace.o(5405216342016L, 40272);
      return;
      if (bg.nm(this.kah))
      {
        w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
        GMTrace.o(5405216342016L, 40272);
        return;
      }
      this.kag = vk(this.kah);
      break;
      label252:
      w.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : bmp null ,mFixedPayUrl=" + bg.nl(this.kak));
      break label93;
      label284:
      this.jZO.setVisibility(8);
    }
    label296:
    this.jZQ.setVisibility(8);
    this.jZP.setVisibility(8);
    this.jZO.setVisibility(8);
    findViewById(a.f.stL).setVisibility(8);
    GMTrace.o(5405216342016L, 40272);
  }
  
  public final void b(s params)
  {
    int k = 0;
    GMTrace.i(5406424301568L, 40281);
    w.d("MicroMsg.CollectMainUI", "func[onRecv]:Recv payerMsg");
    int i;
    if (((this.eXn != 1) && (this.eXn != 0)) || ((params.msgType == 9) || ((this.eXn == 8) && (params.msgType == 26))))
    {
      if (this.jZM != null) {
        this.jZM.vibrate(50L);
      }
      if (params.jWT < this.kaq)
      {
        w.d("MicroMsg.CollectMainUI", "Recieve but time out ");
        GMTrace.o(5406424301568L, 40281);
        return;
      }
      i = 0;
      if (i >= this.kal.size()) {
        break label519;
      }
      if ((params.status != 0) || (!bg.nl(params.username).equals(((a)this.kal.get(i)).username)) || (((a)this.kal.get(i)).status != 2)) {
        break label329;
      }
      this.kal.remove(i);
      this.kal.add(i, new a(params));
      i = 1;
    }
    for (;;)
    {
      label215:
      if (i == 0) {
        i = 0;
      }
      for (;;)
      {
        int j = k;
        Object localObject;
        if (i < this.kal.size())
        {
          localObject = (s)this.kal.get(i);
          if (params.jWT > ((s)localObject).jWT)
          {
            this.kal.add(i, new a(params));
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            this.kal.add(new a(params));
          }
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5425483218944L, 40423);
              CollectMainUI.h(CollectMainUI.this);
              CollectMainUI.i(CollectMainUI.this).abC();
              CollectMainUI.e(CollectMainUI.this);
              GMTrace.o(5425483218944L, 40423);
            }
          });
          GMTrace.o(5406424301568L, 40281);
          return;
          label329:
          if (params.eRP.equals(((a)this.kal.get(i)).eRP))
          {
            w.v("MicroMsg.CollectMainUI", "func[onRecv] Duplicated msg, transId=" + params.eRP);
            if (((a)this.kal.get(i)).status == 0)
            {
              ((a)this.kal.get(i)).status = params.status;
              ((a)this.kal.get(i)).jWS = params.jWS;
              ((a)this.kal.get(i)).eCU = params.eCU;
              if (params.status == 1)
              {
                localObject = this.kat;
                a locala = (a)this.kal.get(i);
                ((b)localObject).kaU.add(locala);
              }
            }
            i = 1;
            break label215;
          }
          i += 1;
          break;
        }
        i += 1;
      }
      label519:
      i = 0;
    }
  }
  
  public boolean f(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5406155866112L, 40279);
    GMTrace.o(5406155866112L, 40279);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(5407095390208L, 40286);
    super.finish();
    overridePendingTransition(a.a.gci, a.a.gcj);
    GMTrace.o(5407095390208L, 40286);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5405753212928L, 40276);
    int i = a.g.sMb;
    GMTrace.o(5405753212928L, 40276);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5406558519296L, 40282);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5406558519296L, 40282);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.kak = paramIntent.getStringExtra("ftf_pay_url");
        this.kam = paramIntent.getDoubleExtra("ftf_fixed_fee", 0.0D);
        this.kan = paramIntent.getStringExtra("ftf_fixed_fee_type");
        this.kao = paramIntent.getStringExtra("ftf_fixed_desc");
        this.kaj = paramIntent.getStringExtra("key_currency_unit");
        this.kad.setText(this.kav);
      }
      for (this.kap = true;; this.kap = false)
      {
        anc();
        apg();
        GMTrace.o(5406558519296L, 40282);
        return;
      }
      this.jZy = q.zJ();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5404679471104L, 40268);
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.slR)));
    paramBundle = cN().cO().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.aNX));
      }
      paramBundle = paramBundle.findViewById(16908309);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.white));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.slS));
    }
    com.tencent.mm.kernel.h.xz();
    this.eXn = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
    this.jZy = q.zJ();
    int i = getIntent().getIntExtra("key_from_scene", 1);
    g.ork.i(14021, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
    com.tencent.mm.kernel.h.xz();
    boolean bool = ((String)com.tencent.mm.kernel.h.xy().xh().get(327731, "0")).equals("0");
    overridePendingTransition(a.a.aMb, a.a.aMa);
    if (bool)
    {
      paramBundle = this.vKB.vKW;
      if (!q.zR()) {
        break label565;
      }
    }
    label565:
    for (i = a.i.sSL;; i = a.i.sSK)
    {
      com.tencent.mm.ui.base.h.a(paramBundle, i, a.i.sSM, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5414074712064L, 40338);
          GMTrace.o(5414074712064L, 40338);
        }
      });
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(327731, "1");
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().kL(true);
      com.tencent.mm.plugin.collect.a.a.aos();
      paramBundle = com.tencent.mm.plugin.collect.a.a.aot();
      if (!paramBundle.jwK.contains(this)) {
        paramBundle.jwK.add(this);
      }
      MP();
      apb();
      anc();
      this.jZM = ((Vibrator)getSystemService("vibrator"));
      this.kaq = bg.Pu();
      if (kaI < 0)
      {
        paramBundle = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics(paramBundle);
        kaI = paramBundle.widthPixels / 2 - BackwardSupportUtil.b.a(this.vKB.vKW, 20.0F);
        kaJ = BackwardSupportUtil.b.a(this.vKB.vKW, 60.0F);
        kaK = BackwardSupportUtil.b.a(this.vKB.vKW, 40.0F);
        kaL = BackwardSupportUtil.b.a(this.vKB.vKW, 70.0F);
      }
      apg();
      com.tencent.mm.wallet_core.c.p.eP(16, 0);
      GMTrace.o(5404679471104L, 40268);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5404813688832L, 40269);
    if (this.jZN != null) {
      this.jZN.setImageBitmap(null);
    }
    Object localObject = this.kag;
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
    {
      w.i("MicroMsg.CollectMainUI", "bitmap recycle %s", new Object[] { localObject });
      ((Bitmap)localObject).recycle();
    }
    if (this.jZV != null) {
      this.jZV.dismiss();
    }
    com.tencent.mm.plugin.collect.a.a.aos();
    com.tencent.mm.plugin.collect.a.a.aot().jwK.remove(this);
    this.jZM.cancel();
    if (this.kaw != null)
    {
      localObject = this.kaw;
      Iterator localIterator = ((com.tencent.mm.plugin.collect.b.f)localObject).fUk.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        w.i("MicroMsg.F2fGetPayUrlManager", "uninit, do cancel netscene");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.c((com.tencent.mm.ad.k)localEntry.getKey());
      }
      ((com.tencent.mm.plugin.collect.b.f)localObject).fUk.clear();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(1588, (com.tencent.mm.ad.e)localObject);
    }
    j.c(this.kaH);
    super.onDestroy();
    GMTrace.o(5404813688832L, 40269);
  }
  
  protected void onPause()
  {
    GMTrace.i(5406826954752L, 40284);
    super.onPause();
    au.a(null);
    GMTrace.o(5406826954752L, 40284);
  }
  
  protected void onResume()
  {
    GMTrace.i(5406692737024L, 40283);
    super.onResume();
    au.a(this);
    GMTrace.o(5406692737024L, 40283);
  }
  
  final class a
    extends s
  {
    public boolean jFL;
    
    public a(s params)
    {
      GMTrace.i(5436086419456L, 40502);
      this.jFL = false;
      this.username = params.username;
      this.eRP = params.eRP;
      this.jWS = params.jWS;
      this.jWT = params.jWT;
      this.scene = params.scene;
      this.status = params.status;
      this.fMz = params.fMz;
      GMTrace.o(5436086419456L, 40502);
    }
  }
  
  private final class b
  {
    public boolean kaT;
    LinkedList<CollectMainUI.a> kaU;
    
    public b()
    {
      GMTrace.i(5414880018432L, 40344);
      this.kaU = new LinkedList();
      GMTrace.o(5414880018432L, 40344);
    }
    
    public final void abC()
    {
      GMTrace.i(5415014236160L, 40345);
      if (!this.kaT)
      {
        if (!this.kaU.isEmpty())
        {
          final Object localObject = (CollectMainUI.a)this.kaU.poll();
          this.kaT = true;
          CollectMainUI.h(CollectMainUI.this);
          CollectMainUI.k(CollectMainUI.this).setLayoutParams(new LinearLayout.LayoutParams(CollectMainUI.f(CollectMainUI.this).getWidth(), CollectMainUI.f(CollectMainUI.this).getHeight()));
          if (CollectMainUI.this.kap) {
            CollectMainUI.k(CollectMainUI.this).setPadding(0, CollectMainUI.apn(), 0, 0);
          }
          final AnimationSet localAnimationSet;
          int j;
          for (;;)
          {
            CollectMainUI.l(CollectMainUI.this).setText(com.tencent.mm.pluginsdk.ui.d.h.b(CollectMainUI.this.vKB.vKW, ((CollectMainUI.a)localObject).fMz, CollectMainUI.l(CollectMainUI.this).getTextSize()));
            a.b.a(CollectMainUI.m(CollectMainUI.this), ((CollectMainUI.a)localObject).username);
            CollectMainUI.n(CollectMainUI.this).setText(com.tencent.mm.wallet_core.ui.e.d(((CollectMainUI.a)localObject).jWS, ((CollectMainUI.a)localObject).eCU));
            CollectMainUI.k(CollectMainUI.this).setVisibility(0);
            localAnimationSet = new AnimationSet(false);
            localAnimationSet.addAnimation(new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F));
            j = 0;
            int i = 0;
            while (i < CollectMainUI.o(CollectMainUI.this).size())
            {
              if (((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).eRP.equals(((CollectMainUI.a)localObject).eRP)) {
                j = i;
              }
              i += 1;
            }
            CollectMainUI.k(CollectMainUI.this).setPadding(0, CollectMainUI.apo(), 0, 0);
          }
          float f3 = CollectMainUI.apk();
          float f2 = 0.0F + CollectMainUI.f(CollectMainUI.this).getHeight() / 2;
          float f1 = f2;
          if (CollectMainUI.j(CollectMainUI.this).getVisibility() == 0) {
            f1 = f2 + CollectMainUI.j(CollectMainUI.this).getHeight();
          }
          f2 = j * CollectMainUI.apl() + CollectMainUI.apl() / 2;
          int[] arrayOfInt = new int[2];
          CollectMainUI.f(CollectMainUI.this).getLocationInWindow(arrayOfInt);
          localAnimationSet.addAnimation(new TranslateAnimation(0.0F, f3, 0.0F, (int)(f1 + f2 + (arrayOfInt[1] - CollectMainUI.apm()))));
          localAnimationSet.setDuration(300L);
          localAnimationSet.setInterpolator(new DecelerateInterpolator());
          localAnimationSet.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5423872606208L, 40411);
              CollectMainUI.k(CollectMainUI.this).setVisibility(8);
              w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animation end. TransId=" + localObject.eRP);
              int i = 0;
              for (;;)
              {
                if (i < CollectMainUI.o(CollectMainUI.this).size())
                {
                  if (((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).eRP.equals(localObject.eRP))
                  {
                    ((CollectMainUI.a)CollectMainUI.o(CollectMainUI.this).get(i)).jFL = true;
                    w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Update msg animation status. TransId=" + localObject.eRP);
                  }
                }
                else
                {
                  CollectMainUI.h(CollectMainUI.this);
                  CollectMainUI.b.this.kaT = false;
                  CollectMainUI.b.this.abC();
                  GMTrace.o(5423872606208L, 40411);
                  return;
                }
                i += 1;
              }
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5424006823936L, 40412);
              GMTrace.o(5424006823936L, 40412);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5424141041664L, 40413);
              GMTrace.o(5424141041664L, 40413);
            }
          });
          localObject = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
          ((ScaleAnimation)localObject).setDuration(300L);
          ((ScaleAnimation)localObject).setInterpolator(new LinearInterpolator());
          ((ScaleAnimation)localObject).setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426691178496L, 40432);
              localAnimationSet.setStartOffset(1700L);
              CollectMainUI.k(CollectMainUI.this).startAnimation(localAnimationSet);
              GMTrace.o(5426691178496L, 40432);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426825396224L, 40433);
              GMTrace.o(5426825396224L, 40433);
            }
            
            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
              GMTrace.i(5426959613952L, 40434);
              CollectMainUI.k(CollectMainUI.this).setVisibility(0);
              GMTrace.o(5426959613952L, 40434);
            }
          });
          CollectMainUI.k(CollectMainUI.this).startAnimation((Animation)localObject);
          GMTrace.o(5415014236160L, 40345);
        }
      }
      else {
        w.d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animating, wait. QueueSize=" + this.kaU.size());
      }
      GMTrace.o(5415014236160L, 40345);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */