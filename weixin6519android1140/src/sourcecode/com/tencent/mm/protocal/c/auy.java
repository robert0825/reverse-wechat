package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auy
  extends ayx
{
  public String lSX;
  public String lSY;
  public long uKe;
  public int uKf;
  public String uKg;
  public int uKn;
  public int uKo;
  public int uKp;
  public int udE;
  
  public auy()
  {
    GMTrace.i(3864799477760L, 28795);
    GMTrace.o(3864799477760L, 28795);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864933695488L, 28796);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lSY != null) {
        paramVarArgs.e(2, this.lSY);
      }
      if (this.uKg != null) {
        paramVarArgs.e(3, this.uKg);
      }
      paramVarArgs.fk(4, this.udE);
      paramVarArgs.T(5, this.uKe);
      paramVarArgs.fk(6, this.uKf);
      if (this.lSX != null) {
        paramVarArgs.e(7, this.lSX);
      }
      paramVarArgs.fk(8, this.uKo);
      paramVarArgs.fk(9, this.uKn);
      paramVarArgs.fk(10, this.uKp);
      GMTrace.o(3864933695488L, 28796);
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
      if (this.lSY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSY);
      }
      i = paramInt;
      if (this.uKg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uKg);
      }
      i = i + b.a.a.a.fh(4, this.udE) + b.a.a.a.S(5, this.uKe) + b.a.a.a.fh(6, this.uKf);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lSX);
      }
      i = b.a.a.a.fh(8, this.uKo);
      int j = b.a.a.a.fh(9, this.uKn);
      int k = b.a.a.a.fh(10, this.uKp);
      GMTrace.o(3864933695488L, 28796);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3864933695488L, 28796);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auy localauy = (auy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3864933695488L, 28796);
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
          localauy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 2: 
        localauy.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 3: 
        localauy.uKg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 4: 
        localauy.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 5: 
        localauy.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 6: 
        localauy.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 7: 
        localauy.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 8: 
        localauy.uKo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      case 9: 
        localauy.uKn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3864933695488L, 28796);
        return 0;
      }
      localauy.uKp = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3864933695488L, 28796);
      return 0;
    }
    GMTrace.o(3864933695488L, 28796);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\auy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */