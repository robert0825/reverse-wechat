package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.setting.a.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.aeg;
import com.tencent.mm.protocal.c.bjy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SettingsTrustFriendUI
  extends MMActivity
  implements e
{
  private static int oKo;
  private r kOh;
  private GridView lCF;
  private TextView mbU;
  private List<String> oKk;
  private a oKl;
  private View oKm;
  private boolean oKn;
  
  static
  {
    GMTrace.i(4641249034240L, 34580);
    oKo = 5;
    GMTrace.o(4641249034240L, 34580);
  }
  
  public SettingsTrustFriendUI()
  {
    GMTrace.i(4638564679680L, 34560);
    GMTrace.o(4638564679680L, 34560);
  }
  
  private void beI()
  {
    GMTrace.i(4639638421504L, 34568);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(352277, null);
    Object localObject = new ArrayList();
    if (!bg.nm(str)) {
      localObject = bg.g(str.split(","));
    }
    for (;;)
    {
      if ((this.oKk.size() == ((List)localObject).size()) && (this.oKk.containsAll((Collection)localObject)))
      {
        finish();
        GMTrace.o(4639638421504L, 34568);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dUL), getString(R.l.cUG), getString(R.l.cUp), getString(R.l.cTK), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4690775375872L, 34949);
          SettingsTrustFriendUI.h(SettingsTrustFriendUI.this);
          GMTrace.o(4690775375872L, 34949);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4681648570368L, 34881);
          SettingsTrustFriendUI.this.finish();
          GMTrace.o(4681648570368L, 34881);
        }
      });
      GMTrace.o(4639638421504L, 34568);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4639235768320L, 34565);
    oM(R.l.cGj);
    this.lCF = ((GridView)findViewById(R.h.cip));
    this.oKl = new a((byte)0);
    int i = getResources().getDimensionPixelSize(R.f.aQy);
    this.lCF.setColumnWidth(i);
    this.lCF.setNumColumns(-1);
    this.lCF.setStretchMode(1);
    this.lCF.setHorizontalSpacing(getResources().getDimensionPixelSize(R.f.aSp) * 2);
    this.lCF.setVerticalSpacing(getResources().getDimensionPixelSize(R.f.aSq));
    this.lCF.setAdapter(this.oKl);
    ((ViewGroup)this.lCF.getParent()).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4617358278656L, 34402);
        if (SettingsTrustFriendUI.b(SettingsTrustFriendUI.this))
        {
          SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, false);
          SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).notifyDataSetChanged();
        }
        GMTrace.o(4617358278656L, 34402);
      }
    });
    this.lCF.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(4628632567808L, 34486);
        if ((SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)) && (paramAnonymousMotionEvent.getAction() == 1) && (SettingsTrustFriendUI.d(SettingsTrustFriendUI.this).pointToPosition((int)paramAnonymousMotionEvent.getX(), (int)paramAnonymousMotionEvent.getY()) == -1))
        {
          SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, false);
          SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).notifyDataSetChanged();
          GMTrace.o(4628632567808L, 34486);
          return true;
        }
        GMTrace.o(4628632567808L, 34486);
        return false;
      }
    });
    this.lCF.setHorizontalScrollBarEnabled(false);
    this.lCF.setVerticalScrollBarEnabled(false);
    this.lCF.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4672655982592L, 34814);
        if (SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) == 1)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("list_type", 12);
          paramAnonymousAdapterView.putExtra("titile", SettingsTrustFriendUI.this.getString(R.l.cRp));
          paramAnonymousAdapterView.putExtra("scene", 2);
          paramAnonymousAdapterView.putExtra("max_limit_num", SettingsTrustFriendUI.beJ());
          paramAnonymousAdapterView.putExtra("stay_in_wechat", true);
          paramAnonymousAdapterView.putExtra("already_select_contact", bg.c(SettingsTrustFriendUI.e(SettingsTrustFriendUI.this), ","));
          paramAnonymousAdapterView.putExtra("block_contact", q.zE());
          paramAnonymousAdapterView.putExtra("list_attr", s.ex(s.wTp, 256));
          paramAnonymousAdapterView.putExtra("too_many_member_tip_string", SettingsTrustFriendUI.this.getString(R.l.eaT, new Object[] { Integer.valueOf(SettingsTrustFriendUI.beJ()) }));
          d.a(SettingsTrustFriendUI.this, ".ui.contact.SelectContactUI", paramAnonymousAdapterView, 1);
          GMTrace.o(4672655982592L, 34814);
          return;
        }
        if (SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) == 2) {
          if (!SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)) {
            SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, true);
          }
        }
        for (;;)
        {
          SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).notifyDataSetChanged();
          do
          {
            GMTrace.o(4672655982592L, 34814);
            return;
          } while ((SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) != 0) || (!SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)));
          SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).remove(SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItem(paramAnonymousInt));
          if (SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).size() == 0) {
            SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, false);
          }
        }
      }
    });
    this.mbU = ((TextView)findViewById(R.h.cio));
    String str = getIntent().getStringExtra(e.f.vGJ);
    if (!bg.nm(str)) {
      this.mbU.setText(str);
    }
    for (;;)
    {
      this.oKm = findViewById(R.h.cis);
      this.oKm.setVisibility(8);
      ((TextView)this.oKm.findViewById(R.h.cny)).setText(getString(R.l.eaU, new Object[] { Integer.valueOf(3) }));
      this.oKm.findViewById(R.h.bps).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4620847939584L, 34428);
          SettingsTrustFriendUI.f(SettingsTrustFriendUI.this).setVisibility(8);
          GMTrace.o(4620847939584L, 34428);
        }
      });
      findViewById(R.h.ciq).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4665408225280L, 34760);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://weixin110.qq.com/security/readtemplate?t=w_security_center_website/trusted_friend_guide");
          d.b(SettingsTrustFriendUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          GMTrace.o(4665408225280L, 34760);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4613734400000L, 34375);
          SettingsTrustFriendUI.g(SettingsTrustFriendUI.this);
          GMTrace.o(4613734400000L, 34375);
          return true;
        }
      });
      a(1, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4687554150400L, 34925);
          SettingsTrustFriendUI.h(SettingsTrustFriendUI.this);
          GMTrace.o(4687554150400L, 34925);
          return true;
        }
      }, p.b.vLG);
      lg(true);
      GMTrace.o(4639235768320L, 34565);
      return;
      this.mbU.setText(getResources().getString(R.l.eaV, new Object[] { Integer.valueOf(3) }));
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4639504203776L, 34567);
    w.d("MicroMsg.SettingsTrustFriendUI", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.kOh != null) {
      this.kOh.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() == 869)
      {
        paramString = (aeg)((b)paramk.gud).gtD.gtK;
        oKo = paramString.utU;
        paramString = paramString.tQj;
        if (paramString.size() == this.oKk.size()) {
          if (paramString.size() == 0) {
            paramInt1 = 0;
          }
        }
        while (paramInt1 != 0)
        {
          this.oKk.clear();
          paramString = paramString.iterator();
          for (;;)
          {
            if (paramString.hasNext())
            {
              paramk = (bjy)paramString.next();
              this.oKk.add(paramk.jhi);
              continue;
              paramk = paramString.iterator();
              for (;;)
              {
                if (paramk.hasNext())
                {
                  bjy localbjy = (bjy)paramk.next();
                  if (!this.oKk.contains(localbjy.jhi))
                  {
                    paramInt1 = 1;
                    break;
                  }
                }
              }
              paramInt1 = 0;
              break;
            }
          }
          this.oKl.notifyDataSetChanged();
        }
        if ((this.oKk.size() > 0) && (this.oKk.size() < 3)) {
          this.oKm.setVisibility(0);
        }
        at.AR();
        com.tencent.mm.y.c.xh().set(352277, bg.c(this.oKk, ","));
        GMTrace.o(4639504203776L, 34567);
        return;
      }
      if (paramk.getType() == 583)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(352277, bg.c(this.oKk, ","));
        finish();
        GMTrace.o(4639504203776L, 34567);
      }
    }
    else if (!bg.nm(paramString))
    {
      com.tencent.mm.ui.base.h.bm(this, paramString);
    }
    GMTrace.o(4639504203776L, 34567);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4638833115136L, 34562);
    int i = R.i.cGj;
    GMTrace.o(4638833115136L, 34562);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4639369986048L, 34566);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (!bg.nm(paramIntent))
      {
        this.oKk.clear();
        this.oKk.addAll(bg.g(paramIntent.split(",")));
        this.oKl.notifyDataSetChanged();
      }
    }
    GMTrace.o(4639369986048L, 34566);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4638698897408L, 34561);
    super.onCreate(paramBundle);
    at.AR();
    paramBundle = (String)com.tencent.mm.y.c.xh().get(352277, null);
    if (!bg.nm(paramBundle)) {
      this.oKk = bg.g(paramBundle.split(","));
    }
    if (this.oKk == null) {
      this.oKk = new ArrayList();
    }
    this.vKB.hqF.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4711579123712L, 35104);
        SettingsTrustFriendUI.a(SettingsTrustFriendUI.this);
        GMTrace.o(4711579123712L, 35104);
      }
    });
    MP();
    GMTrace.o(4638698897408L, 34561);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4639772639232L, 34569);
    if (paramInt == 4)
    {
      beI();
      GMTrace.o(4639772639232L, 34569);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(4639772639232L, 34569);
    return bool;
  }
  
  public void onStart()
  {
    GMTrace.i(4638967332864L, 34563);
    super.onStart();
    at.wS().a(869, this);
    at.wS().a(583, this);
    GMTrace.o(4638967332864L, 34563);
  }
  
  protected void onStop()
  {
    GMTrace.i(4639101550592L, 34564);
    super.onStop();
    at.wS().b(869, this);
    at.wS().b(583, this);
    GMTrace.o(4639101550592L, 34564);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(4688225239040L, 34930);
      GMTrace.o(4688225239040L, 34930);
    }
    
    public final int getCount()
    {
      GMTrace.i(4688359456768L, 34931);
      int i = SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).size();
      if (SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)) {}
      for (;;)
      {
        GMTrace.o(4688359456768L, 34931);
        return i;
        if (i == 0) {
          i = 1;
        } else if ((i > 0) && (i < SettingsTrustFriendUI.beJ())) {
          i += 2;
        } else if (i >= SettingsTrustFriendUI.beJ()) {
          i += 1;
        } else {
          i = 0;
        }
      }
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(4688493674496L, 34932);
      if (getItemViewType(paramInt) == 0)
      {
        Object localObject = SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).get(paramInt);
        GMTrace.o(4688493674496L, 34932);
        return localObject;
      }
      GMTrace.o(4688493674496L, 34932);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(4688896327680L, 34935);
      long l = paramInt;
      GMTrace.o(4688896327680L, 34935);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(4688627892224L, 34933);
      int i = SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).size();
      if ((SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)) || (paramInt < i))
      {
        GMTrace.o(4688627892224L, 34933);
        return 0;
      }
      if (i == 0)
      {
        GMTrace.o(4688627892224L, 34933);
        return 1;
      }
      if (i >= SettingsTrustFriendUI.beJ())
      {
        GMTrace.o(4688627892224L, 34933);
        return 2;
      }
      if (paramInt == i)
      {
        GMTrace.o(4688627892224L, 34933);
        return 1;
      }
      if (paramInt == i + 1)
      {
        GMTrace.o(4688627892224L, 34933);
        return 2;
      }
      GMTrace.o(4688627892224L, 34933);
      return -1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4689030545408L, 34936);
      if (paramView == null)
      {
        paramView = SettingsTrustFriendUI.this.getLayoutInflater().inflate(R.i.cGk, null);
        Object localObject1 = (ImageView)paramView.findViewById(R.h.cim);
        Object localObject2 = (ImageView)paramView.findViewById(R.h.cin);
        TextView localTextView = (TextView)paramView.findViewById(R.h.cir);
        paramViewGroup = new a();
        paramViewGroup.ozP = ((ImageView)localObject1);
        paramViewGroup.oKs = ((ImageView)localObject2);
        paramViewGroup.jgK = localTextView;
        paramView.setTag(paramViewGroup);
        if (getItemViewType(paramInt) != 0) {
          break label233;
        }
        localObject1 = (String)SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).get(paramInt);
        at.AR();
        localObject2 = com.tencent.mm.y.c.yK().TE((String)localObject1);
        paramViewGroup.ozP.setScaleType(ImageView.ScaleType.FIT_XY);
        a.b.a(paramViewGroup.ozP, (String)localObject1);
        paramViewGroup.jgK.setText(com.tencent.mm.pluginsdk.ui.d.h.b(SettingsTrustFriendUI.this, ((x)localObject2).vk(), paramViewGroup.jgK.getTextSize()));
        if (!SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)) {
          break label221;
        }
        paramViewGroup.oKs.setVisibility(0);
      }
      for (;;)
      {
        GMTrace.o(4689030545408L, 34936);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label221:
        paramViewGroup.oKs.setVisibility(8);
        continue;
        label233:
        paramViewGroup.jgK.setVisibility(4);
        paramViewGroup.oKs.setVisibility(8);
        paramViewGroup.ozP.setScaleType(ImageView.ScaleType.FIT_XY);
        if (getItemViewType(paramInt) == 1) {
          paramViewGroup.ozP.setImageResource(R.g.aTZ);
        } else if (getItemViewType(paramInt) == 2) {
          paramViewGroup.ozP.setImageResource(R.g.aUa);
        }
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(4688762109952L, 34934);
      GMTrace.o(4688762109952L, 34934);
      return 3;
    }
    
    private final class a
    {
      public TextView jgK;
      public ImageView oKs;
      public ImageView ozP;
      
      public a()
      {
        GMTrace.i(4631853793280L, 34510);
        GMTrace.o(4631853793280L, 34510);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsTrustFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */