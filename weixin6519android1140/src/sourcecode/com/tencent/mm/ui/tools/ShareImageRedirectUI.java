package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.transmit.ShareImageSelectorUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class ShareImageRedirectUI
  extends MMBaseActivity
{
  private String imagePath;
  
  public ShareImageRedirectUI()
  {
    GMTrace.i(1965752844288L, 14646);
    GMTrace.o(1965752844288L, 14646);
  }
  
  private void ahJ()
  {
    GMTrace.i(1966021279744L, 14648);
    k.c(this, e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 0);
    getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1913005277184L, 14253);
        Toast.makeText(ShareImageRedirectUI.this, R.l.ecJ, 1).show();
        ShareImageRedirectUI.this.finish();
        GMTrace.o(1913005277184L, 14253);
        return false;
      }
    });
    GMTrace.o(1966021279744L, 14648);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    GMTrace.i(1966289715200L, 14650);
    getWindow().getDecorView().setOnTouchListener(null);
    if (paramInt2 != -1)
    {
      finish();
      GMTrace.o(1966289715200L, 14650);
      return;
    }
    switch (paramInt1)
    {
    case 1: 
    default: 
      GMTrace.o(1966289715200L, 14650);
      return;
    case 0: 
      localObject = getApplicationContext();
      at.AR();
      this.imagePath = k.b((Context)localObject, paramIntent, c.yU());
      if (this.imagePath == null)
      {
        GMTrace.o(1966289715200L, 14650);
        return;
      }
      paramIntent = new Intent(this, ShareImageSelectorUI.class);
      paramIntent.putExtra("intent_extra_image_path", this.imagePath);
      startActivityForResult(paramIntent, 2);
      GMTrace.o(1966289715200L, 14650);
      return;
    }
    if (paramIntent != null) {
      localObject = paramIntent.getStringArrayListExtra("Select_Contact");
    }
    if ((localObject != null) && (((ArrayList)localObject).size() == 1))
    {
      paramIntent = new Intent(this, En_5b8fbb1e.class);
      paramIntent.putExtra("Chat_User", (String)((ArrayList)localObject).get(0));
      startActivity(paramIntent);
      finish();
      GMTrace.o(1966289715200L, 14650);
      return;
    }
    if ((localObject != null) && (((ArrayList)localObject).size() > 1))
    {
      finish();
      GMTrace.o(1966289715200L, 14650);
      return;
    }
    paramIntent = new Intent();
    paramIntent.putExtra("Ksnsupload_type", 0);
    paramIntent.putExtra("sns_kemdia_path", this.imagePath);
    d.b(this, "sns", ".ui.En_c4f742e5", paramIntent);
    finish();
    GMTrace.o(1966289715200L, 14650);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1965887062016L, 14647);
    super.onCreate(paramBundle);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 16, "", "");
    w.i("MicroMsg.ShareImageRedirectUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(1965887062016L, 14647);
      return;
    }
    ahJ();
    GMTrace.o(1965887062016L, 14647);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(1966155497472L, 14649);
    w.i("MicroMsg.ShareImageRedirectUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1966155497472L, 14649);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(1966155497472L, 14649);
        return;
      }
      h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1946157056000L, 14500);
          ShareImageRedirectUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          ShareImageRedirectUI.this.finish();
          GMTrace.o(1946157056000L, 14500);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1953136377856L, 14552);
          ShareImageRedirectUI.this.finish();
          GMTrace.o(1953136377856L, 14552);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ShareImageRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */