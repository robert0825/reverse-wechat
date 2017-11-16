package com.tencent.mm.remoteservice;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class a
  extends b.a
{
  private final d kSj;
  protected RemoteService vdT;
  public b vdU;
  
  public a(d paramd)
  {
    GMTrace.i(12954292453376L, 96517);
    this.kSj = paramd;
    GMTrace.o(12954292453376L, 96517);
  }
  
  public Object CLIENT_CALL(String paramString, Object... paramVarArgs)
  {
    GMTrace.i(12954695106560L, 96520);
    paramVarArgs = objectsToBundle(paramVarArgs);
    try
    {
      this.vdU.onCallback(paramString, paramVarArgs, true);
      paramString = paramVarArgs.get("result_key");
      GMTrace.o(12954695106560L, 96520);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bg.f(paramString) });
      }
    }
  }
  
  public Object REMOTE_CALL(final String paramString, final Object... paramVarArgs)
  {
    GMTrace.i(12954560888832L, 96519);
    if (this.kSj.isConnected())
    {
      paramVarArgs = objectsToBundle(paramVarArgs);
      this.kSj.a(this, paramString, paramVarArgs);
      paramVarArgs.setClassLoader(getClass().getClassLoader());
      paramString = paramVarArgs.get("result_key");
      GMTrace.o(12954560888832L, 96519);
      return paramString;
    }
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12958318985216L, 96547);
        Bundle localBundle = a.this.objectsToBundle(paramVarArgs);
        a.a(a.this).a(a.this, paramString, localBundle);
        GMTrace.o(12958318985216L, 96547);
      }
    });
    GMTrace.o(12954560888832L, 96519);
    return null;
  }
  
  public Object[] getArgs(Bundle paramBundle)
  {
    GMTrace.i(12954963542016L, 96522);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = paramBundle.size();
    while (i < j)
    {
      String str = String.valueOf(i);
      if (paramBundle.containsKey(str)) {
        localLinkedList.add(paramBundle.get(str));
      }
      i += 1;
    }
    paramBundle = localLinkedList.toArray();
    GMTrace.o(12954963542016L, 96522);
    return paramBundle;
  }
  
  public Bundle objectsToBundle(Object... paramVarArgs)
  {
    GMTrace.i(12954829324288L, 96521);
    Bundle localBundle = new Bundle();
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      if ((paramVarArgs[i] instanceof Bundle)) {
        localBundle.putBundle(String.valueOf(i), (Bundle)paramVarArgs[i]);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof Parcelable)) {
          localBundle.putParcelable(String.valueOf(i), (Parcelable)paramVarArgs[i]);
        } else {
          localBundle.putSerializable(String.valueOf(i), (Serializable)paramVarArgs[i]);
        }
      }
    }
    GMTrace.o(12954829324288L, 96521);
    return localBundle;
  }
  
  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(12954426671104L, 96518);
    w.d("MicroMsg.BaseClientRequest", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        int i = 0;
        Object localObject1 = localObject2;
        if (i < j)
        {
          localObject1 = arrayOfMethod[i];
          if (((Method)localObject1).getName().equalsIgnoreCase(paramString))
          {
            break label187;
            if (((Method)localObject1).isAnnotationPresent(paramString))
            {
              paramString = ((Method)localObject1).invoke(this, getArgs(paramBundle));
              if (((Method)localObject1).getReturnType() != Void.TYPE) {
                paramBundle.putSerializable("result_key", (Serializable)paramString);
              }
            }
            GMTrace.o(12954426671104L, 96518);
          }
          else
          {
            i += 1;
            continue;
            paramString = f.class;
            continue;
          }
        }
        if (localObject1 == null) {
          continue;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(12954426671104L, 96518);
        return;
      }
      label187:
      if (paramBoolean) {
        paramString = e.class;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\remoteservice\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */