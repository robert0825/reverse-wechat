package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.c.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class ContactRemarkInfoViewUI
  extends MMActivity
{
  private String aDo;
  private String fjt;
  private String gQT;
  private x iBi;
  private int nLz;
  private String username;
  private View wRO;
  private View wRP;
  private TextView wRk;
  private TextView wRl;
  private ImageView wRo;
  private boolean wRv;
  
  public ContactRemarkInfoViewUI()
  {
    GMTrace.i(1732079779840L, 12905);
    this.wRv = false;
    GMTrace.o(1732079779840L, 12905);
  }
  
  private void PY()
  {
    GMTrace.i(1732750868480L, 12910);
    at.AR();
    this.iBi = com.tencent.mm.y.c.yK().TE(this.username);
    this.aDo = this.iBi.vk();
    this.fjt = this.iBi.fjt;
    this.gQT = this.iBi.fju;
    GMTrace.o(1732750868480L, 12910);
  }
  
  private void cgn()
  {
    GMTrace.i(1733019303936L, 12912);
    Bitmap localBitmap = com.tencent.mm.ay.c.Kn().kI(this.username);
    if (localBitmap != null)
    {
      this.wRo.setImageBitmap(localBitmap);
      this.wRv = true;
    }
    GMTrace.o(1733019303936L, 12912);
  }
  
  protected final void MP()
  {
    GMTrace.i(1732885086208L, 12911);
    this.wRk = ((TextView)findViewById(R.h.bqV));
    this.wRl = ((TextView)findViewById(R.h.bqT));
    this.wRo = ((ImageView)findViewById(R.h.bYp));
    this.wRO = findViewById(R.h.bru);
    this.wRP = findViewById(R.h.brv);
    oM(R.l.djX);
    this.wRo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1812610416640L, 13505);
        if (!ContactRemarkInfoViewUI.a(ContactRemarkInfoViewUI.this))
        {
          GMTrace.o(1812610416640L, 13505);
          return;
        }
        paramAnonymousView = new Intent(ContactRemarkInfoViewUI.this, ContactRemarkImagePreviewUI.class);
        paramAnonymousView.putExtra("Contact_User", ContactRemarkInfoViewUI.b(ContactRemarkInfoViewUI.this));
        com.tencent.mm.ay.c.Kn();
        paramAnonymousView.putExtra("remark_image_path", com.tencent.mm.ay.c.kF(ContactRemarkInfoViewUI.b(ContactRemarkInfoViewUI.this)));
        paramAnonymousView.putExtra("view_only", true);
        ContactRemarkInfoViewUI.this.startActivity(paramAnonymousView);
        GMTrace.o(1812610416640L, 13505);
      }
    });
    a(0, getString(R.l.cSC), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1731006038016L, 12897);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.setClass(ContactRemarkInfoViewUI.this.vKB.vKW, ContactRemarkInfoModUI.class);
        paramAnonymousMenuItem.putExtra("Contact_Scene", ContactRemarkInfoViewUI.c(ContactRemarkInfoViewUI.this));
        paramAnonymousMenuItem.putExtra("Contact_User", ContactRemarkInfoViewUI.d(ContactRemarkInfoViewUI.this).field_username);
        ContactRemarkInfoViewUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(1731006038016L, 12897);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1763218292736L, 13137);
        ContactRemarkInfoViewUI.this.finish();
        GMTrace.o(1763218292736L, 13137);
        return true;
      }
    });
    GMTrace.o(1732885086208L, 12911);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1732616650752L, 12909);
    int i = R.i.ctV;
    GMTrace.o(1732616650752L, 12909);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1732213997568L, 12906);
    super.onCreate(paramBundle);
    this.nLz = getIntent().getIntExtra("Contact_Scene", 9);
    this.username = getIntent().getStringExtra("Contact_User");
    if (t.nm(this.username))
    {
      finish();
      GMTrace.o(1732213997568L, 12906);
      return;
    }
    PY();
    MP();
    GMTrace.o(1732213997568L, 12906);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1732482433024L, 12908);
    super.onDestroy();
    GMTrace.o(1732482433024L, 12908);
  }
  
  public void onResume()
  {
    GMTrace.i(1732348215296L, 12907);
    super.onResume();
    PY();
    this.wRk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, t.nl(this.aDo), this.wRk.getTextSize()));
    if (!t.nm(this.fjt))
    {
      this.wRO.setVisibility(0);
      this.wRl.setText(t.nl(this.fjt));
    }
    while (!t.nm(this.gQT))
    {
      this.wRP.setVisibility(0);
      com.tencent.mm.ay.c.Kn();
      if (!com.tencent.mm.ay.c.kG(this.username))
      {
        com.tencent.mm.ay.c.Kn().a(this.username, this.gQT, new c.a()
        {
          public final void by(final boolean paramAnonymousBoolean)
          {
            GMTrace.i(1740535496704L, 12968);
            ContactRemarkInfoViewUI.f(ContactRemarkInfoViewUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(1745635770368L, 13006);
                if (!paramAnonymousBoolean)
                {
                  com.tencent.mm.ui.base.h.bm(ContactRemarkInfoViewUI.this, ContactRemarkInfoViewUI.this.getString(R.l.cSM));
                  GMTrace.o(1745635770368L, 13006);
                  return;
                }
                ContactRemarkInfoViewUI.e(ContactRemarkInfoViewUI.this);
                GMTrace.o(1745635770368L, 13006);
              }
            });
            GMTrace.o(1740535496704L, 12968);
          }
        });
        GMTrace.o(1732348215296L, 12907);
        return;
        this.wRO.setVisibility(8);
      }
      else
      {
        cgn();
        GMTrace.o(1732348215296L, 12907);
        return;
      }
    }
    this.wRP.setVisibility(8);
    GMTrace.o(1732348215296L, 12907);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\ContactRemarkInfoViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */