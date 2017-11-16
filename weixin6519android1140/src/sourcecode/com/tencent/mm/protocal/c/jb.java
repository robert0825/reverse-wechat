package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jb
  extends azh
{
  public String lSX;
  public String lSY;
  public int nFd;
  public long tQd;
  public String tYF;
  public String tYJ;
  public String tYu;
  
  public jb()
  {
    GMTrace.i(3998748770304L, 29793);
    GMTrace.o(3998748770304L, 29793);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3998882988032L, 29794);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tYu != null) {
        paramVarArgs.e(3, this.tYu);
      }
      if (this.lSY != null) {
        paramVarArgs.e(4, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(5, this.lSX);
      }
      paramVarArgs.fk(9, this.nFd);
      paramVarArgs.T(10, this.tQd);
      if (this.tYF != null) {
        paramVarArgs.e(11, this.tYF);
      }
      if (this.tYJ != null) {
        paramVarArgs.e(12, this.tYJ);
      }
      GMTrace.o(3998882988032L, 29794);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.tYu != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tYu);
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lSY);
      }
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lSX);
      }
      i = paramInt + b.a.a.a.fh(9, this.nFd) + b.a.a.a.S(10, this.tQd);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tYF);
      }
      i = paramInt;
      if (this.tYJ != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.tYJ);
      }
      GMTrace.o(3998882988032L, 29794);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3998882988032L, 29794);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jb localjb = (jb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      case 6: 
      case 7: 
      case 8: 
      default: 
        GMTrace.o(3998882988032L, 29794);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localjb.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 3: 
        localjb.tYu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 4: 
        localjb.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 5: 
        localjb.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 9: 
        localjb.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 10: 
        localjb.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      case 11: 
        localjb.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998882988032L, 29794);
        return 0;
      }
      localjb.tYJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3998882988032L, 29794);
      return 0;
    }
    GMTrace.o(3998882988032L, 29794);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */