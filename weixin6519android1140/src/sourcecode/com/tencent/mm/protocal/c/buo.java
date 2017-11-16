package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class buo
  extends com.tencent.mm.bm.a
{
  public String lPF;
  public String lTf;
  public int vcS;
  public bee vcT;
  public cy vcU;
  public apy vcV;
  public cn vcW;
  public cx vcX;
  public cr vcY;
  public LinkedList<jx> vcZ;
  public String vda;
  public String vdb;
  
  public buo()
  {
    GMTrace.i(3795140476928L, 28276);
    this.vcZ = new LinkedList();
    GMTrace.o(3795140476928L, 28276);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795274694656L, 28277);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lTf != null) {
        paramVarArgs.e(1, this.lTf);
      }
      paramVarArgs.fk(2, this.vcS);
      if (this.lPF != null) {
        paramVarArgs.e(3, this.lPF);
      }
      if (this.vcT != null)
      {
        paramVarArgs.fm(4, this.vcT.aYq());
        this.vcT.a(paramVarArgs);
      }
      if (this.vcU != null)
      {
        paramVarArgs.fm(5, this.vcU.aYq());
        this.vcU.a(paramVarArgs);
      }
      if (this.vcV != null)
      {
        paramVarArgs.fm(6, this.vcV.aYq());
        this.vcV.a(paramVarArgs);
      }
      if (this.vcW != null)
      {
        paramVarArgs.fm(7, this.vcW.aYq());
        this.vcW.a(paramVarArgs);
      }
      if (this.vcX != null)
      {
        paramVarArgs.fm(8, this.vcX.aYq());
        this.vcX.a(paramVarArgs);
      }
      if (this.vcY != null)
      {
        paramVarArgs.fm(11, this.vcY.aYq());
        this.vcY.a(paramVarArgs);
      }
      paramVarArgs.d(12, 8, this.vcZ);
      if (this.vda != null) {
        paramVarArgs.e(13, this.vda);
      }
      if (this.vdb != null) {
        paramVarArgs.e(14, this.vdb);
      }
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lTf != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lTf) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.vcS);
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPF);
      }
      i = paramInt;
      if (this.vcT != null) {
        i = paramInt + b.a.a.a.fj(4, this.vcT.aYq());
      }
      paramInt = i;
      if (this.vcU != null) {
        paramInt = i + b.a.a.a.fj(5, this.vcU.aYq());
      }
      i = paramInt;
      if (this.vcV != null) {
        i = paramInt + b.a.a.a.fj(6, this.vcV.aYq());
      }
      paramInt = i;
      if (this.vcW != null) {
        paramInt = i + b.a.a.a.fj(7, this.vcW.aYq());
      }
      i = paramInt;
      if (this.vcX != null) {
        i = paramInt + b.a.a.a.fj(8, this.vcX.aYq());
      }
      paramInt = i;
      if (this.vcY != null) {
        paramInt = i + b.a.a.a.fj(11, this.vcY.aYq());
      }
      i = paramInt + b.a.a.a.c(12, 8, this.vcZ);
      paramInt = i;
      if (this.vda != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.vda);
      }
      i = paramInt;
      if (this.vdb != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.vdb);
      }
      GMTrace.o(3795274694656L, 28277);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vcZ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buo localbuo = (buo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 9: 
      case 10: 
      default: 
        GMTrace.o(3795274694656L, 28277);
        return -1;
      case 1: 
        localbuo.lTf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 2: 
        localbuo.vcS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 3: 
        localbuo.lPF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bee();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bee)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcT = ((bee)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcU = ((cy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcV = ((apy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcW = ((cn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcX = ((cx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcY = ((cr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuo.vcZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795274694656L, 28277);
        return 0;
      case 13: 
        localbuo.vda = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795274694656L, 28277);
        return 0;
      }
      localbuo.vdb = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3795274694656L, 28277);
      return 0;
    }
    GMTrace.o(3795274694656L, 28277);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */