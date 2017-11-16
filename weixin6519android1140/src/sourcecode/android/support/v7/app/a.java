package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.z;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.a.a.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class a
{
  public int EA;
  public boolean EB = false;
  public Button EC;
  CharSequence ED;
  public Message EE;
  public Button EF;
  CharSequence EG;
  public Message EH;
  public Button EI;
  CharSequence EJ;
  public Message EK;
  public NestedScrollView EL;
  public int EM = 0;
  TextView EN;
  public View EO;
  public ListAdapter EP;
  public int EQ = -1;
  int ER;
  int ES;
  public int ET;
  public int EU;
  public int EV;
  public int EW;
  int EX = 0;
  final View.OnClickListener EY = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if ((paramAnonymousView == a.this.EC) && (a.this.EE != null)) {
        paramAnonymousView = Message.obtain(a.this.EE);
      }
      for (;;)
      {
        if (paramAnonymousView != null) {
          paramAnonymousView.sendToTarget();
        }
        a.this.mHandler.obtainMessage(1, a.this.Es).sendToTarget();
        return;
        if ((paramAnonymousView == a.this.EF) && (a.this.EH != null)) {
          paramAnonymousView = Message.obtain(a.this.EH);
        } else if ((paramAnonymousView == a.this.EI) && (a.this.EK != null)) {
          paramAnonymousView = Message.obtain(a.this.EK);
        } else {
          paramAnonymousView = null;
        }
      }
    }
  };
  public final i Es;
  final Window Et;
  public CharSequence Eu;
  public ListView Ev;
  public int Ew;
  public int Ex;
  public int Ey;
  public int Ez;
  public TextView iD;
  public ImageView jV;
  public Drawable jd;
  public final Context mContext;
  public Handler mHandler;
  public View mView;
  CharSequence tX;
  
  public a(Context paramContext, i parami, Window paramWindow)
  {
    this.mContext = paramContext;
    this.Es = parami;
    this.Et = paramWindow;
    this.mHandler = new b(parami);
    paramContext = paramContext.obtainStyledAttributes(null, a.k.AlertDialog, android.support.v7.a.a.a.alertDialogStyle, 0);
    this.ER = paramContext.getResourceId(a.k.AlertDialog_android_layout, 0);
    this.ES = paramContext.getResourceId(a.k.AlertDialog_buttonPanelSideLayout, 0);
    this.ET = paramContext.getResourceId(a.k.AlertDialog_listLayout, 0);
    this.EU = paramContext.getResourceId(a.k.AlertDialog_multiChoiceItemLayout, 0);
    this.EV = paramContext.getResourceId(a.k.AlertDialog_singleChoiceItemLayout, 0);
    this.EW = paramContext.getResourceId(a.k.AlertDialog_listItemLayout, 0);
    paramContext.recycle();
    parami.cY();
  }
  
  public static void a(View paramView1, View paramView2, View paramView3)
  {
    int j = 0;
    if (paramView2 != null)
    {
      if (z.h(paramView1, -1))
      {
        i = 0;
        paramView2.setVisibility(i);
      }
    }
    else if (paramView3 != null) {
      if (!z.h(paramView1, 1)) {
        break label48;
      }
    }
    label48:
    for (int i = j;; i = 4)
    {
      paramView3.setVisibility(i);
      return;
      i = 4;
      break;
    }
  }
  
  static boolean aI(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    while (i > 0)
    {
      int j = i - 1;
      i = j;
      if (aI(paramView.getChildAt(j))) {
        return true;
      }
    }
    return false;
  }
  
  static ViewGroup b(View paramView1, View paramView2)
  {
    if (paramView1 == null) {
      if (!(paramView2 instanceof ViewStub)) {
        break label71;
      }
    }
    label71:
    for (paramView1 = ((ViewStub)paramView2).inflate();; paramView1 = paramView2)
    {
      return (ViewGroup)paramView1;
      if (paramView2 != null)
      {
        ViewParent localViewParent = paramView2.getParent();
        if ((localViewParent instanceof ViewGroup)) {
          ((ViewGroup)localViewParent).removeView(paramView2);
        }
      }
      if ((paramView1 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView1).inflate();
      }
      for (;;)
      {
        return (ViewGroup)paramView1;
      }
    }
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null) {
      paramMessage = this.mHandler.obtainMessage(paramInt, paramOnClickListener);
    }
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Button does not exist");
    case -1: 
      this.ED = paramCharSequence;
      this.EE = paramMessage;
      return;
    case -2: 
      this.EG = paramCharSequence;
      this.EH = paramMessage;
      return;
    }
    this.EJ = paramCharSequence;
    this.EK = paramMessage;
  }
  
  public final void setIcon(int paramInt)
  {
    this.jd = null;
    this.EM = paramInt;
    if (this.jV != null)
    {
      if (paramInt != 0)
      {
        this.jV.setVisibility(0);
        this.jV.setImageResource(this.EM);
      }
    }
    else {
      return;
    }
    this.jV.setVisibility(8);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    if (this.EN != null) {
      this.EN.setText(paramCharSequence);
    }
  }
  
  public static final class a
  {
    public Cursor AE;
    public final LayoutInflater CJ;
    public int EA;
    public boolean EB = false;
    public int EM = 0;
    public View EO;
    public ListAdapter EP;
    public int EQ = -1;
    public CharSequence Eu;
    public int Ew;
    public int Ex;
    public int Ey;
    public int Ez;
    public int Fc = 0;
    public CharSequence Fd;
    public DialogInterface.OnClickListener Fe;
    public CharSequence Ff;
    public DialogInterface.OnClickListener Fg;
    public CharSequence Fh;
    public DialogInterface.OnClickListener Fi;
    public DialogInterface.OnCancelListener Fj;
    public DialogInterface.OnDismissListener Fk;
    public DialogInterface.OnKeyListener Fl;
    public CharSequence[] Fm;
    public DialogInterface.OnClickListener Fn;
    public boolean[] Fo;
    public boolean Fp;
    public boolean Fq;
    public DialogInterface.OnMultiChoiceClickListener Fr;
    public String Fs;
    public String Ft;
    public AdapterView.OnItemSelectedListener Fu;
    public boolean Fv = true;
    public Drawable jd;
    public final Context mContext;
    public View mView;
    public boolean nX;
    public CharSequence tX;
    
    public a(Context paramContext)
    {
      this.mContext = paramContext;
      this.nX = true;
      this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    }
  }
  
  private static final class b
    extends Handler
  {
    private WeakReference<DialogInterface> FB;
    
    public b(DialogInterface paramDialogInterface)
    {
      this.FB = new WeakReference(paramDialogInterface);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      case 0: 
      default: 
        return;
      case -3: 
      case -2: 
      case -1: 
        ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.FB.get(), paramMessage.what);
        return;
      }
      ((DialogInterface)paramMessage.obj).dismiss();
    }
  }
  
  private static final class c
    extends ArrayAdapter<CharSequence>
  {
    public c(Context paramContext, int paramInt, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt, 16908308, paramArrayOfCharSequence);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final boolean hasStableIds()
    {
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */