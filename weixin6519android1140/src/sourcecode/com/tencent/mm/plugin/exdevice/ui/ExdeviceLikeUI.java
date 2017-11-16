package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.Map;
import junit.framework.Assert;

public class ExdeviceLikeUI
  extends MMActivity
{
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> kHq;
  private boolean kHr;
  private ListView kHs;
  private a kHt;
  private final int kHu;
  private String mAppName;
  
  public ExdeviceLikeUI()
  {
    GMTrace.i(11070143987712L, 82479);
    this.kHu = 30;
    GMTrace.o(11070143987712L, 82479);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11070412423168L, 82481);
    int i = R.i.cvK;
    GMTrace.o(11070412423168L, 82481);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11070278205440L, 82480);
    super.onCreate(paramBundle);
    this.mAppName = getIntent().getStringExtra("app_username");
    paramBundle = getIntent().getStringExtra("key_rank_info");
    Object localObject1 = getIntent().getStringExtra("key_rank_semi");
    this.kHr = getIntent().getBooleanExtra("key_is_like_read_only", false);
    if (!bg.nm(paramBundle))
    {
      String str = this.mAppName;
      w.d("MicroMsg.ExdeviceMsgXmlParser", paramBundle);
      if (bg.nm(paramBundle)) {
        w.e("MicroMsg.ExdeviceMsgXmlParser", "like info is null or nil");
      }
      Map localMap;
      do
      {
        do
        {
          paramBundle = null;
          this.kHq = paramBundle;
          this.kHs = ((ListView)findViewById(R.h.bxu));
          this.kHs.setEmptyView(findViewById(R.h.empty));
          this.kHt = new a();
          this.kHs.setAdapter(this.kHt);
          if (!this.kHr) {
            this.kHs.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
              public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
              {
                GMTrace.i(11007732744192L, 82014);
                paramAnonymousAdapterView = (com.tencent.mm.plugin.exdevice.f.b.a.e)ExdeviceLikeUI.b(ExdeviceLikeUI.this).getItem(paramAnonymousInt);
                paramAnonymousView = new Intent(ExdeviceLikeUI.this, ExdeviceRankInfoUI.class);
                paramAnonymousView.putExtra("app_username", paramAnonymousAdapterView.field_appusername);
                paramAnonymousView.putExtra("rank_id", paramAnonymousAdapterView.field_rankID);
                paramAnonymousView.putExtra("device_type", 1);
                ExdeviceLikeUI.this.startActivity(paramAnonymousView);
                ExdeviceLikeUI.this.finish();
                GMTrace.o(11007732744192L, 82014);
              }
            });
          }
          oM(R.l.drv);
          if (!this.kHr) {
            a(0, getString(R.l.drt), new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                GMTrace.i(11008269615104L, 82018);
                paramAnonymousMenuItem = new Intent(ExdeviceLikeUI.this, ExdeviceRankInfoUI.class);
                paramAnonymousMenuItem.putExtra("app_username", ExdeviceLikeUI.a(ExdeviceLikeUI.this));
                paramAnonymousMenuItem.putExtra("rank_id", "#");
                paramAnonymousMenuItem.putExtra("key_is_latest", true);
                paramAnonymousMenuItem.putExtra("device_type", 1);
                ExdeviceLikeUI.this.startActivity(paramAnonymousMenuItem);
                ExdeviceLikeUI.this.finish();
                GMTrace.o(11008269615104L, 82018);
                return false;
              }
            });
          }
          a(new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(11071888818176L, 82492);
              ExdeviceLikeUI.this.finish();
              GMTrace.o(11071888818176L, 82492);
              return false;
            }
          });
          GMTrace.o(11070278205440L, 82480);
          return;
          paramBundle = f.a.C(paramBundle, (String)localObject1);
        } while (paramBundle == null);
        localMap = paramBundle.git;
        localObject1 = new ArrayList();
      } while ((localMap == null) || (localMap.isEmpty()));
      int i = 0;
      Object localObject2 = new StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
      if (i == 0) {}
      for (paramBundle = "";; paramBundle = Integer.valueOf(i))
      {
        localObject2 = (String)localMap.get(paramBundle + ".username");
        if (!bg.nm((String)localObject2)) {
          break label356;
        }
        w.i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", new Object[] { Integer.valueOf(i) });
        paramBundle = (Bundle)localObject1;
        break;
      }
      label356:
      Object localObject3 = new StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
      label374:
      Object localObject4;
      label418:
      Object localObject5;
      if (i == 0)
      {
        paramBundle = "";
        localObject3 = (String)localMap.get(paramBundle + ".rankid");
        localObject4 = new StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
        if (i != 0) {
          break label557;
        }
        paramBundle = "";
        localObject4 = (String)localMap.get(paramBundle + ".liketip");
        localObject5 = new StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
        if (i != 0) {
          break label565;
        }
      }
      label557:
      label565:
      for (paramBundle = "";; paramBundle = Integer.valueOf(i))
      {
        paramBundle = (String)localMap.get(paramBundle + ".timestamp");
        localObject5 = new com.tencent.mm.plugin.exdevice.f.b.a.e();
        ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject5).field_appusername = str;
        ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject5).field_rankID = ((String)localObject3);
        ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject5).field_username = ((String)localObject2);
        ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject5).field_timestamp = bg.getInt(paramBundle, 0);
        ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject5).field_liketips = ((String)localObject4);
        ((ArrayList)localObject1).add(localObject5);
        i += 1;
        break;
        paramBundle = Integer.valueOf(i);
        break label374;
        paramBundle = Integer.valueOf(i);
        break label418;
      }
    }
    paramBundle = getIntent().getStringExtra("rank_id");
    if (!bg.nm(paramBundle)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.kHq = ad.atW().wQ(paramBundle);
      break;
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(11039005474816L, 82247);
      GMTrace.o(11039005474816L, 82247);
    }
    
    public final int getCount()
    {
      GMTrace.i(11039139692544L, 82248);
      if (ExdeviceLikeUI.c(ExdeviceLikeUI.this) == null)
      {
        GMTrace.o(11039139692544L, 82248);
        return 0;
      }
      int i = ExdeviceLikeUI.c(ExdeviceLikeUI.this).size();
      GMTrace.o(11039139692544L, 82248);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11039273910272L, 82249);
      Object localObject = ExdeviceLikeUI.c(ExdeviceLikeUI.this).get(paramInt);
      GMTrace.o(11039273910272L, 82249);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11039408128000L, 82250);
      long l = paramInt;
      GMTrace.o(11039408128000L, 82250);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11039542345728L, 82251);
      com.tencent.mm.plugin.exdevice.f.b.a.e locale = (com.tencent.mm.plugin.exdevice.f.b.a.e)ExdeviceLikeUI.c(ExdeviceLikeUI.this).get(paramInt);
      if (paramView == null) {
        if (ExdeviceLikeUI.d(ExdeviceLikeUI.this))
        {
          paramView = LayoutInflater.from(ExdeviceLikeUI.this).inflate(R.i.cvJ, paramViewGroup, false);
          paramViewGroup = new a();
          paramViewGroup.hqg = ((ImageView)paramView.findViewById(R.h.bxl));
          paramViewGroup.kHw = ((NoMeasuredTextView)paramView.findViewById(R.h.bxV));
          paramViewGroup.hvi = ((TextView)paramView.findViewById(R.h.bxO));
          paramViewGroup.kHx = ((TextView)paramView.findViewById(R.h.bxN));
          paramViewGroup.kHw.J(ExdeviceLikeUI.this.getResources().getDimension(R.f.aQF));
          paramViewGroup.kHw.setTextColor(ExdeviceLikeUI.this.getResources().getColor(R.e.black));
          paramViewGroup.kHw.cag();
          paramViewGroup.kHw.whw = true;
          paramView.setTag(paramViewGroup);
          label179:
          a.b.o(paramViewGroup.hqg, locale.field_username);
          paramViewGroup.kHw.setText(h.b(ExdeviceLikeUI.this, r.fs(locale.field_username), paramViewGroup.kHw.fB.getTextSize()));
          if ((bg.nm(locale.field_liketips)) || (paramViewGroup.hvi == null)) {
            break label357;
          }
          paramViewGroup.hvi.setVisibility(0);
          paramViewGroup.hvi.setText(locale.field_liketips);
          label261:
          paramInt = (int)((System.currentTimeMillis() / 1000L - locale.field_timestamp) / 60L + 1L);
          if (paramInt > 30) {
            break label376;
          }
          paramViewGroup.kHx.setText(ExdeviceLikeUI.this.getString(R.l.dru, new Object[] { Integer.valueOf(paramInt) }));
        }
      }
      for (;;)
      {
        GMTrace.o(11039542345728L, 82251);
        return paramView;
        paramView = LayoutInflater.from(ExdeviceLikeUI.this).inflate(R.i.cvI, paramViewGroup, false);
        break;
        paramViewGroup = (a)paramView.getTag();
        break label179;
        label357:
        if (paramViewGroup.hvi == null) {
          break label261;
        }
        paramViewGroup.hvi.setVisibility(8);
        break label261;
        label376:
        paramViewGroup.kHx.setText(n.c(ExdeviceLikeUI.this, locale.field_timestamp * 1000L, true));
      }
    }
    
    final class a
    {
      ImageView hqg;
      TextView hvi;
      NoMeasuredTextView kHw;
      TextView kHx;
      
      a()
      {
        GMTrace.i(11056587997184L, 82378);
        GMTrace.o(11056587997184L, 82378);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceLikeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */