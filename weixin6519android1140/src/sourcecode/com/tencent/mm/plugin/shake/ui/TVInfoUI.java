package com.tencent.mm.plugin.shake.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.g.a.ca.a;
import com.tencent.mm.g.a.ca.b;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.e.a.a;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.aea;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class TVInfoUI
  extends MMPreference
  implements com.tencent.mm.ad.e, j.a
{
  private long eDr;
  private TextView hqi;
  protected ProgressDialog htG;
  protected f htU;
  private ImageView jGJ;
  private String oRg;
  private TextView oRh;
  private c.a oRi;
  private com.tencent.mm.plugin.shake.e.b oRj;
  private boolean owE;
  private boolean oza;
  
  public TVInfoUI()
  {
    GMTrace.i(6577205542912L, 49004);
    this.oRg = "";
    this.oza = false;
    this.owE = false;
    this.htG = null;
    GMTrace.o(6577205542912L, 49004);
  }
  
  private void a(final c.a parama)
  {
    GMTrace.i(6578413502464L, 49013);
    if (parama == null)
    {
      w.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
      finish();
      GMTrace.o(6578413502464L, 49013);
      return;
    }
    this.hqi.setText(parama.field_title);
    if (bg.nm(parama.field_topic)) {
      this.oRh.setVisibility(8);
    }
    for (;;)
    {
      this.jGJ = ((ImageView)findViewById(R.h.ciZ));
      if (!bg.nm(parama.field_playurl))
      {
        ImageView localImageView = (ImageView)findViewById(R.h.ciY);
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6532913692672L, 48674);
            g.ork.i(10987, new Object[] { Integer.valueOf(2), parama.field_playstatid, "", "" });
            TVInfoUI.a(TVInfoUI.this, parama.field_playurl);
            GMTrace.o(6532913692672L, 48674);
          }
        });
        this.jGJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6565662818304L, 48918);
            g.ork.i(10987, new Object[] { Integer.valueOf(2), parama.field_playstatid, "", "" });
            TVInfoUI.a(TVInfoUI.this, parama.field_playurl);
            GMTrace.o(6565662818304L, 48918);
          }
        });
      }
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6533718999040L, 48680);
          TVInfoUI.a(TVInfoUI.this);
          GMTrace.o(6533718999040L, 48680);
          return true;
        }
      });
      if ((!bg.nm(parama.field_id)) && (!this.oza) && (!getIntent().getBooleanExtra("key_TV_come_from_shake", false)))
      {
        int i = getIntent().getIntExtra("key_TV_getProductInfoScene", 0);
        w.d("MicroMsg.TVInfoUI", "GetTVInfo id[%s], scene[%s]", new Object[] { parama.field_id, Integer.valueOf(i) });
        at.wS().a(new com.tencent.mm.plugin.shake.d.a.b(parama.field_id, i), 0);
        this.oza = true;
      }
      this.jGJ.setVisibility(0);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6588345614336L, 49087);
          TVInfoUI.this.finish();
          GMTrace.o(6588345614336L, 49087);
          return true;
        }
      });
      w.v("MicroMsg.TVInfoUI", "start postToMainThread initBodyView");
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6534524305408L, 48686);
          TVInfoUI.a(TVInfoUI.this, parama);
          TVInfoUI.b(TVInfoUI.this, parama);
          GMTrace.o(6534524305408L, 48686);
        }
      });
      GMTrace.o(6578413502464L, 49013);
      return;
      this.oRh.setText(parama.field_topic);
    }
  }
  
  private void bcW()
  {
    GMTrace.i(6578547720192L, 49014);
    this.eDr = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
    if ((this.eDr > 0L) && (at.AU()))
    {
      at.AR();
      au localau = com.tencent.mm.y.c.yM().cM(this.eDr);
      if (localau.field_msgId > 0L)
      {
        localau.dc(this.oRj.Pm());
        at.AR();
        com.tencent.mm.y.c.yM().a(this.eDr, localau);
      }
    }
    GMTrace.o(6578547720192L, 49014);
  }
  
  protected final void MP()
  {
    GMTrace.i(6578279284736L, 49012);
    oM(R.l.dVR);
    this.htU = this.wky;
    this.hqi = ((TextView)findViewById(R.h.cja));
    this.oRh = ((TextView)findViewById(R.h.cjb));
    String str2 = getIntent().getStringExtra("key_TV_xml");
    String str1 = str2;
    if (bg.nm(str2))
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("key_TV_xml_bytes");
      str1 = str2;
      if (arrayOfByte != null) {
        str1 = new String(arrayOfByte);
      }
    }
    w.d("MicroMsg.TVInfoUI", "tvinfo xml : %s", new Object[] { str1 });
    this.oRi = com.tencent.mm.plugin.shake.e.c.Gx(str1);
    if (this.oRi == null)
    {
      w.e("MicroMsg.TVInfoUI", "initView(), tv == null");
      finish();
      GMTrace.o(6578279284736L, 49012);
      return;
    }
    a(this.oRi);
    GMTrace.o(6578279284736L, 49012);
  }
  
  public final int QI()
  {
    GMTrace.i(6577473978368L, 49006);
    int i = R.o.epF;
    GMTrace.o(6577473978368L, 49006);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6578950373376L, 49017);
    if (paramk == null)
    {
      w.w("MicroMsg.TVInfoUI", "scene == null");
      GMTrace.o(6578950373376L, 49017);
      return;
    }
    if (paramk.getType() == 552)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        Toast.makeText(this, R.l.dVS, 0).show();
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      if (this.oRi == null)
      {
        w.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      paramString = (com.tencent.mm.plugin.shake.d.a.b)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (aea)paramString.fUa.gtD.gtK; paramString == null; paramString = null)
      {
        w.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
        GMTrace.o(6578950373376L, 49017);
        return;
      }
      if (paramString.tWx != null)
      {
        w.d("MicroMsg.TVInfoUI", "onSceneEnd  tvInfo.DescriptionXML != null, res:" + paramString.tWx);
        paramString = com.tencent.mm.plugin.shake.e.c.Gx(paramString.tWx);
        if ((this.oRi != null) && (this.oRi.field_xml != null) && (paramString != null) && (paramString.field_xml != null) && (!this.oRi.field_xml.equals(paramString.field_xml)))
        {
          this.oRi = paramString;
          a(this.oRi);
        }
      }
    }
    GMTrace.o(6578950373376L, 49017);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6578681937920L, 49015);
    w.d("MicroMsg.TVInfoUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.hiu });
    if ((this.oRi == null) || (this.oRi.oBs == null))
    {
      w.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
      GMTrace.o(6578681937920L, 49015);
      return false;
    }
    for (;;)
    {
      Intent localIntent;
      try
      {
        int i = Integer.valueOf(paramPreference.hiu).intValue();
        int j = i / 100;
        int k = i % 100;
        w.v("MicroMsg.TVInfoUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((j < 0) || (j >= this.oRi.oBs.size()))
        {
          w.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.oRi.oBs.size()) });
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        paramf = (com.tencent.mm.plugin.shake.e.a)this.oRi.oBs.get(j);
        if (paramf == null)
        {
          w.w("MicroMsg.TVInfoUI", "actionList == null");
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        if ((k < 0) || (k >= paramf.gVg.size()))
        {
          w.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(paramf.gVg.size()) });
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        paramf = (a.a)paramf.gVg.get(k);
        if (paramf == null)
        {
          w.w("MicroMsg.TVInfoUI", "action == null");
          GMTrace.o(6578681937920L, 49015);
          return false;
        }
        w.v("MicroMsg.TVInfoUI", "action type:" + paramf.type + ", target:" + paramf.oRs + ", targetDesc:" + paramf.oRu + ", targetDesc2:" + paramf.oRv);
        if (paramf.type == 3)
        {
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf.oRs);
          paramPreference.putExtra("show_bottom", false);
          paramPreference.putExtra("geta8key_scene", 10);
          paramPreference.putExtra("srcUsername", paramf.oRv);
          com.tencent.mm.plugin.shake.a.hnH.j(paramPreference, this);
          GMTrace.o(6578681937920L, 49015);
          return true;
        }
        if (paramf.type != 4) {
          break label666;
        }
        at.AR();
        paramPreference = com.tencent.mm.y.c.yK().TE(paramf.oRs);
        if (paramPreference == null) {
          continue;
        }
        localIntent = new Intent();
        if ((com.tencent.mm.l.a.eE(paramPreference.field_type)) && (paramPreference.bSA()))
        {
          com.tencent.mm.af.x.FG().iC(paramf.oRs);
          if (paramf.oRu.equals("1"))
          {
            localIntent.putExtra("Chat_User", paramf.oRs);
            localIntent.putExtra("finish_direct", true);
            com.tencent.mm.plugin.shake.a.hnH.e(localIntent, this);
            continue;
          }
        }
        localIntent.putExtra("Contact_User", paramf.oRs);
      }
      catch (Exception paramf)
      {
        w.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        w.printErrStackTrace("MicroMsg.TVInfoUI", paramf, "", new Object[0]);
        GMTrace.o(6578681937920L, 49015);
        return false;
      }
      localIntent.putExtra("force_get_contact", true);
      d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      continue;
      label666:
      if (paramf.type == 5)
      {
        paramPreference = new gt();
        paramPreference.eJT.actionCode = 11;
        paramPreference.eJT.result = paramf.oRs;
        paramPreference.eJT.context = this;
        paramPreference.eDO = null;
        com.tencent.mm.sdk.b.a.vgX.a(paramPreference, Looper.myLooper());
      }
      else if (paramf.type == 6)
      {
        paramPreference = new Intent();
        paramPreference.putExtra("key_product_id", paramf.oRs);
        paramPreference.putExtra("key_product_scene", 9);
        d.b(this, "product", ".ui.MallProductUI", paramPreference);
      }
    }
  }
  
  public final int ait()
  {
    GMTrace.i(6577608196096L, 49007);
    int i = R.i.cHf;
    GMTrace.o(6577608196096L, 49007);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6577339760640L, 49005);
    int i = R.i.cHe;
    GMTrace.o(6577339760640L, 49005);
    return i;
  }
  
  public final void k(final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6578816155648L, 49016);
    if (paramString != null)
    {
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.TVInfoUI", "onGetPictureFinish pic, url = [%s], bitmap is null ? [%B]", new Object[] { paramString, Boolean.valueOf(bool) });
        try
        {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6540161449984L, 48728);
              if ((TVInfoUI.e(TVInfoUI.this) != null) && (TVInfoUI.e(TVInfoUI.this).equals(paramString)))
              {
                if ((TVInfoUI.f(TVInfoUI.this) != null) && (paramBitmap != null))
                {
                  TVInfoUI.f(TVInfoUI.this).setImageBitmap(paramBitmap);
                  TVInfoUI.g(TVInfoUI.this);
                }
                TVInfoUI.h(TVInfoUI.this);
              }
              f localf = TVInfoUI.this.htU;
              GMTrace.o(6540161449984L, 48728);
            }
          });
          GMTrace.o(6578816155648L, 49016);
          return;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", new Object[] { paramString.getLocalizedMessage() });
          w.printErrStackTrace("MicroMsg.TVInfoUI", paramString, "", new Object[0]);
          GMTrace.o(6578816155648L, 49016);
          return;
        }
      }
    }
    w.e("MicroMsg.TVInfoUI", "onUpdate pic, url  is null ");
    GMTrace.o(6578816155648L, 49016);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6577742413824L, 49008);
    super.onCreate(paramBundle);
    j.b(this);
    MP();
    GMTrace.o(6577742413824L, 49008);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6578145067008L, 49011);
    j.c(this);
    super.onDestroy();
    GMTrace.o(6578145067008L, 49011);
  }
  
  protected void onPause()
  {
    GMTrace.i(6578010849280L, 49010);
    at.wS().b(552, this);
    super.onPause();
    GMTrace.o(6578010849280L, 49010);
  }
  
  protected void onResume()
  {
    GMTrace.i(6577876631552L, 49009);
    super.onResume();
    at.wS().a(552, this);
    GMTrace.o(6577876631552L, 49009);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\TVInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */