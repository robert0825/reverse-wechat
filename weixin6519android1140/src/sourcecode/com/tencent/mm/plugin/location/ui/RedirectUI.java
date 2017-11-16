package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lt;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.rc;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.impl.d;
import com.tencent.mm.pluginsdk.location.LocationIntent;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(23)
public class RedirectUI
  extends Activity
{
  private static long fJy;
  private long eDr;
  private final ae handler;
  private String info;
  private boolean isStart;
  private int jHw;
  private double mwH;
  private double mwI;
  private boolean myS;
  private String mzA;
  private String mzB;
  private int mzC;
  private final int mzD;
  private boolean mzE;
  private final int mzF;
  private final int mzG;
  private final int mzH;
  private final int mzI;
  private int type;
  private int zoom;
  
  static
  {
    GMTrace.i(9724208611328L, 72451);
    fJy = 86400000L;
    GMTrace.o(9724208611328L, 72451);
  }
  
  public RedirectUI()
  {
    GMTrace.i(9723134869504L, 72443);
    this.type = 0;
    this.isStart = false;
    this.myS = true;
    this.mwH = 0.0D;
    this.mwI = 0.0D;
    this.mzA = "";
    this.mzB = "";
    this.zoom = 0;
    this.info = "";
    this.handler = new ae();
    this.mzD = 1;
    this.mzE = false;
    this.mzF = 0;
    this.mzG = 1;
    this.mzH = 0;
    this.mzI = 1;
    GMTrace.o(9723134869504L, 72443);
  }
  
  private void a(Intent paramIntent, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(9723537522688L, 72446);
    if (paramIntent != null)
    {
      paramIntent.putExtra("kShowshare", getIntent().getBooleanExtra("kShowshare", true));
      at.AR();
      paramIntent.putExtra("kimg_path", com.tencent.mm.y.c.yU());
      paramIntent.putExtra("kPoi_url", bg.aq(getIntent().getStringExtra("kPoi_url"), ""));
      paramIntent.putExtra("map_view_type", getIntent().getIntExtra("map_view_type", 0));
      paramIntent.putExtra("kFavInfoLocalId", getIntent().getLongExtra("kFavInfoLocalId", -1L));
      paramIntent.putExtra("kFavCanDel", getIntent().getBooleanExtra("kFavCanDel", true));
      paramIntent.putExtra("kFavCanRemark", getIntent().getBooleanExtra("kFavCanRemark", true));
      paramIntent.putExtra("kwebmap_slat", paramDouble1);
      paramIntent.putExtra("kwebmap_lng", paramDouble2);
      paramIntent.putExtra("kPoiName", getIntent().getStringExtra("kPoiName"));
      paramIntent.putExtra("kisUsername", bg.aq(getIntent().getStringExtra("kisUsername"), ""));
      paramIntent.putExtra("map_talker_name", this.mzB);
      paramIntent.putExtra("kIs_pick_poi", getIntent().getBooleanExtra("kIs_pick_poi", false));
      paramIntent.putExtra("KFavLocSigleView", getIntent().getBooleanExtra("KFavLocSigleView", false));
      rc localrc = new rc();
      localrc.eVX.eVY = true;
      com.tencent.mm.sdk.b.a.vgX.m(localrc);
      if (this.type == 6)
      {
        paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
        paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
        if (this.zoom > 0) {
          paramIntent.putExtra("kwebmap_scale", this.zoom);
        }
        paramIntent.putExtra("Kwebmap_locaion", this.info);
        paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
        startActivityForResult(paramIntent, 3);
        GMTrace.o(9723537522688L, 72446);
        return;
      }
      if ((this.type == 1) || (this.type == 2) || (this.type == 7) || (this.type == 9))
      {
        paramIntent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
        paramIntent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
        paramIntent.putExtra("kTags", getIntent().getStringArrayListExtra("kTags"));
        if (this.zoom > 0) {
          paramIntent.putExtra("kwebmap_scale", this.zoom);
        }
        paramIntent.putExtra("Kwebmap_locaion", this.info);
        paramIntent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
        startActivityForResult(paramIntent, 3);
        GMTrace.o(9723537522688L, 72446);
        return;
      }
      if (this.type == 0)
      {
        startActivityForResult(paramIntent, 2);
        GMTrace.o(9723537522688L, 72446);
        return;
      }
      if (this.type == 3)
      {
        startActivityForResult(paramIntent, 5);
        GMTrace.o(9723537522688L, 72446);
        return;
      }
      if (this.type == 8) {
        startActivityForResult(paramIntent, 6);
      }
      GMTrace.o(9723537522688L, 72446);
      return;
    }
    finish();
    GMTrace.o(9723537522688L, 72446);
  }
  
  private void j(final double paramDouble1, double paramDouble2)
  {
    GMTrace.i(9723403304960L, 72445);
    this.isStart = true;
    Intent localIntent = d.v(this);
    final Object localObject;
    switch (this.type)
    {
    case 4: 
    case 5: 
    default: 
      w.d("MicroMsg.RedirectUI", "view type error");
      localObject = null;
      switch (this.type)
      {
      }
      break;
    }
    for (;;)
    {
      if (!r.hjH) {
        break label358;
      }
      this.handler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9652267909120L, 71915);
          RedirectUI.a(RedirectUI.this, localObject, paramDouble1, this.lfH);
          GMTrace.o(9652267909120L, 71915);
        }
      }, 2000L);
      GMTrace.o(9723403304960L, 72445);
      return;
      String str = getIntent().getStringExtra("fromWhereShare");
      w.d("MicroMsg.RedirectUI", "location resume");
      localIntent.putExtra("intent_map_key", 5);
      localObject = localIntent;
      if (bg.nm(str)) {
        break;
      }
      localIntent.putExtra("fromWhereShare", str);
      localObject = localIntent;
      break;
      w.d("MicroMsg.RedirectUI", "view normal");
      localIntent.putExtra("intent_map_key", 4);
      localObject = localIntent;
      break;
      localIntent.putExtra("intent_map_key", 4);
      localObject = localIntent;
      break;
      localObject = new StringBuilder("view poi      isHidePoiOversea : ");
      if (bg.getInt(com.tencent.mm.k.g.uu().z("ShowConfig", "hidePoiOversea"), 1) == 1) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.ConfigListDecoder", "isHidePoiOversea : " + bool);
        w.d("MicroMsg.RedirectUI", bool);
        localIntent.putExtra("intent_map_key", 2);
        localObject = localIntent;
        break;
      }
      ((Intent)localObject).putExtra("location_scene", 1);
    }
    label358:
    a((Intent)localObject, paramDouble1, paramDouble2);
    GMTrace.o(9723403304960L, 72445);
  }
  
  public void finish()
  {
    GMTrace.i(9723940175872L, 72449);
    super.finish();
    GMTrace.o(9723940175872L, 72449);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9723671740416L, 72447);
    w.i("MicroMsg.RedirectUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      finish();
      GMTrace.o(9723671740416L, 72447);
      return;
    }
    if (paramIntent == null)
    {
      finish();
      GMTrace.o(9723671740416L, 72447);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      setResult(paramInt2, paramIntent);
      finish();
      GMTrace.o(9723671740416L, 72447);
      return;
      String str1 = this.mzB;
      LocationIntent localLocationIntent = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      w.i("MicroMsg.RedirectUI", "locationintent " + localLocationIntent.brl());
      Object localObject1 = new lt();
      ((lt)localObject1).eQj.eQl = this.mzC;
      ((lt)localObject1).eQj.lat = localLocationIntent.lat;
      ((lt)localObject1).eQj.lng = localLocationIntent.lng;
      ((lt)localObject1).eQj.eMn = localLocationIntent.eMn;
      ((lt)localObject1).eQj.label = localLocationIntent.label;
      ((lt)localObject1).eQj.eQm = localLocationIntent.mzo;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
      double d1 = localLocationIntent.lat;
      double d2 = localLocationIntent.lng;
      paramInt1 = localLocationIntent.eMn;
      String str2 = localLocationIntent.label;
      Object localObject2 = localLocationIntent.mzo;
      String str3 = localLocationIntent.tmu;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "";
      }
      localObject1 = "<msg><location x=\"" + d1 + "\" y=\"" + d2 + "\" scale=\"" + paramInt1 + "\" label=\"" + bg.Sw(str2) + "\" poiname=\"" + bg.Sw((String)localObject1) + "\" infourl=\"" + bg.Sw(str3) + "\" maptype=\"0\" /></msg>";
      w.d("MicroMsg.RedirectUI", "xml " + (String)localObject1);
      localObject2 = new ol();
      ((ol)localObject2).eTx.eTy = str1;
      ((ol)localObject2).eTx.content = ((String)localObject1);
      ((ol)localObject2).eTx.type = 48;
      ((ol)localObject2).eTx.flags = 0;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
      n.a(2004, (float)localLocationIntent.lng, (float)localLocationIntent.lat, 0);
      continue;
      localObject1 = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      w.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject1).brl());
      if (((LocationIntent)localObject1).tmv == 3)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject1).mwL, Integer.valueOf(1) });
        label590:
        paramIntent.putExtra("kwebmap_slat", ((LocationIntent)localObject1).lat);
        paramIntent.putExtra("kwebmap_lng", ((LocationIntent)localObject1).lng);
        paramIntent.putExtra("kwebmap_scale", ((LocationIntent)localObject1).eMn);
        paramIntent.putExtra("Kwebmap_locaion", ((LocationIntent)localObject1).label);
        paramIntent.putExtra("kTags", paramIntent.getStringArrayListExtra("kTags"));
        if (!((LocationIntent)localObject1).mzo.equals("")) {
          break label718;
        }
      }
      label718:
      for (localObject1 = "";; localObject1 = ((LocationIntent)localObject1).mzo)
      {
        paramIntent.putExtra("kPoiName", (String)localObject1);
        break;
        com.tencent.mm.plugin.report.service.g.ork.i(10822, new Object[] { Integer.valueOf(1), ((LocationIntent)localObject1).mwL, Integer.valueOf(0) });
        break label590;
      }
      localObject1 = (LocationIntent)paramIntent.getParcelableExtra("KLocationIntent");
      w.i("MicroMsg.RedirectUI", "locationintent " + ((LocationIntent)localObject1).brl());
      if (((LocationIntent)localObject1).gER != null) {
        w.d("MicroMsg.RedirectUI", "addr: " + ((LocationIntent)localObject1).gER.toString());
      }
      paramIntent.putExtra("key_pick_addr", ((LocationIntent)localObject1).gER);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9723269087232L, 72444);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().addFlags(Integer.MIN_VALUE);
      getWindow().setStatusBarColor(0);
    }
    at.AR();
    int i;
    if (bg.aG(Long.valueOf(bg.c((Long)com.tencent.mm.y.c.xh().get(81938, null))).longValue()) * 1000L > fJy)
    {
      i = 1;
      if (i != 0) {
        com.tencent.mm.aw.c.Kc().update();
      }
      this.type = getIntent().getIntExtra("map_view_type", -1);
      if (this.type == -1) {
        finish();
      }
      this.eDr = getIntent().getLongExtra("kMsgId", -1L);
      this.mzB = getIntent().getStringExtra("map_talker_name");
      w.d("MicroMsg.RedirectUI", "tofutest type: %s", new Object[] { Integer.valueOf(this.type) });
      switch (this.type)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(9723269087232L, 72444);
      return;
      i = 0;
      break;
      paramBundle = l.aKo().Bi(this.mzB);
      StringBuilder localStringBuilder = new StringBuilder("resume try to enter trackRoom ");
      if (paramBundle != null) {}
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.RedirectUI", bool);
        if (paramBundle == null) {
          break;
        }
        this.mwH = paramBundle.latitude;
        this.mwI = paramBundle.longitude;
        this.info = paramBundle.mwD;
        w.i("MicroMsg.RedirectUI", "resume lat %f lng %f %s member size %d", new Object[] { Double.valueOf(this.mwH), Double.valueOf(this.mwI), this.info, Integer.valueOf(paramBundle.eNM.size()) });
        this.zoom = 0;
        j(this.mwH, this.mwI);
        GMTrace.o(9723269087232L, 72444);
        return;
      }
      j(-1000.0D, -1000.0D);
      GMTrace.o(9723269087232L, 72444);
      return;
      this.mwH = getIntent().getDoubleExtra("kwebmap_slat", -85.0D);
      this.mwI = getIntent().getDoubleExtra("kwebmap_lng", -1000.0D);
      this.zoom = getIntent().getIntExtra("kwebmap_scale", 0);
      this.info = getIntent().getStringExtra("Kwebmap_locaion");
      j(this.mwH, this.mwI);
      GMTrace.o(9723269087232L, 72444);
      return;
      this.mzA = getIntent().getStringExtra("map_sender_name");
      this.jHw = getIntent().getIntExtra("view_type_key", 1);
      this.mzC = getIntent().getIntExtra("key_get_location_type", 0);
      j(-85.0D, -1000.0D);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9723805958144L, 72448);
    this.myS = false;
    super.onDestroy();
    GMTrace.o(9723805958144L, 72448);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\RedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */