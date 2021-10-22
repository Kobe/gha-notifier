package github

class GitHubWorkflowRunsResponse(
    total_count: Int,
    workflow_runs: Array<GitHubWorkflowRun>
) {
    val totalCount = total_count
    val latestWorkflowRun = workflow_runs[0]
}

data class GitHubWorkflowRun(
    val status: String,
    val run_number: Int,
    val conclusion: String?, // this is null when a build is running
    val created_at: String,
    val html_url: String,
    val head_branch: String,
    val repository: GitHubRepository)

data class GitHubRepository(val name: String)