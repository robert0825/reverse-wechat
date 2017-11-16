package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgt
  extends ayx
{
  public String eLg;
  public String signature;
  public String uHK;
  public String uSo;
  
  public bgt()
  {
    GMTrace.i(4011365236736L, 29887);
    GMTrace.o(4011365236736L, 29887);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4011499454464L, 29888);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uHK != null) {
        paramVarArgs.e(2, this.uHK);
      }
      if (this.signature != null) {
        paramVarArgs.e(3, this.signature);
      }
      if (this.uSo != null) {
        paramVarArgs.e(4, this.uSo);
      }
      if (this.eLg != null) {
        paramVarArgs.e(5, this.eLg);
      }
      GMTrace.o(4011499454464L, 29888);
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
      if (this.uHK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uHK);
      }
      i = paramInt;
      if (this.signature != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.signature);
      }
      paramInt = i;
      if (this.uSo != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uSo);
      }
      i = paramInt;
      if (this.eLg != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eLg);
      }
      GMTrace.o(4011499454464L, 29888);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4011499454464L, 29888);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgt localbgt = (bgt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4011499454464L, 29888);
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
          localbgt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4011499454464L, 29888);
        return 0;
      case 2: 
        localbgt.uHK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4011499454464L, 29888);
        return 0;
      case 3: 
        localbgt.signature = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4011499454464L, 29888);
        return 0;
      case 4: 
        localbgt.uSo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4011499454464L, 29888);
        return 0;
      }
      localbgt.eLg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4011499454464L, 29888);
      return 0;
    }
    GMTrace.o(4011499454464L, 29888);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */