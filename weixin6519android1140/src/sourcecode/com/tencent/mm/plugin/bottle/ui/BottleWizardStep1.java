package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class BottleWizardStep1
  extends MMActivity
{
  private ImageView jqF;
  
  public BottleWizardStep1()
  {
    GMTrace.i(7653497503744L, 57023);
    this.jqF = null;
    GMTrace.o(7653497503744L, 57023);
  }
  
  private void ahI()
  {
    GMTrace.i(7653900156928L, 57026);
    Bitmap localBitmap = b.a(x.Tt(q.zE()), false, -1);
    if (localBitmap == null) {
      localBitmap = b.a(q.zE(), false, -1);
    }
    for (;;)
    {
      this.jqF = ((ImageView)findViewById(R.h.bGL));
      if (localBitmap != null) {
        this.jqF.setImageBitmap(localBitmap);
      }
      GMTrace.o(7653900156928L, 57026);
      return;
    }
  }
  
  private void ahJ()
  {
    GMTrace.i(7654437027840L, 57030);
    if (!k.c(this, e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 3)) {
      Toast.makeText(this, getString(R.l.dWY), 1).show();
    }
    GMTrace.o(7654437027840L, 57030);
  }
  
  protected final void MP()
  {
    GMTrace.i(7654302810112L, 57029);
    oM(R.l.dba);
    ((LinearLayout)findViewById(R.h.bGM)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7602092113920L, 56640);
        BottleWizardStep1.a(BottleWizardStep1.this);
        GMTrace.o(7602092113920L, 56640);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7614708580352L, 56734);
        BottleWizardStep1.this.aLo();
        BottleWizardStep1.this.finish();
        GMTrace.o(7614708580352L, 56734);
        return true;
      }
    });
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7621956337664L, 56788);
        paramAnonymousMenuItem = new Intent().setClass(BottleWizardStep1.this, BottleWizardStep2.class);
        BottleWizardStep1.this.startActivity(paramAnonymousMenuItem);
        BottleWizardStep1.this.finish();
        GMTrace.o(7621956337664L, 56788);
        return true;
      }
    });
    GMTrace.o(7654302810112L, 57029);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7654168592384L, 57028);
    int i = R.i.cqx;
    GMTrace.o(7654168592384L, 57028);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7654705463296L, 57032);
    Object localObject1;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(7654705463296L, 57032);
      return;
    case 3: 
      localObject1 = getApplicationContext();
      at.AR();
      paramIntent = k.b((Context)localObject1, paramIntent, c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(7654705463296L, 57032);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 1);
      ((Intent)localObject1).putExtra("CropImage_OutputPath", paramIntent);
      ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
      com.tencent.mm.plugin.bottle.a.hnH.a(this, (Intent)localObject1, 4);
      GMTrace.o(7654705463296L, 57032);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(7654705463296L, 57032);
        return;
      }
      localObject1 = getApplicationContext();
      at.AR();
      Object localObject2 = k.b((Context)localObject1, paramIntent, c.yU());
      if (localObject2 == null)
      {
        GMTrace.o(7654705463296L, 57032);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 1);
      ((Intent)localObject1).putExtra("CropImage_ImgPath", (String)localObject2);
      localObject2 = new StringBuilder();
      n.Dh();
      ((Intent)localObject1).putExtra("CropImage_OutputPath", d.t(x.Tt(q.zE()), true) + ".crop");
      com.tencent.mm.plugin.bottle.a.hnH.a((Intent)localObject1, 4, this, paramIntent);
      GMTrace.o(7654705463296L, 57032);
      return;
    }
    if (paramIntent == null)
    {
      GMTrace.o(7654705463296L, 57032);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      w.e("MicroMsg.BottleWizardStep1", "crop picture failed");
      GMTrace.o(7654705463296L, 57032);
      return;
    }
    new o(this.vKB.vKW, paramIntent).b(2, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7623701168128L, 56801);
        BottleWizardStep1.c(BottleWizardStep1.this);
        GMTrace.o(7623701168128L, 56801);
      }
    });
    GMTrace.o(7654705463296L, 57032);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7653631721472L, 57024);
    super.onCreate(paramBundle);
    GMTrace.o(7653631721472L, 57024);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7653765939200L, 57025);
    super.onDestroy();
    GMTrace.o(7653765939200L, 57025);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7654571245568L, 57031);
    w.i("MicroMsg.BottleWizardStep1", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7654571245568L, 57031);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(7654571245568L, 57031);
        return;
      }
      h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7624506474496L, 56807);
          BottleWizardStep1.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(7624506474496L, 56807);
        }
      }, null);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(7654034374656L, 57027);
    super.onResume();
    MP();
    ahI();
    GMTrace.o(7654034374656L, 57027);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottleWizardStep1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */