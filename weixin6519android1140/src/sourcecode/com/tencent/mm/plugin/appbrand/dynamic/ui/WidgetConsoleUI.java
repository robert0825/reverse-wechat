package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.h.a;
import com.tencent.mm.plugin.appbrand.q.a.a;
import com.tencent.mm.plugin.appbrand.q.a.b;
import com.tencent.mm.plugin.appbrand.q.a.c;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class WidgetConsoleUI
  extends MMActivity
  implements h.a
{
  String appId;
  int eII;
  int hKC;
  EditText hVn;
  Button[] hVo;
  Button hVp;
  Button hVq;
  MRecyclerView hVr;
  a hVs;
  int hVt;
  String hVu;
  final List<LogInfo> hVv;
  String id;
  
  public WidgetConsoleUI()
  {
    GMTrace.i(18324075315200L, 136525);
    this.hVv = new LinkedList();
    GMTrace.o(18324075315200L, 136525);
  }
  
  private boolean Vr()
  {
    GMTrace.i(18324612186112L, 136529);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("id");
    this.appId = localIntent.getStringExtra("app_id");
    this.eII = localIntent.getIntExtra("pkg_type", 0);
    this.hKC = localIntent.getIntExtra("pkg_version", 0);
    Ve(String.format("(%s)", new Object[] { str }));
    if (bg.nm(str))
    {
      finish();
      GMTrace.o(18324612186112L, 136529);
      return false;
    }
    if (str.equals(this.id))
    {
      GMTrace.o(18324612186112L, 136529);
      return true;
    }
    this.id = str;
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().b(this.id, this);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().a(str, this);
    GMTrace.o(18324612186112L, 136529);
    return true;
  }
  
  private void bo(int paramInt1, int paramInt2)
  {
    GMTrace.i(18325014839296L, 136532);
    Button localButton = (Button)findViewById(paramInt2);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18327162322944L, 136548);
        int i = 0;
        if (i < WidgetConsoleUI.this.hVo.length)
        {
          Button localButton = WidgetConsoleUI.this.hVo[i];
          if (localButton == paramAnonymousView) {}
          for (boolean bool = true;; bool = false)
          {
            localButton.setSelected(bool);
            if ((bool) && (WidgetConsoleUI.this.hVt != i))
            {
              WidgetConsoleUI.this.hVt = i;
              WidgetConsoleUI.a(WidgetConsoleUI.this);
            }
            i += 1;
            break;
          }
        }
        GMTrace.o(18327162322944L, 136548);
      }
    });
    this.hVo[paramInt1] = localButton;
    GMTrace.o(18325014839296L, 136532);
  }
  
  private boolean pV(String paramString)
  {
    GMTrace.i(18325551710208L, 136536);
    if ((!bg.nm(this.hVu)) && ((paramString == null) || (!paramString.toLowerCase().contains(this.hVu.toLowerCase()))))
    {
      GMTrace.o(18325551710208L, 136536);
      return true;
    }
    GMTrace.o(18325551710208L, 136536);
    return false;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 1;
    GMTrace.i(18324477968384L, 136528);
    View localView;
    if (paramMotionEvent.getAction() == 0)
    {
      localView = getCurrentFocus();
      if ((localView == null) || (!(localView instanceof EditText))) {
        break label171;
      }
      int[] arrayOfInt = new int[2];
      int[] tmp43_41 = arrayOfInt;
      tmp43_41[0] = 0;
      int[] tmp47_43 = tmp43_41;
      tmp47_43[1] = 0;
      tmp47_43;
      localView.getLocationInWindow(arrayOfInt);
      int k = arrayOfInt[0];
      int m = arrayOfInt[1];
      int n = localView.getHeight();
      int i1 = localView.getWidth();
      i = j;
      if (paramMotionEvent.getX() > k)
      {
        i = j;
        if (paramMotionEvent.getX() < i1 + k)
        {
          i = j;
          if (paramMotionEvent.getY() > m) {
            if (paramMotionEvent.getY() < n + m) {
              break label171;
            }
          }
        }
      }
    }
    label171:
    for (int i = j;; i = 0)
    {
      if (i != 0) {
        db(localView);
      }
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(18324477968384L, 136528);
      return bool;
    }
  }
  
  public final void fJ(int paramInt)
  {
    GMTrace.i(18325283274752L, 136534);
    final String str;
    switch (paramInt)
    {
    default: 
      str = "";
    }
    for (;;)
    {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18323941097472L, 136524);
          WidgetConsoleUI.this.sq(String.format("%s%s", new Object[] { WidgetConsoleUI.this.getString(a.c.iUz), str }));
          Toast.makeText(WidgetConsoleUI.this, String.format("%s%s", new Object[] { WidgetConsoleUI.this.id, str }), 1).show();
          GMTrace.o(18323941097472L, 136524);
        }
      });
      GMTrace.o(18325283274752L, 136534);
      return;
      str = "(PAUSE)";
      continue;
      str = "(RESUME)";
      continue;
      str = "(START)";
      continue;
      str = "(STOP)";
    }
  }
  
  public void finish()
  {
    GMTrace.i(18324880621568L, 136531);
    if ((isFinishing()) || (this.vKD))
    {
      GMTrace.o(18324880621568L, 136531);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      GMTrace.o(18324880621568L, 136531);
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18325149057024L, 136533);
    int i = a.b.iUv;
    GMTrace.o(18325149057024L, 136533);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18324209532928L, 136526);
    super.onCreate(paramBundle);
    if (!Vr())
    {
      GMTrace.o(18324209532928L, 136526);
      return;
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18319243476992L, 136489);
        WidgetConsoleUI.this.finish();
        GMTrace.o(18319243476992L, 136489);
        return false;
      }
    });
    oM(a.c.iUz);
    this.hVn = ((EditText)findViewById(a.a.iTX));
    this.hVn.clearFocus();
    this.hVo = new Button[5];
    bo(0, a.a.iUe);
    bo(1, a.a.iUh);
    bo(2, a.a.iUg);
    bo(3, a.a.iUj);
    bo(4, a.a.iUf);
    this.hVo[0].setSelected(true);
    this.hVt = 0;
    this.hVp = ((Button)findViewById(a.a.iTT));
    this.hVq = ((Button)findViewById(a.a.iUr));
    this.hVq.setEnabled(false);
    this.hVp.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18326625452032L, 136544);
        WidgetConsoleUI.this.hVv.clear();
        WidgetConsoleUI.this.hVs.hVv.clear();
        WidgetConsoleUI.this.hVs.TS.notifyChanged();
        GMTrace.o(18326625452032L, 136544);
      }
    });
    this.hVq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18328772935680L, 136560);
        GMTrace.o(18328772935680L, 136560);
      }
    });
    this.hVn.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(18321793613824L, 136508);
        GMTrace.o(18321793613824L, 136508);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18321525178368L, 136506);
        GMTrace.o(18321525178368L, 136506);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18321659396096L, 136507);
        GMTrace.o(18321659396096L, 136507);
      }
    });
    this.hVn.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(18329041371136L, 136562);
        if (paramAnonymousInt == 66)
        {
          WidgetConsoleUI.this.hVu = WidgetConsoleUI.this.hVn.getText().toString();
          WidgetConsoleUI.a(WidgetConsoleUI.this);
          WidgetConsoleUI.this.db(paramAnonymousView);
          GMTrace.o(18329041371136L, 136562);
          return true;
        }
        GMTrace.o(18329041371136L, 136562);
        return false;
      }
    });
    this.hVn.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(18327430758400L, 136550);
        if (!paramAnonymousBoolean) {
          WidgetConsoleUI.this.db(paramAnonymousView);
        }
        GMTrace.o(18327430758400L, 136550);
      }
    });
    findViewById(a.a.iTY).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18329578242048L, 136566);
        WidgetConsoleUI.this.hVu = WidgetConsoleUI.this.hVn.getText().toString();
        WidgetConsoleUI.a(WidgetConsoleUI.this);
        GMTrace.o(18329578242048L, 136566);
      }
    });
    this.vKB.hqF.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18329309806592L, 136564);
        WidgetConsoleUI.this.db(paramAnonymousView);
        GMTrace.o(18329309806592L, 136564);
        return false;
      }
    });
    this.hVr = ((MRecyclerView)findViewById(a.a.iUi));
    this.hVs = new a(this);
    paramBundle = this.hVr;
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    paramBundle.a(new LinearLayoutManager());
    this.hVr.a(null);
    this.hVr.a(this.hVs);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().a(this.id, this);
    GMTrace.o(18324209532928L, 136526);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(18324746403840L, 136530);
    super.onDestroy();
    ((e)com.tencent.mm.kernel.h.h(e.class)).CH().b(this.id, this);
    GMTrace.o(18324746403840L, 136530);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(18324343750656L, 136527);
    super.onNewIntent(paramIntent);
    if (!Vr())
    {
      GMTrace.o(18324343750656L, 136527);
      return;
    }
    GMTrace.o(18324343750656L, 136527);
  }
  
  public final void z(List<LogInfo> paramList)
  {
    GMTrace.i(18325417492480L, 136535);
    if (paramList == null)
    {
      GMTrace.o(18325417492480L, 136535);
      return;
    }
    final LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramList.size())
    {
      LogInfo localLogInfo = (LogInfo)paramList.get(i);
      this.hVv.add(localLogInfo);
      if (((localLogInfo.level == this.hVt) || (this.hVt == 0)) && (!pV(localLogInfo.message))) {
        localLinkedList.add(localLogInfo);
      }
      i += 1;
    }
    if (!localLinkedList.isEmpty()) {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18320048783360L, 136495);
          int i = WidgetConsoleUI.this.hVs.getItemCount();
          WidgetConsoleUI.this.hVs.hVv.addAll(localLinkedList);
          WidgetConsoleUI.this.hVs.R(i, localLinkedList.size());
          if (((LinearLayoutManager)WidgetConsoleUI.this.hVr.SW).fa() == i - 1) {
            WidgetConsoleUI.this.hVr.smoothScrollToPosition(WidgetConsoleUI.this.hVs.getItemCount() - 1);
          }
          GMTrace.o(18320048783360L, 136495);
        }
      });
    }
    GMTrace.o(18325417492480L, 136535);
  }
  
  private static final class a
    extends RecyclerView.a
  {
    public static final SimpleDateFormat hVz;
    LayoutInflater CJ;
    List<LogInfo> hVv;
    
    static
    {
      GMTrace.i(18323135791104L, 136518);
      hVz = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
      GMTrace.o(18323135791104L, 136518);
    }
    
    a(Context paramContext)
    {
      GMTrace.i(18322464702464L, 136513);
      this.CJ = LayoutInflater.from(paramContext);
      this.hVv = new LinkedList();
      GMTrace.o(18322464702464L, 136513);
    }
    
    public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(18322598920192L, 136514);
      paramViewGroup = new a(this.CJ.inflate(a.b.iUu, paramViewGroup, false), paramInt);
      GMTrace.o(18322598920192L, 136514);
      return paramViewGroup;
    }
    
    public final void a(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(18322733137920L, 136515);
      LogInfo localLogInfo = (LogInfo)this.hVv.get(paramInt);
      ((a)paramt).hvO.setText(String.format("[%s] %s", new Object[] { hVz.format(new Date(localLogInfo.gra)), localLogInfo.message }));
      GMTrace.o(18322733137920L, 136515);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(18322867355648L, 136516);
      int i = this.hVv.size();
      GMTrace.o(18322867355648L, 136516);
      return i;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(18323001573376L, 136517);
      paramInt = ((LogInfo)this.hVv.get(paramInt)).level;
      GMTrace.o(18323001573376L, 136517);
      return paramInt;
    }
    
    private static final class a
      extends RecyclerView.t
    {
      TextView hVA;
      TextView hvO;
      
      public a(View paramView, int paramInt)
      {
        super();
        GMTrace.i(18320183001088L, 136496);
        this.hVA = ((TextView)paramView.findViewById(a.a.iUd));
        this.hvO = ((TextView)paramView.findViewById(a.a.brW));
        switch (paramInt)
        {
        default: 
          this.hVA.setText("L");
          this.hvO.setTextColor(-7829368);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 1: 
          this.hVA.setText("L");
          this.hvO.setTextColor(-7829368);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 2: 
          this.hVA.setText("I");
          this.hvO.setTextColor(-16777216);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 3: 
          this.hVA.setText("W");
          this.hvO.setTextColor(Color.rgb(0, 0, 204));
          GMTrace.o(18320183001088L, 136496);
          return;
        }
        this.hVA.setText("E");
        this.hvO.setTextColor(-65536);
        GMTrace.o(18320183001088L, 136496);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\ui\WidgetConsoleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */