package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
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
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.c;
import com.tencent.mm.af.m;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ContactSearchResultUI
  extends MMActivity
{
  private static ae gie;
  private LinkedList<bai> glr;
  private ListView quk;
  private b qul;
  private Map<String, c> qum;
  
  static
  {
    GMTrace.i(5783978770432L, 43094);
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(5783978770432L, 43094);
  }
  
  public ContactSearchResultUI()
  {
    GMTrace.i(5782770810880L, 43085);
    this.glr = new LinkedList();
    GMTrace.o(5782770810880L, 43085);
  }
  
  protected final void MP()
  {
    GMTrace.i(5783039246336L, 43087);
    oM(R.l.ctY);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5793508229120L, 43165);
        ContactSearchResultUI.this.finish();
        GMTrace.o(5793508229120L, 43165);
        return true;
      }
    });
    this.qum = new HashMap();
    this.quk = ((ListView)findViewById(R.h.bYA));
    Object localObject = (TextView)findViewById(R.h.empty);
    this.quk.setEmptyView((View)localObject);
    localObject = getIntent().getByteArrayExtra("result");
    final int i = getIntent().getIntExtra("add_more_friend_search_scene", 0);
    if (localObject != null) {}
    try
    {
      localObject = (bak)new bak().aD((byte[])localObject);
      if (localObject != null) {
        this.glr = ((bak)localObject).uql;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ContactSearchResultUI", localIOException, "", new Object[0]);
      }
      this.qul = new b(this);
      this.quk.setAdapter(this.qul);
      this.quk.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(5775657271296L, 43032);
          paramAnonymousInt -= ContactSearchResultUI.a(ContactSearchResultUI.this).getHeaderViewsCount();
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= ContactSearchResultUI.a(ContactSearchResultUI.this).getCount()))
          {
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          paramAnonymousAdapterView = (bai)ContactSearchResultUI.a(ContactSearchResultUI.this).getItemAtPosition(paramAnonymousInt);
          paramAnonymousView = paramAnonymousAdapterView.ufy.uNR;
          at.AR();
          com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(paramAnonymousView);
          if (com.tencent.mm.l.a.eE(localx.field_type))
          {
            paramAnonymousAdapterView = new Intent();
            paramAnonymousAdapterView.putExtra("Contact_User", paramAnonymousView);
            paramAnonymousAdapterView.putExtra("Contact_Scene", 3);
            if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
            {
              if (localx.bSA())
              {
                g.ork.A(10298, paramAnonymousView + ",35");
                paramAnonymousAdapterView.putExtra("Contact_Scene", 35);
              }
              com.tencent.mm.bj.d.b(ContactSearchResultUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousAdapterView);
            }
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          if ((paramAnonymousAdapterView.uAv & 0x8) > 0) {
            g.ork.A(10298, paramAnonymousAdapterView.ufy.uNR + ",35");
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.ufy.uNR);
          paramAnonymousView.putExtra("Contact_Alias", paramAnonymousAdapterView.gCC);
          paramAnonymousView.putExtra("Contact_Nick", paramAnonymousAdapterView.uxT.uNR);
          paramAnonymousView.putExtra("Contact_Signature", paramAnonymousAdapterView.gCA);
          paramAnonymousView.putExtra("Contact_RegionCode", RegionCodeDecoder.ai(paramAnonymousAdapterView.gCG, paramAnonymousAdapterView.gCy, paramAnonymousAdapterView.gCz));
          paramAnonymousView.putExtra("Contact_Sex", paramAnonymousAdapterView.gCx);
          paramAnonymousView.putExtra("Contact_VUser_Info", paramAnonymousAdapterView.uAw);
          paramAnonymousView.putExtra("Contact_VUser_Info_Flag", paramAnonymousAdapterView.uAv);
          paramAnonymousView.putExtra("Contact_KWeibo_flag", paramAnonymousAdapterView.uAz);
          paramAnonymousView.putExtra("Contact_KWeibo", paramAnonymousAdapterView.uAx);
          paramAnonymousView.putExtra("Contact_KWeiboNick", paramAnonymousAdapterView.uAy);
          paramAnonymousView.putExtra("Contact_KSnsIFlag", paramAnonymousAdapterView.uAB.gCI);
          paramAnonymousView.putExtra("Contact_KSnsBgId", paramAnonymousAdapterView.uAB.gCK);
          paramAnonymousView.putExtra("Contact_KSnsBgUrl", paramAnonymousAdapterView.uAB.gCJ);
          paramAnonymousView.putExtra("Contact_Scene", 35);
          if (i != 0) {
            paramAnonymousView.putExtra("add_more_friend_search_scene", i);
          }
          if (paramAnonymousAdapterView.uAC != null) {}
          try
          {
            paramAnonymousView.putExtra("Contact_customInfo", paramAnonymousAdapterView.uAC.toByteArray());
            if ((paramAnonymousAdapterView.uAv & 0x8) > 0) {
              g.ork.A(10298, paramAnonymousAdapterView.ufy.uNR + ",35");
            }
            com.tencent.mm.bj.d.b(ContactSearchResultUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
            GMTrace.o(5775657271296L, 43032);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.ContactSearchResultUI", localIOException, "", new Object[0]);
            }
          }
        }
      });
      this.quk.setOnScrollListener(new com.tencent.mm.ui.applet.a());
      GMTrace.o(5783039246336L, 43087);
    }
    if ((this.glr == null) || (this.glr.size() == 0))
    {
      GMTrace.o(5783039246336L, 43087);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5783173464064L, 43088);
    int i = R.i.ctY;
    GMTrace.o(5783173464064L, 43088);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5782905028608L, 43086);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(5782905028608L, 43086);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5783307681792L, 43089);
    n.Dv().cancel();
    if (this.qum != null) {
      this.qum.clear();
    }
    super.onDestroy();
    GMTrace.o(5783307681792L, 43089);
  }
  
  private static abstract class a
    implements Runnable
  {
    public String iconUrl;
    public String username;
    
    public a()
    {
      GMTrace.i(5776059924480L, 43035);
      GMTrace.o(5776059924480L, 43035);
    }
    
    public final void dT(String paramString1, String paramString2)
    {
      GMTrace.i(5776194142208L, 43036);
      this.username = paramString1;
      this.iconUrl = paramString2;
      GMTrace.o(5776194142208L, 43036);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private Context mContext;
    
    public b(Context paramContext)
    {
      GMTrace.i(5784381423616L, 43097);
      this.mContext = paramContext;
      GMTrace.o(5784381423616L, 43097);
    }
    
    private bai vR(int paramInt)
    {
      GMTrace.i(5784649859072L, 43099);
      if (ContactSearchResultUI.b(ContactSearchResultUI.this) == null)
      {
        GMTrace.o(5784649859072L, 43099);
        return null;
      }
      bai localbai = (bai)ContactSearchResultUI.b(ContactSearchResultUI.this).get(paramInt);
      GMTrace.o(5784649859072L, 43099);
      return localbai;
    }
    
    public final int getCount()
    {
      GMTrace.i(5784515641344L, 43098);
      if (ContactSearchResultUI.b(ContactSearchResultUI.this) == null)
      {
        GMTrace.o(5784515641344L, 43098);
        return 0;
      }
      int i = ContactSearchResultUI.b(ContactSearchResultUI.this).size();
      GMTrace.o(5784515641344L, 43098);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5784784076800L, 43100);
      GMTrace.o(5784784076800L, 43100);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 8;
      GMTrace.i(5784918294528L, 43101);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.cFv, null);
        paramViewGroup = new ContactSearchResultUI.d();
        paramViewGroup.hqG = ((ImageView)localView.findViewById(R.h.bfl));
        paramViewGroup.jtr = ((TextView)localView.findViewById(R.h.bQW));
        paramViewGroup.jts = localView.findViewById(R.h.cjV);
        paramViewGroup.jtt = ((TextView)localView.findViewById(R.h.bHu));
        paramViewGroup.jtw = localView.findViewById(R.h.bhp);
        localView.setTag(paramViewGroup);
      }
      bai localbai;
      for (;;)
      {
        localbai = vR(paramInt);
        if (localbai != null) {
          break;
        }
        w.e("MicroMsg.ContactSearchResultAdapter", "shouldnot be empty");
        GMTrace.o(5784918294528L, 43101);
        return localView;
        paramViewGroup = (ContactSearchResultUI.d)paramView.getTag();
        localView = paramView;
      }
      paramViewGroup.username = localbai.ufy.uNR;
      paramViewGroup.iconUrl = localbai.ubW;
      paramViewGroup.hqG.setTag(paramViewGroup.username);
      paramViewGroup.aiz();
      String str = localbai.ufy.uNR;
      Object localObject1 = (ContactSearchResultUI.c)ContactSearchResultUI.c(ContactSearchResultUI.this).get(str);
      paramView = (View)localObject1;
      Object localObject2;
      boolean bool;
      if (localObject1 == null)
      {
        localObject1 = new ContactSearchResultUI.c();
        ContactSearchResultUI.c(ContactSearchResultUI.this).put(str, localObject1);
        paramView = localbai.uAC;
        if (paramView != null)
        {
          localObject2 = new com.tencent.mm.af.d();
          ((com.tencent.mm.af.d)localObject2).field_username = str;
          ((com.tencent.mm.af.d)localObject2).field_brandFlag = paramView.gCL;
          ((com.tencent.mm.af.d)localObject2).field_brandIconURL = paramView.gCO;
          ((com.tencent.mm.af.d)localObject2).field_brandInfo = paramView.gCN;
          ((com.tencent.mm.af.d)localObject2).field_extInfo = paramView.gCM;
          paramView = null;
          if (((com.tencent.mm.af.d)localObject2).bq(false) != null) {
            paramView = ((com.tencent.mm.af.d)localObject2).bq(false).Fa();
          }
          if (paramView != null)
          {
            if ((!((com.tencent.mm.af.d)localObject2).bq(false).Fc()) || (bg.nm(paramView.gwE))) {
              break label558;
            }
            bool = true;
          }
        }
      }
      for (;;)
      {
        ((ContactSearchResultUI.c)localObject1).jtp = bool;
        if (localbai.uAv != 0)
        {
          bool = true;
          label385:
          ((ContactSearchResultUI.c)localObject1).jto = bool;
          paramView = (View)localObject1;
          localObject1 = paramViewGroup.jts;
          if (!paramView.jto) {
            break label570;
          }
          paramInt = 0;
          ((View)localObject1).setVisibility(paramInt);
          localObject1 = paramViewGroup.jtw;
          paramInt = i;
          if (paramView.jtp) {
            paramInt = 0;
          }
          ((View)localObject1).setVisibility(paramInt);
          w.v("MicroMsg.ContactSearchResultAdapter", "verifyFlay : %d", new Object[] { Integer.valueOf(localbai.uAv) });
          paramView = bg.nl(localbai.gCA);
        }
        try
        {
          paramViewGroup.jtt.setText(h.b(this.mContext, paramView, paramViewGroup.jtt.getTextSize()));
          try
          {
            localObject1 = paramViewGroup.jtr;
            localObject2 = this.mContext;
            if (bg.nm(localbai.uxT.uNR)) {
              break label590;
            }
            paramView = localbai.uxT.uNR;
            ((TextView)localObject1).setText(h.b((Context)localObject2, paramView, paramViewGroup.jtr.getTextSize()));
          }
          catch (Exception paramView)
          {
            for (;;)
            {
              paramViewGroup.jtr.setText("");
            }
          }
          GMTrace.o(5784918294528L, 43101);
          return localView;
          label558:
          bool = false;
          continue;
          bool = false;
          break label385;
          label570:
          paramInt = 8;
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            paramViewGroup.jtt.setText("");
            continue;
            label590:
            if (!bg.nm(localbai.gCC)) {
              paramView = localbai.gCC;
            } else {
              paramView = bg.nl(localbai.ufy.uNR);
            }
          }
        }
      }
    }
  }
  
  private static final class c
  {
    protected boolean jto;
    protected boolean jtp;
    
    public c()
    {
      GMTrace.i(5775254618112L, 43029);
      GMTrace.o(5775254618112L, 43029);
    }
  }
  
  private static final class d
    implements m.a.a, Runnable
  {
    public ImageView hqG;
    public String iconUrl;
    public TextView jtr;
    public View jts;
    public TextView jtt;
    public View jtw;
    public ContactSearchResultUI.a qup;
    public String username;
    
    public d()
    {
      GMTrace.i(5792568705024L, 43158);
      this.qup = new ContactSearchResultUI.a()
      {
        public final void run()
        {
          GMTrace.i(5782099722240L, 43080);
          if ((bg.nm(this.username)) || (bg.nm(ContactSearchResultUI.d.this.username)) || (!this.username.equals(ContactSearchResultUI.d.this.username)))
          {
            GMTrace.o(5782099722240L, 43080);
            return;
          }
          Bitmap localBitmap = m.d(this.username, this.iconUrl, 0);
          if ((localBitmap != null) && (!localBitmap.isRecycled())) {
            ContactSearchResultUI.d.this.aiz();
          }
          GMTrace.o(5782099722240L, 43080);
        }
      };
      com.tencent.mm.af.x.FO().a(this);
      GMTrace.o(5792568705024L, 43158);
    }
    
    public final void aiz()
    {
      GMTrace.i(5792702922752L, 43159);
      if (this.hqG == null)
      {
        GMTrace.o(5792702922752L, 43159);
        return;
      }
      at.xB().A(this);
      GMTrace.o(5792702922752L, 43159);
    }
    
    public final void ja(String paramString)
    {
      GMTrace.i(5792971358208L, 43161);
      if ((paramString != null) && (paramString.equals(this.username)))
      {
        this.qup.dT(this.username, this.iconUrl);
        at.xB().h(this.qup, 200L);
      }
      GMTrace.o(5792971358208L, 43161);
    }
    
    public final void run()
    {
      GMTrace.i(5792837140480L, 43160);
      final Bitmap localBitmap = m.iY(this.username);
      if (localBitmap != null)
      {
        ContactSearchResultUI.brK().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5781831286784L, 43078);
            if ((ContactSearchResultUI.d.this.hqG != null) && (ContactSearchResultUI.d.this.hqG.getTag() != null) && (ContactSearchResultUI.d.this.username != null) && (ContactSearchResultUI.d.this.username.equals(ContactSearchResultUI.d.this.hqG.getTag()))) {
              ContactSearchResultUI.d.this.hqG.setImageBitmap(localBitmap);
            }
            GMTrace.o(5781831286784L, 43078);
          }
        });
        GMTrace.o(5792837140480L, 43160);
        return;
      }
      ContactSearchResultUI.brK().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5780757544960L, 43070);
          if (ContactSearchResultUI.d.this.hqG != null)
          {
            ContactSearchResultUI.d.this.hqG.setImageResource(R.g.aUD);
            ContactSearchResultUI.d.this.qup.dT(ContactSearchResultUI.d.this.username, ContactSearchResultUI.d.this.iconUrl);
            at.xB().h(ContactSearchResultUI.d.this.qup, 200L);
          }
          GMTrace.o(5780757544960L, 43070);
        }
      });
      GMTrace.o(5792837140480L, 43160);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\ContactSearchResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */