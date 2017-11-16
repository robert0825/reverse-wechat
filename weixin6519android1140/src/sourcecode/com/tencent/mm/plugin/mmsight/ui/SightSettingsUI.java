package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SightSettingsUI
  extends MMActivity
{
  private ListView hvF;
  private d kSj;
  private CaptureMMProxy mXf;
  private a njo;
  private LinkedList<b> njp;
  
  public SightSettingsUI()
  {
    GMTrace.i(7396873207808L, 55111);
    this.kSj = new d(this);
    this.njp = new LinkedList();
    GMTrace.o(7396873207808L, 55111);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7397007425536L, 55112);
    int i = a.e.nle;
    GMTrace.o(7397007425536L, 55112);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7397141643264L, 55113);
    super.onCreate(paramBundle);
    this.mXf = new CaptureMMProxy(this.kSj);
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7396067901440L, 55105);
        w.i("MicroMsg.SightSettingsUI", "has connect");
        SightSettingsUI.a(SightSettingsUI.this);
        GMTrace.o(7396067901440L, 55105);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7399960215552L, 55134);
        SightSettingsUI.this.finish();
        GMTrace.o(7399960215552L, 55134);
        return false;
      }
    });
    GMTrace.o(7397141643264L, 55113);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7397275860992L, 55114);
    super.onDestroy();
    this.kSj.release();
    GMTrace.o(7397275860992L, 55114);
  }
  
  protected void onPause()
  {
    GMTrace.i(7397544296448L, 55116);
    super.onPause();
    GMTrace.o(7397544296448L, 55116);
  }
  
  protected void onResume()
  {
    GMTrace.i(7397410078720L, 55115);
    super.onResume();
    GMTrace.o(7397410078720L, 55115);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(7398483820544L, 55123);
      GMTrace.o(7398483820544L, 55123);
    }
    
    public final int getCount()
    {
      GMTrace.i(7398618038272L, 55124);
      int i = SightSettingsUI.d(SightSettingsUI.this).size();
      GMTrace.o(7398618038272L, 55124);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(7398752256000L, 55125);
      Object localObject = SightSettingsUI.d(SightSettingsUI.this).get(paramInt);
      GMTrace.o(7398752256000L, 55125);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7398886473728L, 55126);
      GMTrace.o(7398886473728L, 55126);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, final ViewGroup paramViewGroup)
    {
      GMTrace.i(7399020691456L, 55127);
      paramView = new TextView(SightSettingsUI.this);
      paramViewGroup = (SightSettingsUI.b)getItem(paramInt);
      paramView.setText(paramViewGroup.njt + "->:" + paramViewGroup.qY(((Integer)SightSettingsUI.b(paramViewGroup.njq).get(paramViewGroup.njw, Integer.valueOf(0))).intValue()));
      paramView.setGravity(17);
      paramView.setTextSize(1, 20.0F);
      paramView.setHeight(com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 50));
      if (paramInt % 2 == 1) {
        paramView.setBackgroundColor(Color.parseColor("#e2efda"));
      }
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7388014837760L, 55045);
          paramAnonymousView = paramViewGroup;
          LinkedList localLinkedList1 = new LinkedList();
          LinkedList localLinkedList2 = new LinkedList();
          int i = 0;
          while (i < paramAnonymousView.nju.length)
          {
            localLinkedList1.add(paramAnonymousView.nju[i]);
            localLinkedList2.add(Integer.valueOf(i));
            i += 1;
          }
          h.a(paramAnonymousView.njq, "", localLinkedList1, localLinkedList2, "", new SightSettingsUI.b.1(paramAnonymousView));
          GMTrace.o(7388014837760L, 55045);
        }
      });
      GMTrace.o(7399020691456L, 55127);
      return paramView;
    }
  }
  
  final class b
  {
    public String njt;
    String[] nju;
    int[] njv;
    w.a njw;
    
    public b(String paramString, w.a parama, String[] paramArrayOfString, int[] paramArrayOfInt)
    {
      GMTrace.i(7383988305920L, 55015);
      this.njt = paramString;
      this.nju = paramArrayOfString;
      this.njw = parama;
      this.njv = paramArrayOfInt;
      GMTrace.o(7383988305920L, 55015);
    }
    
    final String qY(int paramInt)
    {
      GMTrace.i(7384122523648L, 55016);
      int i = 0;
      while (i < this.njv.length)
      {
        if ((paramInt == this.njv[i]) && (i < this.nju.length))
        {
          str = this.nju[i];
          GMTrace.o(7384122523648L, 55016);
          return str;
        }
        i += 1;
      }
      String str = this.nju[0];
      GMTrace.o(7384122523648L, 55016);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\SightSettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */