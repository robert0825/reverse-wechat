package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.gd;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class SnsNotInterestUI
  extends MMPreference
  implements e
{
  private static final String[] qda;
  private static final int[] qdb;
  private static final int[] qdf;
  private f iAA;
  private r ihl;
  private String nRz;
  private HashMap<String, Boolean> qdc;
  private HashMap<Integer, Boolean> qdd;
  private HashMap<String, Integer> qde;
  private TextView qdg;
  private EditText qdh;
  private ListView qdi;
  private LinearLayout qdj;
  private int qdk;
  private int qdl;
  private long qdm;
  private boolean qdn;
  private boolean qdo;
  q qdp;
  
  static
  {
    GMTrace.i(8499069190144L, 63323);
    qda = new String[] { "sns_expose_reason_not_fav", "sns_expose_reason_too_freq", "sns_expose_reason_too_many_same_content", "sns_expose_reason_marketing", "sns_expose_reason_content_sexy", "sns_expose_reason_rumour", "sns_expose_reason_other" };
    qdb = new int[] { 1, 2, 4, 8, 16, 32, 64 };
    qdf = new int[] { i.j.pja, i.j.pje, i.j.pjf, i.j.piZ, i.j.piY, i.j.pjc, i.j.pjb };
    GMTrace.o(8499069190144L, 63323);
  }
  
  public SnsNotInterestUI()
  {
    GMTrace.i(8497592795136L, 63312);
    this.qdc = new HashMap(qda.length);
    this.qdd = new HashMap(qdb.length);
    this.qde = new HashMap(qdb.length);
    this.nRz = null;
    this.qdn = false;
    this.qdo = false;
    this.ihl = null;
    this.qdp = null;
    GMTrace.o(8497592795136L, 63312);
  }
  
  private void bpl()
  {
    int k = 0;
    GMTrace.i(8497861230592L, 63314);
    Object localObject1 = qda;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      this.qdc.put(localObject2, Boolean.valueOf(false));
      i += 1;
    }
    localObject1 = qdb;
    int m = localObject1.length;
    i = 0;
    for (;;)
    {
      j = k;
      if (i >= m) {
        break;
      }
      j = localObject1[i];
      this.qdd.put(Integer.valueOf(j), Boolean.valueOf(false));
      i += 1;
    }
    while (j < qdb.length)
    {
      this.qde.put(qda[j], Integer.valueOf(qdb[j]));
      j += 1;
    }
    GMTrace.o(8497861230592L, 63314);
  }
  
  protected final void MP()
  {
    GMTrace.i(8498129666048L, 63316);
    super.MP();
    oM(i.j.pji);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8371965001728L, 62376);
        SnsNotInterestUI.this.finish();
        GMTrace.o(8371965001728L, 62376);
        return true;
      }
    });
    this.qdg = ((TextView)findViewById(i.f.pcU));
    this.qdh = ((EditText)findViewById(i.f.pcV));
    this.qdi = ((ListView)findViewById(16908298));
    this.qdj = ((LinearLayout)findViewById(i.f.paE));
    this.qdj.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8479070748672L, 63174);
        SnsNotInterestUI.a(SnsNotInterestUI.this).requestFocus();
        SnsNotInterestUI.this.aLo();
        GMTrace.o(8479070748672L, 63174);
      }
    });
    this.qdh.setVisibility(8);
    this.qdg.setVisibility(8);
    this.iAA = this.wky;
    if (this.iAA == null) {
      w.e("MicroMsg.SnsNotInterestUI", "initPref error, PreferenceScreen is null!");
    }
    for (;;)
    {
      a(0, getString(i.j.phP), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8704019660800L, 64850);
          SnsNotInterestUI.b(SnsNotInterestUI.this);
          GMTrace.o(8704019660800L, 64850);
          return true;
        }
      }, p.b.vLG);
      Y(0, false);
      GMTrace.o(8498129666048L, 63316);
      return;
      Object localObject;
      if (this.iAA.VG("sns_expose_desc") == null)
      {
        localObject = new PreferenceTitleCategory(this);
        ((Preference)localObject).setTitle(i.j.piW);
        ((Preference)localObject).setKey("sns_expose_desc");
        this.iAA.a((Preference)localObject);
      }
      int i = 0;
      while (i < qda.length)
      {
        localObject = qda[i];
        int j = qdf[i];
        if (this.iAA.VG((String)localObject) == null)
        {
          Preference localPreference = new Preference(this);
          localPreference.setTitle(j);
          localPreference.setKey((String)localObject);
          localPreference.setLayoutResource(i.g.cBA);
          localPreference.setWidgetLayoutResource(i.g.peV);
          this.iAA.a(localPreference);
        }
        i += 1;
      }
    }
  }
  
  public final int QI()
  {
    GMTrace.i(8498398101504L, 63318);
    GMTrace.o(8498398101504L, 63318);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8498666536960L, 63320);
    w.d("MicroMsg.SnsNotInterestUI", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramk.getType() == 218)
    {
      this.ihl.dismiss();
      this.ihl = null;
      if (((q)paramk).type == 9)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.qdn = true;
          Toast.makeText(this, i.j.pjh, 1).show();
          finish();
          GMTrace.o(8498666536960L, 63320);
          return;
        }
        this.qdn = false;
        Toast.makeText(this, i.j.piX, 1).show();
      }
    }
    GMTrace.o(8498666536960L, 63320);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(8498532319232L, 63319);
    if (paramPreference == null)
    {
      GMTrace.o(8498532319232L, 63319);
      return false;
    }
    String str = paramPreference.hiu;
    if (this.qdc.containsKey(str))
    {
      boolean bool = ((Boolean)this.qdc.get(str)).booleanValue();
      label85:
      int i;
      if (bool)
      {
        paramPreference.setWidgetLayoutResource(i.g.peV);
        paramf.notifyDataSetChanged();
        if (bool) {
          break label283;
        }
        bool = true;
        this.qdc.put(str, Boolean.valueOf(bool));
        i = ((Integer)this.qde.get(str)).intValue();
        this.qdd.put(Integer.valueOf(i), Boolean.valueOf(bool));
        w.d("MicroMsg.SnsNotInterestUI", "click: %s, notInterestType: %d, isCheck: %b", new Object[] { str, Integer.valueOf(i), Boolean.valueOf(bool) });
        paramf = this.qdc.values().iterator();
        while (paramf.hasNext()) {
          if (((Boolean)paramf.next()).booleanValue())
          {
            i = 1;
            label204:
            if (i == 0) {
              break label294;
            }
            Y(0, true);
            label214:
            if ((!bool) || (!str.equals("sns_expose_reason_other"))) {
              break label303;
            }
            this.qdh.setVisibility(0);
            this.qdg.setVisibility(0);
            this.qdh.requestFocus();
            this.qdo = true;
            aLs();
          }
        }
      }
      for (;;)
      {
        GMTrace.o(8498532319232L, 63319);
        return true;
        paramPreference.setWidgetLayoutResource(i.g.peU);
        break;
        label283:
        bool = false;
        break label85;
        i = 0;
        break label204;
        label294:
        Y(0, false);
        break label214;
        label303:
        if (!((Boolean)this.qdc.get("sns_expose_reason_other")).booleanValue())
        {
          this.qdh.setVisibility(8);
          this.qdg.setVisibility(8);
          this.qdi.requestFocus();
          this.qdo = false;
          aLo();
        }
        else
        {
          this.qdi.requestFocus();
          aLo();
        }
      }
    }
    GMTrace.o(8498532319232L, 63319);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8498263883776L, 63317);
    int i = i.g.pfF;
    GMTrace.o(8498263883776L, 63317);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8497727012864L, 63313);
    super.onCreate(paramBundle);
    this.qdk = getIntent().getIntExtra("sns_info_not_interest_scene", 0);
    this.qdm = getIntent().getLongExtra("sns_info_svr_id", 0L);
    if (this.qdm != 0L)
    {
      paramBundle = ae.bjd().dU(this.qdm).field_userName;
      if (paramBundle != null)
      {
        com.tencent.mm.kernel.h.xz();
        paramBundle = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(paramBundle);
        if (paramBundle.fja != 2) {
          break label147;
        }
        qdf[1] = i.j.pjd;
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(218, this);
      bpl();
      MP();
      GMTrace.o(8497727012864L, 63313);
      return;
      label147:
      if (paramBundle.fja == 1) {
        qdf[1] = i.j.pje;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8497995448320L, 63315);
    super.onDestroy();
    bpl();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(218, this);
    gd localgd = new gd();
    localgd.eJj.eJk = this.qdn;
    localgd.eJj.eJl = this.qdm;
    a.vgX.m(localgd);
    GMTrace.o(8497995448320L, 63315);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsNotInterestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */