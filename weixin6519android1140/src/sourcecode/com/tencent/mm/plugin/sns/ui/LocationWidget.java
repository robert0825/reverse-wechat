package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LocationWidget
  extends LinearLayout
{
  float aFG;
  private int fje;
  private String fjl;
  private float gEJ;
  private float gEK;
  private boolean gET;
  private com.tencent.mm.modelgeo.b mCj;
  private String mDZ;
  private b.a mwO;
  private String mzo;
  private Activity nJy;
  float nvC;
  private a.a nvP;
  private c nvw;
  private alj nwe;
  private ImageView pOP;
  private TextView pPN;
  private View pTD;
  private View pTE;
  private int[] pTF;
  private ImageView[] pTG;
  private int pTH;
  private TextView pTI;
  private byte[] pTJ;
  private String pTK;
  private String pTL;
  private int pTM;
  float pTN;
  int pTO;
  a pTP;
  private boolean pTQ;
  private b pTR;
  private int score;
  
  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8679592034304L, 64668);
    this.pTF = new int[] { i.f.pbN, i.f.pbO, i.f.pbP, i.f.pbQ, i.f.pbR };
    this.pTG = new ImageView[5];
    this.gEJ = -1000.0F;
    this.gEK = -1000.0F;
    this.pTM = 0;
    this.nwe = null;
    this.fje = 0;
    this.pTN = 0.0F;
    this.nvC = 0.0F;
    this.aFG = 0.0F;
    this.pTO = -1;
    this.gET = true;
    this.nvw = c.Ir();
    this.pTP = null;
    this.pTQ = false;
    this.mwO = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(17140946042880L, 127710);
        w.i("MicroMsg.LocationWidget", "get info %s", new Object[] { paramAnonymousAddr.toString() });
        if (!LocationWidget.e(LocationWidget.this))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.f(LocationWidget.this);
        if (!bg.nm(LocationWidget.g(LocationWidget.this)))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.a(LocationWidget.this, paramAnonymousAddr.gEA);
        LocationWidget.f(LocationWidget.this);
        GMTrace.o(17140946042880L, 127710);
      }
    };
    this.nvP = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(17148864888832L, 127769);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(17148864888832L, 127769);
          return true;
        }
        w.d("MicroMsg.LocationWidget", "get location %f %f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mk();
        if (paramAnonymousInt == 0)
        {
          paramAnonymousBoolean = false;
          if (LocationWidget.h(LocationWidget.this) != null) {
            break label122;
          }
        }
        label122:
        for (boolean bool = false;; bool = LocationWidget.h(LocationWidget.this).gET)
        {
          locale.a(2003, paramAnonymousBoolean, bool, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          n.a(2003, paramAnonymousFloat1, paramAnonymousFloat2, 0);
          if (LocationWidget.e(LocationWidget.this)) {
            break label137;
          }
          GMTrace.o(17148864888832L, 127769);
          return false;
          paramAnonymousBoolean = true;
          break;
        }
        label137:
        if ((LocationWidget.i(LocationWidget.this) == -1000.0F) || (LocationWidget.j(LocationWidget.this) == -1000.0F))
        {
          LocationWidget.a(LocationWidget.this, paramAnonymousFloat2);
          LocationWidget.b(LocationWidget.this, paramAnonymousFloat1);
        }
        GMTrace.o(17148864888832L, 127769);
        return false;
      }
    };
    this.pTR = null;
    f((MMActivity)paramContext);
    GMTrace.o(8679592034304L, 64668);
  }
  
  public LocationWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8679457816576L, 64667);
    this.pTF = new int[] { i.f.pbN, i.f.pbO, i.f.pbP, i.f.pbQ, i.f.pbR };
    this.pTG = new ImageView[5];
    this.gEJ = -1000.0F;
    this.gEK = -1000.0F;
    this.pTM = 0;
    this.nwe = null;
    this.fje = 0;
    this.pTN = 0.0F;
    this.nvC = 0.0F;
    this.aFG = 0.0F;
    this.pTO = -1;
    this.gET = true;
    this.nvw = c.Ir();
    this.pTP = null;
    this.pTQ = false;
    this.mwO = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(17140946042880L, 127710);
        w.i("MicroMsg.LocationWidget", "get info %s", new Object[] { paramAnonymousAddr.toString() });
        if (!LocationWidget.e(LocationWidget.this))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.f(LocationWidget.this);
        if (!bg.nm(LocationWidget.g(LocationWidget.this)))
        {
          GMTrace.o(17140946042880L, 127710);
          return;
        }
        LocationWidget.a(LocationWidget.this, paramAnonymousAddr.gEA);
        LocationWidget.f(LocationWidget.this);
        GMTrace.o(17140946042880L, 127710);
      }
    };
    this.nvP = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(17148864888832L, 127769);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(17148864888832L, 127769);
          return true;
        }
        w.d("MicroMsg.LocationWidget", "get location %f %f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        com.tencent.mm.modelstat.e locale = com.tencent.mm.modelstat.e.Mk();
        if (paramAnonymousInt == 0)
        {
          paramAnonymousBoolean = false;
          if (LocationWidget.h(LocationWidget.this) != null) {
            break label122;
          }
        }
        label122:
        for (boolean bool = false;; bool = LocationWidget.h(LocationWidget.this).gET)
        {
          locale.a(2003, paramAnonymousBoolean, bool, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          n.a(2003, paramAnonymousFloat1, paramAnonymousFloat2, 0);
          if (LocationWidget.e(LocationWidget.this)) {
            break label137;
          }
          GMTrace.o(17148864888832L, 127769);
          return false;
          paramAnonymousBoolean = true;
          break;
        }
        label137:
        if ((LocationWidget.i(LocationWidget.this) == -1000.0F) || (LocationWidget.j(LocationWidget.this) == -1000.0F))
        {
          LocationWidget.a(LocationWidget.this, paramAnonymousFloat2);
          LocationWidget.b(LocationWidget.this, paramAnonymousFloat1);
        }
        GMTrace.o(17148864888832L, 127769);
        return false;
      }
    };
    this.pTR = null;
    f((MMActivity)paramContext);
    GMTrace.o(8679457816576L, 64667);
  }
  
  private void Q(ArrayList<Exif.a> paramArrayList)
  {
    GMTrace.i(8679994687488L, 64671);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      GMTrace.o(8679994687488L, 64671);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.A(11139, "1");
    Exif.a locala1;
    if ((Math.abs(-1000.0F - this.gEJ) > 1.0E-6D) && (Math.abs(-1000.0F - this.gEK) > 1.0E-6D))
    {
      locala1 = (Exif.a)paramArrayList.get(paramArrayList.size() - 1);
      if (c(locala1.latitude, locala1.longitude, this.gEJ, this.gEK)) {
        com.tencent.mm.plugin.report.service.g.ork.A(11139, "2");
      }
    }
    int i = 0;
    if (i < paramArrayList.size())
    {
      j = i + 1;
      label141:
      if (j >= paramArrayList.size()) {
        break label235;
      }
      locala1 = (Exif.a)paramArrayList.get(i);
      Exif.a locala2 = (Exif.a)paramArrayList.get(j);
      if (c(locala1.latitude, locala1.longitude, locala2.latitude, locala2.longitude)) {
        com.tencent.mm.plugin.report.service.g.ork.A(11139, "3");
      }
    }
    label235:
    for (int j = 0;; j = 1)
    {
      if (j != 0)
      {
        i += 1;
        break;
        j += 1;
        break label141;
      }
      GMTrace.o(8679994687488L, 64671);
      return;
    }
  }
  
  private void bnA()
  {
    int i = 0;
    GMTrace.i(17133161414656L, 127652);
    w.i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", new Object[] { Integer.valueOf(this.pTH), this.pTL, Integer.valueOf(this.pTM), Integer.valueOf(this.fje), Boolean.valueOf(bg.bQU()) });
    if ((bg.bQU()) || (this.pTH == 0) || (bg.nm(this.pTL)) || (this.pTM == 1) || ((this.fje & 0x1) == 0))
    {
      this.pTE.setVisibility(8);
      GMTrace.o(17133161414656L, 127652);
      return;
    }
    this.pTE.setVisibility(0);
    while (i < this.score)
    {
      this.pTG[i].setImageResource(i.i.phH);
      i += 1;
    }
    i = this.score;
    while (i < 5)
    {
      this.pTG[i].setImageResource(i.i.phG);
      i += 1;
    }
    GMTrace.o(17133161414656L, 127652);
  }
  
  private void bnC()
  {
    GMTrace.i(8680531558400L, 64675);
    if ((this.pTI != null) && (this.pPN != null))
    {
      if (bg.nm(this.mzo)) {
        break label94;
      }
      this.pTI.setText(this.mzo);
      this.pPN.setVisibility(8);
    }
    while ((!bg.nm(this.mzo)) || (!bg.nm(this.fjl)))
    {
      this.pOP.setImageResource(bnE());
      GMTrace.o(8680531558400L, 64675);
      return;
      label94:
      if (!bg.nm(this.fjl))
      {
        this.pTI.setText(this.fjl);
        this.pPN.setVisibility(8);
      }
      else
      {
        this.pTI.setText(i.j.pjV);
        this.pPN.setVisibility(8);
      }
    }
    this.pOP.setImageResource(bnD());
    GMTrace.o(8680531558400L, 64675);
  }
  
  private void bnG()
  {
    GMTrace.i(8681068429312L, 64679);
    if (this.pTP != null)
    {
      boolean bool = this.pTP.bnr();
      Object localObject = this.pTP.bnq();
      if ((localObject == null) || (((ArrayList)localObject).size() == 0))
      {
        GMTrace.o(8681068429312L, 64679);
        return;
      }
      localObject = ((ArrayList)localObject).iterator();
      if (((Iterator)localObject).hasNext())
      {
        Exif.a locala = (Exif.a)((Iterator)localObject).next();
        w.d("MicroMsg.LocationWidget", "snsreport lat lng %f, %f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) });
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
        int j = (int)(locala.latitude * 1000000.0D);
        int k = (int)(locala.longitude * 1000000.0D);
        if (bool) {}
        for (int i = 1;; i = 2)
        {
          localg.i(11345, new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(2) });
          break;
        }
      }
    }
    GMTrace.o(8681068429312L, 64679);
  }
  
  private static boolean c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    GMTrace.i(8680128905216L, 64672);
    if (q.d(paramDouble1, paramDouble2, paramDouble3, paramDouble4) > 1000.0D)
    {
      GMTrace.o(8680128905216L, 64672);
      return true;
    }
    GMTrace.o(8680128905216L, 64672);
    return false;
  }
  
  private void f(MMActivity paramMMActivity)
  {
    GMTrace.i(8679726252032L, 64669);
    this.nJy = paramMMActivity;
    View localView = View.inflate(paramMMActivity, getLayoutResource(), this);
    this.pTD = localView.findViewById(i.f.pbm);
    this.pTI = ((TextView)this.pTD.findViewById(i.f.bLm));
    this.pPN = ((TextView)this.pTD.findViewById(i.f.pbo));
    this.pOP = ((ImageView)this.pTD.findViewById(i.f.pbn));
    this.pTE = localView.findViewById(i.f.pbM);
    final int i = 0;
    while (i < 5)
    {
      this.pTG[i] = ((ImageView)this.pTE.findViewById(this.pTF[i]));
      this.pTG[i].setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8694221766656L, 64777);
          if (LocationWidget.a(LocationWidget.this) == i + 1) {
            LocationWidget.b(LocationWidget.this);
          }
          for (;;)
          {
            LocationWidget.c(LocationWidget.this);
            GMTrace.o(8694221766656L, 64777);
            return;
            LocationWidget.a(LocationWidget.this, i + 1);
          }
        }
      });
      i += 1;
    }
    this.mCj = com.tencent.mm.modelgeo.b.Ip();
    this.pTD.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17141080260608L, 127711);
        boolean bool = a.a(LocationWidget.d(LocationWidget.this), "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
        w.i("MicroMsg.LocationWidget", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          GMTrace.o(17141080260608L, 127711);
          return;
        }
        LocationWidget.this.bnB();
        GMTrace.o(17141080260608L, 127711);
      }
    });
    this.pTL = paramMMActivity.getIntent().getStringExtra("kpoi_id");
    if (!bg.nm(this.pTL))
    {
      this.gEJ = paramMMActivity.getIntent().getFloatExtra("k_lat", -1000.0F);
      this.gEK = paramMMActivity.getIntent().getFloatExtra("k_lng", -1000.0F);
      this.mzo = paramMMActivity.getIntent().getStringExtra("kpoi_name");
      this.pTK = paramMMActivity.getIntent().getStringExtra("Kpoi_address");
      bnC();
    }
    this.pTH = bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsPostPOICommentSwitch"), 0);
    bnA();
    GMTrace.o(8679726252032L, 64669);
  }
  
  public final boolean U(Intent paramIntent)
  {
    GMTrace.i(8680397340672L, 64674);
    if (paramIntent == null)
    {
      GMTrace.o(8680397340672L, 64674);
      return true;
    }
    this.pTM = paramIntent.getIntExtra("get_poi_classify_type", 0);
    this.fje = paramIntent.getIntExtra("get_poi_showflag", 0);
    w.d("MicroMsg.LocationWidget", "onactivity result ok poiClassifyType %d", new Object[] { Integer.valueOf(this.pTM) });
    this.mzo = bg.aq(paramIntent.getStringExtra("get_poi_name"), "");
    this.fjl = bg.aq(paramIntent.getStringExtra("get_city"), "");
    this.gEJ = paramIntent.getFloatExtra("get_lat", -1000.0F);
    this.gEK = paramIntent.getFloatExtra("get_lng", -1000.0F);
    w.i("MicroMsg.LocationWidget", "check cur lat " + this.pTN + " " + this.nvC);
    this.pTN = paramIntent.getFloatExtra("get_cur_lat", 0.0F);
    this.nvC = paramIntent.getFloatExtra("get_cur_lng", 0.0F);
    this.pTO = paramIntent.getIntExtra("get_loctype", -1);
    this.aFG = paramIntent.getFloatExtra("get_accuracy", 0.0F);
    this.gET = paramIntent.getBooleanExtra("get_is_mars", true);
    this.mDZ = paramIntent.getStringExtra("request_id");
    Object localObject = com.tencent.mm.modelstat.e.Mk();
    boolean bool;
    if (this.pTO == 0)
    {
      bool = false;
      ((com.tencent.mm.modelstat.e)localObject).a(2003, bool, this.gET, this.gEK, this.gEJ, (int)this.aFG);
      this.pTJ = paramIntent.getByteArrayExtra("location_ctx");
      if (bg.nm(this.mzo)) {
        break label619;
      }
      this.pTK = bg.aq(paramIntent.getStringExtra("get_poi_address"), "");
      this.pTL = bg.aq(paramIntent.getStringExtra("get_poi_classify_id"), "");
      this.nwe = new alj();
    }
    for (;;)
    {
      try
      {
        this.nwe = ((alj)this.nwe.aD(paramIntent.getByteArrayExtra("get_poi_item_buf")));
        if (!bg.nm(this.pTL))
        {
          this.nwe = new alj();
          this.nwe.nuO = this.pTL;
          this.nwe.jib = this.pTM;
          this.nwe.eBt = this.mzo;
          this.nwe.nuT.add(new azq().Rq(this.pTK));
        }
        w.d("MicroMsg.LocationWidget", "label %s poiname %s", new Object[] { this.pTK, this.mzo });
        bnC();
        bnA();
        this.pTR = new b();
        localObject = this.pTR;
        if (paramIntent != null)
        {
          ((b)localObject).index = paramIntent.getIntExtra("report_index", -1);
          ((b)localObject).nvF = paramIntent.getLongExtra("first_start_time", 0L);
          ((b)localObject).nvG = paramIntent.getLongExtra("lastSuccStamp", 0L);
          ((b)localObject).nvH = paramIntent.getLongExtra("firstSuccStamp", 0L);
          ((b)localObject).nvI = paramIntent.getIntExtra("reqLoadCnt", 0);
          ((b)localObject).mDo = paramIntent.getIntExtra("entry_time", 0);
          ((b)localObject).hSv = paramIntent.getStringExtra("search_id");
        }
        GMTrace.o(8680397340672L, 64674);
        return true;
        bool = true;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        this.nwe = null;
        continue;
      }
      label619:
      if (!bg.nm(this.fjl))
      {
        this.mzo = "";
        this.pTK = "";
        this.pTL = "";
        this.nwe = null;
      }
      else
      {
        this.gEJ = -1000.0F;
        this.gEK = -1000.0F;
        this.mzo = "";
        this.pTK = "";
        this.fjl = "";
        this.pTL = "";
        this.nwe = null;
      }
    }
  }
  
  public final void bnB()
  {
    GMTrace.i(8679860469760L, 64670);
    Intent localIntent = new Intent();
    localIntent.putExtra("near_life_scene", 1);
    try
    {
      localIntent.putExtra("get_poi_item_buf", this.nwe.toByteArray());
      if (!bg.nm(this.pTL))
      {
        localIntent.putExtra("get_poi_classify_id", this.pTL);
        localIntent.putExtra("get_lat", this.gEJ);
        localIntent.putExtra("get_lng", this.gEK);
        localIntent.putExtra("request_id", this.mDZ);
        if (this.pTP == null) {
          break label240;
        }
        Object localObject = this.pTP.bnq();
        if (localObject == null) {
          break label240;
        }
        Q((ArrayList)localObject);
        ArrayList localArrayList = new ArrayList();
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          Exif.a locala = (Exif.a)((Iterator)localObject).next();
          localArrayList.add(String.format("%f\n%f", new Object[] { Double.valueOf(locala.latitude), Double.valueOf(locala.longitude) }));
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.LocationWidget", localException, "", new Object[0]);
        continue;
        if (!bg.nm(this.fjl)) {
          localIntent.putExtra("get_city", this.fjl);
        }
      }
      label240:
      d.b(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", localIntent, 10);
      GMTrace.o(8679860469760L, 64670);
    }
  }
  
  protected int bnD()
  {
    GMTrace.i(8680665776128L, 64676);
    int i = i.i.phA;
    GMTrace.o(8680665776128L, 64676);
    return i;
  }
  
  protected int bnE()
  {
    GMTrace.i(8680799993856L, 64677);
    int i = i.i.phB;
    GMTrace.o(8680799993856L, 64677);
    return i;
  }
  
  public final amc bnF()
  {
    GMTrace.i(8680934211584L, 64678);
    amc localamc = new amc();
    localamc.tYz = this.gEJ;
    localamc.tYy = this.gEK;
    localamc.uBa = 0;
    localamc.score = this.score;
    if (this.pTJ != null) {
      localamc.uBb = new com.tencent.mm.bm.b(this.pTJ);
    }
    if (!bg.nm(this.mzo))
    {
      localamc.pTK = this.pTK;
      localamc.mzo = this.mzo;
      localamc.uAX = this.pTL;
      localamc.gCz = this.fjl;
      if ((this.pTM != 0) && (this.pTM == 1))
      {
        localamc.pTM = 2;
        w.d("MicroMsg.LocationWidget", "getlocation type %d", new Object[] { Integer.valueOf(localamc.pTM) });
      }
    }
    for (;;)
    {
      if (this.pTR != null)
      {
        String str = String.format("%f/%f", new Object[] { Float.valueOf(localamc.tYz), Float.valueOf(localamc.tYy) });
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append("index " + this.pTR.index);
        localStringBuffer.append("firstStartStamp " + this.pTR.nvF);
        localStringBuffer.append("lastSuccStamp " + this.pTR.nvH);
        localStringBuffer.append("firstSuccStamp " + this.pTR.nvG);
        localStringBuffer.append("reqLoadCnt " + this.pTR.nvI);
        localStringBuffer.append("classifyId " + this.pTL);
        localStringBuffer.append("entryTime " + this.pTR.mDo);
        localStringBuffer.append("searchId" + this.pTR.hSv);
        w.d("MicroMsg.LocationWidget", "report %s", new Object[] { localStringBuffer.toString() });
        com.tencent.mm.plugin.report.service.g.ork.i(11135, new Object[] { Integer.valueOf(5), Integer.valueOf(this.pTR.index + 1), Long.valueOf(this.pTR.nvF), Long.valueOf(this.pTR.nvH), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.pTR.nvG), Integer.valueOf(this.pTR.nvI), str, this.pTL, Integer.valueOf(this.pTR.mDo), this.pTR.hSv, p.sZ() });
      }
      bnG();
      GMTrace.o(8680934211584L, 64678);
      return localamc;
      localamc.pTM = 1;
      break;
      if (!bg.nm(this.fjl)) {
        localamc.gCz = this.fjl;
      }
    }
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8681202647040L, 64680);
    int i = i.g.pbp;
    GMTrace.o(8681202647040L, 64680);
    return i;
  }
  
  public final void stop()
  {
    GMTrace.i(8680263122944L, 64673);
    if (this.nvw != null) {
      this.nvw.c(this.nvP);
    }
    if (this.mCj != null) {
      this.mCj.a(this.mwO);
    }
    GMTrace.o(8680263122944L, 64673);
  }
  
  public static abstract interface a
  {
    public abstract ArrayList<Exif.a> bnq();
    
    public abstract boolean bnr();
  }
  
  final class b
  {
    String hSv;
    int index;
    int mDo;
    long nvF;
    long nvG;
    long nvH;
    int nvI;
    
    b()
    {
      GMTrace.i(8634494877696L, 64332);
      this.nvF = -1L;
      this.nvG = -1L;
      this.nvH = -1L;
      this.nvI = 0;
      this.mDo = 0;
      this.hSv = "";
      GMTrace.o(8634494877696L, 64332);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\LocationWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */