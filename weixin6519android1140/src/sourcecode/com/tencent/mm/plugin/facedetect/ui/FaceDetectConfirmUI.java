package com.tencent.mm.plugin.facedetect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.b.l;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.protocal.c.akx;
import com.tencent.mm.protocal.c.auq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.List;

@a(3)
public class FaceDetectConfirmUI
  extends MMActivity
  implements e
{
  private String appId;
  private int gRj;
  private r hsU;
  private String ijm;
  private String kRS;
  private TextView kVk;
  private TextView kVl;
  private TextView kVm;
  private Button kVn;
  private List<akx> kVo;
  private auq kVp;
  private String kVq;
  
  public FaceDetectConfirmUI()
  {
    GMTrace.i(5891889823744L, 43898);
    this.kVo = new ArrayList();
    this.kVp = null;
    this.kRS = null;
    GMTrace.o(5891889823744L, 43898);
  }
  
  private void awO()
  {
    GMTrace.i(5893366218752L, 43909);
    Intent localIntent = new Intent();
    localIntent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k.nr(90024));
    localIntent.putExtra("err_msg", "user cancel in confirm ui");
    FaceDetectReporter.aws().a(this.gRj, false, 3, 1, 90024);
    FaceDetectReporter.aws().kTA = System.currentTimeMillis();
    FaceDetectReporter.aws().aU(this.kVq, this.gRj);
    setResult(0, localIntent);
    finish();
    GMTrace.o(5893366218752L, 43909);
  }
  
  private void dismissDialog()
  {
    GMTrace.i(5892426694656L, 43902);
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    GMTrace.o(5892426694656L, 43902);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5892963565568L, 43906);
    w.i("MicroMsg.FaceDetectConfirmUI", "alvinluo scene: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.kVo = ((l)paramk).kRQ;
      this.kVp = ((l)paramk).kRR;
      this.kRS = ((l)paramk).kRS;
      if (bg.nm(this.kRS)) {
        this.kRS = getString(a.h.kQy);
      }
      dismissDialog();
      this.kVn.setEnabled(true);
      this.kVk.setText(this.kRS);
      w.i("MicroMsg.FaceDetectConfirmUI", "alvinluo refreshView");
      if (this.kVp != null)
      {
        if (!bg.nm(this.kVp.eLQ))
        {
          w.v("MicroMsg.FaceDetectConfirmUI", "alvinluo provider wording: %s", new Object[] { this.kVp.eLQ });
          this.kVl.setVisibility(0);
          this.kVl.setText(this.kVp.eLQ);
        }
        if (!bg.nm(this.kVp.uKc))
        {
          w.v("MicroMsg.FaceDetectConfirmUI", "alvinluo protocal url wording: %s", new Object[] { this.kVp.uKc });
          this.kVm.setVisibility(0);
          this.kVm.setText(this.kVp.uKc);
          if (!bg.nm(this.kVp.url))
          {
            w.v("MicroMsg.FaceDetectConfirmUI", "alvinluo protocal url: %s", new Object[] { this.kVp.url });
            paramString = this.kVp.url;
            this.kVm.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(5900345540608L, 43961);
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", paramString);
                paramAnonymousView.putExtra("showShare", false);
                paramAnonymousView.putExtra("geta8key_username", q.zE());
                d.b(FaceDetectConfirmUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                GMTrace.o(5900345540608L, 43961);
              }
            });
          }
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.wS().b(1147, this);
      GMTrace.o(5892963565568L, 43906);
      return;
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = getString(a.h.kQJ);
      }
      dismissDialog();
      com.tencent.mm.ui.base.h.a(this, paramk, getString(a.h.cUG), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5898600710144L, 43948);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k.nr(90022));
          paramAnonymousDialogInterface.putExtra("err_msg", "get confirm info error");
          FaceDetectReporter.aws().a(FaceDetectConfirmUI.b(FaceDetectConfirmUI.this), false, 3, 2, 90022);
          FaceDetectReporter.aws().kTA = System.currentTimeMillis();
          FaceDetectReporter.aws().aU(FaceDetectConfirmUI.c(FaceDetectConfirmUI.this), FaceDetectConfirmUI.b(FaceDetectConfirmUI.this));
          FaceDetectConfirmUI.a(FaceDetectConfirmUI.this, paramAnonymousDialogInterface);
          FaceDetectConfirmUI.this.finish();
          GMTrace.o(5898600710144L, 43948);
        }
      });
    }
  }
  
  public void finish()
  {
    GMTrace.i(5892292476928L, 43901);
    dismissDialog();
    super.finish();
    GMTrace.o(5892292476928L, 43901);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5892024041472L, 43899);
    int i = a.g.kQl;
    GMTrace.o(5892024041472L, 43899);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5893097783296L, 43907);
    w.i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    FaceDetectReporter.aws().kTA = System.currentTimeMillis();
    FaceDetectReporter.aws().aU(this.kVq, this.gRj);
    setResult(paramInt2, paramIntent);
    finish();
    GMTrace.o(5893097783296L, 43907);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(5892695130112L, 43904);
    awO();
    super.onBackPressed();
    GMTrace.o(5892695130112L, 43904);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5892158259200L, 43900);
    super.onCreate(paramBundle);
    this.appId = getIntent().getStringExtra("k_app_id");
    this.ijm = getIntent().getStringExtra("request_verify_pre_info");
    this.kVq = getIntent().getStringExtra("key_function_name");
    this.gRj = getIntent().getIntExtra("key_business_type", -1);
    sq(getString(a.h.kQz));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5890681864192L, 43889);
        w.i("MicroMsg.FaceDetectConfirmUI", "alvinluo cancel with back button");
        FaceDetectConfirmUI.a(FaceDetectConfirmUI.this);
        GMTrace.o(5890681864192L, 43889);
        return false;
      }
    });
    this.kVk = ((TextView)findViewById(a.e.kPE));
    this.kVl = ((TextView)findViewById(a.e.kPO));
    this.kVm = ((TextView)findViewById(a.e.kPN));
    this.kVn = ((Button)findViewById(a.e.kQg));
    this.kVn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5894842613760L, 43920);
        paramAnonymousView = new Intent(FaceDetectConfirmUI.this, FaceDetectPrepareUI.class);
        paramAnonymousView.putExtras(FaceDetectConfirmUI.this.getIntent().getExtras());
        FaceDetectConfirmUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(5894842613760L, 43920);
      }
    });
    w.i("MicroMsg.FaceDetectConfirmUI", "alvinluo start get confirm info");
    paramBundle = this.vKB.vKW;
    getString(a.h.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(paramBundle, getString(a.h.cUV), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5900077105152L, 43959);
        GMTrace.o(5900077105152L, 43959);
      }
    });
    paramBundle = new l(this.appId, this.ijm);
    com.tencent.mm.kernel.h.wS().a(1147, this);
    com.tencent.mm.kernel.h.wS().a(paramBundle, 0);
    GMTrace.o(5892158259200L, 43900);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\FaceDetectConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */