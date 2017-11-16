package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qj
  extends ayx
{
  public String amf;
  public String eQb;
  public String eSd;
  public int scene;
  public String url;
  
  public qj()
  {
    GMTrace.i(17615808364544L, 131248);
    GMTrace.o(17615808364544L, 131248);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615942582272L, 131249);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.amf != null) {
        paramVarArgs.e(2, this.amf);
      }
      if (this.eSd != null) {
        paramVarArgs.e(3, this.eSd);
      }
      if (this.eQb != null) {
        paramVarArgs.e(4, this.eQb);
      }
      paramVarArgs.fk(5, this.scene);
      if (this.url != null) {
        paramVarArgs.e(6, this.url);
      }
      GMTrace.o(17615942582272L, 131249);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.amf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.amf);
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eSd);
      }
      paramInt = i;
      if (this.eQb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eQb);
      }
      i = paramInt + b.a.a.a.fh(5, this.scene);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.url);
      }
      GMTrace.o(17615942582272L, 131249);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17615942582272L, 131249);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qj localqj = (qj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17615942582272L, 131249);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 2: 
        localqj.amf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 3: 
        localqj.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 4: 
        localqj.eQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      case 5: 
        localqj.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17615942582272L, 131249);
        return 0;
      }
      localqj.url = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17615942582272L, 131249);
      return 0;
    }
    GMTrace.o(17615942582272L, 131249);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */