package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;

public class LocationExtUI
  extends MMActivity
{
  private ArrayList<String> kuu;
  private TextView myM;
  private TextView myN;
  private String myO;
  
  public LocationExtUI()
  {
    GMTrace.i(9664213286912L, 72004);
    this.kuu = new ArrayList();
    GMTrace.o(9664213286912L, 72004);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9664481722368L, 72006);
    int i = R.i.cAN;
    GMTrace.o(9664481722368L, 72006);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9664615940096L, 72007);
    if (4097 == paramInt1)
    {
      if ((-1 != paramInt2) || (paramIntent == null))
      {
        GMTrace.o(9664615940096L, 72007);
        return;
      }
      paramIntent = paramIntent.getCharSequenceExtra("key_result");
      if (paramIntent == null) {}
      for (paramIntent = "";; paramIntent = paramIntent.toString())
      {
        this.myO = paramIntent;
        this.myN.setText(this.myO);
        GMTrace.o(9664615940096L, 72007);
        return;
      }
    }
    if (4098 == paramInt1)
    {
      if ((-1 != paramInt2) || (paramIntent == null))
      {
        GMTrace.o(9664615940096L, 72007);
        return;
      }
      this.kuu.clear();
      String[] arrayOfString = paramIntent.getStringArrayExtra("key_fav_result_array");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
      {
        GMTrace.o(9664615940096L, 72007);
        return;
      }
      paramIntent = arrayOfString[0];
      this.kuu.add(arrayOfString[0]);
      String str = getResources().getString(R.l.duW);
      paramInt1 = 1;
      while (paramInt1 < arrayOfString.length)
      {
        this.kuu.add(arrayOfString[paramInt1]);
        paramIntent = paramIntent + str + arrayOfString[paramInt1];
        paramInt1 += 1;
      }
      this.myM.setText(paramIntent);
      GMTrace.o(9664615940096L, 72007);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(9664615940096L, 72007);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9664347504640L, 72005);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bg.nm(paramBundle)) {
      findViewById(R.h.bKZ).setVisibility(8);
    }
    for (;;)
    {
      this.myM = ((TextView)findViewById(R.h.cgr));
      this.myN = ((TextView)findViewById(R.h.bYn));
      this.myM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9715752894464L, 72388);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("key_fav_result_list", LocationExtUI.a(LocationExtUI.this));
          d.b(LocationExtUI.this.vKB.vKW, "favorite", ".ui.FavTagEditUI", paramAnonymousView, 4098);
          GMTrace.o(9715752894464L, 72388);
        }
      });
      this.myN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9660857843712L, 71979);
          paramAnonymousView = new Intent(LocationExtUI.this.vKB.vKW, RemarkUI.class);
          paramAnonymousView.putExtra("key_nullable", true);
          paramAnonymousView.putExtra("key_value", LocationExtUI.this.getIntent().getStringExtra("key_value"));
          paramAnonymousView.putExtra("key_hint", LocationExtUI.this.getString(R.l.dGI));
          paramAnonymousView.putExtra("Kwebmap_locaion", LocationExtUI.this.getIntent().getStringExtra("Kwebmap_locaion"));
          paramAnonymousView.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
          paramAnonymousView.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
          paramAnonymousView.putExtra("kFavInfoLocalId", LocationExtUI.this.getIntent().getLongExtra("kFavInfoLocalId", -1L));
          paramAnonymousView.putExtra("kRemark", LocationExtUI.this.getIntent().getStringExtra("kRemark"));
          LocationExtUI.this.startActivityForResult(paramAnonymousView, 4097);
          GMTrace.o(9660857843712L, 71979);
        }
      });
      a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9718839902208L, 72411);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("key_remark_result", LocationExtUI.b(LocationExtUI.this));
          paramAnonymousMenuItem.putExtra("key_tags_result", LocationExtUI.a(LocationExtUI.this));
          LocationExtUI.this.setResult(-1, paramAnonymousMenuItem);
          LocationExtUI.this.finish();
          GMTrace.o(9718839902208L, 72411);
          return true;
        }
      }, p.b.vLG);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9660052537344L, 71973);
          LocationExtUI.this.finish();
          GMTrace.o(9660052537344L, 71973);
          return true;
        }
      });
      GMTrace.o(9664347504640L, 72005);
      return;
      ((TextView)findViewById(R.h.bLl)).setText(paramBundle);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\LocationExtUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */