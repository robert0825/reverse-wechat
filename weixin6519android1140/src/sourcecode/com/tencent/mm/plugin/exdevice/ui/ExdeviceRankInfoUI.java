package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.j.a;
import com.tencent.mm.plugin.exdevice.f.b.f;
import com.tencent.mm.plugin.exdevice.model.ac;
import com.tencent.mm.plugin.exdevice.model.ac.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.a;
import com.tencent.mm.ui.base.MMPullDownView.b;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class ExdeviceRankInfoUI
  extends MMActivity
  implements j.a, com.tencent.mm.plugin.exdevice.f.b.e, f, d
{
  private static int kII;
  private boolean FS;
  private String iAx;
  private String imd;
  private boolean kCa;
  public boolean kCm;
  public String kCn;
  private r kGg;
  private Map<String, String> kIY;
  private ImageView kIs;
  private View kIw;
  private String kIy;
  private String kIz;
  private ListView kJB;
  private b kJC;
  private View kJD;
  private ExdeviceRankListHeaderView kJE;
  private ExdeviceRankChampionInfoView kJF;
  private View kJG;
  private String kJH;
  private String kJI;
  private String kJJ;
  private String kJK;
  private com.tencent.mm.plugin.exdevice.f.b.a.a kJL;
  private String kJM;
  private int kJN;
  private List<e> kJO;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> kJP;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> kJQ;
  private boolean kJR;
  private boolean kJS;
  private String kJT;
  private boolean kJU;
  private j kJV;
  private com.tencent.mm.plugin.exdevice.a.b<j> kJW;
  
  static
  {
    GMTrace.i(11048534933504L, 82318);
    kII = 128;
    GMTrace.o(11048534933504L, 82318);
  }
  
  public ExdeviceRankInfoUI()
  {
    GMTrace.i(11041824047104L, 82268);
    this.kGg = null;
    this.kIY = new HashMap();
    this.kJW = new com.tencent.mm.plugin.exdevice.a.b() {};
    GMTrace.o(11041824047104L, 82268);
  }
  
  private void auL()
  {
    GMTrace.i(11042360918016L, 82272);
    if ((this.kJL != null) && (this.iAx != null) && (this.iAx.equals(this.kJL.field_username)) && (bg.nm(this.kJL.field_championUrl)))
    {
      if (this.kIw != null) {
        this.kIw.setVisibility(0);
      }
      if (this.kJE != null)
      {
        this.kJE.kKb = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11101953589248L, 82716);
            com.tencent.mm.plugin.exdevice.f.a.e.c(ExdeviceRankInfoUI.this);
            GMTrace.o(11101953589248L, 82716);
          }
        };
        GMTrace.o(11042360918016L, 82272);
      }
    }
    else
    {
      if (this.kIw != null) {
        this.kIw.setVisibility(8);
      }
      if ((this.kJL != null) && (!bg.aq(this.kJL.field_username, "").equals(this.iAx)) && (!bg.nm(this.kJL.field_championUrl))) {
        this.kJE.kKb = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11090545082368L, 82631);
            ExdeviceRankInfoUI.p(ExdeviceRankInfoUI.this);
            GMTrace.o(11090545082368L, 82631);
          }
        };
      }
    }
    GMTrace.o(11042360918016L, 82272);
  }
  
  private void auQ()
  {
    GMTrace.i(16656822697984L, 124103);
    w.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
    this.kJV = new j(this.kJK, this.kJJ, this.kJM, this.kJR, this.kJW);
    this.kJV.kCp = this;
    at.wS().a(this.kJV, 0);
    GMTrace.o(16656822697984L, 124103);
  }
  
  private void auR()
  {
    GMTrace.i(11042226700288L, 82271);
    w.i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", new Object[] { this.kJT, this.iAx });
    String str;
    int i;
    if (!bg.nm(this.kJT))
    {
      str = this.kJT;
      w.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", new Object[] { str, this.iAx });
      if (!bg.nm(str)) {
        break label104;
      }
      i = -1;
    }
    while (i < 0)
    {
      w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "locate to username is null or nil.");
      GMTrace.o(11042226700288L, 82271);
      return;
      label104:
      if ((this.kJO == null) || (this.kJO.size() == 0))
      {
        i = -2;
      }
      else
      {
        i = 0;
        for (;;)
        {
          if (i >= this.kJO.size()) {
            break label309;
          }
          Object localObject = ((e)this.kJO.get(i)).kLW;
          int j = ((e)this.kJO.get(i)).kLX;
          if ((localObject != null) && (str.equalsIgnoreCase(((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject).field_username)) && (!str.equalsIgnoreCase(this.iAx)) && ((j & 0x2) != 2))
          {
            localObject = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
            j = ((DisplayMetrics)localObject).heightPixels;
            w.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            this.kJB.setSelectionFromTop(i, j / 4);
            this.kJC.kIZ = str;
            this.kJC.notifyDataSetInvalidated();
            auU();
            break;
          }
          i += 1;
        }
        label309:
        this.kJC.kIZ = null;
        i = -3;
      }
    }
    GMTrace.o(11042226700288L, 82271);
  }
  
  private void auS()
  {
    GMTrace.i(11042495135744L, 82273);
    String str = auT();
    if (!bg.nm(str)) {
      this.kJM = str;
    }
    GMTrace.o(11042495135744L, 82273);
  }
  
  private String auT()
  {
    GMTrace.i(11042629353472L, 82274);
    if (this.kJO != null)
    {
      Object localObject = this.kJO.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.plugin.exdevice.f.b.a.d locald = ((e)((Iterator)localObject).next()).kLW;
        if ((locald != null) && (locald.field_ranknum == 1))
        {
          localObject = locald.field_username;
          GMTrace.o(11042629353472L, 82274);
          return (String)localObject;
        }
      }
    }
    GMTrace.o(11042629353472L, 82274);
    return null;
  }
  
  private void auU()
  {
    GMTrace.i(11042897788928L, 82276);
    View localView = this.kJB.getChildAt(0);
    int[] arrayOfInt = new int[2];
    if (localView != null)
    {
      if (this.kJB.getFirstVisiblePosition() == 0)
      {
        localView.getLocationOnScreen(arrayOfInt);
        if ((bg.nm(this.kJT)) && (kII == 128)) {
          kII = arrayOfInt[1];
        }
        int i = arrayOfInt[1];
        if (i > 0)
        {
          if (i >= kII) {}
          for (float f = 1.0F;; f = i / kII)
          {
            w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap-alpha: %s", new Object[] { Float.valueOf(f) });
            this.kJF.setAlpha(f);
            this.kJF.setVisibility(0);
            this.kIw.setAlpha(f);
            GMTrace.o(11042897788928L, 82276);
            return;
          }
        }
      }
      this.kJF.setAlpha(0.0F);
      this.kIw.setAlpha(0.0F);
      this.kJF.setVisibility(8);
    }
    GMTrace.o(11042897788928L, 82276);
  }
  
  private void auV()
  {
    GMTrace.i(11043703095296L, 82282);
    if (this.kJL != null)
    {
      if ((this.imd != this.kJL.field_championUrl) && ((this.imd == null) || (!this.imd.equals(this.kJL.field_championUrl))))
      {
        com.tencent.mm.plugin.exdevice.f.a.e.a(this, this.kIs, this.kJL.field_championUrl, R.e.aNq);
        this.imd = this.kJL.field_championUrl;
        GMTrace.o(11043703095296L, 82282);
      }
    }
    else
    {
      this.kIs.setImageResource(R.e.aNq);
      this.imd = null;
    }
    GMTrace.o(11043703095296L, 82282);
  }
  
  private void auX()
  {
    GMTrace.i(11044911054848L, 82291);
    if (bg.nm(this.kCn))
    {
      localObject = ad.atV().wP(this.iAx);
      if (localObject != null) {
        this.kCn = ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject).field_championUrl;
      }
    }
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = b.e(this.iAx, this.kJQ);
    Object localObject = "--";
    String str = "0";
    if (locald != null)
    {
      localObject = String.valueOf(locald.field_ranknum);
      str = String.valueOf(locald.field_score);
    }
    new ac().a(this, (String)localObject, str, this.kCn, new ac.a()
    {
      public final void wH(String paramAnonymousString)
      {
        GMTrace.i(11105040596992L, 82739);
        Intent localIntent = new Intent();
        localIntent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
        localIntent.putExtra("Ksnsupload_appname", ExdeviceRankInfoUI.this.getString(R.l.dsd));
        localIntent.putExtra("Ksnsupload_source", 1);
        localIntent.putExtra("need_result", true);
        String str = u.gy("wx_sport");
        u.Av().p(str, true).o("prePublishId", "wx_sport");
        localIntent.putExtra("reportSessionId", str);
        localIntent.putExtra("Ksnsupload_type", 0);
        localIntent.putExtra("sns_kemdia_path", paramAnonymousString);
        com.tencent.mm.bj.d.b(ExdeviceRankInfoUI.this, "sns", ".ui.En_c4f742e5", localIntent, 2);
        GMTrace.o(11105040596992L, 82739);
      }
    });
    GMTrace.o(11044911054848L, 82291);
  }
  
  private void ee(boolean paramBoolean)
  {
    GMTrace.i(11041958264832L, 82269);
    if ((this.kJS) && (!paramBoolean))
    {
      GMTrace.o(11041958264832L, 82269);
      return;
    }
    ad.atZ();
    this.kJQ = com.tencent.mm.plugin.exdevice.f.b.c.wL(this.kJK);
    this.kJP = ad.atT().auf();
    this.kJO = this.kJC.b(this.kJP, this.kJQ, this.kCm);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11019007033344L, 82098);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).kIX = ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).notifyDataSetChanged();
        ExdeviceRankInfoUI.c(ExdeviceRankInfoUI.this);
        GMTrace.o(11019007033344L, 82098);
      }
    });
    GMTrace.o(11041958264832L, 82269);
  }
  
  private void ef(boolean paramBoolean)
  {
    GMTrace.i(11043837313024L, 82283);
    if (paramBoolean) {
      auS();
    }
    if (!bg.nm(this.kJJ))
    {
      this.kJF.xd(this.kJM);
      this.kJF.setVisibility(0);
      GMTrace.o(11043837313024L, 82283);
      return;
    }
    this.kJF.setVisibility(8);
    GMTrace.o(11043837313024L, 82283);
  }
  
  protected final void MP()
  {
    GMTrace.i(11042763571200L, 82275);
    this.kJD = findViewById(R.h.bRp);
    Object localObject1 = new ExdeviceRankListHeaderView(this);
    Object localObject2 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject2);
    int j = ((Rect)localObject2).top;
    int i = j;
    if (j == 0) {
      i = com.tencent.mm.plugin.exdevice.j.b.w(this, getResources().getDimensionPixelSize(R.f.aPV));
    }
    localObject2 = getResources().getDisplayMetrics();
    if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
    {
      j = getResources().getDimensionPixelSize(R.f.aPM);
      localObject2 = getWindowManager().getDefaultDisplay();
      j = ((Display)localObject2).getHeight() / 2 - i - j;
      if (((Display)localObject2).getHeight() > 0)
      {
        i = j;
        if (j > 0) {}
      }
      else
      {
        i = getResources().getDimensionPixelSize(R.f.aPU);
      }
      ((ExdeviceRankListHeaderView)localObject1).setMinimumHeight(i);
      ((ExdeviceRankListHeaderView)localObject1).setMinimumWidth(((Display)localObject2).getWidth());
      ((ExdeviceRankListHeaderView)localObject1).setTag(Integer.valueOf(i));
      this.kJE = ((ExdeviceRankListHeaderView)localObject1);
      localObject1 = (MMPullDownView)findViewById(R.h.bUD);
      this.kJB = ((ListView)findViewById(R.h.bxJ));
      this.kJF = ((ExdeviceRankChampionInfoView)findViewById(R.h.blY));
      this.kIw = findViewById(R.h.cco);
      this.kIw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14877095624704L, 110843);
          w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap: start change cover");
          com.tencent.mm.plugin.exdevice.f.a.e.c(ExdeviceRankInfoUI.this);
          GMTrace.o(14877095624704L, 110843);
        }
      });
      this.kJE.kKe = false;
      auL();
      ((MMPullDownView)localObject1).lE(false);
      ((MMPullDownView)localObject1).lG(false);
      ((MMPullDownView)localObject1).lF(false);
      ((MMPullDownView)localObject1).lE(false);
      ((MMPullDownView)localObject1).lD(false);
      ((MMPullDownView)localObject1).wei = true;
      ((MMPullDownView)localObject1).wel = new MMPullDownView.a()
      {
        public final boolean auY()
        {
          GMTrace.i(14866492424192L, 110764);
          ExdeviceRankInfoUI localExdeviceRankInfoUI = ExdeviceRankInfoUI.this;
          if ((ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this) != null) && (ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this).size() != 0)) {}
          for (boolean bool = true;; bool = false)
          {
            ExdeviceRankInfoUI.b(localExdeviceRankInfoUI, bool);
            GMTrace.o(14866492424192L, 110764);
            return false;
          }
        }
      };
      ((MMPullDownView)localObject1).wdZ = new MMPullDownView.c()
      {
        public final boolean aoZ()
        {
          GMTrace.i(14875216576512L, 110829);
          View localView = ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getChildAt(ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getChildCount() - 1);
          int i = ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getCount();
          if ((i > 0) && (localView != null) && (localView.getBottom() <= ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getHeight()) && (ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getLastVisiblePosition() == i - 1))
          {
            GMTrace.o(14875216576512L, 110829);
            return true;
          }
          GMTrace.o(14875216576512L, 110829);
          return false;
        }
      };
      ((MMPullDownView)localObject1).wet = new MMPullDownView.b()
      {
        public final void auP()
        {
          GMTrace.i(14875619229696L, 110832);
          ExdeviceRankInfoUI.r(ExdeviceRankInfoUI.this);
          GMTrace.o(14875619229696L, 110832);
        }
      };
      ((MMPullDownView)localObject1).wea = new MMPullDownView.d()
      {
        public final boolean aoY()
        {
          GMTrace.i(14876692971520L, 110840);
          int i = ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getFirstVisiblePosition();
          if (i == 0)
          {
            View localView = ExdeviceRankInfoUI.q(ExdeviceRankInfoUI.this).getChildAt(i);
            if ((localView != null) && (localView.getTop() >= 0))
            {
              GMTrace.o(14876692971520L, 110840);
              return true;
            }
          }
          GMTrace.o(14876692971520L, 110840);
          return false;
        }
      };
      this.kJB.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(14870250520576L, 110792);
          ExdeviceRankInfoUI.r(ExdeviceRankInfoUI.this);
          GMTrace.o(14870250520576L, 110792);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(14870116302848L, 110791);
          ExdeviceRankInfoUI.r(ExdeviceRankInfoUI.this);
          GMTrace.o(14870116302848L, 110791);
        }
      });
      this.kJB.addHeaderView(this.kJE, null, false);
      localObject2 = getLayoutInflater().inflate(R.i.cwa, null);
      this.kJG = ((View)localObject2).findViewById(R.h.bHB);
      ((View)localObject2).findViewById(R.h.bHA).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14869847867392L, 110789);
          com.tencent.mm.plugin.sport.b.d.nU(24);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Select_Talker_Name", "gh_43f2581f6fd6");
          paramAnonymousView.putExtra("Select_block_List", "gh_43f2581f6fd6");
          paramAnonymousView.putExtra("Select_Conv_Type", 3);
          paramAnonymousView.putExtra("mutil_select_is_ret", true);
          paramAnonymousView.putExtra("Select_Send_Card", true);
          com.tencent.mm.bj.d.a(ExdeviceRankInfoUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousView, 3);
          GMTrace.o(14869847867392L, 110789);
        }
      });
      this.kJG.setVisibility(8);
      this.kJB.addFooterView((View)localObject2);
      if (this.kJP == null) {
        break label768;
      }
    }
    label644:
    label768:
    for (i = this.kJP.size();; i = 0)
    {
      if (this.kJQ != null) {}
      for (j = this.kJQ.size();; j = 0)
      {
        if (i + j == 0)
        {
          this.kJO = new ArrayList();
          this.kJC.kIX = this.kJO;
          getString(R.l.cUG);
          this.kGg = com.tencent.mm.ui.base.h.a(this, getString(R.l.bKJ), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(14866626641920L, 110765);
              if (ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this) != null)
              {
                ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).dismiss();
                ExdeviceRankInfoUI.f(ExdeviceRankInfoUI.this);
              }
              ExdeviceRankInfoUI.this.finish();
              GMTrace.o(14866626641920L, 110765);
            }
          });
        }
        this.kJB.setAdapter(this.kJC);
        this.kJC.kJa = this;
        if (this.kJN == 1)
        {
          this.kJB.setVisibility(0);
          this.kJD.setVisibility(8);
        }
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label644;
          }
          w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: cannot handle this device type");
          finish();
          GMTrace.o(11042763571200L, 82275);
          return;
          j = getResources().getDimensionPixelSize(R.f.aPN);
          break;
          this.kJB.setVisibility(8);
          this.kJD.setVisibility(0);
        }
        this.kIs = ((ImageView)findViewById(R.h.bxn));
        ((MMPullDownView)localObject1).wei = false;
        int k = com.tencent.mm.br.a.ef(this);
        j = ((Integer)this.kJE.getTag()).intValue();
        i = j;
        if (this.kCm)
        {
          i = getResources().getDimensionPixelSize(R.f.aPX);
          int m = getResources().getDimensionPixelSize(R.f.aPW);
          i = j + (i / 2 + m);
        }
        localObject1 = new RelativeLayout.LayoutParams(k, i);
        this.kIs.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        auV();
        ef(false);
        GMTrace.o(11042763571200L, 82275);
        return;
      }
    }
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(11045045272576L, 82292);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11099135016960L, 82695);
        if ((ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this) != null) && (ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).isShowing()))
        {
          ExdeviceRankInfoUI.e(ExdeviceRankInfoUI.this).dismiss();
          ExdeviceRankInfoUI.f(ExdeviceRankInfoUI.this);
          w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "dismiss tips dialog.");
        }
        GMTrace.o(11099135016960L, 82695);
      }
    });
    this.kIy = paramj.kBQ;
    this.kIz = paramj.kBR;
    this.kCn = paramj.kCn;
    this.kCm = paramj.kCm;
    this.kCa = paramj.kCa;
    this.kJQ = paramj.kCf;
    this.kJP = paramj.kCg;
    this.kJO = this.kJC.b(this.kJP, this.kJQ, this.kCm);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14873605963776L, 110817);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).kIX = ExdeviceRankInfoUI.a(ExdeviceRankInfoUI.this);
        ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).notifyDataSetChanged();
        ExdeviceRankInfoUI.c(ExdeviceRankInfoUI.this);
        GMTrace.o(14873605963776L, 110817);
      }
    });
    GMTrace.o(11045045272576L, 82292);
  }
  
  public final void aT(String paramString, int paramInt)
  {
    GMTrace.i(11044508401664L, 82288);
    ad.atZ();
    String str1 = this.kJK;
    String str2 = this.kJJ;
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.atS();
    boolean bool;
    com.tencent.mm.plugin.exdevice.f.b.a.d locald1;
    if ((!bg.nm(str1)) && (!bg.nm(paramString)) && ((paramInt == 1) || (paramInt == 0) || (paramInt == 2)))
    {
      bool = true;
      Assert.assertTrue(bool);
      locald1 = locald.a(new com.tencent.mm.plugin.exdevice.f.b.d(str1, null, paramString));
      if (locald1 != null) {
        break label121;
      }
      w.w("MicroMsg.ExdeviceRankInfoStg", "hy: info is null. abort");
    }
    for (;;)
    {
      com.tencent.mm.plugin.exdevice.f.b.c.b(str1, str2, paramString, paramInt);
      GMTrace.o(11044508401664L, 82288);
      return;
      bool = false;
      break;
      label121:
      locald1.field_selfLikeState = paramInt;
      switch (locald1.field_selfLikeState)
      {
      default: 
        w.w("MicroMsg.ExdeviceRankInfoStg", "hy: still loading...abort");
      }
    }
    for (locald1.field_likecount += 1;; locald1.field_likecount -= 1)
    {
      locald.a(locald1, true);
      break;
    }
  }
  
  public final void auW()
  {
    GMTrace.i(11044374183936L, 82287);
    com.tencent.mm.plugin.sport.b.d.nU(31);
    auX();
    GMTrace.o(11044374183936L, 82287);
  }
  
  public final void b(String paramString, com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    GMTrace.i(11043971530752L, 82284);
    if ((paramd != null) && (!bg.nm(paramString))) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!"HardDeviceRankInfo".equals(paramString)) {
        break;
      }
      if ((this.kJK == null) || (!this.kJK.equals(paramd.kCc))) {
        break label222;
      }
      w.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", new Object[] { this.kJK });
      ee(true);
      if ((bg.nm(this.kJM)) || (!this.kJM.equals(auT())))
      {
        auS();
        this.kJL = ad.atV().wP(this.kJM);
        runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11080076099584L, 82553);
            ExdeviceRankInfoUI.s(ExdeviceRankInfoUI.this);
            ExdeviceRankInfoUI.t(ExdeviceRankInfoUI.this);
            GMTrace.o(11080076099584L, 82553);
          }
        });
      }
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11090276646912L, 82629);
          ExdeviceRankInfoUI.u(ExdeviceRankInfoUI.this);
          if (!ExdeviceRankInfoUI.v(ExdeviceRankInfoUI.this))
          {
            ExdeviceRankInfoUI.h(ExdeviceRankInfoUI.this);
            GMTrace.o(11090276646912L, 82629);
            return;
          }
          ExdeviceRankInfoUI.b(ExdeviceRankInfoUI.this).notifyDataSetChanged();
          GMTrace.o(11090276646912L, 82629);
        }
      });
      GMTrace.o(11043971530752L, 82284);
      return;
    }
    if (("HardDeviceChampionInfo".equals(paramString)) && (!bg.nm(this.kJM)) && (this.kJM.equals(paramd.username)))
    {
      this.kJL = ad.atV().wP(this.kJM);
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14874679705600L, 110825);
          ExdeviceRankInfoUI.s(ExdeviceRankInfoUI.this);
          ExdeviceRankInfoUI.t(ExdeviceRankInfoUI.this);
          GMTrace.o(14874679705600L, 110825);
        }
      });
    }
    label222:
    GMTrace.o(11043971530752L, 82284);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11043568877568L, 82281);
    int i = R.i.cwc;
    GMTrace.o(11043568877568L, 82281);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11044642619392L, 82289);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.exdevice.f.a.e.a(this, paramInt1, paramInt2, paramIntent, this.kJJ))
    {
      GMTrace.o(11044642619392L, 82289);
      return;
    }
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(11044642619392L, 82289);
      return;
      if (paramIntent == null)
      {
        w.e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(11044642619392L, 82289);
        return;
      }
      if (paramIntent == null) {}
      for (Object localObject = null; (localObject == null) || (((String)localObject).length() == 0); localObject = paramIntent.getStringExtra("Select_Conv_User"))
      {
        w.e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
        GMTrace.o(11044642619392L, 82289);
        return;
      }
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      ac.b(this, (String)localObject, ac.cj(this), paramIntent, this.kIz);
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getResources().getString(R.l.cUy));
      w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Select conversation return.");
      GMTrace.o(11044642619392L, 82289);
      return;
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getResources().getString(R.l.cUy));
      w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "Share to timeline return.");
      GMTrace.o(11044642619392L, 82289);
      return;
      if (paramIntent != null)
      {
        localObject = bg.g(paramIntent.getStringExtra("received_card_name").split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          com.tencent.mm.plugin.messenger.a.d.aOe().l("gh_43f2581f6fd6", str, s.eb(str));
          if (!bg.nm(paramIntent))
          {
            ol localol = new ol();
            localol.eTx.eTy = str;
            localol.eTx.content = paramIntent;
            localol.eTx.type = s.go(str);
            localol.eTx.flags = 0;
            com.tencent.mm.sdk.b.a.vgX.m(localol);
          }
        }
        GMTrace.o(11044642619392L, 82289);
        return;
        if ((paramIntent != null) && (paramIntent.getBooleanExtra("KeyNeedUpdateRank", false))) {
          auQ();
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11042092482560L, 82270);
    super.onCreate(paramBundle);
    this.FS = false;
    this.iAx = q.zE();
    paramBundle = getIntent();
    this.kJH = paramBundle.getStringExtra("key_rank_info");
    this.kJI = paramBundle.getStringExtra("key_rank_semi");
    this.kJJ = paramBundle.getStringExtra("app_username");
    this.kJK = paramBundle.getStringExtra("rank_id");
    this.kJR = paramBundle.getBooleanExtra("key_is_latest", false);
    this.kJM = paramBundle.getStringExtra("key_champioin_username");
    this.kJN = paramBundle.getIntExtra("device_type", 0);
    this.kJT = paramBundle.getStringExtra("locate_to_username");
    this.kJS = paramBundle.getBooleanExtra("key_only_show_latest_rank", false);
    Object localObject;
    if ((bg.nm(this.kJK)) || ("#".equals(this.kJK)))
    {
      if (!this.kJS)
      {
        paramBundle = ad.atS();
        localObject = String.format("select * from %s order by %s desc limit 1", new Object[] { "HardDeviceRankInfo", "rankID" });
        localObject = paramBundle.fTZ.a((String)localObject, null, 2);
        if (localObject != null) {
          break label660;
        }
        w.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        paramBundle = null;
        if (paramBundle != null)
        {
          this.kJK = paramBundle.field_rankID;
          this.kJJ = paramBundle.field_appusername;
        }
      }
      this.kJM = null;
      this.kJR = true;
    }
    else
    {
      ad.atZ();
      this.kJQ = com.tencent.mm.plugin.exdevice.f.b.c.wL(this.kJK);
      if (!this.kJS)
      {
        if ((this.kJQ != null) && (this.kJQ.size() > 0)) {
          break label705;
        }
        this.kJP = new ArrayList();
        this.kJQ = com.tencent.mm.plugin.exdevice.f.a.a.a(this.kJK, this.kJJ, this.kJH, this.kJI, this.kIY, this.kJP);
        ad.atZ();
        com.tencent.mm.plugin.exdevice.f.b.c.c(this.kJK, this.kJQ);
      }
    }
    for (;;)
    {
      this.kJP = ad.atT().auf();
      this.kJC = new b(this, this.kJJ);
      this.kJC.kIY = this.kIY;
      this.kJO = this.kJC.b(this.kJP, this.kJQ, this.kCm);
      this.kJC.kIX = this.kJO;
      if (bg.nm(this.kJM)) {
        auS();
      }
      this.kJL = ad.atV().wP(this.kJM);
      if ((this.kJL == null) && (!bg.nm(this.kJM)))
      {
        this.kJL = new com.tencent.mm.plugin.exdevice.f.b.a.a();
        this.kJL.field_username = this.kJM;
        this.kJL.field_championMotto = getIntent().getStringExtra("key_champion_info");
        this.kJL.field_championUrl = getIntent().getStringExtra("key_champion_coverimg");
        ad.atZ();
        paramBundle = this.kJL;
        ad.atV().a(paramBundle, true);
      }
      MP();
      if ((this.kJQ != null) && (this.kJQ.size() > 0))
      {
        paramBundle = ((com.tencent.mm.plugin.exdevice.f.b.a.d)this.kJQ.get(0)).field_username;
        this.kJF.xd(paramBundle);
      }
      ad.aua().a(this);
      ad.atZ().kCw = this;
      auQ();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11083163107328L, 82576);
          ExdeviceRankInfoUI.this.finish();
          GMTrace.o(11083163107328L, 82576);
          return false;
        }
      });
      oM(R.l.dse);
      lg(true);
      auR();
      paramBundle = new qh();
      paramBundle.eUX.action = 2;
      com.tencent.mm.sdk.b.a.vgX.a(paramBundle, Looper.getMainLooper());
      GMTrace.o(11042092482560L, 82270);
      return;
      label660:
      if (!((Cursor)localObject).moveToFirst())
      {
        w.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        paramBundle = null;
      }
      for (;;)
      {
        ((Cursor)localObject).close();
        break;
        paramBundle = new com.tencent.mm.plugin.exdevice.f.b.a.d();
        paramBundle.b((Cursor)localObject);
      }
      label705:
      com.tencent.mm.plugin.exdevice.f.a.a.b(this.kJH, this.kJI, this.kIY);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11043300442112L, 82279);
    this.FS = true;
    super.onDestroy();
    if (this.kJV != null) {
      this.kJV.kCp = null;
    }
    ad.aua().b(this);
    ad.atZ().kCw = null;
    ad.atZ().kCx = null;
    GMTrace.o(11043300442112L, 82279);
  }
  
  protected void onPause()
  {
    GMTrace.i(11043434659840L, 82280);
    super.onPause();
    GMTrace.o(11043434659840L, 82280);
  }
  
  protected void onRestart()
  {
    GMTrace.i(11043166224384L, 82278);
    super.onRestart();
    ee(true);
    GMTrace.o(11043166224384L, 82278);
  }
  
  protected void onResume()
  {
    GMTrace.i(11043032006656L, 82277);
    super.onResume();
    GMTrace.o(11043032006656L, 82277);
  }
  
  public final void wM(String paramString)
  {
    GMTrace.i(11044105748480L, 82285);
    w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank changed to %s", new Object[] { paramString });
    this.kJK = paramString;
    GMTrace.o(11044105748480L, 82285);
  }
  
  public final void xf(String paramString)
  {
    GMTrace.i(11044239966208L, 82286);
    com.tencent.mm.plugin.sport.b.d.nU(6);
    Intent localIntent = new Intent(this, ExdeviceProfileUI.class);
    localIntent.putExtra("username", paramString);
    localIntent.putExtra("usernickname", (String)this.kIY.get(paramString));
    localIntent.putExtra("app_username", this.kJJ);
    localIntent.putExtra("rank_id", this.kJK);
    startActivityForResult(localIntent, 4);
    GMTrace.o(11044239966208L, 82286);
  }
  
  public final boolean xg(String paramString)
  {
    GMTrace.i(11044776837120L, 82290);
    if ((!bg.nm(this.kJK)) && (!"#".equals(this.kJK)))
    {
      if (q.zE().equals(paramString))
      {
        w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: is self. see who likes me");
        paramString = new Intent(this, ExdeviceLikeUI.class);
        paramString.putExtra("app_username", this.kJJ);
        paramString.putExtra("rank_id", this.kJK);
        paramString.putExtra("key_is_like_read_only", true);
        startActivity(paramString);
        GMTrace.o(11044776837120L, 82290);
        return true;
      }
      GMTrace.o(11044776837120L, 82290);
      return false;
    }
    w.d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank id is not valid.abort the event");
    Toast.makeText(this, getString(R.l.drR), 0).show();
    GMTrace.o(11044776837120L, 82290);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceRankInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */