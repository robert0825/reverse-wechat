package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.ui.widget.DragSortListView;
import com.tencent.mm.ui.widget.DragSortListView.g;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.y.at;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort3rdAppUI
  extends MMActivity
{
  private DragSortListView kpm;
  private a vOu;
  private long vOv;
  private List<f> vOw;
  
  public Sort3rdAppUI()
  {
    GMTrace.i(2877091217408L, 21436);
    GMTrace.o(2877091217408L, 21436);
  }
  
  protected final void MP()
  {
    GMTrace.i(2877493870592L, 21439);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(3078552027136L, 22937);
        Sort3rdAppUI.this.finish();
        GMTrace.o(3078552027136L, 22937);
        return true;
      }
    });
    sq(getString(R.l.cQi));
    this.kpm = ((DragSortListView)findViewById(R.h.bKn));
    this.kpm.xnZ = new DragSortListView.g()
    {
      public final void bW(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1905891737600L, 14200);
        f localf = (f)Sort3rdAppUI.a(Sort3rdAppUI.this).getItem(paramAnonymousInt1);
        Sort3rdAppUI.a(Sort3rdAppUI.this).remove(localf);
        Sort3rdAppUI.a(Sort3rdAppUI.this).insert(localf, paramAnonymousInt2);
        GMTrace.o(1905891737600L, 14200);
      }
    };
    GMTrace.o(2877493870592L, 21439);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2877225435136L, 21437);
    int i = R.i.cGJ;
    GMTrace.o(2877225435136L, 21437);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(2877359652864L, 21438);
    super.onCreate(paramBundle);
    this.vOv = getIntent().getLongExtra("KFlag", -1L);
    MP();
    this.vOw = com.tencent.mm.pluginsdk.model.app.g.b(this, this.vOv, true);
    paramBundle = an.bJJ().eu(this.vOv);
    if ((paramBundle != null) && (paramBundle.size() > 0)) {
      Collections.sort(this.vOw, new Comparator() {});
    }
    this.vOu = new a(this, this.vOw, this.vOv);
    this.kpm.setAdapter(this.vOu);
    GMTrace.o(2877359652864L, 21438);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2877628088320L, 21440);
    super.onDestroy();
    GMTrace.o(2877628088320L, 21440);
  }
  
  protected void onPause()
  {
    GMTrace.i(2877762306048L, 21441);
    super.onPause();
    if (this.vOu != null)
    {
      List localList = this.vOu.kgE;
      o localo = an.bJJ();
      long l = this.vOv;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("delete from AppSort");
      ((StringBuilder)localObject).append(" where flag = ").append(l).append(" ");
      localObject = ((StringBuilder)localObject).toString();
      localo.fTZ.eZ("AppSort", (String)localObject);
      if ((localList != null) && (localList.size() > 0))
      {
        at.AR();
        l = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
        localo = an.bJJ();
        int i = 0;
        while (i < localList.size())
        {
          localObject = new com.tencent.mm.pluginsdk.model.app.n();
          ((com.tencent.mm.pluginsdk.model.app.n)localObject).field_flag = this.vOv;
          ((com.tencent.mm.pluginsdk.model.app.n)localObject).field_appId = ((f)localList.get(i)).field_appId;
          ((com.tencent.mm.pluginsdk.model.app.n)localObject).field_sortId = i;
          localo.a((com.tencent.mm.pluginsdk.model.app.n)localObject);
          i += 1;
        }
        at.AR();
        com.tencent.mm.y.c.yH().aL(l);
      }
    }
    GMTrace.o(2877762306048L, 21441);
  }
  
  private static final class a
    extends ArrayAdapter<f>
  {
    private com.tencent.mm.ao.a.a.c kEK;
    List<f> kgE;
    private Context mContext;
    private long vOv;
    
    public a(Context paramContext, List<f> paramList, long paramLong)
    {
      super(R.i.cGK, paramList);
      GMTrace.i(1886832820224L, 14058);
      this.vOv = paramLong;
      this.mContext = paramContext;
      this.kgE = paramList;
      paramContext = new c.a();
      paramContext.gKR = R.g.aYh;
      this.kEK = paramContext.Jn();
      GMTrace.o(1886832820224L, 14058);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      boolean bool = true;
      GMTrace.i(1886967037952L, 14059);
      final f localf;
      Object localObject;
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cGK, null);
        paramViewGroup = new a(paramView);
        paramView.setTag(paramViewGroup);
        localf = (f)getItem(paramInt);
        paramViewGroup.hqH.setText(localf.field_appName);
        localObject = com.tencent.mm.pluginsdk.model.app.g.b(localf.field_appId, 1, com.tencent.mm.br.a.getDensity(this.mContext));
        if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
          break label173;
        }
        paramViewGroup.iub.setImageBitmap((Bitmap)localObject);
        label104:
        localObject = paramViewGroup.saZ;
        if ((localf.field_appInfoFlag & 0x4000) != 0) {
          break label195;
        }
      }
      for (;;)
      {
        ((MMSwitchBtn)localObject).mK(bool);
        paramViewGroup.saZ.xrE = new MMSwitchBtn.a()
        {
          public final void cc(boolean paramAnonymousBoolean)
          {
            GMTrace.i(2896687005696L, 21582);
            f localf;
            if (paramAnonymousBoolean) {
              localf = localf;
            }
            for (localf.field_appInfoFlag &= 0xBFFF;; localf.field_appInfoFlag |= 0x4000)
            {
              an.aWy().a(localf, new String[0]);
              GMTrace.o(2896687005696L, 21582);
              return;
              localf = localf;
            }
          }
        };
        paramView.setVisibility(0);
        GMTrace.o(1886967037952L, 14059);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label173:
        com.tencent.mm.ao.n.Jd().a(localf.field_appIconUrl, paramViewGroup.iub, this.kEK);
        break label104;
        label195:
        bool = false;
      }
    }
    
    static final class a
    {
      TextView hqH;
      ImageView iub;
      View kgF;
      ImageView kgG;
      MMSwitchBtn saZ;
      
      public a(View paramView)
      {
        GMTrace.i(3471138881536L, 25862);
        this.kgG = ((ImageView)paramView.findViewById(R.h.bGi));
        this.iub = ((ImageView)paramView.findViewById(R.h.bGn));
        this.hqH = ((TextView)paramView.findViewById(R.h.chH));
        this.saZ = ((MMSwitchBtn)paramView.findViewById(R.h.cgj));
        this.kgF = paramView.findViewById(R.h.brL);
        GMTrace.o(3471138881536L, 25862);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\Sort3rdAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */