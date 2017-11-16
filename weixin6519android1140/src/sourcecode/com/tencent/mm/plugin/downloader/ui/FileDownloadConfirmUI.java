package com.tencent.mm.plugin.downloader.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.b.b;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

public class FileDownloadConfirmUI
  extends MMBaseActivity
{
  private i hiJ;
  
  public FileDownloadConfirmUI()
  {
    GMTrace.i(18587947368448L, 138491);
    this.hiJ = null;
    GMTrace.o(18587947368448L, 138491);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18588081586176L, 138492);
    super.onCreate(paramBundle);
    setContentView(b.b.empty);
    paramBundle = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18587813150720L, 138490);
        f.apJ().bf(this.keH);
        w.i("MicroMsg.FileDownloadConfirmUI", "Remove task: %d", new Object[] { Long.valueOf(this.keH) });
        GMTrace.o(18587813150720L, 138490);
      }
    };
    DialogInterface.OnClickListener local2 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18588484239360L, 138495);
        GMTrace.o(18588484239360L, 138495);
      }
    };
    DialogInterface.OnDismissListener local3 = new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18588752674816L, 138497);
        FileDownloadConfirmUI.this.finish();
        GMTrace.o(18588752674816L, 138497);
      }
    };
    i.a locala = new i.a(this);
    locala.Vz("");
    locala.BO(b.c.kdV);
    locala.BQ(b.c.cUW).a(paramBundle);
    locala.BR(b.c.cTJ).b(local2);
    locala.a(local3);
    this.hiJ = locala.aax();
    this.hiJ.show();
    w.i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
    GMTrace.o(18588081586176L, 138492);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(20087159390208L, 149661);
    w.i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
    GMTrace.o(20087159390208L, 149661);
  }
  
  protected void onStop()
  {
    GMTrace.i(18588215803904L, 138493);
    super.onStop();
    this.hiJ.dismiss();
    GMTrace.o(18588215803904L, 138493);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\ui\FileDownloadConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */