package github

//class GitHubClient() {
//    val client = HttpClient() {}
//
//    val url = URI("https://api.github.com/repos/Kobe/fizz-buzz-service/actions/workflows/verify/runs?per_page=1&branch=main")
//
//    suspend fun getLatestWorkflowRun() {
//        val workflowResponse: HttpResponse = client.get(url)
//        val foo = workflowResponse.receive()
//    }
//}


//class xxx() {
//
//    val webClient = webClientBuilder
//        .defaultHeaders { httpHeaders -> httpHeaders.setBearerAuth(githubBearerToken) }
//        .build()
//
//    fun getWorkflowRuns(
//        githubGroup: String,
//        githubRepo: String,
//        githubWorkflowNameOrId: String
//    ): Mono<GithubWorkflowRunsResponse> {
//        return webClient.get()
//            .uri(URI("${githubApiBaseUrl}/repos/$githubGroup/$githubRepo/actions/workflows/$githubWorkflowNameOrId/runs?per_page=1&branch=main"))
//            .header("Accept", "application/vnd.github.v3+json")
//            .retrieve()
//            .bodyToMono<GithubWorkflowRunsResponse>()
//            .timeout(Duration.ofSeconds(5))
//            .doOnError { exception -> logger.error(t = exception, msg = { "failed to fetch github api" }) }
//            .onErrorReturn(GithubWorkflowRunsResponse(0, arrayOf(GithubWorkflowRun(
//                status = "Unknown",
//                run_number = 0,
//                conclusion = "Exception",
//                created_at = Date().toString(),
//                html_url = "https://github.com/$githubGroup/$githubRepo/actions/workflows/$githubWorkflowNameOrId",
//                head_branch = "main",
//                repository = GithubRepository("$githubRepo - $githubWorkflowNameOrId (main branch)")
//            )
//            )))
//    }
//
//}