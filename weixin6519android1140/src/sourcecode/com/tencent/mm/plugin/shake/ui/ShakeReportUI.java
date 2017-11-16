package com.tencent.mm.plugin.shake.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.d.a.h.a;
import com.tencent.mm.plugin.shake.d.a.k.1;
import com.tencent.mm.pluginsdk.l.c.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.ac;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShakeReportUI
  extends MMActivity
  implements com.tencent.mm.platformtools.j.a, l.a, com.tencent.mm.plugin.shake.c.a.f.a, com.tencent.mm.sdk.e.j.a, m.b, ap
{
  private static List<h.a> fJr;
  private com.tencent.mm.modelgeo.c fJm;
  private boolean fJp;
  private Map<String, h.a> fJq;
  private a.a fJt;
  private com.tencent.mm.ao.a.a gJI;
  private ImageView hqg;
  private com.tencent.mm.pluginsdk.l.c ntd;
  private boolean oPA;
  private boolean oPB;
  private boolean oPC;
  private boolean oPD;
  private boolean oPE;
  private boolean oPF;
  private boolean oPG;
  private int oPH;
  private c oPI;
  private com.tencent.mm.plugin.shake.b.l oPJ;
  private com.tencent.mm.pluginsdk.ui.f oPK;
  private View oPL;
  private View oPM;
  private TextView oPN;
  private TextView oPO;
  private TextView oPP;
  private View oPQ;
  private View oPR;
  private View oPS;
  private View oPT;
  private Animation oPU;
  private Animation oPV;
  private Animation oPW;
  private Animation oPX;
  private View oPY;
  private View oPZ;
  private View oQA;
  private int oQB;
  private com.tencent.mm.plugin.shake.c.b.a oQC;
  private boolean oQD;
  @SuppressLint({"UseSparseArrays"})
  private Map<Integer, Boolean> oQE;
  private boolean oQF;
  private boolean oQG;
  private boolean oQH;
  private boolean oQI;
  private int oQJ;
  private long oQK;
  private boolean oQL;
  private com.tencent.mm.sdk.b.c oQM;
  private com.tencent.mm.sdk.b.c oQN;
  private View.OnClickListener oQO;
  private MMImageView oQa;
  private TextView oQb;
  private ImageView oQc;
  private String oQd;
  private Bitmap oQe;
  private Dialog oQf;
  private ImageView oQg;
  private com.tencent.mm.plugin.shake.b.d oQh;
  private ImageView oQi;
  private ImageView oQj;
  private ImageView oQk;
  private ImageView oQl;
  private ImageView oQm;
  private ImageView oQn;
  private TextView oQo;
  private int oQp;
  private int oQq;
  private View oQr;
  private ImageView oQs;
  private ImageView oQt;
  private ImageView oQu;
  private ImageView oQv;
  private View oQw;
  private View oQx;
  private View oQy;
  private View oQz;
  private boolean oaK;
  
  static
  {
    GMTrace.i(6559757238272L, 48874);
    fJr = new CopyOnWriteArrayList();
    GMTrace.o(6559757238272L, 48874);
  }
  
  public ShakeReportUI()
  {
    GMTrace.i(6547006554112L, 48779);
    this.oPA = false;
    this.oPB = false;
    this.oPD = false;
    this.oPE = false;
    this.oPF = false;
    this.oPG = false;
    this.oPH = 22;
    this.oPJ = new com.tencent.mm.plugin.shake.b.l();
    this.oPY = null;
    this.oPZ = null;
    this.oQa = null;
    this.oQb = null;
    this.oQc = null;
    this.oQd = "";
    this.oQe = null;
    this.oQg = null;
    this.gJI = null;
    this.oQh = null;
    this.oQp = 1;
    this.oQq = 0;
    this.oQA = null;
    this.oQB = 0;
    this.oQD = false;
    this.oQE = new HashMap();
    this.oQF = false;
    this.oQG = false;
    this.oQH = false;
    this.oQI = false;
    this.oQJ = 1;
    this.oaK = true;
    this.fJp = false;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15393968095232L, 114694);
        if (paramAnonymousBoolean)
        {
          w.d("MicroMsg.ShakeReportUI", "on location get ok");
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vqS, String.valueOf(paramAnonymousFloat2));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vqT, String.valueOf(paramAnonymousFloat1));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vti, String.valueOf(paramAnonymousDouble2));
          ShakeReportUI.a(ShakeReportUI.this);
          if (ShakeReportUI.b(ShakeReportUI.this) != null) {
            ShakeReportUI.b(ShakeReportUI.this).c(ShakeReportUI.c(ShakeReportUI.this));
          }
        }
        for (;;)
        {
          GMTrace.o(15393968095232L, 114694);
          return false;
          w.w("MicroMsg.ShakeReportUI", "getLocation fail");
        }
      }
    };
    this.fJq = new ConcurrentHashMap();
    this.oQK = 0L;
    this.oQL = false;
    this.oQM = new com.tencent.mm.sdk.b.c() {};
    this.oQN = new com.tencent.mm.sdk.b.c() {};
    this.oQO = new View.OnClickListener()
    {
      public long oPf;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6546335465472L, 48774);
        if (bg.nm((String)ShakeReportUI.p(ShakeReportUI.this).getTag()))
        {
          GMTrace.o(6546335465472L, 48774);
          return;
        }
        if (ShakeReportUI.L(ShakeReportUI.this) == null)
        {
          GMTrace.o(6546335465472L, 48774);
          return;
        }
        paramAnonymousView = ShakeReportUI.L(ShakeReportUI.this);
        Object localObject1 = paramAnonymousView.field_username;
        if (11 == paramAnonymousView.field_type)
        {
          if (System.currentTimeMillis() - this.oPf > 3000L)
          {
            this.oPf = System.currentTimeMillis();
            if ((paramAnonymousView.field_reserved3 == null) || (paramAnonymousView.field_reserved3.split(",").length != 3) || (paramAnonymousView.field_reserved3.split(",")[0] == null) || (paramAnonymousView.field_reserved3.split(",")[0].equals(""))) {
              break label266;
            }
            localObject1 = paramAnonymousView.field_reserved3.split(",");
            localObject2 = new qi();
            ((qi)localObject2).eUY.userName = localObject1[0];
            ((qi)localObject2).eUY.eVa = bg.aq(localObject1[1], "");
            ((qi)localObject2).eUY.eVb = Integer.parseInt(localObject1[2]);
            ((qi)localObject2).eUY.scene = 1077;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          }
          for (;;)
          {
            localObject1 = ShakeReportUI.C(ShakeReportUI.this).oMw;
            if ((localObject1 != null) && ((localObject1 instanceof com.tencent.mm.plugin.shake.d.a.h)))
            {
              com.tencent.mm.plugin.shake.d.a.h.a(paramAnonymousView);
              com.tencent.mm.plugin.shake.d.a.h.b(paramAnonymousView);
            }
            GMTrace.o(6546335465472L, 48774);
            return;
            label266:
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView.getCity());
            ((Intent)localObject1).putExtra("scene", 27);
            ((Intent)localObject1).putExtra("stastic_scene", 5);
            com.tencent.mm.bj.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          }
        }
        at.AR();
        Object localObject2 = com.tencent.mm.y.c.yK().TE((String)localObject1);
        if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", (String)localObject1);
          paramAnonymousView.putExtra("Sns_from_Scene", 22);
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            if (((x)localObject2).bSA())
            {
              com.tencent.mm.plugin.report.service.g.ork.A(10298, (String)localObject1 + "," + ShakeReportUI.M(ShakeReportUI.this));
              paramAnonymousView.putExtra("Contact_Scene", ShakeReportUI.M(ShakeReportUI.this));
            }
            com.tencent.mm.plugin.shake.a.hnH.d(paramAnonymousView, ShakeReportUI.this);
          }
          GMTrace.o(6546335465472L, 48774);
          return;
        }
        if ((paramAnonymousView.field_reserved1 & 0x8) > 0) {
          com.tencent.mm.plugin.report.service.g.ork.A(10298, paramAnonymousView.field_username + "," + ShakeReportUI.M(ShakeReportUI.this));
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Contact_User", paramAnonymousView.field_username);
        ((Intent)localObject1).putExtra("Contact_Nick", paramAnonymousView.field_nickname);
        ((Intent)localObject1).putExtra("Contact_Distance", paramAnonymousView.field_distance);
        ((Intent)localObject1).putExtra("Contact_Signature", paramAnonymousView.field_signature);
        ((Intent)localObject1).putExtra("Contact_Province", paramAnonymousView.getProvince());
        ((Intent)localObject1).putExtra("Contact_City", paramAnonymousView.getCity());
        ((Intent)localObject1).putExtra("Contact_Sex", paramAnonymousView.field_sex);
        ((Intent)localObject1).putExtra("Contact_IsLBSFriend", true);
        ((Intent)localObject1).putExtra("Contact_VUser_Info", paramAnonymousView.field_reserved3);
        ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramAnonymousView.field_reserved1);
        ((Intent)localObject1).putExtra("Contact_KSnsIFlag", paramAnonymousView.field_snsFlag);
        ((Intent)localObject1).putExtra("Contact_KSnsBgUrl", paramAnonymousView.field_sns_bgurl);
        ((Intent)localObject1).putExtra("Contact_Scene", ShakeReportUI.M(ShakeReportUI.this));
        ((Intent)localObject1).putExtra("Sns_from_Scene", 22);
        com.tencent.mm.plugin.shake.a.hnH.d((Intent)localObject1, ShakeReportUI.this);
        GMTrace.o(6546335465472L, 48774);
      }
    };
    GMTrace.o(6547006554112L, 48779);
  }
  
  private void Gw(String paramString)
  {
    GMTrace.i(6549825126400L, 48800);
    this.oPD = false;
    if (this.oPC) {
      aq.C(this.vKB.vKW, R.l.ecc);
    }
    if (this.oPX == null) {
      this.oPX = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLr);
    }
    tV(2);
    if ((paramString != null) && (paramString.length() > 1)) {
      this.oPO.setText(paramString);
    }
    for (;;)
    {
      this.oPO.startAnimation(this.oPX);
      this.oPG = true;
      com.tencent.mm.sdk.platformtools.af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6575192276992L, 48989);
          ShakeReportUI.I(ShakeReportUI.this);
          ShakeReportUI.d(ShakeReportUI.this, false);
          GMTrace.o(6575192276992L, 48989);
        }
      }, this.oPX.getDuration());
      GMTrace.o(6549825126400L, 48800);
      return;
      this.oPO.setText(R.l.ebE);
    }
  }
  
  private void a(com.tencent.mm.plugin.shake.c.a.e parame)
  {
    GMTrace.i(6550227779584L, 48803);
    this.oQC = com.tencent.mm.plugin.shake.c.b.a.a(this, parame, new DialogInterface.OnCancelListener()new com.tencent.mm.plugin.shake.c.b.a.b
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6581097857024L, 49033);
        paramAnonymousDialogInterface.dismiss();
        ShakeReportUI.b(ShakeReportUI.this, true);
        ShakeReportUI.J(ShakeReportUI.this);
        ShakeReportUI.K(ShakeReportUI.this).setText("");
        GMTrace.o(6581097857024L, 49033);
      }
    }, new com.tencent.mm.plugin.shake.c.b.a.b()
    {
      public final void bfy()
      {
        GMTrace.i(6565125947392L, 48914);
        ShakeReportUI.b(ShakeReportUI.this, true);
        ShakeReportUI.K(ShakeReportUI.this).setText("");
        GMTrace.o(6565125947392L, 48914);
      }
    });
    GMTrace.o(6550227779584L, 48803);
  }
  
  private void aZQ()
  {
    GMTrace.i(6547677642752L, 48784);
    bfT();
    at.AR();
    com.tencent.mm.y.c.a(this);
    at.AR();
    com.tencent.mm.y.c.xh().a(this);
    com.tencent.mm.plugin.shake.b.m.bfk().c(this);
    if (this.oPJ.oMw != null) {
      this.oPJ.oMw.resume();
    }
    this.oPF = true;
    if ((this.oQC != null) && (this.oQC.isShowing()) && (!this.oQC.oNE)) {
      this.oPF = false;
    }
    w.i("MicroMsg.ShakeReportUI", "tryStartShake");
    Object localObject;
    label299:
    boolean bool;
    if ((this.ntd != null) && (!this.ntd.bKx()))
    {
      this.ntd.a(new a(this));
      if ((this.ntd.bKz()) && (this.oPN != null)) {
        this.oPN.setText(getString(R.l.ebr));
      }
    }
    else
    {
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6540429885440L, 48730);
          if (ShakeReportUI.d(ShakeReportUI.this) != null) {
            ShakeReportUI.d(ShakeReportUI.this).bKy();
          }
          GMTrace.o(6540429885440L, 48730);
        }
      }, 1000L);
      if (this.ntd != null) {
        this.ntd.bKy();
      }
      ho(false);
      hp(false);
      bfV();
      at.AR();
      localObject = (String)com.tencent.mm.y.c.xh().get(327696, "1");
      if (com.tencent.mm.plugin.shake.d.a.k.bfi())
      {
        if (this.oQp == 4) {
          hl(true);
        }
        if (((String)localObject).equals("4")) {
          cp(findViewById(R.h.cdV));
        }
      }
      if (!((String)localObject).equals("3")) {
        break label456;
      }
      cp(findViewById(R.h.cdS));
      bool = com.tencent.mm.s.c.vK().aE(262154, 266258);
      if ((!getIntent().getBooleanExtra("shake_music", false)) || (!com.tencent.mm.at.c.JX()) || (this.oPJ.oMv == 3)) {
        break label486;
      }
      getIntent().putExtra("shake_music", false);
      this.oQp = 3;
    }
    for (;;)
    {
      bfU();
      hm(true);
      w.d("MicroMsg.ShakeReportUI", "isShakeGetConfigList = %s", new Object[] { Boolean.valueOf(r.hjZ) });
      if (r.hjZ)
      {
        localObject = new com.tencent.mm.aw.k(7);
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      }
      hq(true);
      bgb();
      bfR();
      GMTrace.o(6547677642752L, 48784);
      return;
      this.oPN.setText(getString(R.l.ecd));
      break;
      label456:
      if ((!((String)localObject).equals("6")) || (!com.tencent.mm.plugin.shake.c.c.a.bfI())) {
        break label299;
      }
      cp(findViewById(R.h.cdI));
      break label299;
      label486:
      if ((getIntent().getBooleanExtra("shake_tv", false)) && (this.oPJ.oMv != 4) && (com.tencent.mm.plugin.shake.d.a.k.bfi()))
      {
        getIntent().putExtra("shake_tv", false);
        this.oQp = 4;
      }
      else if ((this.oPJ.oMv != 6) && (com.tencent.mm.plugin.shake.c.c.a.bfI()) && ((bool) || (getIntent().getBooleanExtra("shake_card", false))))
      {
        this.oQB = getIntent().getIntExtra("shake_card", 0);
        getIntent().putExtra("shake_card", false);
        w.i("MicroMsg.ShakeReportUI", "onresume shake card tab is open, activity type is 0 or open from specialview");
        this.oQp = 6;
      }
    }
  }
  
  private void aq(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6551435739136L, 48812);
    this.oPD = false;
    if (this.oPX == null) {
      this.oPX = AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLr);
    }
    tV(2);
    ho(true);
    if ((paramString != null) && (paramString.length() > 1)) {
      this.oPO.setText(paramString);
    }
    for (;;)
    {
      this.oPG = true;
      GMTrace.o(6551435739136L, 48812);
      return;
      if (paramBoolean)
      {
        this.oPO.setText(R.l.ebw);
      }
      else
      {
        this.oPO.setText("");
        ho(false);
      }
    }
  }
  
  private void bfR()
  {
    GMTrace.i(6548080295936L, 48787);
    if (!bgd())
    {
      GMTrace.o(6548080295936L, 48787);
      return;
    }
    if (BluetoothAdapter.getDefaultAdapter() != null)
    {
      Object localObject = com.tencent.mm.k.g.uu().ui();
      if (localObject != null)
      {
        this.oQK = System.currentTimeMillis();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          w.i("MicroMsg.ShakeReportUI", "op=true,iBeacon = %s", new Object[] { str });
          dj localdj = new dj();
          localdj.eEZ.eFb = str;
          localdj.eEZ.eEY = true;
          com.tencent.mm.sdk.b.a.vgX.m(localdj);
        }
      }
    }
    GMTrace.o(6548080295936L, 48787);
  }
  
  private void bfS()
  {
    GMTrace.i(6548214513664L, 48788);
    at.AR();
    if (!Boolean.valueOf(bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsX, null), false)).booleanValue())
    {
      this.fJq.clear();
      fJr = new CopyOnWriteArrayList();
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      Object localObject = com.tencent.mm.k.g.uu().ui();
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          dj localdj = new dj();
          w.i("MicroMsg.ShakeReportUI", "op=false,iBeacon = %s", new Object[] { str });
          localdj.eEZ.eFb = str;
          localdj.eEZ.eEY = false;
          com.tencent.mm.sdk.b.a.vgX.m(localdj);
        }
      }
    }
    GMTrace.o(6548214513664L, 48788);
  }
  
  private void bfT()
  {
    GMTrace.i(6548482949120L, 48790);
    at.AR();
    int j = bg.a((Integer)com.tencent.mm.y.c.xh().get(12290, null), 0);
    ImageView localImageView = (ImageView)findViewById(R.h.cdC);
    if ((this.oQe != null) && (!this.oQe.isRecycled())) {
      this.oQe.recycle();
    }
    at.AR();
    Object localObject1;
    if (bg.a((Boolean)com.tencent.mm.y.c.xh().get(4110, null)))
    {
      localObject1 = new StringBuilder();
      at.AR();
      localObject1 = com.tencent.mm.y.c.yU() + "default_shake_img_filename.jpg";
      if (com.tencent.mm.a.e.aZ((String)localObject1))
      {
        this.oQe = com.tencent.mm.platformtools.j.nf((String)localObject1);
        localImageView.setImageDrawable(new BitmapDrawable(this.oQe));
        localObject1 = (ImageView)findViewById(R.h.baj);
        localImageView = (ImageView)findViewById(R.h.bag);
        if (j != 2) {
          break label400;
        }
        i = R.g.bai;
        label182:
        ((ImageView)localObject1).setImageResource(i);
        if (j != 2) {
          break label407;
        }
      }
    }
    label400:
    label407:
    for (int i = R.g.bah;; i = R.g.bag)
    {
      localImageView.setImageResource(i);
      View.OnClickListener local7 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6577071325184L, 49003);
          if (!ShakeReportUI.t(ShakeReportUI.this))
          {
            GMTrace.o(6577071325184L, 49003);
            return;
          }
          ShakeReportUI.b(ShakeReportUI.this, false);
          ShakeReportUI.c(ShakeReportUI.this, true);
          ShakeReportUI.d(ShakeReportUI.this, false);
          paramAnonymousView = ShakeReportUI.this.vKB.vKW;
          String str = ShakeReportUI.this.getString(R.l.ebP);
          h.c local1 = new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(6532376821760L, 48670);
              ShakeReportUI.b(ShakeReportUI.this, true);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(6532376821760L, 48670);
                return;
                com.tencent.mm.pluginsdk.ui.tools.k.a(ShakeReportUI.this, 1, null);
              }
            }
          };
          DialogInterface.OnCancelListener local2 = new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(6532645257216L, 48672);
              ShakeReportUI.b(ShakeReportUI.this, true);
              GMTrace.o(6532645257216L, 48672);
            }
          };
          com.tencent.mm.ui.base.h.a(paramAnonymousView, null, new String[] { str }, "", local1, local2);
          GMTrace.o(6577071325184L, 49003);
        }
      };
      ((ImageView)localObject1).setOnClickListener(local7);
      localImageView.setOnClickListener(local7);
      if (this.oPS == null) {
        this.oPS = findViewById(R.h.cdn);
      }
      this.oPS.setOnClickListener(local7);
      if (this.oPT == null) {
        this.oPT = findViewById(R.h.cdo);
      }
      this.oPT.setOnClickListener(local7);
      GMTrace.o(6548482949120L, 48790);
      return;
      try
      {
        localObject1 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.decodeStream(this.vKB.vKW.getAssets().open("resource/shakehideimg_man.jpg")));
        localImageView.setImageDrawable((Drawable)localObject1);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.w("MicroMsg.ShakeReportUI", "Bg decode exp:" + localIOException.getLocalizedMessage());
          Object localObject2 = null;
        }
      }
      at.AR();
      this.oQe = com.tencent.mm.platformtools.j.nf((String)com.tencent.mm.y.c.xh().get(4111, null));
      localImageView.setImageDrawable(new BitmapDrawable(this.oQe));
      break;
      i = R.g.baj;
      break label182;
    }
  }
  
  private void bfU()
  {
    GMTrace.i(6548751384576L, 48792);
    if ((this.oQp == 3) && (com.tencent.mm.at.c.JX()))
    {
      this.oQp = 3;
      this.oPP.setText(R.l.ecl);
      this.oQg.setBackgroundResource(R.g.aZY);
      this.oQi.setBackgroundResource(R.g.bac);
      this.oQj.setBackgroundResource(R.g.bab);
      this.oQk.setBackgroundResource(R.g.bae);
      this.oQl.setBackgroundResource(R.g.aZW);
      findViewById(R.h.cdD).setVisibility(0);
      oM(R.l.ech);
      com.tencent.mm.plugin.report.service.g.ork.i(11720, new Object[] { Integer.valueOf(2) });
    }
    Object localObject1;
    int i;
    Object localObject2;
    for (;;)
    {
      localObject1 = this.oPJ;
      i = this.oQp;
      if (i != ((com.tencent.mm.plugin.shake.b.l)localObject1).oMv) {
        break;
      }
      localObject1 = ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw;
      if (!this.oPD) {
        hp(false);
      }
      if ((!com.tencent.mm.plugin.shake.c.c.a.bfI()) || (!(localObject1 instanceof com.tencent.mm.plugin.shake.c.a.g))) {
        break label952;
      }
      localObject2 = (com.tencent.mm.plugin.shake.c.a.g)localObject1;
      i = this.oQB;
      ((com.tencent.mm.plugin.shake.c.a.g)localObject2).jtE = i;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService from_scene:" + i);
      if (this.oQB != 3) {
        break label952;
      }
      w.i("MicroMsg.ShakeReportUI", "open shake card from specialview");
      localObject1 = (com.tencent.mm.plugin.shake.c.a.g)localObject1;
      localObject2 = getIntent().getStringExtra("key_shake_card_ext_info");
      if ((localObject2 == null) || (((String)localObject2).length() > 256)) {
        break label929;
      }
      w.i("MicroMsg.ShakeCardService", "ShakeCardService mExtInfo:" + ((com.tencent.mm.plugin.shake.c.a.g)localObject1).mdd);
      ((com.tencent.mm.plugin.shake.c.a.g)localObject1).mdd = ((String)localObject2);
      GMTrace.o(6548751384576L, 48792);
      return;
      if ((this.oQp == 4) && (com.tencent.mm.plugin.shake.d.a.k.bfi()))
      {
        this.oQp = 4;
        this.oPP.setText(R.l.ecm);
        this.oQg.setBackgroundResource(R.g.aZY);
        this.oQi.setBackgroundResource(R.g.bac);
        this.oQj.setBackgroundResource(R.g.baa);
        this.oQk.setBackgroundResource(R.g.baf);
        this.oQl.setBackgroundResource(R.g.aZW);
        findViewById(R.h.cdD).setVisibility(0);
        oM(R.l.eci);
        com.tencent.mm.plugin.report.service.g.ork.i(11720, new Object[] { Integer.valueOf(3) });
      }
      else if ((this.oQp == 5) && (bgc()))
      {
        this.oQp = 5;
        this.oPP.setText(R.l.eck);
        this.oQg.setBackgroundResource(R.g.aZZ);
        this.oQi.setBackgroundResource(R.g.bac);
        this.oQj.setBackgroundResource(R.g.baa);
        this.oQk.setBackgroundResource(R.g.bae);
        this.oQl.setBackgroundResource(R.g.aZW);
        findViewById(R.h.cdD).setVisibility(0);
        oM(R.l.ecg);
        com.tencent.mm.plugin.report.service.g.ork.i(11720, new Object[] { Integer.valueOf(4) });
      }
      else if ((this.oQp == 6) && (com.tencent.mm.plugin.shake.c.c.a.bfI()))
      {
        this.oQp = 6;
        this.oPP.setText(R.l.ecj);
        this.oQg.setBackgroundResource(R.g.aZY);
        this.oQi.setBackgroundResource(R.g.bac);
        this.oQj.setBackgroundResource(R.g.baa);
        this.oQk.setBackgroundResource(R.g.bae);
        this.oQl.setBackgroundResource(R.g.aZX);
        findViewById(R.h.cdD).setVisibility(0);
        oM(R.l.ecf);
        bfX();
        bga();
        com.tencent.mm.plugin.report.service.g.ork.i(11720, new Object[] { Integer.valueOf(5) });
      }
      else
      {
        this.oQp = 1;
        this.oPP.setText(R.l.eby);
        this.oQg.setBackgroundResource(R.g.aZY);
        this.oQi.setBackgroundResource(R.g.bad);
        this.oQj.setBackgroundResource(R.g.baa);
        this.oQk.setBackgroundResource(R.g.bae);
        this.oQl.setBackgroundResource(R.g.aZW);
        if (com.tencent.mm.at.c.JX()) {
          findViewById(R.h.cdD).setVisibility(0);
        }
        oM(R.l.ece);
        com.tencent.mm.plugin.report.service.g.ork.i(11720, new Object[] { Integer.valueOf(1) });
      }
    }
    if (((com.tencent.mm.plugin.shake.b.l)localObject1).oMw != null) {
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw.beX();
    }
    switch (i)
    {
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMv = i;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw.init();
      localObject1 = ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw;
      break;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw = new com.tencent.mm.plugin.shake.b.c(this, this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw = com.tencent.mm.plugin.shake.d.a.j.a(this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw = new com.tencent.mm.plugin.shake.d.a.l(this, this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw = new com.tencent.mm.plugin.shake.d.a.h(this);
      continue;
      ((com.tencent.mm.plugin.shake.b.l)localObject1).oMw = new com.tencent.mm.plugin.shake.c.a.g(this);
    }
    label929:
    w.i("MicroMsg.ShakeCardService", "ShakeCardService ext_info size > 256 byte, extinfo:" + (String)localObject2);
    label952:
    GMTrace.o(6548751384576L, 48792);
  }
  
  private void bfV()
  {
    GMTrace.i(6548885602304L, 48793);
    at.AR();
    this.oPC = bg.a((Boolean)com.tencent.mm.y.c.xh().get(4112, null));
    if (this.oPC)
    {
      Ba(8);
      GMTrace.o(6548885602304L, 48793);
      return;
    }
    Ba(0);
    GMTrace.o(6548885602304L, 48793);
  }
  
  private void bfW()
  {
    GMTrace.i(6551167303680L, 48810);
    if (com.tencent.mm.plugin.shake.c.c.a.bfI())
    {
      if (com.tencent.mm.s.c.vK().aE(262155, 266259))
      {
        this.oQn.setVisibility(0);
        GMTrace.o(6551167303680L, 48810);
        return;
      }
      this.oQn.setVisibility(8);
    }
    GMTrace.o(6551167303680L, 48810);
  }
  
  private void bfX()
  {
    GMTrace.i(6551301521408L, 48811);
    if ((this.oQp == 6) && (com.tencent.mm.plugin.shake.c.c.a.bfI()))
    {
      boolean bool1 = com.tencent.mm.s.c.vK().aE(262154, 266258);
      boolean bool2 = com.tencent.mm.s.c.vK().aE(262155, 266259);
      if (bool1)
      {
        aq(com.tencent.mm.plugin.shake.c.c.a.bfD(), true);
        GMTrace.o(6551301521408L, 48811);
        return;
      }
      if (bool2)
      {
        aq(com.tencent.mm.plugin.shake.c.c.a.bfF(), true);
        GMTrace.o(6551301521408L, 48811);
        return;
      }
      if (!this.oQD)
      {
        if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.bfB()))
        {
          aq(com.tencent.mm.plugin.shake.c.c.a.bfB(), true);
          GMTrace.o(6551301521408L, 48811);
          return;
        }
        aq(getString(R.l.ebw), true);
      }
    }
    GMTrace.o(6551301521408L, 48811);
  }
  
  private void bfY()
  {
    GMTrace.i(6551569956864L, 48813);
    if ((this.oQC != null) && (this.oQC.isShowing())) {
      this.oQC.dismiss();
    }
    this.oQC = null;
    GMTrace.o(6551569956864L, 48813);
  }
  
  private void bfZ()
  {
    int m = 1;
    GMTrace.i(6551704174592L, 48814);
    boolean bool1 = com.tencent.mm.plugin.shake.c.c.a.bff();
    boolean bool2 = com.tencent.mm.s.c.vK().aE(262154, 266258);
    boolean bool3 = com.tencent.mm.s.c.vK().aE(262155, 266259);
    if (getIntent().getBooleanExtra("shake_card", false)) {}
    for (int i = getIntent().getIntExtra("shake_card", 0);; i = 0)
    {
      com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
      int j;
      if (bool2)
      {
        j = 1;
        if (!bool1) {
          break label237;
        }
        k = 1;
        label90:
        localg.i(11668, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.shake.c.c.a.bfE(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.bfA()) });
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool3) {
          break label242;
        }
        j = 1;
        label158:
        if (!bool1) {
          break label247;
        }
      }
      label237:
      label242:
      label247:
      for (int k = m;; k = 0)
      {
        localg.i(11668, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), com.tencent.mm.plugin.shake.c.c.a.bfE(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.bfA()) });
        GMTrace.o(6551704174592L, 48814);
        return;
        j = 0;
        break;
        k = 0;
        break label90;
        j = 0;
        break label158;
      }
    }
  }
  
  private void bga()
  {
    GMTrace.i(6551838392320L, 48815);
    if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.bfC())) {
      this.oQo.setText(com.tencent.mm.plugin.shake.c.c.a.bfC());
    }
    GMTrace.o(6551838392320L, 48815);
  }
  
  private void bgb()
  {
    GMTrace.i(6551972610048L, 48816);
    label128:
    label173:
    label215:
    Object localObject;
    int i;
    if (com.tencent.mm.at.c.JX())
    {
      w.i("MicroMsg.ShakeReportUI", "is not oversea user, show shake music");
      this.oQE.put(Integer.valueOf(3), Boolean.valueOf(true));
      findViewById(R.h.cdS).setVisibility(0);
      if (com.tencent.mm.at.c.JY())
      {
        at.AR();
        if (com.tencent.mm.y.c.xh().getInt(4118, 0) == 0) {
          this.oQm.setVisibility(0);
        }
      }
      else
      {
        if (!com.tencent.mm.plugin.shake.d.a.k.bfi()) {
          break label317;
        }
        this.oQE.put(Integer.valueOf(4), Boolean.valueOf(true));
        findViewById(R.h.cdV).setVisibility(0);
        w.i("MicroMsg.ShakeReportUI", "show shake tv tab");
        if (!com.tencent.mm.plugin.shake.c.c.a.bfI()) {
          break label359;
        }
        this.oQE.put(Integer.valueOf(6), Boolean.valueOf(true));
        findViewById(R.h.cdI).setVisibility(0);
        w.i("MicroMsg.ShakeReportUI", "show shake card tab");
        if (!bgc()) {
          break label402;
        }
        this.oQE.put(Integer.valueOf(5), Boolean.valueOf(true));
        this.oQA.setVisibility(0);
        w.i("MicroMsg.ShakeReportUI", "[shakezb]show shake ibeacon tab");
        localObject = this.oQE.values().iterator();
        i = 0;
        label232:
        if (!((Iterator)localObject).hasNext()) {
          break label441;
        }
        if (!((Boolean)((Iterator)localObject).next()).booleanValue()) {
          break label584;
        }
        i += 1;
      }
    }
    label317:
    label359:
    label402:
    label441:
    label584:
    for (;;)
    {
      break label232;
      this.oQm.setVisibility(8);
      break;
      this.oQE.put(Integer.valueOf(3), Boolean.valueOf(false));
      findViewById(R.h.cdS).setVisibility(8);
      w.i("MicroMsg.ShakeReportUI", "is oversea user, hide shake music");
      break;
      this.oQE.put(Integer.valueOf(4), Boolean.valueOf(false));
      findViewById(R.h.cdV).setVisibility(8);
      w.i("MicroMsg.ShakeReportUI", "hide shake tv tab");
      break label128;
      findViewById(R.h.cdI).setVisibility(8);
      this.oQE.put(Integer.valueOf(6), Boolean.valueOf(false));
      w.i("MicroMsg.ShakeReportUI", "hide shake card tab");
      break label173;
      this.oQE.put(Integer.valueOf(5), Boolean.valueOf(false));
      this.oQA.setVisibility(8);
      w.i("MicroMsg.ShakeReportUI", "[shakezb]hide shake ibeacon tab");
      break label215;
      this.oQq = i;
      localObject = (LinearLayout)findViewById(R.h.cdD);
      if (i == 1) {
        ((LinearLayout)localObject).setVisibility(8);
      }
      while ((i > 4) && (this.oQL))
      {
        findViewById(R.h.cdV).setVisibility(8);
        w.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() > 0.");
        this.oQq -= 1;
        GMTrace.o(6551972610048L, 48816);
        return;
        ((LinearLayout)localObject).setVisibility(0);
      }
      if ((i > 4) && (!this.oQL))
      {
        this.oQA.setVisibility(8);
        this.oQF = false;
        this.oQq -= 1;
        w.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() <= 0.");
      }
      GMTrace.o(6551972610048L, 48816);
      return;
    }
  }
  
  private boolean bgc()
  {
    GMTrace.i(6552106827776L, 48817);
    w.i("MicroMsg.ShakeReportUI", "[shakezb] isChineseAppLang :" + v.bPG() + " ,getApplicationLanguage[en or zh_CN or zh_HK or zh_TW is avaliable] :" + v.bPK());
    if ((this.oQF) && (bgd()))
    {
      GMTrace.o(6552106827776L, 48817);
      return true;
    }
    GMTrace.o(6552106827776L, 48817);
    return false;
  }
  
  private static boolean bgd()
  {
    GMTrace.i(6552241045504L, 48818);
    if ((v.bPG()) || (v.bPK().equals("en")) || (v.bPK().equals("ja")))
    {
      GMTrace.o(6552241045504L, 48818);
      return true;
    }
    GMTrace.o(6552241045504L, 48818);
    return false;
  }
  
  private void cp(View paramView)
  {
    GMTrace.i(6550361997312L, 48804);
    if (paramView == null)
    {
      GMTrace.o(6550361997312L, 48804);
      return;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 80, "", "");
    w.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(6550361997312L, 48804);
      return;
    }
    aq("", false);
    if (paramView.getId() == R.h.cdM)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11722, new Object[] { Integer.valueOf(1) });
      if (this.oQp != 1)
      {
        if (this.oQp == 4) {
          hl(false);
        }
        this.oQp = 1;
        bfU();
        hn(false);
        if (this.oPL != null) {
          this.oPL.setVisibility(8);
        }
      }
    }
    do
    {
      for (;;)
      {
        hm(true);
        hp(false);
        hq(true);
        GMTrace.o(6550361997312L, 48804);
        return;
        if (paramView.getId() == R.h.cdS)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(11722, new Object[] { Integer.valueOf(2) });
          if ((!this.fJp) && (this.fJm != null)) {
            this.fJm.a(this.fJt, true);
          }
          if ((!com.tencent.mm.p.a.aR(this)) && (!com.tencent.mm.p.a.aP(this)) && (this.oQp != 3))
          {
            if (this.oQp == 4) {
              hl(false);
            }
            this.oQp = 3;
            bfU();
            hn(false);
            if (this.oPL != null) {
              this.oPL.setVisibility(8);
            }
          }
          if (com.tencent.mm.at.c.JY())
          {
            at.AR();
            if (com.tencent.mm.y.c.xh().getInt(4118, 0) == 0)
            {
              paramView = new i.a(this.vKB.vKW);
              paramView.BN(R.l.cUG);
              paramView.BO(R.l.ebO);
              paramView.BQ(R.l.ebN).a(new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6560025673728L, 48876);
                  if (ShakeReportUI.r(ShakeReportUI.this) != null) {
                    ShakeReportUI.r(ShakeReportUI.this).cancel();
                  }
                  GMTrace.o(6560025673728L, 48876);
                }
              });
              paramView.lz(true);
              paramView.d(new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(6560294109184L, 48878);
                  at.AR();
                  com.tencent.mm.y.c.xh().setInt(4118, 1);
                  ShakeReportUI.s(ShakeReportUI.this).setVisibility(8);
                  GMTrace.o(6560294109184L, 48878);
                }
              });
              this.oQf = paramView.aax();
              this.oQf.show();
            }
          }
        }
        else
        {
          if (paramView.getId() != R.h.cdV) {
            break;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11722, new Object[] { Integer.valueOf(3) });
          if ((!this.fJp) && (this.fJm != null)) {
            this.fJm.a(this.fJt, true);
          }
          if ((!com.tencent.mm.p.a.aR(this)) && (!com.tencent.mm.p.a.aP(this)) && (this.oQp != 4))
          {
            hl(true);
            this.oQp = 4;
            bfU();
            hn(false);
            if (this.oPL != null) {
              this.oPL.setVisibility(8);
            }
          }
        }
      }
      if ((paramView.getId() != R.h.cdQ) && (paramView.getId() != R.h.cdN)) {
        break;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11722, new Object[] { Integer.valueOf(4) });
    } while (this.oQp == 5);
    this.oQp = 5;
    bfU();
    hn(false);
    if (this.oPL != null) {
      this.oPL.setVisibility(8);
    }
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      paramView = (LocationManager)ab.getContext().getSystemService("location");
      if (paramView == null) {
        break label845;
      }
    }
    label845:
    for (bool = paramView.isProviderEnabled("gps");; bool = true)
    {
      if (!bool) {
        Gw(getString(R.l.ebI));
      }
      paramView = BluetoothAdapter.getDefaultAdapter();
      if ((paramView != null) && (paramView.getState() != 12))
      {
        Gw(getString(R.l.ebH));
        break;
      }
      if (paramView != null) {
        break;
      }
      Gw(getString(R.l.ebL));
      break;
      if (paramView.getId() != R.h.cdI) {
        break;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11722, new Object[] { Integer.valueOf(5) });
      if (this.oQp == 6) {
        break;
      }
      if (this.oQp == 4) {
        hl(false);
      }
      this.oQp = 6;
      bfU();
      hn(false);
      if (this.oPL != null) {
        this.oPL.setVisibility(8);
      }
      com.tencent.mm.s.c.vK().l(262155, false);
      this.oQn.setVisibility(8);
      break;
    }
  }
  
  private void hl(boolean paramBoolean)
  {
    GMTrace.i(6548617166848L, 48791);
    String str = String.format("%1$s-shaketype-%2$d", new Object[] { getClass().getName(), Integer.valueOf(4) });
    w.d("MicroMsg.ShakeReportUI", "activate change report , class name=" + str + ", isActive=" + paramBoolean);
    ac.a(paramBoolean, new Intent().putExtra("classname", str));
    GMTrace.o(6548617166848L, 48791);
  }
  
  private void hm(boolean paramBoolean)
  {
    Object localObject1 = null;
    GMTrace.i(6549019820032L, 48794);
    hn(paramBoolean);
    if (this.oPZ == null) {
      this.oPZ = findViewById(R.h.bFx);
    }
    if (!paramBoolean)
    {
      this.oPZ.setVisibility(8);
      GMTrace.o(6549019820032L, 48794);
      return;
    }
    int i = com.tencent.mm.plugin.shake.b.m.bfl().ME();
    if (i <= 0)
    {
      this.oPZ.setVisibility(8);
      GMTrace.o(6549019820032L, 48794);
      return;
    }
    if (this.oQb == null) {
      this.oQb = ((TextView)this.oPZ.findViewById(R.h.cdu));
    }
    this.oQb.setText(getString(R.l.ebW, new Object[] { Integer.valueOf(i) }));
    this.oPZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6586332348416L, 49072);
        paramAnonymousView = new Intent(ShakeReportUI.this, ShakeMsgListUI.class);
        paramAnonymousView.putExtra("shake_msg_from", 1);
        paramAnonymousView.putExtra("shake_msg_list_title", ShakeReportUI.this.getString(R.l.ecv));
        ShakeReportUI.this.startActivity(paramAnonymousView);
        GMTrace.o(6586332348416L, 49072);
      }
    });
    if (this.oQa == null) {
      this.oQa = ((MMImageView)findViewById(R.h.cdA));
    }
    Object localObject2 = com.tencent.mm.plugin.shake.b.m.bfl();
    String str = "SELECT * FROM " + ((com.tencent.mm.plugin.shake.b.g)localObject2).getTableName() + " where status != 1 ORDER BY rowid" + " DESC LIMIT 1";
    localObject2 = ((com.tencent.mm.plugin.shake.b.g)localObject2).fTZ.a(str, null, 2);
    if (localObject2 == null)
    {
      if (localObject1 != null)
      {
        localObject1 = ((com.tencent.mm.plugin.shake.b.f)localObject1).field_thumburl;
        if (bg.nm((String)localObject1)) {
          break label362;
        }
        localObject1 = new com.tencent.mm.plugin.shake.e.b((String)localObject1);
        localObject2 = com.tencent.mm.platformtools.j.a((com.tencent.mm.platformtools.i)localObject1);
        this.oQa.setTag(((com.tencent.mm.plugin.shake.e.b)localObject1).Po());
        if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
          this.oQa.setImageBitmap((Bitmap)localObject2);
        }
      }
      else
      {
        label297:
        this.oPZ.setVisibility(0);
        GMTrace.o(6549019820032L, 48794);
      }
    }
    else
    {
      if (!((Cursor)localObject2).moveToFirst()) {
        break label375;
      }
      localObject1 = new com.tencent.mm.plugin.shake.b.f();
      ((com.tencent.mm.plugin.shake.b.f)localObject1).b((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      break;
      this.oQa.setImageResource(R.k.cJr);
      break label297;
      label362:
      this.oQa.setImageResource(R.k.cJr);
      break label297;
      label375:
      localObject1 = null;
    }
  }
  
  private void hn(boolean paramBoolean)
  {
    GMTrace.i(6549154037760L, 48795);
    if (this.oPY == null) {
      this.oPY = findViewById(R.h.bFw);
    }
    if ((this.oPJ.oMv == 3) || (this.oPJ.oMv == 4) || (this.oPJ.oMv == 5) || (this.oPJ.oMv == 6) || (!paramBoolean))
    {
      this.oPY.setVisibility(8);
      GMTrace.o(6549154037760L, 48795);
      return;
    }
    int i = com.tencent.mm.bc.l.MN().ME();
    if (i <= 0)
    {
      this.oPY.setVisibility(8);
      GMTrace.o(6549154037760L, 48795);
      return;
    }
    this.oPY.setVisibility(0);
    ((TextView)this.oPY.findViewById(R.h.bZr)).setText(getResources().getQuantityString(R.j.cIC, i, new Object[] { Integer.valueOf(i) }));
    this.oPY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6569823567872L, 48949);
        paramAnonymousView = new Intent(ShakeReportUI.this, ShakeSayHiListUI.class);
        paramAnonymousView.putExtra("IntentSayHiType", 1);
        ShakeReportUI.this.startActivity(paramAnonymousView);
        GMTrace.o(6569823567872L, 48949);
      }
    });
    if (this.oQc == null) {
      this.oQc = ((ImageView)findViewById(R.h.bMx));
    }
    com.tencent.mm.bc.j localj = com.tencent.mm.bc.l.MN().MI();
    if (localj != null)
    {
      this.oQd = localj.field_sayhiuser;
      com.tencent.mm.pluginsdk.ui.a.b.a(this.oQc, this.oQd);
    }
    GMTrace.o(6549154037760L, 48795);
  }
  
  private void ho(boolean paramBoolean)
  {
    GMTrace.i(6549288255488L, 48796);
    if (this.oPO != null)
    {
      if (paramBoolean)
      {
        this.oPO.setVisibility(0);
        GMTrace.o(6549288255488L, 48796);
        return;
      }
      this.oPO.setVisibility(8);
      this.oPO.cancelLongPress();
    }
    GMTrace.o(6549288255488L, 48796);
  }
  
  private void hp(boolean paramBoolean)
  {
    GMTrace.i(6549422473216L, 48797);
    if (this.oPM != null)
    {
      if (paramBoolean)
      {
        this.oPM.setVisibility(0);
        GMTrace.o(6549422473216L, 48797);
        return;
      }
      this.oPM.setVisibility(4);
    }
    GMTrace.o(6549422473216L, 48797);
  }
  
  private void hq(boolean paramBoolean)
  {
    GMTrace.i(6552375263232L, 48819);
    this.oQr.setVisibility(8);
    GMTrace.o(6552375263232L, 48819);
  }
  
  private void tV(int paramInt)
  {
    GMTrace.i(6549556690944L, 48798);
    if (paramInt == 1) {}
    for (boolean bool = true;; bool = false)
    {
      hp(bool);
      if (paramInt != 2) {
        break;
      }
      ho(true);
      GMTrace.o(6549556690944L, 48798);
      return;
    }
    ho(false);
    GMTrace.o(6549556690944L, 48798);
  }
  
  public final void AI()
  {
    GMTrace.i(6549690908672L, 48799);
    bfU();
    GMTrace.o(6549690908672L, 48799);
  }
  
  protected final void MP()
  {
    GMTrace.i(6548348731392L, 48789);
    com.tencent.mm.plugin.shake.c.c.a.bfe();
    this.oQE.put(Integer.valueOf(1), Boolean.valueOf(true));
    this.oQE.put(Integer.valueOf(3), Boolean.valueOf(false));
    this.oQE.put(Integer.valueOf(4), Boolean.valueOf(false));
    this.oQE.put(Integer.valueOf(5), Boolean.valueOf(false));
    this.oQE.put(Integer.valueOf(6), Boolean.valueOf(false));
    this.gJI = new com.tencent.mm.ao.a.a(this);
    this.oPN = ((TextView)findViewById(R.h.cdG));
    this.oPM = findViewById(R.h.cdW);
    this.oPO = ((TextView)findViewById(R.h.cdB));
    this.oPP = ((TextView)findViewById(R.h.cdF));
    this.oQr = findViewById(R.h.cek);
    this.oQs = ((ImageView)findViewById(R.h.cdY));
    this.oQt = ((ImageView)findViewById(R.h.cea));
    this.oQu = ((ImageView)findViewById(R.h.cec));
    this.oQv = ((ImageView)findViewById(R.h.cee));
    this.oQw = findViewById(R.h.cdZ);
    this.oQx = findViewById(R.h.ceb);
    this.oQy = findViewById(R.h.ced);
    this.oQz = findViewById(R.h.cef);
    this.oPL = findViewById(R.h.cdE);
    this.oPL.setOnClickListener(this.oQO);
    this.hqg = ((ImageView)this.oPL.findViewById(R.h.cdq));
    this.hqg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6564857511936L, 48912);
        if (ShakeReportUI.o(ShakeReportUI.this) != 5)
        {
          ShakeReportUI.a(ShakeReportUI.this, new com.tencent.mm.pluginsdk.ui.f(ShakeReportUI.this, (String)ShakeReportUI.p(ShakeReportUI.this).getTag(), null, com.tencent.mm.pluginsdk.ui.f.a.ttv));
          ShakeReportUI.q(ShakeReportUI.this).bKN();
        }
        GMTrace.o(6564857511936L, 48912);
      }
    });
    bfT();
    Object localObject = View.inflate(this.vKB.vKW, R.i.cGp, null);
    this.oQf = new com.tencent.mm.ui.base.k(this.vKB.vKW, R.m.eme);
    this.oQf.setContentView((View)localObject);
    this.oQf.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6572239486976L, 48967);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            GMTrace.i(6567139213312L, 48929);
            u.a(ShakeReportUI.this, 0, ShakeReportUI.this.getString(R.l.ecn));
            at.AR();
            com.tencent.mm.y.c.xh().set(4117, Boolean.valueOf(true));
            GMTrace.o(6567139213312L, 48929);
            return false;
          }
        });
        GMTrace.o(6572239486976L, 48967);
      }
    });
    ((Button)((View)localObject).findViewById(R.h.cdk)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6535329611776L, 48692);
        ShakeReportUI.r(ShakeReportUI.this).cancel();
        GMTrace.o(6535329611776L, 48692);
      }
    });
    at.AR();
    boolean bool1 = bg.b((Boolean)com.tencent.mm.y.c.xh().get(4108, null));
    at.AR();
    boolean bool2 = bg.b((Boolean)com.tencent.mm.y.c.xh().get(4117, null));
    if (!bool1)
    {
      ((View)localObject).setVisibility(0);
      this.oQf.show();
      at.AR();
      com.tencent.mm.y.c.xh().set(4108, Boolean.valueOf(true));
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6582708469760L, 49045);
          ShakeReportUI.a(ShakeReportUI.this, false);
          ShakeReportUI.this.finish();
          GMTrace.o(6582708469760L, 49045);
          return true;
        }
      });
      a(0, R.l.cQm, R.k.cIU, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6544590635008L, 48761);
          ShakeReportUI.a(ShakeReportUI.this, false);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.setClass(ShakeReportUI.this, ShakePersonalInfoUI.class);
          ShakeReportUI.this.startActivityForResult(paramAnonymousMenuItem, 3);
          GMTrace.o(6544590635008L, 48761);
          return true;
        }
      });
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6542040498176L, 48742);
          ShakeReportUI.a(ShakeReportUI.this, paramAnonymousView);
          GMTrace.o(6542040498176L, 48742);
        }
      };
      if ((!this.oQI) && (!this.oQG)) {
        break label791;
      }
    }
    label791:
    for (this.oQg = ((ImageView)findViewById(R.h.cdP));; this.oQg = ((ImageView)findViewById(R.h.cdO)))
    {
      this.oQi = ((ImageView)findViewById(R.h.cdL));
      this.oQj = ((ImageView)findViewById(R.h.cdR));
      this.oQk = ((ImageView)findViewById(R.h.cdU));
      this.oQl = ((ImageView)findViewById(R.h.cdH));
      this.oQo = ((TextView)findViewById(R.h.cdK));
      this.oQn = ((ImageView)findViewById(R.h.cdJ));
      this.oQm = ((ImageView)findViewById(R.h.cdT));
      bga();
      this.oQA.setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.cdQ).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.cdM).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.cdS).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.cdV).setOnClickListener((View.OnClickListener)localObject);
      findViewById(R.h.cdI).setOnClickListener((View.OnClickListener)localObject);
      com.tencent.mm.sdk.b.a.vgX.b(this.oQM);
      com.tencent.mm.sdk.b.a.vgX.b(this.oQN);
      bfW();
      bfZ();
      hq(true);
      GMTrace.o(6548348731392L, 48789);
      return;
      if (bool2) {
        break;
      }
      Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
      {
        public final boolean queueIdle()
        {
          GMTrace.i(6560562544640L, 48880);
          u.a(ShakeReportUI.this, 0, ShakeReportUI.this.getString(R.l.ecn));
          at.AR();
          com.tencent.mm.y.c.xh().set(4117, Boolean.valueOf(true));
          GMTrace.o(6560562544640L, 48880);
          return false;
        }
      });
      break;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6547274989568L, 48781);
    GMTrace.o(6547274989568L, 48781);
    return 1;
  }
  
  public final void a(int paramInt, final com.tencent.mm.plugin.shake.c.a.e parame, long paramLong)
  {
    GMTrace.i(6550093561856L, 48802);
    this.oQD = true;
    if (paramInt == 1251)
    {
      if (parame == null)
      {
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      w.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_GetLbsCard");
      com.tencent.mm.plugin.shake.c.c.a.bfe();
      bgb();
      bfW();
      bfZ();
      this.oQB = 4;
      com.tencent.mm.plugin.shake.b.m.bfq().putValue("key_shake_card_item", parame);
      GMTrace.o(6550093561856L, 48802);
      return;
    }
    Object localObject;
    if (paramInt == 1250)
    {
      if (parame == null)
      {
        this.oQh = null;
        Gw(null);
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      if (((parame == null) || (this.oPD)) && (!this.oPD))
      {
        this.oQh = null;
        Gw(null);
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      this.oPD = false;
      w.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_ShakeCard");
      if (this.oPJ.oMv == 6)
      {
        localObject = this.oPJ.oMw;
        if ((localObject != null) && ((localObject instanceof com.tencent.mm.plugin.shake.c.a.g)))
        {
          localObject = (com.tencent.mm.plugin.shake.c.a.g)localObject;
          switch ((int)paramLong)
          {
          }
        }
      }
    }
    for (;;)
    {
      GMTrace.o(6550093561856L, 48802);
      return;
      w.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_OK");
      if (((com.tencent.mm.plugin.shake.c.a.g)localObject).jzr == 3)
      {
        w.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is  MMBIZ_SHAKE_CARD_ACTION_TYPE_NO_CARD");
        if ((parame != null) && (!TextUtils.isEmpty(parame.oMY)))
        {
          Gw(parame.oMY);
          GMTrace.o(6550093561856L, 48802);
          return;
        }
        Gw(getString(R.l.ebv));
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      w.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is " + ((com.tencent.mm.plugin.shake.c.a.g)localObject).jzr);
      tV(3);
      if (parame.jzr == 1) {
        this.oPF = false;
      }
      if ((this.oQC != null) && (this.oQC.isShowing()))
      {
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      if (parame.oNa)
      {
        localObject = (ViewStub)findViewById(R.h.cla);
        if (localObject != null) {
          ((ViewStub)localObject).inflate();
        }
        ((ShakeEggAnimFrame)findViewById(R.h.bmm)).J(this);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6571702616064L, 48963);
            ShakeReportUI.a(ShakeReportUI.this, parame);
            GMTrace.o(6571702616064L, 48963);
          }
        }, 1000L);
        GMTrace.o(6550093561856L, 48802);
        return;
      }
      a(parame);
      GMTrace.o(6550093561856L, 48802);
      return;
      w.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_ERR_REPORT");
      Gw(getString(R.l.ebv));
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6550764650496L, 48807);
    a("", null);
    GMTrace.o(6550764650496L, 48807);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(6550630432768L, 48806);
    bfV();
    if (!this.oPE) {
      hm(true);
    }
    GMTrace.o(6550630432768L, 48806);
  }
  
  public final void bfs()
  {
    GMTrace.i(6551033085952L, 48809);
    com.tencent.mm.plugin.shake.c.c.a.bfe();
    bfW();
    bfX();
    bga();
    bgb();
    bfZ();
    GMTrace.o(6551033085952L, 48809);
  }
  
  public final void d(List<com.tencent.mm.plugin.shake.b.d> paramList, long paramLong)
  {
    GMTrace.i(6549959344128L, 48801);
    hq(true);
    if ((paramList == null) || (!this.oPD) || (paramLong == 6L))
    {
      this.oQh = null;
      if (paramLong == 6L)
      {
        Gw(getString(R.l.ebM));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (paramLong == 7L)
      {
        Gw(getString(R.l.ebK));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (paramLong == 8L)
      {
        Gw(getString(R.l.ebI));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (paramLong == 9L)
      {
        Gw(getString(R.l.ebH));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (paramLong == 10L)
      {
        Gw(getString(R.l.ebL));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      Gw(null);
      GMTrace.o(6549959344128L, 48801);
      return;
    }
    this.oPD = false;
    if (paramList.size() > 0) {
      this.oQh = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0));
    }
    int i;
    Object localObject1;
    if (this.oPJ.oMv == 1)
    {
      if ((paramList.size() > 0) && (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type != 0))
      {
        Gw(null);
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      this.oPH = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).scene;
      i = paramList.size();
      if (i == 0)
      {
        Gw(null);
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (i == 1)
      {
        localObject1 = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_username;
        Object localObject2 = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_nickname;
        w.i("MicroMsg.ShakeReportUI", "1 u:" + (String)localObject1 + " n:" + (String)localObject2 + " d:" + ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_distance);
        if (this.oPC) {
          aq.C(this.vKB.vKW, R.l.ebU);
        }
        tV(3);
        localObject1 = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
        Object localObject3;
        if (!bg.nm(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username))
        {
          this.oPL.setTag(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
          this.oPL.setVisibility(0);
          at.AR();
          localObject2 = com.tencent.mm.y.c.yK().TE(((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
          localObject3 = new StringBuilder().append(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
          if (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type)) {
            break label965;
          }
          paramList = getString(R.l.ebV);
          localObject3 = paramList;
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex != 1) {
            break label971;
          }
          this.oPL.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance + this.vKB.vKW.getString(R.l.ecq));
          label604:
          TextView localTextView = (TextView)this.oPL.findViewById(R.h.cdr);
          ActionBarActivity localActionBarActivity = this.vKB.vKW;
          StringBuilder localStringBuilder = new StringBuilder().append(((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname);
          if (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject2).field_type)) {
            break label1062;
          }
          paramList = getString(R.l.ebV);
          label664:
          localTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localActionBarActivity, paramList, localTextView.getTextSize()));
          if (this.hqg != null)
          {
            if (bg.nm((String)localObject3)) {
              break label1068;
            }
            this.hqg.setContentDescription(String.format(getString(R.l.ebt), new Object[] { localObject3 }));
          }
          label729:
          ((TextView)this.oPL.findViewById(R.h.cdp)).setText(((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
          com.tencent.mm.pluginsdk.ui.a.b.a((ImageView)this.oPL.findViewById(R.h.cdq), ((com.tencent.mm.plugin.shake.b.d)localObject1).field_username);
          paramList = (ImageView)this.oPL.findViewById(R.h.cdt);
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1 == 0) {
            break label1085;
          }
          paramList.setVisibility(0);
          paramList.setImageBitmap(BackwardSupportUtil.b.c(ak.a.gmZ.fr(((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1), 2.0F));
          label819:
          if ((((com.tencent.mm.plugin.shake.b.d)localObject1).field_reserved1 != 0) || (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex == 0)) {
            break label1102;
          }
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex != 1) {
            break label1094;
          }
          i = R.k.cMN;
          label849:
          paramList = com.tencent.mm.br.a.b(this, i);
          this.oPL.findViewById(R.h.cds).setVisibility(0);
          ((ImageView)this.oPL.findViewById(R.h.cds)).setImageDrawable(paramList);
        }
        for (;;)
        {
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).getProvince() == null)
          {
            w.e("MicroMsg.ShakeReportUI", "PROVINCE NULL");
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_province = "";
          }
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).getCity() == null)
          {
            w.e("MicroMsg.ShakeReportUI", "CITY NULL");
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_city = "";
          }
          this.oPL.startAnimation(AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLV));
          GMTrace.o(6549959344128L, 48801);
          return;
          label965:
          paramList = "";
          break;
          label971:
          if (((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex == 2)
          {
            this.oPL.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance + this.vKB.vKW.getString(R.l.ecp));
            break label604;
          }
          this.oPL.setContentDescription((String)localObject3 + ((com.tencent.mm.plugin.shake.b.d)localObject1).field_distance);
          break label604;
          label1062:
          paramList = "";
          break label664;
          label1068:
          this.hqg.setContentDescription(getString(R.l.ebu));
          break label729;
          label1085:
          paramList.setVisibility(8);
          break label819;
          label1094:
          i = R.k.cMM;
          break label849;
          label1102:
          this.oPL.findViewById(R.h.cds).setVisibility(8);
        }
      }
      if (this.oPC) {
        aq.C(this.vKB.vKW, R.l.ebU);
      }
      tV(3);
      hn(false);
      paramList = new Intent(this, ShakeItemListUI.class);
      paramList.putExtra("_key_show_type_", -1);
      paramList.putExtra("_key_title_", getString(R.l.ebT));
      startActivity(paramList);
      GMTrace.o(6549959344128L, 48801);
      return;
    }
    if (this.oPJ.oMv == 3)
    {
      i = paramList.size();
      if (i == 0)
      {
        Gw(getString(R.l.ecb));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (i == 1)
      {
        if (this.oPC) {
          aq.C(this.vKB.vKW, R.l.ebU);
        }
        tV(3);
        if (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type == 4)
        {
          paramList = com.tencent.mm.plugin.shake.d.a.i.a(((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_lvbuffer, paramLong);
          com.tencent.mm.at.b.c(paramList);
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("key_mode", 1);
          ((Intent)localObject1).putExtra("key_offset", paramList.uFr);
          ((Intent)localObject1).putExtra("music_player_beg_time", paramList.ppD);
          ((Intent)localObject1).putExtra("key_scene", 3);
          if (com.tencent.mm.at.c.JY()) {
            ((Intent)localObject1).putExtra("KGlobalShakeMusic", true);
          }
          com.tencent.mm.bj.d.b(this, "music", ".ui.MusicMainUI", (Intent)localObject1);
          GMTrace.o(6549959344128L, 48801);
          return;
        }
        w.w("MicroMsg.ShakeReportUI", "Unexpected type, ignore.");
      }
      GMTrace.o(6549959344128L, 48801);
      return;
    }
    if (this.oPJ.oMv == 4)
    {
      hq(true);
      i = paramList.size();
      if (i == 0)
      {
        Gw(getString(R.l.ecw));
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      if (i == 1)
      {
        if (this.oPC) {
          aq.C(this.vKB.vKW, R.l.ebU);
        }
        tV(3);
        paramList = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
        new ae().postDelayed(new k.1(paramList, this), 100L);
      }
      GMTrace.o(6549959344128L, 48801);
      return;
    }
    if (this.oPJ.oMv == 5) {
      switch ((int)paramLong)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6549959344128L, 48801);
      return;
      if ((!paramList.isEmpty()) && (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type == 11))
      {
        if (paramList.size() == 1)
        {
          if (this.oPC) {
            aq.C(this.vKB.vKW, R.l.ebU);
          }
          tV(3);
          paramList = (com.tencent.mm.plugin.shake.b.d)paramList.get(0);
          if (!bg.nm(paramList.field_username))
          {
            this.oPL.setTag(paramList.field_username);
            ((TextView)this.oPL.findViewById(R.h.cdr)).setText(paramList.field_username);
            this.oPL.setContentDescription(bg.nl(paramList.field_nickname));
            ((TextView)this.oPL.findViewById(R.h.cdp)).setText(paramList.field_signature);
            this.gJI.a(paramList.getProvince(), (ImageView)this.oPL.findViewById(R.h.cdq));
            this.oPL.findViewById(R.h.cds).setVisibility(8);
            this.oPL.startAnimation(AnimationUtils.loadAnimation(this.vKB.vKW, R.a.aLV));
            this.oPL.setVisibility(0);
          }
          GMTrace.o(6549959344128L, 48801);
          return;
        }
        if (this.oPC) {
          aq.C(this.vKB.vKW, R.l.ebU);
        }
        tV(3);
        hn(false);
        localObject1 = new Intent(this, ShakeItemListUI.class);
        ((Intent)localObject1).putExtra("_key_show_type_", -12);
        ((Intent)localObject1).putExtra("_key_title_", getString(R.l.ebS));
        ((Intent)localObject1).putExtra("_key_show_from_shake_", true);
        ((Intent)localObject1).putExtra("_ibeacon_new_insert_size", paramList.size());
        startActivity((Intent)localObject1);
        GMTrace.o(6549959344128L, 48801);
        return;
      }
      Gw(null);
      GMTrace.o(6549959344128L, 48801);
      return;
      Gw(getString(R.l.ebM));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6547140771840L, 48780);
    int i = R.i.cGs;
    GMTrace.o(6547140771840L, 48780);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6550898868224L, 48808);
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(6550898868224L, 48808);
      return;
    }
    if ((this.oQa != null) && (this.oQa.getTag() != null) && (paramString.equals((String)this.oQa.getTag()))) {
      this.oQa.setImageBitmap(paramBitmap);
    }
    GMTrace.o(6550898868224L, 48808);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6550496215040L, 48805);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(6550496215040L, 48805);
      return;
    case 1: 
      if (paramIntent == null)
      {
        GMTrace.o(6550496215040L, 48805);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 4);
      localIntent.putExtra("CropImage_Filter", true);
      localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
      StringBuilder localStringBuilder = new StringBuilder();
      at.AR();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.y.c.yU() + "custom_shake_img_filename.jpg");
      com.tencent.mm.plugin.shake.a.hnH.a(localIntent, 2, this, paramIntent);
      GMTrace.o(6550496215040L, 48805);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(6550496215040L, 48805);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    at.AR();
    com.tencent.mm.y.c.xh().set(4110, Boolean.valueOf(false));
    at.AR();
    com.tencent.mm.y.c.xh().set(4111, paramIntent);
    bfT();
    GMTrace.o(6550496215040L, 48805);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6547409207296L, 48782);
    super.onCreate(paramBundle);
    oM(R.l.ece);
    this.fJm = com.tencent.mm.modelgeo.c.Ir();
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vqS, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vqT, "");
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vti, "");
    this.oQA = findViewById(R.h.cdN);
    paramBundle = bk.BE();
    Object localObject1 = bg.nl(paramBundle.goV);
    Object localObject2 = bg.nl(paramBundle.goU);
    paramBundle = com.tencent.mm.k.g.uu().z("IBeacon", "GatedLaunch");
    int i;
    int j;
    if (!bg.nm(paramBundle))
    {
      this.oQG = false;
      this.oQH = false;
      if (paramBundle != null) {}
      try
      {
        paramBundle = new JSONObject(paramBundle);
        i = paramBundle.getInt("gatedlaunch");
        at.AU();
        if (i == 0) {
          break label464;
        }
        if (i != 1) {
          break label302;
        }
        paramBundle = paramBundle.getJSONArray("citylist");
        k = paramBundle.length();
        i = 0;
      }
      catch (JSONException paramBundle)
      {
        for (;;)
        {
          try
          {
            int k;
            String str;
            int m;
            label274:
            label302:
            label323:
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_lvbuffer = (String.valueOf(localObject1[4]) + "," + String.valueOf(localObject1[5]) + "," + String.valueOf(localObject1[6])).getBytes("utf-8");
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_insertBatch = 2;
            Object localObject3 = com.tencent.mm.plugin.shake.b.m.bfk();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).bfc();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).a((com.tencent.mm.plugin.shake.b.d)localObject2, true);
            localObject3 = new LinkedList();
            ((List)localObject3).add(localObject2);
            d((List)localObject3, 1L);
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vsT, "");
            paramBundle = paramBundle + "," + localObject1[4] + localObject1[5] + localObject1[6];
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vsU, paramBundle);
            this.oPI = new c(this.vKB.vKI);
            this.ntd = new com.tencent.mm.pluginsdk.l.c(this);
            if (!this.ntd.bKz()) {
              com.tencent.mm.ui.base.h.a(this, R.l.ecd, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6568749826048L, 48941);
                  ShakeReportUI.this.finish();
                  GMTrace.o(6568749826048L, 48941);
                }
              });
            }
            if (com.tencent.mm.plugin.shake.a.hnI != null) {
              com.tencent.mm.plugin.shake.a.hnI.pr();
            }
            com.tencent.mm.platformtools.j.b(this);
            w.i("MicroMsg.ShakeReportUI", "%s", new Object[] { getResources().getDisplayMetrics().toString() });
            i = com.tencent.mm.plugin.shake.b.m.bfl().ME();
            com.tencent.mm.plugin.report.service.g.ork.i(11317, new Object[] { Integer.valueOf(i), e.bgf() });
            com.tencent.mm.plugin.report.service.g.ork.i(11710, new Object[] { Integer.valueOf(1) });
            GMTrace.o(6547409207296L, 48782);
            return;
            if (i != 4) {
              continue;
            }
            this.oQG = true;
            this.oQH = true;
            continue;
            paramBundle = paramBundle;
            w.e("MicroMsg.ShakeReportUI", "[shakezb]parse dymanic setting json fail!!");
            this.oQG = false;
            this.oQH = false;
            continue;
            this.oQJ = 1;
            continue;
            com.tencent.mm.plugin.report.service.g.ork.i(13139, new Object[] { localObject1, localObject2, Integer.valueOf(0), Integer.valueOf(this.oQJ), Integer.valueOf(i), Integer.valueOf(j) });
            continue;
            if (paramBundle == null) {
              continue;
            }
            paramBundle.getState();
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            w.e("MicroMsg.ShakeReportUI", "[kevinkma]parst shakeItem error!");
            continue;
          }
          MP();
          continue;
          j = 0;
          continue;
          i = 0;
          continue;
          i += 1;
        }
      }
      if (i < k)
      {
        localObject3 = paramBundle.getJSONObject(i);
        str = ((JSONObject)localObject3).getString("province");
        j = ((JSONObject)localObject3).getInt("allgatedlaunch");
        if ((str.equals(localObject1)) && (j == 1))
        {
          this.oQG = true;
          break label1532;
        }
        if ((!str.equals(localObject1)) || (j != 0)) {
          break label1532;
        }
        localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
        m = ((JSONArray)localObject3).length();
        j = 0;
        if (j >= m) {
          break label1532;
        }
        if (!((JSONArray)localObject3).getString(j).equals(localObject2)) {
          break label1544;
        }
        this.oQG = true;
        break label1544;
        if (i == 2)
        {
          paramBundle = paramBundle.getJSONArray("citylist");
          k = paramBundle.length();
          i = 0;
          if (i >= k) {
            break label464;
          }
          localObject3 = paramBundle.getJSONObject(i);
          str = ((JSONObject)localObject3).getString("province");
          j = ((JSONObject)localObject3).getInt("allgatedlaunch");
          if ((str.equals(localObject1)) && (j == 1))
          {
            this.oQH = true;
            this.oQG = true;
            break label1551;
          }
          if ((!str.equals(localObject1)) || (j != 0)) {
            break label1551;
          }
          localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
          m = ((JSONArray)localObject3).length();
          j = 0;
        }
      }
    }
    for (;;)
    {
      if (j < m)
      {
        if (!((JSONArray)localObject3).getString(j).equals(localObject2)) {
          break label1558;
        }
        this.oQH = true;
        this.oQG = true;
        break label1558;
        if (i == 3)
        {
          this.oQG = true;
          this.oQH = false;
          label464:
          if (at.AU())
          {
            at.AR();
            if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vta, Integer.valueOf(0))).intValue() == 1) {
              this.oQI = true;
            }
          }
          paramBundle = BluetoothAdapter.getDefaultAdapter();
          boolean bool = ab.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
          if ((paramBundle == null) || (!bool) || (Build.VERSION.SDK_INT < 18) || (paramBundle.getState() != 12)) {
            break label1423;
          }
          this.oQJ = 0;
          if ((paramBundle == null) || (paramBundle.getState() != 12)) {
            break label1527;
          }
          i = 1;
          if (!bool) {
            break label1522;
          }
          j = 1;
          if (!this.oQG) {
            break label1431;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(13139, new Object[] { localObject1, localObject2, Integer.valueOf(1), Integer.valueOf(this.oQJ), Integer.valueOf(i), Integer.valueOf(j) });
          if ((this.oQI) || (this.oQG))
          {
            this.oQF = true;
            this.oQA = findViewById(R.h.cdQ);
            if (this.oQH)
            {
              if ((paramBundle != null) && (paramBundle.getState() == 12)) {
                break label1489;
              }
              this.oQF = false;
            }
          }
          paramBundle = com.tencent.mm.plugin.shake.b.m.bfp();
          if (paramBundle.jwK == null) {
            paramBundle.jwK = new ArrayList();
          }
          if (this != null) {
            paramBundle.jwK.add(new WeakReference(this));
          }
          paramBundle = Boolean.valueOf(false);
          long l3 = bg.Pu();
          long l2 = 0L;
          long l1 = 0L;
          if (at.AU())
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vsX, Boolean.valueOf(true));
            at.AR();
            bool = bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsV, null), false);
            at.AR();
            l2 = bg.a((Long)com.tencent.mm.y.c.xh().get(w.a.vsW, null), 0L);
            at.AR();
            l1 = bg.a((Long)com.tencent.mm.y.c.xh().get(w.a.vsQ, null), 0L);
            paramBundle = Boolean.valueOf(bool);
          }
          if ((!paramBundle.booleanValue()) || (l3 - l2 >= l1)) {
            break label1515;
          }
          this.oQp = 5;
          this.oQF = true;
          this.oPD = true;
          MP();
          bfU();
          at.AR();
          paramBundle = bg.aq((String)com.tencent.mm.y.c.xh().get(w.a.vsU, null), "");
          at.AR();
          localObject1 = bg.aq((String)com.tencent.mm.y.c.xh().get(w.a.vsT, null), "");
          if ((localObject1 != null) && (!((String)localObject1).equals("")))
          {
            localObject1 = ((String)localObject1).split(",");
            localObject2 = new com.tencent.mm.plugin.shake.b.d();
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_type = 11;
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_username = localObject1[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_nickname = localObject1[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_signature = localObject1[1];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_province = localObject1[2];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_city = localObject1[3];
            ((com.tencent.mm.plugin.shake.b.d)localObject2).field_sex = 1;
          }
        }
        label1423:
        label1431:
        label1489:
        label1515:
        label1522:
        label1527:
        label1532:
        paramBundle = null;
        break;
        label1544:
        j += 1;
        break label274;
      }
      label1551:
      i += 1;
      break label323;
      label1558:
      j += 1;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6547946078208L, 48786);
    if ((this.oQe != null) && (!this.oQe.isRecycled())) {
      this.oQe.recycle();
    }
    if ((this.oQf != null) && (this.oQf.isShowing()))
    {
      this.oQf.dismiss();
      this.oQf = null;
    }
    if (this.oPJ.oMw != null) {
      this.oPJ.oMw.beX();
    }
    if (this.ntd != null)
    {
      this.ntd.aFd();
      this.ntd = null;
    }
    Object localObject = com.tencent.mm.plugin.shake.d.a.j.a(null);
    if (com.tencent.mm.plugin.shake.d.a.j.ndo)
    {
      com.tencent.mm.plugin.shake.d.a.j.ndo = false;
      if (!((com.tencent.mm.plugin.shake.d.a.j)localObject).oOz.bfK()) {
        w.e("Micromsg.ShakeMusicMgr", "release MusicFingerPrintRecorder error");
      }
    }
    com.tencent.mm.plugin.shake.d.a.j.oOA = null;
    com.tencent.mm.platformtools.j.c(this);
    com.tencent.mm.sdk.b.a.vgX.c(this.oQM);
    com.tencent.mm.sdk.b.a.vgX.c(this.oQN);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsX, Boolean.valueOf(false));
    bfS();
    if (com.tencent.mm.plugin.shake.c.c.a.bfI()) {
      com.tencent.mm.s.c.vK().l(262154, false);
    }
    bfY();
    localObject = com.tencent.mm.plugin.shake.b.m.bfp();
    if ((((com.tencent.mm.plugin.shake.c.a.f)localObject).jwK == null) || (this == null)) {}
    label347:
    for (;;)
    {
      localObject = com.tencent.mm.plugin.shake.b.m.bfq();
      ((com.tencent.mm.plugin.shake.c.a.d)localObject).fJn = -85.0F;
      ((com.tencent.mm.plugin.shake.c.a.d)localObject).fJo = -1000.0F;
      if (this.fJm != null) {
        this.fJm.c(this.fJt);
      }
      super.onDestroy();
      GMTrace.o(6547946078208L, 48786);
      return;
      int i = 0;
      for (;;)
      {
        if (i >= ((com.tencent.mm.plugin.shake.c.a.f)localObject).jwK.size()) {
          break label347;
        }
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.shake.c.a.f)localObject).jwK.get(i);
        if (localWeakReference != null)
        {
          com.tencent.mm.plugin.shake.c.a.f.a locala = (com.tencent.mm.plugin.shake.c.a.f.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(this)))
          {
            ((com.tencent.mm.plugin.shake.c.a.f)localObject).jwK.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(6547811860480L, 48785);
    at.AR();
    com.tencent.mm.y.c.b(this);
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    com.tencent.mm.plugin.shake.b.m.bfk().j(this);
    if (this.oPJ.oMw != null) {
      this.oPJ.oMw.pause();
    }
    this.oPF = false;
    if (this.ntd != null) {
      this.ntd.aFd();
    }
    this.oPI.bfP();
    if (this.oQp != 5)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(327696, this.oQp);
    }
    if (this.oQp == 4) {
      hl(false);
    }
    bfS();
    super.onPause();
    GMTrace.o(6547811860480L, 48785);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6552509480960L, 48820);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.ShakeReportUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(6552509480960L, 48820);
        return;
      }
    }
    w.i("MicroMsg.ShakeReportUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6552509480960L, 48820);
      return;
      if (paramArrayOfInt[0] != 0)
      {
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6580695203840L, 49030);
            paramAnonymousDialogInterface.dismiss();
            ShakeReportUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(6580695203840L, 49030);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6534792740864L, 48688);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(6534792740864L, 48688);
          }
        });
        GMTrace.o(6552509480960L, 48820);
        return;
        if (paramArrayOfInt[0] == 0)
        {
          aZQ();
          GMTrace.o(6552509480960L, 48820);
          return;
        }
        this.oaK = false;
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6533987434496L, 48682);
            ShakeReportUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            ShakeReportUI.N(ShakeReportUI.this);
            ShakeReportUI.this.finish();
            GMTrace.o(6533987434496L, 48682);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6571971051520L, 48965);
            ShakeReportUI.N(ShakeReportUI.this);
            ShakeReportUI.this.finish();
            GMTrace.o(6571971051520L, 48965);
          }
        });
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(6547543425024L, 48783);
    super.onResume();
    if (this.oaK)
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
      w.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkposition[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
      if (!bool)
      {
        GMTrace.o(6547543425024L, 48783);
        return;
      }
      aZQ();
    }
    GMTrace.o(6547543425024L, 48783);
  }
  
  static final class a
    extends c.a
  {
    private final long[] hll;
    private long jrk;
    private Vibrator jsv;
    WeakReference<ShakeReportUI> oQV;
    
    public a(ShakeReportUI paramShakeReportUI)
    {
      GMTrace.i(6561904721920L, 48890);
      this.jrk = bg.Pw();
      this.hll = new long[] { 300L, 200L, 300L, 200L };
      this.oQV = new WeakReference(paramShakeReportUI);
      GMTrace.o(6561904721920L, 48890);
    }
    
    public final void aTB()
    {
      GMTrace.i(6562038939648L, 48891);
      ShakeReportUI localShakeReportUI = (ShakeReportUI)this.oQV.get();
      if (localShakeReportUI == null)
      {
        GMTrace.o(6562038939648L, 48891);
        return;
      }
      if (localShakeReportUI.isFinishing())
      {
        w.e("MicroMsg.ShakeReportUI", "ui finished");
        GMTrace.o(6562038939648L, 48891);
        return;
      }
      if (!ShakeReportUI.u(localShakeReportUI))
      {
        w.i("MicroMsg.ShakeReportUI", "tryShake the status is can's shake");
        GMTrace.o(6562038939648L, 48891);
        return;
      }
      ShakeReportUI.v(localShakeReportUI);
      long l = bg.aI(this.jrk);
      if (l < 1200L)
      {
        w.i("MicroMsg.ShakeReportUI", "tryStartShake delay too short:" + l);
        GMTrace.o(6562038939648L, 48891);
        return;
      }
      w.w("MicroMsg.ShakeReportUI", "tryStartShake delaytoo enough:" + l);
      this.jrk = bg.Pw();
      Object localObject;
      if (ShakeReportUI.w(localShakeReportUI) != null)
      {
        localObject = ShakeReportUI.w(localShakeReportUI);
        if (((c)localObject).view != null) {
          ((c)localObject).view.setKeepScreenOn(true);
        }
        ((c)localObject).euU.z(30000L, 30000L);
      }
      if (ShakeReportUI.q(localShakeReportUI) != null)
      {
        localObject = ShakeReportUI.q(localShakeReportUI);
        if (((com.tencent.mm.pluginsdk.ui.f)localObject).mQj != null) {
          ((com.tencent.mm.pluginsdk.ui.f)localObject).mQj.dismiss();
        }
      }
      if (ShakeReportUI.x(localShakeReportUI))
      {
        localObject = (ShakeReportUI)this.oQV.get();
        if (localObject != null) {
          aq.C((Context)localObject, R.l.ecr);
        }
      }
      for (;;)
      {
        reset();
        ShakeReportUI.y(localShakeReportUI);
        GMTrace.o(6562038939648L, 48891);
        return;
        localObject = (ShakeReportUI)this.oQV.get();
        if (localObject != null)
        {
          if (this.jsv == null) {
            this.jsv = ((Vibrator)((ShakeReportUI)localObject).getSystemService("vibrator"));
          }
          if (this.jsv != null) {
            this.jsv.vibrate(this.hll, -1);
          }
        }
      }
    }
    
    public final void onRelease()
    {
      GMTrace.i(6562173157376L, 48892);
      GMTrace.o(6562173157376L, 48892);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\ShakeReportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */