package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbi
  extends azh
{
  public int jib;
  public String lQa;
  public String lSX;
  public String lSY;
  public int nFd;
  public int tPV;
  public String tQN;
  public long tQd;
  public String tYF;
  
  public bbi()
  {
    GMTrace.i(3654346080256L, 27227);
    GMTrace.o(3654346080256L, 27227);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3654480297984L, 27228);
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
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.lSY != null) {
        paramVarArgs.e(3, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(4, this.lSX);
      }
      paramVarArgs.fk(5, this.tPV);
      if (this.tQN != null) {
        paramVarArgs.e(6, this.tQN);
      }
      paramVarArgs.fk(7, this.nFd);
      paramVarArgs.fk(8, this.jib);
      paramVarArgs.T(9, this.tQd);
      if (this.tYF != null) {
        paramVarArgs.e(10, this.tYF);
      }
      GMTrace.o(3654480297984L, 27228);
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
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSY);
      }
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSX);
      }
      i = paramInt + b.a.a.a.fh(5, this.tPV);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQN);
      }
      i = paramInt + b.a.a.a.fh(7, this.nFd) + b.a.a.a.fh(8, this.jib) + b.a.a.a.S(9, this.tQd);
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tYF);
      }
      GMTrace.o(3654480297984L, 27228);
      return paramInt;
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
      GMTrace.o(3654480297984L, 27228);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbi localbbi = (bbi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3654480297984L, 27228);
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
          localbbi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 2: 
        localbbi.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 3: 
        localbbi.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 4: 
        localbbi.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 5: 
        localbbi.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 6: 
        localbbi.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 7: 
        localbbi.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 8: 
        localbbi.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      case 9: 
        localbbi.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3654480297984L, 27228);
        return 0;
      }
      localbbi.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3654480297984L, 27228);
      return 0;
    }
    GMTrace.o(3654480297984L, 27228);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */