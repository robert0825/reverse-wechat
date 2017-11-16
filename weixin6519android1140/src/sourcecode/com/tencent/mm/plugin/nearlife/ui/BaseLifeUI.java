package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseLifeUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  boolean fJp;
  protected boolean gET;
  boolean guN;
  protected String hSv;
  private com.tencent.mm.ui.tools.p jQL;
  MMLoadMoreListView mCG;
  boolean mDI;
  protected String mDZ;
  public int mDo;
  private int mwZ;
  private boolean nuj;
  protected alk nvA;
  protected float nvB;
  protected float nvC;
  protected int nvD;
  protected float nvE;
  protected long nvF;
  protected long nvG;
  protected long nvH;
  protected int nvI;
  protected boolean nvJ;
  protected int nvK;
  protected boolean nvL;
  int nvM;
  private View.OnClickListener nvN;
  private View.OnClickListener nvO;
  private a.a nvP;
  private String nvc;
  private View nvp;
  private NearLifeErrorContent nvq;
  private a nvr;
  private a nvs;
  private View nvt;
  private TextView nvu;
  private TextView nvv;
  private com.tencent.mm.modelgeo.c nvw;
  private com.tencent.mm.plugin.nearlife.b.c nvx;
  private int nvy;
  private List<alk> nvz;
  
  public BaseLifeUI()
  {
    GMTrace.i(12552444575744L, 93523);
    this.nvc = "";
    this.nuj = false;
    this.nvw = com.tencent.mm.modelgeo.c.Ir();
    this.nvA = null;
    this.nvB = 0.0F;
    this.nvC = 0.0F;
    this.nvD = 0;
    this.nvE = 0.0F;
    this.gET = true;
    this.nvF = -1L;
    this.nvG = -1L;
    this.nvH = -1L;
    this.nvI = 0;
    this.nvJ = false;
    this.nvK = -1;
    this.nvL = false;
    this.hSv = "";
    this.mDZ = "";
    this.mDI = false;
    this.fJp = false;
    this.nvM = 0;
    this.mwZ = 1;
    this.mDo = -1;
    this.nvN = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12559960768512L, 93579);
        BaseLifeUI.a(BaseLifeUI.this);
        GMTrace.o(12559960768512L, 93579);
      }
    };
    this.nvO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12561034510336L, 93587);
        if (BaseLifeUI.this.nvA == null)
        {
          w.e("MicroMsg.BaseLifeUI", "Location is null");
          GMTrace.o(12561034510336L, 93587);
          return;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(11138, new Object[] { "1", Integer.valueOf(BaseLifeUI.b(BaseLifeUI.this).getCount() + 1), BaseLifeUI.this.hSv });
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(BaseLifeUI.this, NearLifeCreatePoiUI.class);
        paramAnonymousView.putExtra("get_lat", BaseLifeUI.this.nvA.tYz);
        paramAnonymousView.putExtra("get_lng", BaseLifeUI.this.nvA.tYy);
        paramAnonymousView.putExtra("get_preci", BaseLifeUI.this.nvA.ujb);
        paramAnonymousView.putExtra("get_poi_name", BaseLifeUI.b(BaseLifeUI.this).aTQ());
        paramAnonymousView.putExtra("get_cur_lat", BaseLifeUI.this.nvB);
        paramAnonymousView.putExtra("get_cur_lng", BaseLifeUI.this.nvC);
        paramAnonymousView.putExtra("get_accuracy", BaseLifeUI.this.nvE);
        paramAnonymousView.putExtra("get_loctype", BaseLifeUI.this.nvD);
        paramAnonymousView.putExtra("search_id", BaseLifeUI.this.hSv);
        paramAnonymousView.putExtra("get_is_mars", BaseLifeUI.this.gET);
        BaseLifeUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(12561034510336L, 93587);
      }
    };
    this.guN = false;
    this.nvP = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(18052284416000L, 134500);
        if (BaseLifeUI.this.guN)
        {
          GMTrace.o(18052284416000L, 134500);
          return false;
        }
        if (BaseLifeUI.this.fJp)
        {
          GMTrace.o(18052284416000L, 134500);
          return false;
        }
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(18052284416000L, 134500);
          return true;
        }
        com.tencent.mm.modelstat.n.a(2003, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
        BaseLifeUI.this.fJp = true;
        w.i("MicroMsg.BaseLifeUI", "on get location %f %f " + System.currentTimeMillis(), new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        BaseLifeUI.this.nvA = new alk();
        BaseLifeUI.this.nvA.ujd = "";
        BaseLifeUI.this.nvA.uje = 0;
        BaseLifeUI.this.nvA.tYz = paramAnonymousFloat2;
        BaseLifeUI.this.nvA.tYy = paramAnonymousFloat1;
        BaseLifeUI.this.nvA.ujc = "";
        BaseLifeUI.this.nvA.ujb = ((int)paramAnonymousDouble2);
        BaseLifeUI.this.nvB = paramAnonymousFloat2;
        BaseLifeUI.this.nvC = paramAnonymousFloat1;
        BaseLifeUI.this.nvD = paramAnonymousInt;
        BaseLifeUI.this.nvE = ((float)paramAnonymousDouble2);
        Object localObject = BaseLifeUI.this;
        label348:
        BaseLifeUI localBaseLifeUI;
        if (BaseLifeUI.j(BaseLifeUI.this) == null)
        {
          paramAnonymousBoolean = false;
          ((BaseLifeUI)localObject).gET = paramAnonymousBoolean;
          localObject = BaseLifeUI.f(BaseLifeUI.this).nvi;
          if ((localObject == null) || (((ArrayList)localObject).size() <= 0)) {
            break label500;
          }
          localObject = (BackwardSupportUtil.ExifHelper.LatLongData)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
          BaseLifeUI.this.l(((BackwardSupportUtil.ExifHelper.LatLongData)localObject).eMl, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).gIN);
          BaseLifeUI.this.nvL = BaseLifeUI.b(((BackwardSupportUtil.ExifHelper.LatLongData)localObject).eMl, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).gIN, paramAnonymousFloat2, paramAnonymousFloat1);
          BaseLifeUI.f(BaseLifeUI.this).nvm = new BackwardSupportUtil.ExifHelper.LatLongData(BaseLifeUI.this.nvA.tYz, BaseLifeUI.this.nvA.tYy);
          BaseLifeUI.b(BaseLifeUI.this).nvm = new BackwardSupportUtil.ExifHelper.LatLongData(BaseLifeUI.this.nvA.tYz, BaseLifeUI.this.nvA.tYy);
          localBaseLifeUI = BaseLifeUI.this;
          if (!BaseLifeUI.this.mDI) {
            break label514;
          }
        }
        label500:
        label514:
        for (localObject = BaseLifeUI.b(BaseLifeUI.this);; localObject = BaseLifeUI.f(BaseLifeUI.this))
        {
          BaseLifeUI.a(localBaseLifeUI, (a)localObject);
          BaseLifeUI.k(BaseLifeUI.this);
          BaseLifeUI.this.a(BaseLifeUI.i(BaseLifeUI.this));
          GMTrace.o(18052284416000L, 134500);
          return false;
          paramAnonymousBoolean = BaseLifeUI.j(BaseLifeUI.this).gET;
          break;
          BaseLifeUI.this.l(paramAnonymousFloat2, paramAnonymousFloat1);
          break label348;
        }
      }
    };
    GMTrace.o(12552444575744L, 93523);
  }
  
  private void aTV()
  {
    GMTrace.i(12554189406208L, 93536);
    if (!this.mDI)
    {
      w.i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
      GMTrace.o(12554189406208L, 93536);
      return;
    }
    try
    {
      i = Integer.valueOf(com.tencent.mm.k.g.ut().getValue("POICreateForbiden")).intValue();
      w.i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", new Object[] { Integer.valueOf(i) });
      if (i == 1)
      {
        GMTrace.o(12554189406208L, 93536);
        return;
      }
    }
    catch (Exception localException)
    {
      Object localObject = this.nvs;
      String str = this.nvs.aTQ().trim();
      localObject = ((a)localObject).nvg.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!str.equals(((com.tencent.mm.plugin.nearlife.b.a)((Iterator)localObject).next()).eBt.trim()));
      for (int i = 1; i == 0; i = 0)
      {
        str = String.format(getResources().getString(R.l.dLy), new Object[] { this.nvs.aTQ() });
        this.nvu.setText(str);
        rN(0);
        GMTrace.o(12554189406208L, 93536);
        return;
      }
      rN(8);
      GMTrace.o(12554189406208L, 93536);
    }
  }
  
  private boolean gr(boolean paramBoolean)
  {
    GMTrace.i(18050271150080L, 134485);
    if (this.nvx != null)
    {
      w.d("MicroMsg.BaseLifeUI", "scene is doing...");
      GMTrace.o(18050271150080L, 134485);
      return false;
    }
    if (this.nvz.size() - 1 <= this.nvy)
    {
      this.nvy = -1;
      w.i("MicroMsg.BaseLifeUI", "index inc to end, ret");
      GMTrace.o(18050271150080L, 134485);
      return false;
    }
    this.nvy += 1;
    alk localalk = (alk)this.nvz.get(this.nvy);
    if (this.nvy == 0) {
      this.nvI += 1;
    }
    label155:
    azp localazp;
    if (this.mDI)
    {
      i = this.nvs.b(new BackwardSupportUtil.ExifHelper.LatLongData(localalk.tYz, localalk.tYy));
      if (i <= 0) {
        break label254;
      }
      if (!this.mDI) {
        break label256;
      }
      localazp = this.nvs.a(new BackwardSupportUtil.ExifHelper.LatLongData(localalk.tYz, localalk.tYy));
      label193:
      if (!this.mDI) {
        break label285;
      }
    }
    label254:
    label256:
    label285:
    for (int i = 1;; i = 0)
    {
      if (com.tencent.mm.plugin.nearlife.b.c.rK(i)) {
        break label291;
      }
      this.nvy = -1;
      GMTrace.o(18050271150080L, 134485);
      return false;
      i = this.nvr.b(new BackwardSupportUtil.ExifHelper.LatLongData(localalk.tYz, localalk.tYy));
      break label155;
      break;
      localazp = this.nvr.a(new BackwardSupportUtil.ExifHelper.LatLongData(localalk.tYz, localalk.tYy));
      break label193;
    }
    label291:
    if (-1L == this.nvF) {
      this.nvF = System.currentTimeMillis();
    }
    int j = this.nvM;
    float f1 = localalk.tYy;
    float f2 = localalk.tYz;
    int k = localalk.ujb;
    int m = localalk.uje;
    String str2 = localalk.ujc;
    String str3 = localalk.ujd;
    if (this.mDI) {}
    for (String str1 = this.nvs.aTQ();; str1 = "")
    {
      this.nvx = new com.tencent.mm.plugin.nearlife.b.c(i, j, f1, f2, k, m, str2, str3, localazp, str1, this.mDo, paramBoolean);
      at.wS().a(this.nvx, 0);
      w.i("MicroMsg.BaseLifeUI", "start get lbs life list, index:%d, lat:%f, long:%f", new Object[] { Integer.valueOf(this.nvy), Float.valueOf(localalk.tYz), Float.valueOf(localalk.tYy) });
      GMTrace.o(18050271150080L, 134485);
      return true;
    }
  }
  
  private void rN(int paramInt)
  {
    GMTrace.i(12554592059392L, 93539);
    this.mCG.removeFooterView(this.nvp);
    this.mCG.removeFooterView(this.nvt);
    MMLoadMoreListView localMMLoadMoreListView = this.mCG;
    localMMLoadMoreListView.removeFooterView(localMMLoadMoreListView.koo);
    this.nvt.setVisibility(paramInt);
    this.nvu.setVisibility(paramInt);
    this.nvv.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.mCG.addFooterView(this.nvt);
      GMTrace.o(12554592059392L, 93539);
      return;
    }
    localMMLoadMoreListView = this.mCG;
    if (localMMLoadMoreListView.koo == null) {
      localMMLoadMoreListView.bZY();
    }
    try
    {
      localMMLoadMoreListView.removeFooterView(localMMLoadMoreListView.koo);
      localMMLoadMoreListView.addFooterView(localMMLoadMoreListView.koo);
      this.mCG.addFooterView(this.nvp);
      GMTrace.o(12554592059392L, 93539);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void MP()
  {
    GMTrace.i(12553249882112L, 93529);
    this.mCG = ((MMLoadMoreListView)findViewById(R.h.bPy));
    MMLoadMoreListView localMMLoadMoreListView = this.mCG;
    String str = getString(R.l.dKz);
    localMMLoadMoreListView.wdx.setText(str);
    this.nvq = ((NearLifeErrorContent)findViewById(R.h.bPx));
    aTU();
    this.nvr = aTS();
    this.nvs = aTT();
    this.mCG.setAdapter(this.nvr);
    this.nvq.hvF = this.mCG;
    this.nvr.notifyDataSetChanged();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12546002124800L, 93475);
        BaseLifeUI.this.a(-1, false, "");
        BaseLifeUI.this.finish();
        GMTrace.o(12546002124800L, 93475);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12550028656640L, 93505);
        BackwardSupportUtil.c.a(BaseLifeUI.this.mCG);
        GMTrace.o(12550028656640L, 93505);
      }
    };
    this.jQL = new com.tencent.mm.ui.tools.p(true, true);
    this.jQL.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(18052687069184L, 134503);
        w.d("MicroMsg.BaseLifeUI", "click clear");
        if (BaseLifeUI.c(BaseLifeUI.this) != null)
        {
          at.wS().c(BaseLifeUI.c(BaseLifeUI.this));
          BaseLifeUI.d(BaseLifeUI.this);
        }
        BaseLifeUI.b(BaseLifeUI.this).aTP();
        BaseLifeUI.e(BaseLifeUI.this);
        GMTrace.o(18052687069184L, 134503);
      }
      
      public final void QB()
      {
        GMTrace.i(18052821286912L, 134504);
        GMTrace.o(18052821286912L, 134504);
      }
      
      public final void Qy()
      {
        GMTrace.i(18053089722368L, 134506);
        w.d("MicroMsg.BaseLifeUI", "search helper onQuitSearch");
        BaseLifeUI.this.mDI = false;
        BaseLifeUI.this.mCG.setAdapter(BaseLifeUI.f(BaseLifeUI.this));
        BaseLifeUI.f(BaseLifeUI.this).notifyDataSetChanged();
        BaseLifeUI.g(BaseLifeUI.this).rO(BaseLifeUI.f(BaseLifeUI.this).nvo);
        if ((!BaseLifeUI.f(BaseLifeUI.this).aTR()) && (BaseLifeUI.h(BaseLifeUI.this) != null)) {
          BaseLifeUI.h(BaseLifeUI.this).setVisibility(0);
        }
        BaseLifeUI.this.mCG.setOnTouchListener(null);
        BaseLifeUI.e(BaseLifeUI.this);
        BaseLifeUI.a(BaseLifeUI.this, BaseLifeUI.f(BaseLifeUI.this));
        GMTrace.o(18053089722368L, 134506);
      }
      
      public final void Qz()
      {
        GMTrace.i(18053223940096L, 134507);
        w.d("MicroMsg.BaseLifeUI", "search helper onEnterSearch");
        BaseLifeUI.this.nvJ = true;
        BaseLifeUI.i(BaseLifeUI.this).setHint(BaseLifeUI.this.getString(R.l.dKy));
        BaseLifeUI.this.mDI = true;
        BaseLifeUI.b(BaseLifeUI.this).aTP();
        BaseLifeUI.this.mCG.setAdapter(BaseLifeUI.b(BaseLifeUI.this));
        BaseLifeUI.b(BaseLifeUI.this).notifyDataSetChanged();
        BaseLifeUI.this.mCG.caa();
        BaseLifeUI.g(BaseLifeUI.this).rO(BaseLifeUI.b(BaseLifeUI.this).nvo);
        if (BaseLifeUI.h(BaseLifeUI.this) != null) {
          BaseLifeUI.h(BaseLifeUI.this).setVisibility(8);
        }
        BaseLifeUI.this.mCG.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
          {
            GMTrace.i(19002009059328L, 141576);
            BaseLifeUI.this.aLo();
            GMTrace.o(19002009059328L, 141576);
            return false;
          }
        });
        BaseLifeUI.a(BaseLifeUI.this, BaseLifeUI.b(BaseLifeUI.this));
        GMTrace.o(18053223940096L, 134507);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(12562913558528L, 93601);
        w.d("MicroMsg.BaseLifeUI", "search key click");
        BaseLifeUI.b(BaseLifeUI.this, paramAnonymousString);
        GMTrace.o(12562913558528L, 93601);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(18052955504640L, 134505);
        w.d("MicroMsg.BaseLifeUI", "onSearchBarChange  %s", new Object[] { paramAnonymousString });
        if (bg.nm(paramAnonymousString))
        {
          QA();
          GMTrace.o(18052955504640L, 134505);
          return;
        }
        BaseLifeUI.a(BaseLifeUI.this, paramAnonymousString);
        GMTrace.o(18052955504640L, 134505);
      }
    };
    this.mCG.wdv = new MMLoadMoreListView.a()
    {
      public final void anO()
      {
        GMTrace.i(18052150198272L, 134499);
        BaseLifeUI.a(BaseLifeUI.this);
        GMTrace.o(18052150198272L, 134499);
      }
    };
    this.mCG.bZZ();
    GMTrace.o(12553249882112L, 93529);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12554055188480L, 93535);
    if (paramk.getType() != 603)
    {
      GMTrace.o(12554055188480L, 93535);
      return;
    }
    this.mCG.caa();
    com.tencent.mm.plugin.nearlife.b.c localc = (com.tencent.mm.plugin.nearlife.b.c)paramk;
    LogoImageView localLogoImageView;
    Object localObject;
    if (!bg.nm(localc.nvc))
    {
      this.nvc = localc.nvc;
      localLogoImageView = (LogoImageView)this.nvp.findViewById(R.h.bUG);
      localObject = this.nvc;
      at.AR();
      localLogoImageView.imagePath = com.tencent.mm.y.c.yV();
      localLogoImageView.url = ((String)localObject);
      localLogoImageView.mAB = 0;
      localLogoImageView.lhd = 0;
      if ((localObject != null) && (((String)localObject).length() != 0)) {
        break label195;
      }
      localLogoImageView.setVisibility(8);
    }
    int i;
    for (;;)
    {
      this.hSv = localc.hSv;
      this.mwZ = localc.mwZ;
      i = ((com.tencent.mm.plugin.nearlife.b.c)paramk).eHz;
      com.tencent.mm.plugin.nearlife.b.c.rL(i);
      if (this.nvx != null) {
        break;
      }
      w.d("MicroMsg.BaseLifeUI", "scene is null");
      GMTrace.o(12554055188480L, 93535);
      return;
      label195:
      if (((String)localObject).startsWith("http"))
      {
        Bitmap localBitmap = BitmapFactory.decodeFile(localLogoImageView.imagePath + com.tencent.mm.a.g.n(((String)localObject).getBytes()));
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (localLogoImageView.mAB > 0)
          {
            localObject = localBitmap;
            if (localLogoImageView.lhd > 0) {
              localObject = d.a(localBitmap, localLogoImageView.mAB, localLogoImageView.lhd, true, false);
            }
          }
          localLogoImageView.setImageBitmap((Bitmap)localObject);
        }
        else
        {
          com.tencent.mm.sdk.f.e.post(new LogoImageView.a((String)localObject, localLogoImageView.handler), "LogoImageView_download");
        }
      }
      else if (!com.tencent.mm.a.e.aZ((String)localObject))
      {
        localLogoImageView.setVisibility(8);
      }
      else
      {
        if ((localLogoImageView.mAB <= 0) || (localLogoImageView.lhd <= 0)) {}
        for (localObject = d.RD((String)localObject);; localObject = d.e((String)localObject, localLogoImageView.mAB, localLogoImageView.lhd, true))
        {
          if (localObject != null) {
            break label398;
          }
          localLogoImageView.setVisibility(8);
          break;
        }
        label398:
        localLogoImageView.setImageBitmap((Bitmap)localObject);
      }
    }
    w.i("MicroMsg.BaseLifeUI", "onSceneEnd: index:%d, errType=%d, errCode=%d, errMsg=%s opcde %d ", new Object[] { Integer.valueOf(this.nvy), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
    if ((paramInt2 == 0) || (paramInt2 == 101))
    {
      i = 1;
      if ((paramInt1 == 0) || (i != 0)) {
        break label574;
      }
      w.d("MicroMsg.BaseLifeUI", "error");
      if (!this.mDI) {
        break label566;
      }
      paramString = this.nvs;
      label498:
      if ((this.nvz.size() - 1 == this.nvy) && (paramString.getCount() == 0))
      {
        paramString.nvo = 1;
        this.nvq.rO(paramString.nvo);
      }
    }
    for (;;)
    {
      this.nvx = null;
      gr(false);
      GMTrace.o(12554055188480L, 93535);
      return;
      i = 0;
      break;
      label566:
      paramString = this.nvr;
      break label498;
      label574:
      if (-1L == this.nvG) {
        this.nvG = System.currentTimeMillis();
      }
      this.nvH = System.currentTimeMillis();
      paramk = localc.nvd;
      paramString = (alk)this.nvz.get(this.nvy);
      localObject = new BackwardSupportUtil.ExifHelper.LatLongData(paramString.tYz, paramString.tYy);
      if ((this.mDI) && (!this.nvx.nve)) {
        this.nvs.aTP();
      }
      if (this.mDI)
      {
        this.nvs.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.aTO(), localc.aTN());
        label690:
        if ((paramk != null) && (paramk.size() != 0)) {
          break label864;
        }
        if (!this.mDI) {
          break label856;
        }
      }
      label856:
      for (paramString = this.nvs;; paramString = this.nvr)
      {
        if (this.nvz.size() - 1 == this.nvy)
        {
          if (paramString.getCount() == 0) {
            this.nvq.rO(paramString.nvo);
          }
          this.mCG.caa();
          if ((!paramString.aTR()) && (paramInt2 != 101)) {
            aTV();
          }
        }
        if ((!this.nvr.aTR()) && (this.nvp != null) && (!this.mDI)) {
          this.nvp.setVisibility(0);
        }
        if ((this.nvp == null) || (this.mDI)) {
          break label971;
        }
        this.nvp.setVisibility(0);
        break;
        this.nvr.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.aTO(), localc.aTN());
        break label690;
      }
      label864:
      if (this.mDI) {}
      for (paramString = this.nvs;; paramString = this.nvr)
      {
        boolean bool = this.nvx.nve;
        this.mCG.setVisibility(0);
        paramString.nvo = 0;
        this.nvq.rO(this.nvs.nvo);
        paramString.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, paramk);
        paramString.notifyDataSetChanged();
        if ((this.nvz.size() - 1 != this.nvy) || (paramString.aTR())) {
          break;
        }
        this.mCG.caa();
        aTV();
        break;
      }
      label971:
      if (this.nvp != null) {
        this.nvp.setVisibility(8);
      }
    }
  }
  
  protected final void a(int paramInt, boolean paramBoolean, String paramString)
  {
    GMTrace.i(12554457841664L, 93538);
    String str3 = paramString;
    if (paramString != null)
    {
      str3 = paramString;
      if (paramString.startsWith("mm_")) {
        str3 = "";
      }
    }
    int i;
    int j;
    label62:
    String str1;
    if (paramInt >= 0) {
      if (paramBoolean)
      {
        i = 3;
        if (this.nvL)
        {
          paramString = com.tencent.mm.plugin.report.service.g.ork;
          if (!paramBoolean) {
            break label385;
          }
          j = 5;
          paramString.i(11139, new Object[] { Integer.valueOf(j) });
        }
        if (!paramBoolean) {
          break label391;
        }
        str1 = this.nvs.rM(paramInt).mDY;
        paramString = str1;
        if (this.nvs.getCount() <= 0) {
          break label503;
        }
        paramString = this.nvs.rM(1).mDZ;
      }
    }
    for (;;)
    {
      label123:
      j = i;
      String str2 = paramString;
      String str4 = str1;
      if (bg.nm(paramString))
      {
        str2 = this.mDZ;
        str4 = str1;
        j = i;
      }
      if (this.nvA == null) {}
      for (paramString = "null/null";; paramString = String.format("%f/%f", new Object[] { Float.valueOf(this.nvA.tYz), Float.valueOf(this.nvA.tYy) }))
      {
        w.d("MicroMsg.BaseLifeUI", "index: %s, bid: %s, index: %s, searchId: %s, requestId: %s", new Object[] { Integer.valueOf(paramInt + 1), str3, Integer.valueOf(paramInt), str4, str2 });
        com.tencent.mm.plugin.report.service.g.ork.i(11135, new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt + 1), Long.valueOf(this.nvF), Long.valueOf(this.nvH), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.nvG), Integer.valueOf(this.nvI), paramString, str3, Integer.valueOf(this.mDo), str4, com.tencent.mm.compatible.d.p.sZ(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), str2 });
        GMTrace.o(12554457841664L, 93538);
        return;
        i = 1;
        break;
        label385:
        j = 4;
        break label62;
        label391:
        str1 = this.nvr.rM(paramInt).mDY;
        paramString = str1;
        if (this.nvr.getCount() <= 0) {
          break label503;
        }
        paramString = this.nvr.rM(1).mDZ;
        break label123;
        if (this.nvJ) {}
        for (i = 4;; i = 2)
        {
          str4 = "";
          str2 = "";
          j = i;
          break;
        }
      }
      label503:
      str2 = "";
      str1 = paramString;
      paramString = str2;
    }
  }
  
  public abstract a aTS();
  
  public abstract a aTT();
  
  public void aTU()
  {
    GMTrace.i(12552847228928L, 93526);
    w.d("MicroMsg.BaseLifeUI", "init header");
    this.nvt = View.inflate(this, R.i.cuj, null);
    this.nvu = ((TextView)this.nvt.findViewById(R.h.ciE));
    this.nvv = ((TextView)this.nvt.findViewById(R.h.ciD));
    this.nvt.setOnClickListener(this.nvO);
    this.nvp = View.inflate(this, R.i.cDw, null);
    this.mCG.addFooterView(this.nvp);
    this.nvp.setVisibility(8);
    GMTrace.o(12552847228928L, 93526);
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(12553786753024L, 93533);
    int i = R.i.cCN;
    GMTrace.o(12553786753024L, 93533);
    return i;
  }
  
  public abstract void l(double paramDouble1, double paramDouble2);
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12554323623936L, 93537);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.d("MicroMsg.BaseLifeUI", "onActivityResult requestCode %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(12554323623936L, 93537);
      return;
      setResult(-1, paramIntent);
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12553115664384L, 93528);
    super.onCreate(paramBundle);
    this.mDo = ((int)(System.currentTimeMillis() / 1000L));
    com.tencent.mm.plugin.nearlife.b.c.clear();
    at.wS().a(603, this);
    this.nvM = getIntent().getIntExtra("near_life_scene", 0);
    this.mDZ = getIntent().getStringExtra("request_id");
    this.nvz = new ArrayList();
    MP();
    this.mCG.cab();
    if (this.nvw != null) {
      this.nvw.b(this.nvP);
    }
    this.guN = false;
    GMTrace.o(12553115664384L, 93528);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12553518317568L, 93531);
    at.wS().b(603, this);
    super.onDestroy();
    if (this.nvw != null) {
      this.nvw.c(this.nvP);
    }
    GMTrace.o(12553518317568L, 93531);
  }
  
  protected void onPause()
  {
    GMTrace.i(12553652535296L, 93532);
    super.onPause();
    this.nvw.c(this.nvP);
    GMTrace.o(12553652535296L, 93532);
  }
  
  protected void onResume()
  {
    GMTrace.i(12553384099840L, 93530);
    super.onResume();
    this.nvr.notifyDataSetChanged();
    this.nvw.a(this.nvP, true);
    GMTrace.o(12553384099840L, 93530);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\BaseLifeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */