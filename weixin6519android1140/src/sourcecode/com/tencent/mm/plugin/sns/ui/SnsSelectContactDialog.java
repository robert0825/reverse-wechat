package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.v;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsSelectContactDialog
  extends MMBaseActivity
{
  private List<String> gpU;
  private GridView qdR;
  private a qdS;
  
  public SnsSelectContactDialog()
  {
    GMTrace.i(8482828845056L, 63202);
    this.qdR = null;
    this.qdS = null;
    this.gpU = new LinkedList();
    GMTrace.o(8482828845056L, 63202);
  }
  
  private boolean Jh(String paramString)
  {
    GMTrace.i(8483231498240L, 63205);
    String[] arrayOfString = s.gmD;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(arrayOfString[i]))
      {
        GMTrace.o(8483231498240L, 63205);
        return false;
      }
      i += 1;
    }
    if (s.eb(paramString))
    {
      GMTrace.o(8483231498240L, 63205);
      return false;
    }
    if (s.fD(paramString))
    {
      GMTrace.o(8483231498240L, 63205);
      return false;
    }
    if ((this.gpU != null) && (this.gpU.contains(paramString)))
    {
      GMTrace.o(8483231498240L, 63205);
      return false;
    }
    GMTrace.o(8483231498240L, 63205);
    return true;
  }
  
  private String bpo()
  {
    GMTrace.i(8483365715968L, 63206);
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP();
    Object localObject2 = s.gmw;
    Object localObject3 = new LinkedList();
    String[] arrayOfString = s.gmD;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      ((List)localObject3).add(arrayOfString[i]);
      i += 1;
    }
    ((List)localObject3).add("weixin");
    ((List)localObject3).add("officialaccounts");
    ((List)localObject3).add("helper_entry");
    ((List)localObject3).add("filehelper");
    localObject1 = ((as)localObject1).c((String)localObject2, (List)localObject3, "*");
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      GMTrace.o(8483365715968L, 63206);
      return "";
    }
    localObject2 = new LinkedList();
    ((Cursor)localObject1).moveToFirst();
    do
    {
      localObject3 = new com.tencent.mm.storage.ae();
      ((com.tencent.mm.storage.ae)localObject3).b((Cursor)localObject1);
      if (Jh(((aj)localObject3).field_username))
      {
        ((List)localObject2).add(((aj)localObject3).field_username);
        if (((List)localObject2).size() >= 10) {
          break;
        }
      }
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    localObject1 = bg.c((List)localObject2, ";");
    GMTrace.o(8483365715968L, 63206);
    return (String)localObject1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8483499933696L, 63207);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(8483499933696L, 63207);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(8483499933696L, 63207);
      return;
      if (paramIntent == null)
      {
        GMTrace.o(8483499933696L, 63207);
        return;
      }
      paramIntent = bg.g(paramIntent.getStringExtra("Select_Contact").split(","));
      if (paramIntent == null)
      {
        GMTrace.o(8483499933696L, 63207);
        return;
      }
      if (this.gpU == null) {
        this.gpU = new LinkedList();
      }
      paramIntent = paramIntent.iterator();
      while (paramIntent.hasNext())
      {
        String str = (String)paramIntent.next();
        if (!this.gpU.contains(str)) {
          this.gpU.add(str);
        }
      }
      w.d("MicroMsg.SnsSelectContactDialog", "withList count " + this.gpU.size());
      if (this.qdS != null)
      {
        w.d("MicroMsg.SnsSelectContactDialog", "refresh alertAdapter");
        this.qdS.refresh();
      }
      paramIntent = new Intent();
      paramIntent.putExtra("Select_Contact", bg.c(this.gpU, ","));
      setResult(-1, paramIntent);
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8482963062784L, 63203);
    super.onCreate(paramBundle);
    setContentView(i.g.pfy);
    paramBundle = getIntent().getStringExtra("Select_Contact");
    if ((paramBundle == null) || (paramBundle.equals(""))) {
      this.gpU.clear();
    }
    for (;;)
    {
      this.qdR = ((GridView)findViewById(i.f.pak));
      this.qdS = new a(this, this.gpU);
      this.qdR.setAdapter(this.qdS);
      this.qdR.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8393439838208L, 62536);
          if (paramAnonymousInt == SnsSelectContactDialog.a(SnsSelectContactDialog.this).getCount() - 1) {
            SnsSelectContactDialog.b(SnsSelectContactDialog.this);
          }
          for (;;)
          {
            SnsSelectContactDialog.a(SnsSelectContactDialog.this).refresh();
            GMTrace.o(8393439838208L, 62536);
            return;
            SnsSelectContactDialog.c(SnsSelectContactDialog.this).remove(paramAnonymousInt);
          }
        }
      });
      this.qdR.setSelection(this.qdS.getCount() - 1);
      ((ImageButton)findViewById(i.f.bpr)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8564970094592L, 63814);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Select_Contact", bg.c(SnsSelectContactDialog.c(SnsSelectContactDialog.this), ","));
          SnsSelectContactDialog.this.setResult(-1, paramAnonymousView);
          SnsSelectContactDialog.this.finish();
          GMTrace.o(8564970094592L, 63814);
        }
      });
      GMTrace.o(8482963062784L, 63203);
      return;
      this.gpU = bg.g(paramBundle.split(","));
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8483097280512L, 63204);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Select_Contact", bg.c(this.gpU, ","));
      setResult(-1, localIntent);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8483097280512L, 63204);
    return bool;
  }
  
  final class a
    extends BaseAdapter
  {
    private Context context;
    private List<String> gpU;
    private int pNX;
    private int type;
    
    public a(int paramInt)
    {
      GMTrace.i(8596377042944L, 64048);
      this.pNX = 0;
      List localList;
      this.gpU = localList;
      this.context = paramInt;
      this.type = 0;
      refresh();
      GMTrace.o(8596377042944L, 64048);
    }
    
    public final int getCount()
    {
      GMTrace.i(8596645478400L, 64050);
      int i = this.pNX;
      GMTrace.o(8596645478400L, 64050);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8596779696128L, 64051);
      Object localObject = this.gpU.get(paramInt);
      GMTrace.o(8596779696128L, 64051);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8596913913856L, 64052);
      GMTrace.o(8596913913856L, 64052);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8597048131584L, 64053);
      if (paramView == null)
      {
        paramViewGroup = new SnsSelectContactDialog.b();
        if (this.type == 0)
        {
          paramView = View.inflate(this.context, i.g.pgB, null);
          paramViewGroup.koY = ((ImageView)paramView.findViewById(i.f.image));
          paramViewGroup.qdU = ((ImageView)paramView.findViewById(i.f.pbb));
          paramView.setTag(paramViewGroup);
          label72:
          paramView.setVisibility(0);
          if (paramInt != this.pNX - 1) {
            break label181;
          }
          paramViewGroup.koY.setBackgroundDrawable(null);
          paramViewGroup.koY.setImageResource(i.e.oYm);
          paramViewGroup.qdU.setVisibility(8);
          if (this.gpU.size() >= v.vpA) {
            paramView.setVisibility(8);
          }
        }
      }
      for (;;)
      {
        paramViewGroup.koY.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GMTrace.o(8597048131584L, 64053);
        return paramView;
        paramView = View.inflate(this.context, i.g.pft, null);
        break;
        paramViewGroup = (SnsSelectContactDialog.b)paramView.getTag();
        break label72;
        label181:
        paramViewGroup.koY.setBackgroundDrawable(null);
        paramViewGroup.qdU.setVisibility(0);
        Object localObject;
        if (this.type == 0)
        {
          localObject = (String)this.gpU.get(paramInt);
          a.b.a(paramViewGroup.koY, (String)localObject);
        }
        else
        {
          localObject = d.e((String)this.gpU.get(paramInt), com.tencent.mm.plugin.sns.model.ae.bjl(), com.tencent.mm.plugin.sns.model.ae.bjl(), true);
          paramViewGroup.koY.setImageBitmap((Bitmap)localObject);
        }
      }
    }
    
    public final void refresh()
    {
      GMTrace.i(8596511260672L, 64049);
      if (this.gpU == null) {}
      for (this.pNX = 0;; this.pNX = this.gpU.size())
      {
        this.pNX += 1;
        notifyDataSetChanged();
        GMTrace.o(8596511260672L, 64049);
        return;
      }
    }
  }
  
  static final class b
  {
    ImageView koY;
    ImageView qdU;
    
    b()
    {
      GMTrace.i(8629126168576L, 64292);
      GMTrace.o(8629126168576L, 64292);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsSelectContactDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */