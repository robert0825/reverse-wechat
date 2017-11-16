package com.tencent.xweb.xwalk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.a.b;
import com.tencent.xweb.a.g;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.f.a;
import com.tencent.xweb.i;
import com.tencent.xweb.xwalk.a.c;
import com.tencent.xweb.xwalk.a.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xwalk.core.Log;
import org.xwalk.core.R.id;
import org.xwalk.core.R.layout;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.UpdateConfig;

public final class a
  implements b
{
  Context ynm;
  public com.tencent.xweb.WebView yoY;
  ScrollView yoZ = null;
  TextView ypa = null;
  TextView ypb = null;
  public View ypc;
  
  public a(com.tencent.xweb.WebView paramWebView)
  {
    this.ynm = paramWebView.getContext();
    this.yoY = paramWebView;
    csw();
  }
  
  private void bn(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.ynm);
      localBuilder.setMessage(paramString);
      localBuilder.create().show();
      return;
    }
    Log.e("WebDebugPage", paramString);
  }
  
  public final boolean Zg(String paramString)
  {
    if (paramString.contains("www.debugxweb.pro"))
    {
      csx();
      return true;
    }
    if (paramString.contains("www.debugxweb.info"))
    {
      csx();
      return true;
    }
    if (paramString.contains("debugxweb.qq.com"))
    {
      paramString = Uri.parse(paramString);
      Object localObject = paramString.getQueryParameterNames();
      if (localObject == null) {
        return true;
      }
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (str != null) {
          if (str.equals("inspector"))
          {
            boolean bool = paramString.getBooleanQueryParameter("inspector", false);
            i.crW().nh(bool);
            a(bool, null, true);
          }
          else if (str.equals("load_local_xwalk"))
          {
            ni(false);
          }
        }
      }
      return true;
    }
    return false;
  }
  
  public final void a(boolean paramBoolean1, Button paramButton, boolean paramBoolean2)
  {
    try
    {
      XWalkPreferences.setValue("remote-debugging", paramBoolean1);
      try
      {
        if (Build.VERSION.SDK_INT >= 19) {
          android.webkit.WebView.setWebContentsDebuggingEnabled(paramBoolean1);
        }
        try
        {
          com.tencent.smtt.sdk.WebView.setWebContentsDebuggingEnabled(paramBoolean1);
          if ((paramBoolean2) && (this.yoY.getX5WebViewExtension() != null))
          {
            if (!paramBoolean1) {
              break label64;
            }
            this.yoY.loadUrl("http://debugx5.qq.com/?inspector=true");
          }
          for (;;)
          {
            if (paramButton != null)
            {
              if (!paramBoolean1) {
                break;
              }
              paramButton.setText("关闭远程调试模式");
            }
            return;
            label64:
            this.yoY.loadUrl("http://debugx5.qq.com/?inspector=false");
          }
          paramButton.setText("打开远程调试模式");
          return;
        }
        catch (Exception localException1)
        {
          for (;;) {}
        }
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
    catch (Exception localException3)
    {
      for (;;) {}
    }
  }
  
  public final void csh()
  {
    if (i.crW().yno) {
      a(i.crW().yno, null, false);
    }
  }
  
  public final void csw()
  {
    if (!i.crW().ynp) {}
    while (this.ypb != null) {
      return;
    }
    this.ypb = new TextView(this.ynm);
    String str2 = this.yoY.getVersionInfo();
    int i = str2.indexOf(",apkversion");
    String str1 = str2;
    if (i > 0) {
      str1 = str2.substring(0, i);
    }
    this.ypb.setText(str1);
    this.ypb.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        a.this.csx();
        return true;
      }
    });
    this.yoY.getTopView().addView(this.ypb);
  }
  
  public final boolean csx()
  {
    if (this.ypc != null)
    {
      this.ypc.setVisibility(0);
      return true;
    }
    this.ypc = ((LayoutInflater)this.ynm.getSystemService("layout_inflater")).inflate(R.layout.debug_menu, this.yoY.getTopView(), true).findViewById(R.id.view_root);
    ((Button)this.ypc.findViewById(R.id.button_close_menu)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        a.this.ypc.setVisibility(8);
      }
    });
    final Object localObject = (CheckBox)this.ypc.findViewById(R.id.checked_show_version);
    ((CheckBox)localObject).setChecked(i.crW().ynp);
    ((CheckBox)localObject).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        paramAnonymousCompoundButton = i.crW();
        if (paramAnonymousBoolean != paramAnonymousCompoundButton.ynp)
        {
          paramAnonymousCompoundButton.ynp = paramAnonymousBoolean;
          paramAnonymousCompoundButton.ynm.getSharedPreferences("wcwebview", 0).edit().putBoolean("bShowVersion", paramAnonymousCompoundButton.ynp).commit();
        }
        if (paramAnonymousBoolean)
        {
          a.this.csw();
          a.this.ypb.setVisibility(0);
        }
        while (a.this.ypb == null) {
          return;
        }
        a.this.ypb.setVisibility(8);
      }
    });
    ((TextView)this.ypc.findViewById(R.id.check_text)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = localObject;
        if (!localObject.isChecked()) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.setChecked(bool);
          return;
        }
      }
    });
    label264:
    final Button localButton;
    switch (8.ypi[i.crW().ynn.ordinal()])
    {
    default: 
      ((RadioGroup)this.ypc.findViewById(R.id.web_select)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
        {
          paramAnonymousRadioGroup = WebView.c.ynE;
          i locali;
          if (paramAnonymousInt == R.id.WV_AUTO)
          {
            paramAnonymousRadioGroup = WebView.c.ynE;
            locali = i.crW();
            if ((paramAnonymousRadioGroup != locali.ynn) && (locali.ynm != null)) {
              break label98;
            }
          }
          for (;;)
          {
            Log.d("WebDebugPage", "webview change to=" + paramAnonymousRadioGroup);
            return;
            if (paramAnonymousInt == R.id.WV_XWALK)
            {
              paramAnonymousRadioGroup = WebView.c.ynF;
              break;
            }
            if (paramAnonymousInt == R.id.WV_X5)
            {
              paramAnonymousRadioGroup = WebView.c.ynG;
              break;
            }
            if (paramAnonymousInt != R.id.WV_SYS) {
              break;
            }
            paramAnonymousRadioGroup = WebView.c.ynH;
            break;
            label98:
            locali.ynn = paramAnonymousRadioGroup;
            locali.ynm.getSharedPreferences("wcwebview", 0).edit().putString("HardCodeWebView", paramAnonymousRadioGroup.toString()).commit();
          }
        }
      });
      switch (8.ynb[i.crW().ynq.ordinal()])
      {
      default: 
        ((RadioGroup)this.ypc.findViewById(R.id.v8_select)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
          public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
          {
            paramAnonymousRadioGroup = f.a.ync;
            if (paramAnonymousInt == R.id.v8_auto) {
              paramAnonymousRadioGroup = f.a.ync;
            }
            for (;;)
            {
              i locali = i.crW();
              if (locali.ynq != paramAnonymousRadioGroup)
              {
                locali.ynq = paramAnonymousRadioGroup;
                locali.ynm.getSharedPreferences("wcwebview", 0).edit().putString("V8type", paramAnonymousRadioGroup.toString()).commit();
              }
              Log.d("WebDebugPage", "v8 type change to=" + paramAnonymousRadioGroup);
              return;
              if (paramAnonymousInt == R.id.v8_sys) {
                paramAnonymousRadioGroup = f.a.ynd;
              } else if (paramAnonymousInt == R.id.v8_x5) {
                paramAnonymousRadioGroup = f.a.yng;
              } else if (paramAnonymousInt == R.id.v8_xwalk) {
                paramAnonymousRadioGroup = f.a.yne;
              } else if (paramAnonymousInt == R.id.v8_j2v8) {
                paramAnonymousRadioGroup = f.a.ynh;
              } else if (paramAnonymousInt == R.id.v8_nativescript) {
                paramAnonymousRadioGroup = f.a.yni;
              } else if (paramAnonymousInt == R.id.v8_web_x5) {
                paramAnonymousRadioGroup = f.a.ynf;
              }
            }
          }
        });
        ((Button)this.ypc.findViewById(R.id.button_kill)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            a.this.ypc.setVisibility(8);
            paramAnonymousView = (ActivityManager)a.this.ynm.getSystemService("activity");
            int i = Process.myPid();
            int j = Process.myUid();
            paramAnonymousView = paramAnonymousView.getRunningAppProcesses().iterator();
            while (paramAnonymousView.hasNext())
            {
              ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramAnonymousView.next();
              if ((localRunningAppProcessInfo.uid == j) && (localRunningAppProcessInfo.pid != i))
              {
                String str = localRunningAppProcessInfo.processName;
                if ((str == null) || (!str.contains("com.tencent.mm")) || (localRunningAppProcessInfo.processName.contains("tools")) || (localRunningAppProcessInfo.processName.contains("appbrand")) || (localRunningAppProcessInfo.processName.contains("support"))) {
                  Process.killProcess(localRunningAppProcessInfo.pid);
                }
              }
            }
            Process.killProcess(i);
          }
        });
        localObject = (Button)this.ypc.findViewById(R.id.btn_debug);
        a(i.crW().yno, (Button)localObject, false);
        ((Button)localObject).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            if (!i.crW().yno) {}
            for (boolean bool = true;; bool = false)
            {
              i.crW().nh(bool);
              a.this.a(bool, localObject, true);
              return;
            }
          }
        });
        ((Button)this.ypc.findViewById(R.id.button_clear)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            XWalkEnvironment.clearAllVersion(a.this.ynm);
          }
        });
        ((Button)this.ypc.findViewById(R.id.button_refreshLog)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            ((TextView)a.this.ypc.findViewById(R.id.txtVersion)).setText(a.this.yoY.getVersionInfo() + "\n" + XWalkInitializer.getXWalkInitializeLog());
          }
        });
        ((Button)this.ypc.findViewById(R.id.button_loadLocalApk)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            a.this.ni(true);
          }
        });
        localButton = (Button)this.ypc.findViewById(R.id.button_config);
        if (!i.crW().ynr) {}
        break;
      }
      break;
    }
    for (localObject = "使用正式版config";; localObject = "使用测试config")
    {
      localButton.setText((CharSequence)localObject);
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = i.crW();
          boolean bool;
          label85:
          Button localButton;
          if (!i.crW().ynr)
          {
            bool = true;
            if (bool != paramAnonymousView.ynr)
            {
              paramAnonymousView.ynr = bool;
              if (!paramAnonymousView.ynr) {
                break label113;
              }
              XWalkEnvironment.SetTestDownLoadUrl(paramAnonymousView.ynm, "updateConfig_test.xml");
              paramAnonymousView = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
              paramAnonymousView.putLong("nLastFetchConfigTime", 0L);
              paramAnonymousView.commit();
              g.a(WebView.c.ynF).excute("STR_CMD_CLEAR_SCHEDULER", null);
            }
            localButton = localButton;
            if (!i.crW().ynr) {
              break label166;
            }
          }
          label113:
          label166:
          for (paramAnonymousView = "使用正式版config";; paramAnonymousView = "使用测试config")
          {
            localButton.setText(paramAnonymousView);
            return;
            bool = false;
            break;
            XWalkEnvironment.SetTestDownLoadUrl(paramAnonymousView.ynm, "");
            paramAnonymousView = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
            paramAnonymousView.putLong("nLastFetchConfigTime", 0L);
            paramAnonymousView.commit();
            g.a(WebView.c.ynF).excute("STR_CMD_CLEAR_SCHEDULER", null);
            break label85;
          }
        }
      });
      ((Button)this.ypc.findViewById(R.id.button_update)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
          paramAnonymousView.putLong("nLastFetchConfigTime", 0L);
          paramAnonymousView.putBoolean("bCanUseCellular", true);
          paramAnonymousView.putLong("nTimeToUpdate", 100L);
          paramAnonymousView.commit();
          c.csH().yqo = 100L;
          c.csH().ypT = true;
          c.csH().yqq = 100L;
          new e(new k(a.this.ynm).ypM).execute(new String[0]);
        }
      });
      ((TextView)this.ypc.findViewById(R.id.txtVersion)).setText(this.yoY.getVersionInfo() + "\n" + XWalkInitializer.getXWalkInitializeLog());
      return true;
      ((RadioButton)this.ypc.findViewById(R.id.WV_AUTO)).setChecked(true);
      break;
      ((RadioButton)this.ypc.findViewById(R.id.WV_XWALK)).setChecked(true);
      break;
      ((RadioButton)this.ypc.findViewById(R.id.WV_X5)).setChecked(true);
      break;
      ((RadioButton)this.ypc.findViewById(R.id.WV_SYS)).setChecked(true);
      break;
      ((RadioButton)this.ypc.findViewById(R.id.v8_auto)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_sys)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_x5)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_xwalk)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_j2v8)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_nativescript)).setChecked(true);
      break label264;
      ((RadioButton)this.ypc.findViewById(R.id.v8_web_x5)).setChecked(true);
      break label264;
    }
  }
  
  final void ni(final boolean paramBoolean)
  {
    Object localObject1 = Environment.getExternalStorageDirectory();
    if (localObject1 == null)
    {
      bn("请确认应用权限，在权限管理打开应用的读写存储权限", true);
      return;
    }
    if (((File)localObject1).listFiles() == null)
    {
      bn("请确认应用权限，在权限管理打开应用的读写存储权限", true);
      return;
    }
    ((File)localObject1).toString();
    localObject1 = ((File)localObject1).getPath() + "/apkxwebtest";
    final Object localObject2;
    try
    {
      localObject1 = new File((String)localObject1);
      localObject2 = ((File)localObject1).listFiles();
      if ((localObject2 == null) || (localObject2.length == 0))
      {
        bn("apkxwebtest目录下没有.zip文件,请确认应用权限，在权限管理打开应用的读写存储权限", true);
        return;
      }
    }
    catch (Exception localException)
    {
      bn("没有找到apkxwebtest目录,请确认应用权限，在权限管理打开应用的读写存储权限", true);
      return;
    }
    int i = 0;
    while (i < localObject2.length)
    {
      if (localObject2[i].getName().endsWith(".zip"))
      {
        final String str = localObject2[i].getAbsolutePath();
        localObject2 = localObject2[i].getName();
        if (paramBoolean)
        {
          new AlertDialog.Builder(this.ynm).setTitle("提示").setMessage("确定加载:" + (String)localObject2 + "?").setPositiveButton("确定", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              a.this.u(str, localObject2, paramBoolean);
            }
          }).setNegativeButton("取消", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
          }).show();
          return;
        }
        u(str, (String)localObject2, paramBoolean);
        return;
      }
      i += 1;
    }
    bn("apkxwebtest目录下没有.zip文件", true);
  }
  
  final void u(String paramString1, String paramString2, boolean paramBoolean)
  {
    a locala = new a(paramString1, paramString2);
    try
    {
      Object localObject = new File(XWalkEnvironment.getDownloadZipDir(locala.apkVer));
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      paramString1 = new FileInputStream(paramString1);
      localObject = new FileOutputStream((File)localObject);
      byte[] arrayOfByte = new byte[1048576];
      for (;;)
      {
        int i = paramString1.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        ((FileOutputStream)localObject).write(arrayOfByte, 0, i);
      }
      bn("安装" + paramString2 + "失败,错误码=" + paramString1, true);
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        paramString1 = XWalkUpdater.onHandleFile(locala);
        if (paramString1.intValue() != 0) {
          break;
        }
        bn("安装" + paramString2 + "成功", paramBoolean);
        return;
        ((FileOutputStream)localObject).flush();
        paramString1.close();
        ((FileOutputStream)localObject).close();
      }
    }
    catch (Exception paramString1)
    {
      bn("安装失败", true);
      Log.e("WebDebugPage", "install local apk failed : " + paramString1.getMessage());
      return;
    }
  }
  
  static final class a
    extends XWalkUpdater.UpdateConfig
  {
    String ypl;
    
    private a(int paramInt)
    {
      super(false, paramInt);
    }
    
    public a(String paramString1, String paramString2)
    {
      this(i);
      this.ypl = paramString1;
      this.isMatchMd5 = false;
      this.isPatchUpdate = false;
      this.versionDetail = ("local:" + paramString2);
    }
    
    public final boolean checkValid()
    {
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */