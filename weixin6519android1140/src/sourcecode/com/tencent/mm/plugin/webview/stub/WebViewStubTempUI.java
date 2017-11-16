package com.tencent.mm.plugin.webview.stub;

import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.app.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class WebViewStubTempUI
  extends MMActivity
  implements a.a, MMActivity.a
{
  private int rHS;
  private boolean rHT;
  private Dialog rHU;
  
  public WebViewStubTempUI()
  {
    GMTrace.i(12447486312448L, 92741);
    this.rHS = 0;
    this.rHT = false;
    this.rHU = null;
    GMTrace.o(12447486312448L, 92741);
  }
  
  public static void a(Context paramContext, e parame, String paramString1, String paramString2, String paramString3, String paramString4, final DialogInterface.OnClickListener paramOnClickListener1, final DialogInterface.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(19479153082368L, 145131);
    Intent localIntent = new Intent(paramContext, WebViewStubTempUI.class);
    if ((paramContext instanceof Service)) {
      localIntent.addFlags(268435456);
    }
    localIntent.putExtra("key_action_code", 0);
    localIntent.putExtra("key_alert_cancelable", false);
    localIntent.putExtra("key_alert_message", paramString1);
    localIntent.putExtra("key_alert_title", paramString2);
    localIntent.putExtra("key_alert_yes", paramString3);
    localIntent.putExtra("key_alert_no", paramString4);
    localIntent.putExtra("key_alert_result_receiver", new ResultReceiver(ae.fetchFreeHandler())
    {
      protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(12465203052544L, 92873);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(12465203052544L, 92873);
          return;
          paramOnClickListener1.onClick(null, 0);
          GMTrace.o(12465203052544L, 92873);
          return;
          paramOnClickListener2.onClick(null, 0);
        }
      }
    });
    com.tencent.mm.plugin.webview.ui.tools.d.a(localIntent.getExtras(), "webview", ".stub.WebViewStubTempUI", parame, null);
    GMTrace.o(19479153082368L, 145131);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    GMTrace.i(12447620530176L, 92742);
    Intent localIntent = new Intent(paramContext, WebViewStubTempUI.class);
    if ((paramContext instanceof Service)) {
      localIntent.addFlags(268435456);
    }
    localIntent.putExtra("key_action_code", 2);
    StartActivityForResultTask localStartActivityForResultTask = new StartActivityForResultTask();
    localStartActivityForResultTask.oBB = paramString1;
    localStartActivityForResultTask.rHZ = paramString2;
    localStartActivityForResultTask.rIa = paramIntent;
    localStartActivityForResultTask.eLN = 15;
    localStartActivityForResultTask.rIb = false;
    localStartActivityForResultTask.rFJ = paramInt;
    localIntent.putExtra("key_activity_result_task", localStartActivityForResultTask);
    paramContext.startActivity(localIntent);
    GMTrace.o(12447620530176L, 92742);
  }
  
  public static boolean a(Context paramContext, e parame, String[] paramArrayOfString, int paramInt)
  {
    GMTrace.i(19479287300096L, 145132);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i <= 0)
    {
      String str = paramArrayOfString[0];
      if (android.support.v4.content.a.d(paramContext, str) != 0) {
        localArrayList.add(str);
      }
      i += 1;
    }
    if (localArrayList.size() == 0)
    {
      GMTrace.o(19479287300096L, 145132);
      return true;
    }
    paramContext = new Bundle();
    paramContext.putInt("key_action_code", 1);
    paramContext.putStringArray("key_permission_types", (String[])localArrayList.toArray(new String[localArrayList.size()]));
    paramContext.putInt("key_permission_request_code", 116);
    paramContext.putInt("key_binder_id", paramInt);
    com.tencent.mm.plugin.webview.ui.tools.d.a(paramContext, "webview", ".stub.WebViewStubTempUI", parame, null);
    GMTrace.o(19479287300096L, 145132);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12448425836544L, 92748);
    if (this.rHT)
    {
      g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(this.rHS);
      if (localg != null) {
        localg.a(paramInt1, paramInt2, paramIntent);
      }
    }
    finish();
    GMTrace.o(12448425836544L, 92748);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(12448560054272L, 92749);
    GMTrace.o(12448560054272L, 92749);
    return -1;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12448023183360L, 92745);
    super.onCreate(paramBundle);
    switch (getIntent().getIntExtra("key_action_code", -1))
    {
    default: 
      finish();
      GMTrace.o(12448023183360L, 92745);
      return;
    case 0: 
      paramBundle = (ResultReceiver)getIntent().getParcelableExtra("key_alert_result_receiver");
      if (paramBundle == null)
      {
        finish();
        GMTrace.o(12448023183360L, 92745);
        return;
      }
      this.rHU = com.tencent.mm.ui.base.h.a(this, getIntent().getBooleanExtra("key_alert_cancelable", false), getIntent().getStringExtra("key_alert_message"), getIntent().getStringExtra("key_alert_title"), getIntent().getStringExtra("key_alert_yes"), getIntent().getStringExtra("key_alert_no"), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12442788691968L, 92706);
          paramBundle.send(0, null);
          WebViewStubTempUI.this.finish();
          GMTrace.o(12442788691968L, 92706);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12421582290944L, 92548);
          paramBundle.send(1, null);
          WebViewStubTempUI.this.finish();
          GMTrace.o(12421582290944L, 92548);
        }
      });
      this.rHU.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(12429232701440L, 92605);
          WebViewStubTempUI.this.finish();
          GMTrace.o(12429232701440L, 92605);
        }
      });
      GMTrace.o(12448023183360L, 92745);
      return;
    case 1: 
      android.support.v4.app.a.a(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0));
      GMTrace.o(12448023183360L, 92745);
      return;
    }
    paramBundle = (StartActivityForResultTask)getIntent().getParcelableExtra("key_activity_result_task");
    this.rHS = paramBundle.rFJ;
    this.rHT = true;
    this.vKC = this;
    com.tencent.mm.bj.d.a(this, paramBundle.oBB, paramBundle.rHZ, paramBundle.rIa, paramBundle.eLN, paramBundle.rIb);
    GMTrace.o(12448023183360L, 92745);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12448157401088L, 92746);
    super.onDestroy();
    if (this.rHU != null) {
      this.rHU.dismiss();
    }
    GMTrace.o(12448157401088L, 92746);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12448291618816L, 92747);
    int i = getIntent().getIntExtra("key_binder_id", 0);
    switch (paramInt)
    {
    }
    for (;;)
    {
      finish();
      GMTrace.o(12448291618816L, 92747);
      return;
      if (paramArrayOfInt[0] == 0) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i).a(paramInt, -1, null);
      } else {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.yp(i).a(paramInt, 0, null);
      }
    }
  }
  
  private static final class StartActivityForResultTask
    implements Parcelable
  {
    public static final Parcelable.Creator<StartActivityForResultTask> CREATOR;
    int eLN;
    String oBB;
    int rFJ;
    String rHZ;
    Intent rIa;
    boolean rIb;
    
    static
    {
      GMTrace.i(12442520256512L, 92704);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(12442520256512L, 92704);
    }
    
    StartActivityForResultTask()
    {
      GMTrace.i(12442251821056L, 92702);
      GMTrace.o(12442251821056L, 92702);
    }
    
    StartActivityForResultTask(Parcel paramParcel)
    {
      GMTrace.i(12442386038784L, 92703);
      this.oBB = paramParcel.readString();
      this.rHZ = paramParcel.readString();
      this.rIa = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
      this.eLN = paramParcel.readInt();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.rIb = bool;
        this.rFJ = paramParcel.readInt();
        GMTrace.o(12442386038784L, 92703);
        return;
      }
    }
    
    public final int describeContents()
    {
      GMTrace.i(12441983385600L, 92700);
      GMTrace.o(12441983385600L, 92700);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(12442117603328L, 92701);
      paramParcel.writeString(this.oBB);
      paramParcel.writeString(this.rHZ);
      paramParcel.writeParcelable(this.rIa, paramInt);
      paramParcel.writeInt(this.eLN);
      if (this.rIb) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.rFJ);
        GMTrace.o(12442117603328L, 92701);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\WebViewStubTempUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */