单测分为本地单测和Android单测两种，区别在于是否需要使用dvm虚拟机，前者只需要jvm虚拟机

使用espresso ，
运行 connectedDebugAndroidTest执行android单元测试


配置Jacoco，才能使用createDebugCoverageReport命令，获取覆盖率
apply plugin: 'jacoco'
jacoco {
    toolVersion = "0.7.9"
}
如果要计算AndroidTest的覆盖率，只需要在模块的build.gradle里的buildTypes闭包里添加开启覆盖率统计即可。
debug {    
    testCoverageEnabled true
}
要生成报告，可以在AS里找到Gradle菜单，找到verification ->createDebugCoverageReport,右键运行这个task就可以了。
或者在project目录下运行（mac下）
./gradlew createDebugCoverageReport
这个task。
 每个模块都会生成单独的覆盖率文件，在各自的
build/reports/coverage/debug/index.html.
 
connectedDebugAndroidTest 执行android的单元case 
createDebugCoverageReport 产生代码覆盖率的报告 （createDebugCoverageReport任务会调用connectedDebugAndroidTest ）
connectedCheck 包含上面2个任务 


？但是只有androidtest的单元测试，没有junit的单元测试

？试了下5.0手机，覆盖率都是零。 4.4版本正常。 
加入Robotium，
加入androidTestImplementation 'com.jayway.android.robotium:robotium-solo:5.6.3'
android单元测试继承extends ActivityInstrumentationTestCase2 


？配置jacocoTestReport任务，只执行java unit相关，生成jacoco文件夹里面含有覆盖率，
？使用jacocoTestReport其他模块的不会自动生成。



