package com.tencent.mm.plugin.recharge.ui;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.abg;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RechargeUI
  extends MMActivity
  implements com.tencent.mm.ad.e, j.a, MallEditText.b
{
  protected Dialog hul;
  private Button kES;
  private boolean nJA;
  private com.tencent.mm.sdk.b.c nJD;
  private MallEditText ofA;
  private TextView ofB;
  private int ofC;
  private MallRechargeProduct ofD;
  private String ofE;
  private MallNews ofF;
  private boolean ofG;
  private boolean ofH;
  private Map<String, Integer> ofI;
  private String ofJ;
  public String ofK;
  private String ofL;
  public String ofM;
  private MallFunction ofa;
  private TextView ofq;
  private TextView ofr;
  private TextView ofs;
  private TextView oft;
  private FrameLayout ofu;
  private ImageView ofv;
  private ImageView ofw;
  private LinearLayout ofx;
  private a ofy;
  private a ofz;
  
  public RechargeUI()
  {
    GMTrace.i(7901397647360L, 58870);
    this.kES = null;
    this.ofq = null;
    this.ofr = null;
    this.ofs = null;
    this.oft = null;
    this.ofu = null;
    this.ofv = null;
    this.ofw = null;
    this.ofx = null;
    this.ofy = null;
    this.ofz = null;
    this.hul = null;
    this.ofa = null;
    this.ofD = null;
    this.ofE = null;
    this.ofF = null;
    this.nJA = false;
    this.ofG = false;
    this.ofH = true;
    this.ofI = new HashMap();
    this.nJD = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7901397647360L, 58870);
  }
  
  private boolean QS()
  {
    GMTrace.i(7902337171456L, 58877);
    MallEditText localMallEditText = this.ofA;
    if (localMallEditText.getVisibility() == 0) {
      if (bg.nm(localMallEditText.getText()))
      {
        w.d("MicroMsg.MallEditText", "View:" + localMallEditText.hvm + ", editType:" + localMallEditText.hvn + " checkInputValid : empty ");
        i = 0;
        if (i != 0) {
          break label323;
        }
      }
    }
    label323:
    for (int i = 0;; i = 1)
    {
      if ((i != 0) && (this.ofD != null) && (this.ofD.isValid()))
      {
        if ((baw()) && (this.ofD.odP)) {
          n(new com.tencent.mm.plugin.recharge.model.d(this.ofD.odO, this.ofa.odH, this.ofD.eEa, this.ofD.appId, bau(), bav()));
        }
        aLo();
        this.kES.setEnabled(true);
        this.kES.setClickable(true);
        w.d("MicroMsg.MallRechargeUI", "checkInfo : true");
        GMTrace.o(7902337171456L, 58877);
        return true;
        if (!localMallEditText.hvr)
        {
          w.d("MicroMsg.MallEditText", "View:" + localMallEditText.hvm + ", editType:" + localMallEditText.hvn + " checkInputValid : illegal ");
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if ((!this.ofG) && (i == 0) && (this.ofD != null)) {
        this.ofD.isValid();
      }
      this.kES.setEnabled(false);
      this.kES.setClickable(false);
      w.d("MicroMsg.MallRechargeUI", "checkInfo : false");
      GMTrace.o(7902337171456L, 58877);
      return false;
    }
  }
  
  private void ar()
  {
    GMTrace.i(7901934518272L, 58874);
    w.d("MicroMsg.MallRechargeUI", "mCheckedProduct " + this.ofD);
    Object localObject;
    if (this.ofD != null)
    {
      this.ofB.setText(this.ofD.kry);
      TextView localTextView = this.ofs;
      localObject = this.ofD;
      if (!((MallRechargeProduct)localObject).isValid())
      {
        localObject = getString(a.i.sWk);
        localTextView.setText((CharSequence)localObject);
      }
    }
    else
    {
      if ((this.ofF == null) || (this.ofa.rjL == null) || (!this.ofF.equals(this.ofa.rjL)) || ("1".equals(this.ofF.rjR))) {
        break label394;
      }
      this.ofu.setVisibility(8);
      w.d("MicroMsg.MallRechargeUI", "dismiss banner!, news->" + this.ofF.toString());
      label174:
      this.ofr.setVisibility(4);
      if (!QS()) {
        break label498;
      }
      if ((this.ofD != null) && (!baw()))
      {
        this.ofq.setText(this.ofD.odI);
        this.ofq.setTextColor(getResources().getColor(a.c.aOa));
      }
      label234:
      localObject = getString(a.i.sWe);
      if (!TextUtils.isEmpty(this.ofK)) {
        localObject = this.ofK;
      }
      if (!bg.nm(this.ofJ)) {
        a(0, (String)localObject, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(7860461240320L, 58565);
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("rawUrl", RechargeUI.j(RechargeUI.this));
            com.tencent.mm.bj.d.b(RechargeUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
            GMTrace.o(7860461240320L, 58565);
            return true;
          }
        });
      }
      if (bg.nm(this.ofL)) {
        break label511;
      }
      this.oft.setVisibility(0);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.ofM)) {
        this.oft.setText(this.ofM);
      }
      GMTrace.o(7901934518272L, 58874);
      return;
      if ((((MallRechargeProduct)localObject).odJ != ((MallRechargeProduct)localObject).odK) || ((baw()) && (this.ofD.odP)))
      {
        localObject = "";
        break;
      }
      localObject = String.format(getString(a.i.sWm), new Object[] { Float.valueOf(((MallRechargeProduct)localObject).odJ) });
      break;
      label394:
      if ((this.ofa.rjL != null) && (!bg.nm(this.ofa.rjL.rjW)))
      {
        this.ofE = this.ofa.rjL.rjW;
        localObject = j.a(new com.tencent.mm.plugin.recharge.b.a(this.ofE));
        this.ofv.setImageBitmap((Bitmap)localObject);
        this.ofu.setVisibility(0);
        w.d("MicroMsg.MallRechargeUI", "Show banner!");
        break label174;
      }
      this.ofu.setVisibility(8);
      w.d("MicroMsg.MallRechargeUI", "dismiss banner!");
      break label174;
      label498:
      this.ofq.setText("");
      break label234;
      label511:
      this.oft.setVisibility(8);
    }
  }
  
  private String bau()
  {
    GMTrace.i(7902471389184L, 58878);
    String str = "mobile=" + com.tencent.mm.plugin.recharge.model.b.Fp(this.ofA.getText());
    GMTrace.o(7902471389184L, 58878);
    return str;
  }
  
  private String bav()
  {
    GMTrace.i(7902605606912L, 58879);
    String str = com.tencent.mm.plugin.recharge.model.b.Fp(this.ofA.getText());
    GMTrace.o(7902605606912L, 58879);
    return str;
  }
  
  private boolean baw()
  {
    GMTrace.i(7902874042368L, 58881);
    String str = n(this.ofD.odO, this.ofD.eEa, bav());
    if (!this.ofI.containsKey(str))
    {
      GMTrace.o(7902874042368L, 58881);
      return true;
    }
    GMTrace.o(7902874042368L, 58881);
    return false;
  }
  
  private void bk(List<MallRechargeProduct> paramList)
  {
    GMTrace.i(7903679348736L, 58887);
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int k = 0;
      int j;
      for (int i = 0; k < paramList.size(); i = j)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(k);
        j = i;
        if (localMallRechargeProduct.odO == 2)
        {
          j = i;
          if (this.ofD != null)
          {
            j = i;
            if (localMallRechargeProduct.eEa.equals(this.ofD.eEa))
            {
              localMallRechargeProduct.isDefault = true;
              j = 1;
            }
          }
          localArrayList.add(localMallRechargeProduct);
        }
        k += 1;
      }
      if ((i == 0) && (localArrayList.size() > 0)) {
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
      }
      this.ofz.bl(localArrayList);
      GMTrace.o(7903679348736L, 58887);
      return;
    }
    this.ofz.bl(new ArrayList());
    GMTrace.o(7903679348736L, 58887);
  }
  
  private static List<MallRechargeProduct> c(int paramInt, List<MallRechargeProduct> paramList)
  {
    GMTrace.i(7902068736000L, 58875);
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      int i = 0;
      int k;
      for (int j = 0; i < paramList.size(); j = k)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(i);
        k = j;
        if (localMallRechargeProduct.odO == paramInt)
        {
          localArrayList.add(localMallRechargeProduct);
          k = j;
          if (localMallRechargeProduct.isDefault)
          {
            if (j != 0) {
              localMallRechargeProduct.isDefault = false;
            }
            k = 1;
          }
        }
        i += 1;
      }
      if ((j == 0) && (localArrayList.size() > 0)) {
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
      }
    }
    GMTrace.o(7902068736000L, 58875);
    return localArrayList;
  }
  
  private static String n(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(7902739824640L, 58880);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    GMTrace.o(7902739824640L, 58880);
    return paramString1;
  }
  
  private void n(final k paramk)
  {
    GMTrace.i(7902202953728L, 58876);
    if ((paramk.getType() == 497) || (paramk.getType() == 1555))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
      GMTrace.o(7902202953728L, 58876);
      return;
    }
    if (!this.ofH)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
      GMTrace.o(7902202953728L, 58876);
      return;
    }
    if ((this.hul == null) || ((this.hul != null) && (!this.hul.isShowing()))) {
      this.hul = com.tencent.mm.wallet_core.ui.g.a(this.vKB.vKW, true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7880862334976L, 58717);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.c(paramk);
          GMTrace.o(7880862334976L, 58717);
        }
      });
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(paramk, 0);
    GMTrace.o(7902202953728L, 58876);
  }
  
  protected final void MP()
  {
    GMTrace.i(7901800300544L, 58873);
    sq(this.ofa.eVy);
    w.v("MicroMsg.MallRechargeUI", "initView");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7895223631872L, 58824);
        RechargeUI.this.aLo();
        RechargeUI.this.finish();
        GMTrace.o(7895223631872L, 58824);
        return true;
      }
    });
    this.ofq = ((TextView)findViewById(a.f.sBt));
    this.ofr = ((TextView)findViewById(a.f.sCo));
    this.ofs = ((TextView)findViewById(a.f.sCq));
    this.kES = ((Button)findViewById(a.f.bQR));
    this.ofx = ((LinearLayout)findViewById(a.f.sAW));
    this.oft = ((TextView)findViewById(a.f.sCp));
    this.oft.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7886499479552L, 58759);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", RechargeUI.a(RechargeUI.this));
        com.tencent.mm.bj.d.b(RechargeUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7886499479552L, 58759);
      }
    });
    this.kES.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7894955196416L, 58822);
        if ((RechargeUI.b(RechargeUI.this)) && (RechargeUI.c(RechargeUI.this))) {
          RechargeUI.d(RechargeUI.this);
        }
        GMTrace.o(7894955196416L, 58822);
      }
    });
    this.ofA = ((MallEditText)findViewById(a.f.sAZ));
    Object localObject1 = this.ofA;
    Object localObject2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7892270841856L, 58802);
        if (RechargeUI.e(RechargeUI.this).oen)
        {
          RechargeUI.e(RechargeUI.this).b(null);
          GMTrace.o(7892270841856L, 58802);
          return;
        }
        paramAnonymousView = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        RechargeUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(7892270841856L, 58802);
      }
    };
    ((MallEditText)localObject1).hvk.setOnClickListener((View.OnClickListener)localObject2);
    this.ofB = ((TextView)findViewById(a.f.sBy));
    localObject2 = getIntent().getParcelableArrayListExtra("key_product_list");
    localObject1 = c(0, (List)localObject2);
    localObject2 = c(2, (List)localObject2);
    if (((List)localObject1).size() > ((List)localObject2).size()) {}
    for (int i = ((List)localObject1).size();; i = ((List)localObject2).size())
    {
      this.ofC = i;
      this.ofy = new a((byte)0);
      this.ofy.bl((List)localObject1);
      this.ofz = new a((byte)0);
      this.ofz.bl((List)localObject2);
      this.ofx.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7885962608640L, 58755);
          if (((RechargeUI.f(RechargeUI.this) != null) && (RechargeUI.f(RechargeUI.this).getCount() > 0)) || ((RechargeUI.g(RechargeUI.this) != null) && (RechargeUI.g(RechargeUI.this).getCount() > 0))) {
            RechargeUI.this.showDialog(1);
          }
          GMTrace.o(7885962608640L, 58755);
        }
      });
      this.ofu = ((FrameLayout)findViewById(a.f.sCl));
      this.ofv = ((ImageView)findViewById(a.f.sCn));
      this.ofw = ((ImageView)findViewById(a.f.sCm));
      this.ofw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7879251722240L, 58705);
          paramAnonymousView = com.tencent.mm.plugin.wallet_core.model.mall.c.bzi();
          Object localObject = RechargeUI.h(RechargeUI.this).odH;
          w.d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : " + (String)localObject);
          if ((!bg.nm((String)localObject)) && (paramAnonymousView.rkd.containsKey(localObject)))
          {
            localObject = (MallNews)paramAnonymousView.rkd.get(localObject);
            if ("1".equals(((MallNews)localObject).rjR))
            {
              ((MallNews)localObject).rjR = "2";
              paramAnonymousView.aXr();
            }
          }
          RechargeUI.i(RechargeUI.this).setVisibility(8);
          GMTrace.o(7879251722240L, 58705);
        }
      });
      this.ofu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7859655933952L, 58559);
          if (!bg.nm(RechargeUI.h(RechargeUI.this).rjL.rjV))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", RechargeUI.h(RechargeUI.this).rjL.rjV);
            paramAnonymousView.putExtra("geta8key_username", q.zE());
            com.tencent.mm.bj.d.b(RechargeUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          }
          GMTrace.o(7859655933952L, 58559);
        }
      });
      this.ofA.oel = this;
      this.ofA.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7881399205888L, 58721);
          RechargeUI.e(RechargeUI.this).oem.findFocus();
          if (RechargeUI.e(RechargeUI.this).bao().eDi == 2) {
            RechargeUI.e(RechargeUI.this).b(null);
          }
          if (bg.nm(RechargeUI.e(RechargeUI.this).getText().toString())) {
            RechargeUI.e(RechargeUI.this).oem.showDropDown();
          }
          RechargeUI.this.aLs();
          GMTrace.o(7881399205888L, 58721);
        }
      });
      bap();
      j.a(this);
      ar();
      GMTrace.o(7901800300544L, 58873);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7903276695552L, 58884);
    w.d("MicroMsg.MallRechargeUI", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.hul != null) && (this.hul.isShowing()) && (paramk.getType() != 497))
    {
      this.hul.dismiss();
      this.hul = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.e))
      {
        paramk = (com.tencent.mm.plugin.recharge.model.e)paramk;
        paramString = paramk.odU;
        if (paramString != null)
        {
          this.ofD = a.bj(paramString);
          w.d("MicroMsg.MallRechargeUI", "mCheckedProduct again" + this.ofD);
        }
        this.ofJ = paramk.odV;
        this.ofK = paramk.odW;
        this.ofL = paramk.odX;
        this.ofM = paramk.odY;
        w.d("MicroMsg.MallRechargeUI", "mProductList " + paramString);
        ar();
        paramk = c(0, paramString);
        paramString = c(2, paramString);
        if (paramk.size() > paramString.size()) {}
        for (paramInt1 = paramk.size();; paramInt1 = paramString.size())
        {
          this.ofC = paramInt1;
          this.ofy.bl(paramk);
          this.ofz.bl(paramString);
          GMTrace.o(7903276695552L, 58884);
          return;
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.d))
      {
        w.d("MicroMsg.MallRechargeUI", "checkProduct: " + this.ofD);
        paramk = (com.tencent.mm.plugin.recharge.model.d)paramk;
        if ((this.ofD != null) && (this.ofD.eEa != null) && (paramk.odR != null) && (((this.ofD.eEa.equals(paramk.odR.eEa)) && (bav().equals(paramk.htr))) || (paramk.odO != 2)))
        {
          MallRechargeProduct.a(paramk.odR, this.ofD);
          this.ofD.isDefault = true;
          String str = n(paramk.odO, paramk.odR.eEa, paramk.htr);
          this.ofI.put(str, Integer.valueOf(1));
          ar();
          this.ofr.setText(paramString);
          this.ofr.setVisibility(0);
          this.ofr.setTextColor(getResources().getColor(a.c.sme));
        }
        if (paramk.odO == 2)
        {
          if ((this.ofD == null) || (!this.ofD.eEa.equals(paramk.odT)) || (!bav().equals(paramk.htr))) {
            break label741;
          }
          if ((((abg)paramk.fUa.gtD.gtK).umI == 0) && (this.ofD.eEa.equals(paramk.odR.eEa))) {
            break label698;
          }
          this.kES.setEnabled(false);
          this.kES.setClickable(false);
          this.ofr.setText(((abg)paramk.fUa.gtD.gtK).umJ);
          this.ofr.setVisibility(0);
          this.ofr.setTextColor(getResources().getColor(a.c.aOL));
        }
        for (;;)
        {
          bk(paramk.odS);
          w.d("MicroMsg.MallRechargeUI", "NetSceneGetLatestPayProductInfo  mCheckedProduct " + this.ofD);
          GMTrace.o(7903276695552L, 58884);
          return;
          label698:
          n(new com.tencent.mm.plugin.recharge.model.c(this.ofD.odH, bav(), this.ofD.kry, this.ofD.appId, bau()));
          continue;
          label741:
          this.kES.setEnabled(true);
          this.kES.setClickable(true);
          this.ofr.setText(null);
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.g))
      {
        paramString = ((com.tencent.mm.plugin.recharge.model.g)paramk).oek;
        paramString.ePL = 6;
        paramString.tIz = 100;
        com.tencent.mm.pluginsdk.wallet.g.a(this, paramString, 2);
        com.tencent.mm.sdk.b.a.vgX.b(this.nJD);
        GMTrace.o(7903276695552L, 58884);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.c))
      {
        paramString = (com.tencent.mm.plugin.recharge.model.c)paramk;
        if ((this.ofD != null) && (this.ofD.kry.equals(paramString.kry)) && (bav().equals(paramString.eMW)))
        {
          if (((uj)paramString.fUa.gtD.gtK).umI != 0)
          {
            this.kES.setEnabled(false);
            this.kES.setClickable(false);
            this.ofr.setText(((uj)paramString.fUa.gtD.gtK).umJ);
            this.ofr.setVisibility(0);
            this.ofr.setTextColor(getResources().getColor(a.c.aOL));
            GMTrace.o(7903276695552L, 58884);
          }
        }
        else
        {
          this.kES.setEnabled(true);
          this.kES.setClickable(true);
          this.ofr.setText(null);
        }
        GMTrace.o(7903276695552L, 58884);
      }
    }
    else if (!(paramk instanceof com.tencent.mm.plugin.recharge.model.c))
    {
      if ((paramk instanceof com.tencent.mm.plugin.recharge.model.d))
      {
        if (paramInt2 == 100)
        {
          this.kES.setEnabled(true);
          this.kES.setClickable(true);
        }
        for (;;)
        {
          bk(((com.tencent.mm.plugin.recharge.model.d)paramk).odS);
          this.ofr.setText(paramString);
          this.ofr.setVisibility(0);
          this.ofr.setTextColor(getResources().getColor(a.c.aOL));
          this.ofq.setText(((com.tencent.mm.plugin.recharge.model.d)paramk).odI);
          this.ofq.setTextColor(getResources().getColor(a.c.aOL));
          GMTrace.o(7903276695552L, 58884);
          return;
          this.kES.setEnabled(false);
          this.kES.setClickable(false);
        }
      }
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = getString(a.i.tgK);
      }
      com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7858850627584L, 58553);
          GMTrace.o(7858850627584L, 58553);
        }
      });
    }
    GMTrace.o(7903276695552L, 58884);
  }
  
  public final void aLo()
  {
    GMTrace.i(7904350437376L, 58892);
    w.d("MicroMsg.MallRechargeUI", "hideVKB");
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(7904350437376L, 58892);
      return;
    }
    Object localObject = getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(7904350437376L, 58892);
      return;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(7904350437376L, 58892);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
    GMTrace.o(7904350437376L, 58892);
  }
  
  public final void aLs()
  {
    GMTrace.i(7904216219648L, 58891);
    w.d("MicroMsg.MallRechargeUI", "showVKB");
    this.ofA.tc(a.e.aXB);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(7904216219648L, 58891);
      return;
    }
    View localView = getCurrentFocus();
    if (localView == null)
    {
      GMTrace.o(7904216219648L, 58891);
      return;
    }
    if (localView.getWindowToken() == null)
    {
      GMTrace.o(7904216219648L, 58891);
      return;
    }
    localInputMethodManager.showSoftInput(localView, 2);
    GMTrace.o(7904216219648L, 58891);
  }
  
  public final void bap()
  {
    GMTrace.i(7903142477824L, 58883);
    if ((bg.nm(this.ofA.getText())) || (this.ofA.QW()))
    {
      this.ofA.tc(a.e.soR);
      GMTrace.o(7903142477824L, 58883);
      return;
    }
    this.ofA.tc(a.e.aXB);
    GMTrace.o(7903142477824L, 58883);
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7903008260096L, 58882);
    if (!paramBoolean)
    {
      this.ofI.clear();
      this.ofq.setText("");
      this.ofr.setVisibility(4);
    }
    QS();
    GMTrace.o(7903008260096L, 58882);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7901531865088L, 58871);
    int i = a.g.sOt;
    GMTrace.o(7901531865088L, 58871);
    return i;
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(7904082001920L, 58890);
    if (this.ofE == null)
    {
      GMTrace.o(7904082001920L, 58890);
      return;
    }
    if (paramString.equals(this.ofE)) {
      this.ofv.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7889049616384L, 58778);
          RechargeUI.o(RechargeUI.this).setImageBitmap(paramBitmap);
          GMTrace.o(7889049616384L, 58778);
        }
      });
    }
    GMTrace.o(7904082001920L, 58890);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject4 = null;
    Object localObject3 = null;
    GMTrace.i(7903813566464L, 58888);
    Object localObject2;
    Cursor localCursor1;
    switch (paramInt1)
    {
    default: 
    case 1: 
      do
      {
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        GMTrace.o(7903813566464L, 58888);
        return;
      } while (paramInt2 != -1);
      localObject2 = paramIntent.getData();
      if (localObject2 == null)
      {
        w.e("MicroMsg.MallRechargeUI", "uri == null");
        GMTrace.o(7903813566464L, 58888);
        return;
      }
      if (!com.tencent.mm.pluginsdk.h.a.aS(this, "android.permission.READ_CONTACTS"))
      {
        w.e("MicroMsg.MallRechargeUI", "no contact permission");
        GMTrace.o(7903813566464L, 58888);
        return;
      }
      localCursor1 = getContentResolver().query((Uri)localObject2, null, null, null, null);
      if ((localCursor1 != null) && (localCursor1.getCount() > 0))
      {
        localCursor1.moveToFirst();
        int i = localCursor1.getColumnIndex("has_phone_number");
        if ((i <= 0) || (localCursor1.getInt(i) > 0))
        {
          localObject2 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          Cursor localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + (String)localObject2, null, null);
          if (localCursor2.moveToFirst())
          {
            localObject1 = null;
            for (;;)
            {
              localObject2 = localObject1;
              if (localCursor2.isAfterLast()) {
                break;
              }
              i = localCursor2.getColumnIndex("data1");
              int j = localCursor2.getColumnIndex("display_name");
              localObject2 = localCursor2.getString(i);
              localObject3 = localCursor2.getString(j);
              w.d("MicroMsg.MallRechargeUI", "username : " + (String)localObject3);
              if (localObject2 == null) {
                break label638;
              }
              w.d("MicroMsg.MallRechargeUI", "phoneNumber : " + (String)localObject2);
              localObject2 = com.tencent.mm.plugin.recharge.model.b.Fp((String)localObject2);
              w.d("MicroMsg.MallRechargeUI", "phoneNumber : " + (String)localObject2);
              if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject2)) {
                break label635;
              }
              localObject1 = localObject2;
              label409:
              w.d("MicroMsg.MallRechargeUI", "phoneResult : " + (String)localObject1);
              label433:
              localCursor2.moveToNext();
            }
          }
          localObject2 = null;
          localObject3 = localObject1;
          localObject1 = localObject2;
          localObject4 = localObject3;
          if (!localCursor2.isClosed())
          {
            localCursor2.close();
            localObject4 = localObject3;
          }
        }
      }
      break;
    }
    for (localObject1 = localObject2;; localObject1 = null)
    {
      if ((localCursor1 != null) && (!localCursor1.isClosed())) {
        localCursor1.close();
      }
      if (PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1))
      {
        this.ofI.clear();
        this.ofA.b(new com.tencent.mm.plugin.recharge.model.a((String)localObject1, (String)localObject4, 1));
        this.ofq.setText("");
        this.ofr.setVisibility(4);
        QS();
        break;
      }
      showDialog(2);
      break;
      if (paramInt2 == -1)
      {
        if (this.nJA) {
          break;
        }
        w.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
        com.tencent.mm.plugin.recharge.a.a.baj().a(this.ofA.bao());
        finish();
        this.nJA = true;
        break;
      }
      w.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
      break;
      label635:
      break label409;
      label638:
      break label433;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7901666082816L, 58872);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.ofa = ((MallFunction)paramBundle.getParcelableExtra("key_func_info"));
    ArrayList localArrayList = paramBundle.getParcelableArrayListExtra("key_product_list");
    if (!paramBundle.getBooleanExtra("key_is_hide_progress", false)) {}
    for (boolean bool = true;; bool = false)
    {
      this.ofH = bool;
      if (this.ofa != null) {
        break;
      }
      w.e("MicroMsg.MallRechargeUI", "function info is null");
      u.makeText(this, "function info is null", 1).show();
      GMTrace.o(7901666082816L, 58872);
      return;
    }
    if (localArrayList == null)
    {
      w.d("MicroMsg.MallRechargeUI", "function info : " + this.ofa.eVy);
      n(new com.tencent.mm.plugin.recharge.model.e(this.ofa.odH));
    }
    for (;;)
    {
      w.i("MicroMsg.MallRechargeUI", "onCreate()");
      this.ofF = com.tencent.mm.plugin.wallet_core.model.mall.c.bzi().Kn(this.ofa.odH);
      MP();
      GMTrace.o(7901666082816L, 58872);
      return;
      this.ofD = a.bj(localArrayList);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7903947784192L, 58889);
    com.tencent.mm.sdk.b.a.vgX.c(this.nJD);
    super.onDestroy();
    GMTrace.o(7903947784192L, 58889);
  }
  
  protected void onPause()
  {
    GMTrace.i(7903545131008L, 58886);
    super.onPause();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(496, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(497, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(498, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1555, this);
    GMTrace.o(7903545131008L, 58886);
  }
  
  protected void onResume()
  {
    GMTrace.i(7903410913280L, 58885);
    super.onResume();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(496, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(497, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(498, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(1555, this);
    GMTrace.o(7903410913280L, 58885);
  }
  
  private final class a
    extends BaseAdapter
  {
    private List<MallRechargeProduct> odS;
    
    private a()
    {
      GMTrace.i(7876030496768L, 58681);
      this.odS = null;
      GMTrace.o(7876030496768L, 58681);
    }
    
    public final void bl(List<MallRechargeProduct> paramList)
    {
      GMTrace.i(7876164714496L, 58682);
      this.odS = paramList;
      notifyDataSetChanged();
      GMTrace.o(7876164714496L, 58682);
    }
    
    public final int getCount()
    {
      GMTrace.i(7876433149952L, 58684);
      if (this.odS == null)
      {
        GMTrace.o(7876433149952L, 58684);
        return 0;
      }
      int i = this.odS.size();
      GMTrace.o(7876433149952L, 58684);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7876701585408L, 58686);
      long l = paramInt;
      GMTrace.o(7876701585408L, 58686);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7876970020864L, 58688);
      paramView = (CheckedTextView)View.inflate(RechargeUI.this, a.g.sOr, null);
      paramViewGroup = tg(paramInt);
      paramView.setText(paramViewGroup.kry);
      paramView.setEnabled(paramViewGroup.isValid());
      if (paramViewGroup.isDefault) {
        paramView.setChecked(true);
      }
      for (;;)
      {
        GMTrace.o(7876970020864L, 58688);
        return paramView;
        paramView.setChecked(false);
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(7876835803136L, 58687);
      if (!tg(paramInt).isValid())
      {
        GMTrace.o(7876835803136L, 58687);
        return false;
      }
      boolean bool = super.isEnabled(paramInt);
      GMTrace.o(7876835803136L, 58687);
      return bool;
    }
    
    public final void tf(int paramInt)
    {
      GMTrace.i(7876298932224L, 58683);
      int i = 0;
      while (i < this.odS.size())
      {
        ((MallRechargeProduct)this.odS.get(i)).isDefault = false;
        i += 1;
      }
      ((MallRechargeProduct)this.odS.get(paramInt)).isDefault = true;
      GMTrace.o(7876298932224L, 58683);
    }
    
    public final MallRechargeProduct tg(int paramInt)
    {
      GMTrace.i(7876567367680L, 58685);
      MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)this.odS.get(paramInt);
      GMTrace.o(7876567367680L, 58685);
      return localMallRechargeProduct;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\RechargeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */