package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public class CheckInLifeUI
  extends BaseLifeUI
  implements e
{
  private String fjl;
  private View.OnClickListener lXS;
  private String nvU;
  private b nwa;
  private b nwb;
  private ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> nwc;
  private com.tencent.mm.modelgeo.b nwd;
  private alj nwe;
  private View.OnClickListener nwf;
  private b.a nwg;
  
  public CheckInLifeUI()
  {
    GMTrace.i(12547881172992L, 93489);
    this.nwd = null;
    this.fjl = "";
    this.nvU = "";
    this.lXS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12561302945792L, 93589);
        CheckInLifeUI.a(CheckInLifeUI.this, paramAnonymousView, false);
        GMTrace.o(12561302945792L, 93589);
      }
    };
    this.nwf = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12567745396736L, 93637);
        CheckInLifeUI.a(CheckInLifeUI.this, paramAnonymousView, true);
        GMTrace.o(12567745396736L, 93637);
      }
    };
    this.nwg = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(12560766074880L, 93585);
        w.i("MicroMsg.CheckInLifeUI", "get info %s", new Object[] { paramAnonymousAddr.toString() });
        if (!bg.nm(CheckInLifeUI.a(CheckInLifeUI.this)))
        {
          GMTrace.o(12560766074880L, 93585);
          return;
        }
        CheckInLifeUI.a(CheckInLifeUI.this, paramAnonymousAddr.gEA);
        CheckInLifeUI.b(CheckInLifeUI.this).df(CheckInLifeUI.a(CheckInLifeUI.this), paramAnonymousAddr.gEI);
        GMTrace.o(12560766074880L, 93585);
      }
    };
    GMTrace.o(12547881172992L, 93489);
  }
  
  private static ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> L(ArrayList<String> paramArrayList)
  {
    GMTrace.i(12549223350272L, 93499);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      GMTrace.o(12549223350272L, 93499);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String[] arrayOfString = ((String)paramArrayList.next()).split("\n");
      if (2 == arrayOfString.length) {
        try
        {
          localArrayList.add(new BackwardSupportUtil.ExifHelper.LatLongData(Float.valueOf(arrayOfString[0]).floatValue(), Float.valueOf(arrayOfString[1]).floatValue()));
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
    }
    w.i("MicroMsg.CheckInLifeUI", "parse list end, size: " + localArrayList.size());
    GMTrace.o(12549223350272L, 93499);
    return localArrayList;
  }
  
  public final a aTS()
  {
    GMTrace.i(12548820697088L, 93496);
    if (this.nwc == null) {
      this.nwc = L(getIntent().getStringArrayListExtra("lat_long_list"));
    }
    if (this.nwa == null)
    {
      this.nwa = new b(this, this.lXS, "viewlist", false);
      if ((this.nwc != null) && (this.nwc.size() != 0))
      {
        localObject = new ArrayList();
        ((ArrayList)localObject).add(this.nwc.get(this.nwc.size() - 1));
        this.nwa.K((ArrayList)localObject);
        this.nwa.nvn = false;
      }
      localObject = this.nwa;
      GMTrace.o(12548820697088L, 93496);
      return (a)localObject;
    }
    Object localObject = this.nwa;
    GMTrace.o(12548820697088L, 93496);
    return (a)localObject;
  }
  
  public final a aTT()
  {
    GMTrace.i(12548954914816L, 93497);
    if (this.nwc == null) {
      this.nwc = L(getIntent().getStringArrayListExtra("lat_long_list"));
    }
    if (this.nwb == null)
    {
      this.nwb = new b(this, this.nwf, "searchlist", true);
      this.nwb.K(this.nwc);
      this.nwb.nvn = true;
      localb = this.nwb;
      GMTrace.o(12548954914816L, 93497);
      return localb;
    }
    b localb = this.nwb;
    GMTrace.o(12548954914816L, 93497);
    return localb;
  }
  
  public final void aTU()
  {
    GMTrace.i(12548149608448L, 93491);
    super.aTU();
    GMTrace.o(12548149608448L, 93491);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12548686479360L, 93495);
    int i = R.i.cCN;
    GMTrace.o(12548686479360L, 93495);
    return i;
  }
  
  public final void l(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(12549089132544L, 93498);
    w.i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
    if ((this.nwd != null) && (bg.nm(this.fjl))) {
      this.nwd.a(paramDouble1, paramDouble2, this.nwg);
    }
    GMTrace.o(12549089132544L, 93498);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12548015390720L, 93490);
    super.onCreate(paramBundle);
    oM(R.l.dKw);
    this.nwd = com.tencent.mm.modelgeo.b.Ip();
    this.nwe = new alj();
    this.nvU = getIntent().getStringExtra("get_poi_classify_id");
    try
    {
      this.nwe = ((alj)this.nwe.aD(getIntent().getByteArrayExtra("get_poi_item_buf")));
      if (this.nwe != null) {
        this.nvU = this.nwe.nuO;
      }
      if (bg.nm(this.nvU)) {
        this.fjl = getIntent().getStringExtra("get_city");
      }
      if (!bg.nm(this.fjl)) {
        this.nvU = this.nwa.df(this.fjl, "").nuO;
      }
      this.nwa.nvU = this.nvU;
      if ((this.nwe != null) && (!bg.nm(this.nwe.nuO)))
      {
        paramBundle = this.nwa;
        locala = new com.tencent.mm.plugin.nearlife.b.a("", this.nwe);
        if (paramBundle.nvS == null)
        {
          paramBundle.a(locala, 1);
          GMTrace.o(12548015390720L, 93490);
          return;
        }
      }
    }
    catch (Exception paramBundle)
    {
      com.tencent.mm.plugin.nearlife.b.a locala;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.CheckInLifeUI", paramBundle, "", new Object[0]);
        this.nwe = null;
      }
      paramBundle.a(locala, 2);
      GMTrace.o(12548015390720L, 93490);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12548418043904L, 93493);
    super.onDestroy();
    if (this.nwd != null) {
      this.nwd.a(this.nwg);
    }
    GMTrace.o(12548418043904L, 93493);
  }
  
  protected void onPause()
  {
    GMTrace.i(12548552261632L, 93494);
    super.onPause();
    GMTrace.o(12548552261632L, 93494);
  }
  
  protected void onResume()
  {
    GMTrace.i(12548283826176L, 93492);
    super.onResume();
    GMTrace.o(12548283826176L, 93492);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearlife\ui\CheckInLifeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */